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
import de.dfki.cos.basys.common.rest.camunda.dto.BatchDto;
import de.dfki.cos.basys.common.rest.camunda.dto.CompleteExternalTaskDto;
import de.dfki.cos.basys.common.rest.camunda.dto.CountResultDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExceptionDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExtendLockOnExternalTaskDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExternalTaskBpmnError;
import de.dfki.cos.basys.common.rest.camunda.dto.ExternalTaskDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExternalTaskFailureDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExternalTaskQueryDto;
import de.dfki.cos.basys.common.rest.camunda.dto.FetchExternalTasksDto;
import de.dfki.cos.basys.common.rest.camunda.dto.LockedExternalTaskDto;
import org.threeten.bp.OffsetDateTime;
import de.dfki.cos.basys.common.rest.camunda.dto.PriorityDto;
import de.dfki.cos.basys.common.rest.camunda.dto.RetriesDto;
import de.dfki.cos.basys.common.rest.camunda.dto.SetRetriesForExternalTasksDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExternalTaskApi
 */
@Ignore
public class ExternalTaskApiTest {

    private final ExternalTaskApi api = new ExternalTaskApi();

    
    /**
     * 
     *
     * Completes an external task by id and updates process variables.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeExternalTaskResourceTest() throws ApiException {
        String id = null;
        CompleteExternalTaskDto completeExternalTaskDto = null;
        api.completeExternalTaskResource(id, completeExternalTaskDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Extends the timeout of the lock by a given amount of time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void extendLockTest() throws ApiException {
        String id = null;
        ExtendLockOnExternalTaskDto extendLockOnExternalTaskDto = null;
        api.extendLock(id, extendLockOnExternalTaskDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Fetches and locks a specific number of external tasks for execution by a worker. Query can be restricted to specific task topics and for each task topic an individual lock time can be provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void fetchAndLockTest() throws ApiException {
        FetchExternalTasksDto fetchExternalTasksDto = null;
        List<LockedExternalTaskDto> response = api.fetchAndLock(fetchExternalTasksDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves an external task by id, corresponding to the &#x60;ExternalTask&#x60; interface in the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalTaskTest() throws ApiException {
        String id = null;
        ExternalTaskDto response = api.getExternalTask(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves the error details in the context of a running external task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalTaskErrorDetailsTest() throws ApiException {
        String id = null;
        String response = api.getExternalTaskErrorDetails(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the external tasks that fulfill given parameters. Parameters may be static as well as dynamic runtime properties of executions. The size of the result set can be retrieved by using the [Get External Task Count](https://docs.camunda.org/manual/7.14/reference/rest/external-task/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalTasksTest() throws ApiException {
        String externalTaskId = null;
        String externalTaskIdIn = null;
        String topicName = null;
        String workerId = null;
        Boolean locked = null;
        Boolean notLocked = null;
        Boolean withRetriesLeft = null;
        Boolean noRetriesLeft = null;
        OffsetDateTime lockExpirationAfter = null;
        OffsetDateTime lockExpirationBefore = null;
        String activityId = null;
        String activityIdIn = null;
        String executionId = null;
        String processInstanceId = null;
        String processInstanceIdIn = null;
        String processDefinitionId = null;
        String tenantIdIn = null;
        Boolean active = null;
        Boolean suspended = null;
        Long priorityHigherThanOrEquals = null;
        Long priorityLowerThanOrEquals = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<ExternalTaskDto> response = api.getExternalTasks(externalTaskId, externalTaskIdIn, topicName, workerId, locked, notLocked, withRetriesLeft, noRetriesLeft, lockExpirationAfter, lockExpirationBefore, activityId, activityIdIn, executionId, processInstanceId, processInstanceIdIn, processDefinitionId, tenantIdIn, active, suspended, priorityHigherThanOrEquals, priorityLowerThanOrEquals, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the number of external tasks that fulfill given parameters. Takes the same parameters as the [Get External Tasks](https://docs.camunda.org/manual/7.14/reference/rest/external-task/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getExternalTasksCountTest() throws ApiException {
        String externalTaskId = null;
        String externalTaskIdIn = null;
        String topicName = null;
        String workerId = null;
        Boolean locked = null;
        Boolean notLocked = null;
        Boolean withRetriesLeft = null;
        Boolean noRetriesLeft = null;
        OffsetDateTime lockExpirationAfter = null;
        OffsetDateTime lockExpirationBefore = null;
        String activityId = null;
        String activityIdIn = null;
        String executionId = null;
        String processInstanceId = null;
        String processInstanceIdIn = null;
        String processDefinitionId = null;
        String tenantIdIn = null;
        Boolean active = null;
        Boolean suspended = null;
        Long priorityHigherThanOrEquals = null;
        Long priorityLowerThanOrEquals = null;
        CountResultDto response = api.getExternalTasksCount(externalTaskId, externalTaskIdIn, topicName, workerId, locked, notLocked, withRetriesLeft, noRetriesLeft, lockExpirationAfter, lockExpirationBefore, activityId, activityIdIn, executionId, processInstanceId, processInstanceIdIn, processDefinitionId, tenantIdIn, active, suspended, priorityHigherThanOrEquals, priorityLowerThanOrEquals);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for distinct topic names of external tasks that fulfill given parameters. Query can be restricted to only tasks with retries left, tasks that are locked, or tasks that are unlocked. The parameters withLockedTasks and withUnlockedTasks are exclusive. Setting them both to true will return an empty list. Providing no parameters will return a list of all distinct topic names with external tasks.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTopicNamesTest() throws ApiException {
        Boolean withLockedTasks = null;
        Boolean withUnlockedTasks = null;
        Boolean withRetriesLeft = null;
        List<String> response = api.getTopicNames(withLockedTasks, withUnlockedTasks, withRetriesLeft);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Reports a business error in the context of a running external task by id. The error code must be specified to identify the BPMN error handler.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void handleExternalTaskBpmnErrorTest() throws ApiException {
        String id = null;
        ExternalTaskBpmnError externalTaskBpmnError = null;
        api.handleExternalTaskBpmnError(id, externalTaskBpmnError);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Reports a failure to execute an external task by id. A number of retries and a timeout until the task can be retried can be specified. If retries are set to 0, an incident for this task is created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void handleFailureTest() throws ApiException {
        String id = null;
        ExternalTaskFailureDto externalTaskFailureDto = null;
        api.handleFailure(id, externalTaskFailureDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for external tasks that fulfill given parameters in the form of a JSON object.  This method is slightly more powerful than the [Get External Tasks](https://docs.camunda.org/manual/7.14/reference/rest/external-task/get-query/) method because it allows to specify a hierarchical result sorting.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryExternalTasksTest() throws ApiException {
        Integer firstResult = null;
        Integer maxResults = null;
        ExternalTaskQueryDto externalTaskQueryDto = null;
        List<ExternalTaskDto> response = api.queryExternalTasks(firstResult, maxResults, externalTaskQueryDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the number of external tasks that fulfill given parameters. This method takes the same message body as the [Get External Tasks (POST)](https://docs.camunda.org/manual/7.14/reference/rest/external-task/post-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void queryExternalTasksCountTest() throws ApiException {
        ExternalTaskQueryDto externalTaskQueryDto = null;
        CountResultDto response = api.queryExternalTasksCount(externalTaskQueryDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the priority of an existing external task by id. The default value of a priority is 0.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalTaskResourcePriorityTest() throws ApiException {
        String id = null;
        PriorityDto priorityDto = null;
        api.setExternalTaskResourcePriority(id, priorityDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the number of retries left to execute an external task by id. If retries are set to 0, an  incident is created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalTaskResourceRetriesTest() throws ApiException {
        String id = null;
        RetriesDto retriesDto = null;
        api.setExternalTaskResourceRetries(id, retriesDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the number of retries left to execute external tasks by id synchronously. If retries are set to 0,  an incident is created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalTaskRetriesTest() throws ApiException {
        SetRetriesForExternalTasksDto setRetriesForExternalTasksDto = null;
        api.setExternalTaskRetries(setRetriesForExternalTasksDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the number of retries left to execute external tasks by id asynchronously. If retries are set to 0, an incident is created.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setExternalTaskRetriesAsyncOperationTest() throws ApiException {
        SetRetriesForExternalTasksDto setRetriesForExternalTasksDto = null;
        BatchDto response = api.setExternalTaskRetriesAsyncOperation(setRetriesForExternalTasksDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Unlocks an external task by id. Clears the task&#39;s lock expiration time and worker id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unlockTest() throws ApiException {
        String id = null;
        api.unlock(id);

        // TODO: test validations
    }
    
}