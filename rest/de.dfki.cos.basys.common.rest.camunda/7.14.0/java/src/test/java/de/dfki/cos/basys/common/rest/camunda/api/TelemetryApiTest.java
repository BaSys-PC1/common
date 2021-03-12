/*
 * Camunda BPM REST API
 * OpenApi Spec for Camunda BPM REST API.
 *
 * The version of the OpenAPI document: 7.14.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.dfki.cos.basys.common.rest.camunda.api;

import de.dfki.cos.basys.common.rest.camunda.ApiException;
import de.dfki.cos.basys.common.rest.camunda.dto.ExceptionDto;
import de.dfki.cos.basys.common.rest.camunda.dto.TelemetryConfigurationDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TelemetryApi
 */
@Ignore
public class TelemetryApiTest {

    private final TelemetryApi api = new TelemetryApi();

    
    /**
     * Configure Telemetry
     *
     * Configures whether Camunda receives data collection of the process engine setup and usage.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void configureTelemetryTest() throws ApiException {
        TelemetryConfigurationDto telemetryConfigurationDto = null;
        api.configureTelemetry(telemetryConfigurationDto);

        // TODO: test validations
    }
    
    /**
     * Fetch Telemetry Configuration
     *
     * Fetches Telemetry Configuration.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTelemetryConfigurationTest() throws ApiException {
        TelemetryConfigurationDto response = api.getTelemetryConfiguration();

        // TODO: test validations
    }
    
}