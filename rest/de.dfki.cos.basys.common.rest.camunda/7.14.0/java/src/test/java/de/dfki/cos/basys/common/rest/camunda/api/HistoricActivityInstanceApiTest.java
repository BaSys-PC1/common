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

import de.dfki.cos.basys.common.rest.camunda.*;
import de.dfki.cos.basys.common.rest.camunda.auth.*;
import de.dfki.cos.basys.common.rest.camunda.dto.CountResultDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExceptionDto;
import de.dfki.cos.basys.common.rest.camunda.dto.HistoricActivityInstanceDto;
import de.dfki.cos.basys.common.rest.camunda.dto.HistoricActivityInstanceQueryDto;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HistoricActivityInstanceApi
 */
public class HistoricActivityInstanceApiTest {

    private final HistoricActivityInstanceApi api = new HistoricActivityInstanceApi();

    /**
     * Get
     *
     * Retrieves a historic activity instance by id, according to the &#x60;HistoricActivityInstance&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricActivityInstanceTest() throws ApiException {
        //String id = null;
        //HistoricActivityInstanceDto response = api.getHistoricActivityInstance(id);
        // TODO: test validations
    }

    /**
     * Get List
     *
     * Queries for historic activity instances that fulfill the given parameters. The size of the result set can be retrieved by using the [Get Historic Activity Instance Count](https://docs.camunda.org/manual/7.14/reference/rest/history/activity-instance/get-activity-instance-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricActivityInstancesTest() throws ApiException {
        //String sortBy = null;
        //String sortOrder = null;
        //Integer firstResult = null;
        //Integer maxResults = null;
        //String activityInstanceId = null;
        //String processInstanceId = null;
        //String processDefinitionId = null;
        //String executionId = null;
        //String activityId = null;
        //String activityName = null;
        //String activityType = null;
        //String taskAssignee = null;
        //Boolean finished = null;
        //Boolean unfinished = null;
        //Boolean canceled = null;
        //Boolean completeScope = null;
        //OffsetDateTime startedBefore = null;
        //OffsetDateTime startedAfter = null;
        //OffsetDateTime finishedBefore = null;
        //OffsetDateTime finishedAfter = null;
        //String tenantIdIn = null;
        //Boolean withoutTenantId = null;
        //List<HistoricActivityInstanceDto> response = api.getHistoricActivityInstances(sortBy, sortOrder, firstResult, maxResults, activityInstanceId, processInstanceId, processDefinitionId, executionId, activityId, activityName, activityType, taskAssignee, finished, unfinished, canceled, completeScope, startedBefore, startedAfter, finishedBefore, finishedAfter, tenantIdIn, withoutTenantId);
        // TODO: test validations
    }

    /**
     * Get List Count
     *
     * Queries for the number of historic activity instances that fulfill the given parameters. Takes the same parameters as the [Get Historic Activity Instance](https://docs.camunda.org/manual/7.14/reference/rest/history/activity-instance/get-activity-instance-query/)  method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHistoricActivityInstancesCountTest() throws ApiException {
        //String activityInstanceId = null;
        //String processInstanceId = null;
        //String processDefinitionId = null;
        //String executionId = null;
        //String activityId = null;
        //String activityName = null;
        //String activityType = null;
        //String taskAssignee = null;
        //Boolean finished = null;
        //Boolean unfinished = null;
        //Boolean canceled = null;
        //Boolean completeScope = null;
        //OffsetDateTime startedBefore = null;
        //OffsetDateTime startedAfter = null;
        //OffsetDateTime finishedBefore = null;
        //OffsetDateTime finishedAfter = null;
        //String tenantIdIn = null;
        //Boolean withoutTenantId = null;
        //CountResultDto response = api.getHistoricActivityInstancesCount(activityInstanceId, processInstanceId, processDefinitionId, executionId, activityId, activityName, activityType, taskAssignee, finished, unfinished, canceled, completeScope, startedBefore, startedAfter, finishedBefore, finishedAfter, tenantIdIn, withoutTenantId);
        // TODO: test validations
    }

    /**
     * Get List (POST)
     *
     * Queries for historic activity instances that fulfill the given parameters. The size of the result set can be retrieved by using the [Get Historic Activity Instance Count](https://docs.camunda.org/manual/7.14/reference/rest/history/activity-instance/get-activity-instance-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryHistoricActivityInstancesTest() throws ApiException {
        //Integer firstResult = null;
        //Integer maxResults = null;
        //HistoricActivityInstanceQueryDto historicActivityInstanceQueryDto = null;
        //List<HistoricActivityInstanceDto> response = api.queryHistoricActivityInstances(firstResult, maxResults, historicActivityInstanceQueryDto);
        // TODO: test validations
    }

    /**
     * Get List Count (POST)
     *
     * Queries for the number of historic activity instances that fulfill the given parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryHistoricActivityInstancesCountTest() throws ApiException {
        //HistoricActivityInstanceQueryDto historicActivityInstanceQueryDto = null;
        //CountResultDto response = api.queryHistoricActivityInstancesCount(historicActivityInstanceQueryDto);
        // TODO: test validations
    }

}
