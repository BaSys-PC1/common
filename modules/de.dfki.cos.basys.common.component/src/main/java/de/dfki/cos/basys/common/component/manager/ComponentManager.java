/**
 */
package de.dfki.cos.basys.common.component.manager;

import java.util.List;
import java.util.Properties;

import de.dfki.cos.basys.common.component.Component;

public interface ComponentManager {
	
	List<Component> getComponents();
	Component getComponentById(String id);
	Component getComponentByName(String name);

	Component createComponent(Properties config) throws ComponentManagerException;	
	void addComponent(Properties config) throws ComponentManagerException;
	void addComponent(Component component) throws ComponentManagerException;
	void deleteComponent(String id) throws ComponentManagerException;

}
