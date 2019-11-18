package de.dfki.cos.basys.common.component.impl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.dfki.cos.basys.common.component.Component;
import de.dfki.cos.basys.common.component.ComponentContext;
import de.dfki.cos.basys.common.component.ComponentException;
import de.dfki.cos.basys.common.component.ServiceManager;
import de.dfki.cos.basys.common.component.ServiceConnection;
import de.dfki.cos.basys.common.component.StringConstants;
import de.dfki.cos.basys.common.component.manager.ComponentManagerException;

public class ServiceManagerImpl<T> implements ServiceManager<T> {
	public final Logger LOGGER;
	protected Properties config;
	private ComponentContext context = null;
	
	private boolean observeConnection = false;
	private ScheduledFuture<?> connectionHandle = null;
	protected ServiceConnection service = null;

	private Supplier<? extends ServiceConnection> ctor;
	
	public ServiceManagerImpl(Properties config) {
		this.config = config;
		this.LOGGER = LoggerFactory.getLogger("basys.component." + getName().replaceAll(" ", "-"));		
		
		if (config.getProperty("observeConnection") != null) {
			observeConnection = Boolean.parseBoolean(config.getProperty("observeConnection"));
			LOGGER.info("observeConnection = " + observeConnection);
		}	
		
		String serviceImplementationJavaClass = Objects.requireNonNull(config.getProperty(StringConstants.serviceImplementationJavaClass));
		
		Class c = null;
					
		try {
			c = Class.forName(serviceImplementationJavaClass);
		} catch (ClassNotFoundException e2) {
			e2.printStackTrace();
		}		
	
		Constructor<ServiceConnection> constructor = null;
		
		try {
			try {
				constructor = c.getConstructor(Properties.class);
				service = constructor.newInstance(config);
			} catch (NoSuchMethodException e) {
				try {
					constructor = c.getConstructor();
					service = constructor.newInstance();
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public ServiceManagerImpl(Properties config, Supplier<? extends ServiceConnection> ctor) {
		this.config = config;
		this.LOGGER = LoggerFactory.getLogger("basys.component." + getName().replaceAll(" ", "-"));		

		if (config.getProperty("observeConnection") != null) {
			observeConnection = Boolean.parseBoolean(config.getProperty("observeConnection"));
			LOGGER.info("observeConnection = " + observeConnection);
		}	
		
		this.ctor = Objects.requireNonNull(ctor);
		this.service = ctor.get();
	}
	
	private String getName() {		
		return config.getProperty(StringConstants.name) + ".cm";
	}

	@Override
	public T getServiceInterface() {
		return (T)service;
	}

	@Override
	public ServiceConnection getServiceConnection() {
		return service;
	}
	
	@Override
	public void connect(ComponentContext context) throws ComponentException {
		this.context = context;
		if (!isConnected()) {
			LOGGER.debug("connect");
			if (config.containsKey(StringConstants.serviceConnectionString)) {
				String cs = config.getProperty(StringConstants.serviceConnectionString);
				if (cs != null && !cs.equalsIgnoreCase("")) {
					LOGGER.debug("provided connection string: " + cs);
					if (service.connect(context, cs)) {
						LOGGER.debug("connect - finished");
						//setConnected(true);
					} else {
						LOGGER.warn("connect - not successful");
					}
				} else {
					LOGGER.debug("connect - skipped due to empty connection string");
				}
			} else {
				LOGGER.debug("connect - skipped due to missing connection string");
			}			
		} else {
			LOGGER.info("already connected");
		}
	}

	@Override
	public void disconnect() throws ComponentException {
		if (isConnected()) {
			LOGGER.debug("disconnect");
			service.disconnect();
			if (!service.isConnected()) {
				LOGGER.debug("disconnect - finished");
				//setConnected(false);
			} else {
				LOGGER.warn("disconnect - not successful");
			}
		} else {
			LOGGER.info("already disconnected");
		}
	}

	protected boolean doConnect( ) {
		return true;
	}
	
	protected boolean doDisconnect( ) {
		return true;
	}
	
	@Override
	public boolean isConnected() {
		return getServiceConnection().isConnected();
	}

//	protected void setConnected(boolean value) {
//		connected = value;
//		if (observeConnection) {
//			if (connected) {
//				observeConnection();
//			} else {
//				unobserveConnection();
//			}
//		}
//		notifyChange();
//	}
	

	
//	protected void notifyChange() {		
//	}
	

//	private void observeConnection() {
//		LOGGER.info("observeConnection()");
//		connectionHandle = context.getScheduledExecutorService().scheduleWithFixedDelay(new Runnable() {
//
//			@Override
//			public void run() {
//
//				if (!isConnected()) {
//					String cs = config.getProperty(StringConstants.connectionString);
//					LOGGER.info("connectToExternal: " + cs);
//					try {
//						if (canConnect()) {
//							connect(context);
//							// connectedToExternal = true;
//						} else {
//							LOGGER.warn("component cannot connectToExternal(), retry ...");
//						}
//						LOGGER.debug("connectToExternal - finished");
//					} catch (ComponentException e) {
//						LOGGER.error(e.getMessage());
//						LOGGER.warn("component could not connectToExternal(), retry ...");
//						e.printStackTrace();
//					}
//				}
//
//			}
//
//		}, 5000, 5000, TimeUnit.MILLISECONDS);
//
//	}
//
//	protected void unobserveConnection() {
//		LOGGER.info("unobserveConnection()");
//		if (connectionHandle != null) {
//			connectionHandle.cancel(true);
//		}
//	}

//	@Override
//	public void handleConnectionEstablished() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void handleConnectionLost() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public void handleConnectionClosed() {
//		// TODO Auto-generated method stub
//		
//	}


}
