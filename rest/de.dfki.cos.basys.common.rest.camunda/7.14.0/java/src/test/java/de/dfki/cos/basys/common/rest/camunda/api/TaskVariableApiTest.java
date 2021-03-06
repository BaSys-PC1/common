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
import java.io.File;
import de.dfki.cos.basys.common.rest.camunda.dto.PatchVariablesDto;
import de.dfki.cos.basys.common.rest.camunda.dto.VariableValueDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskVariableApi
 */
@Ignore
public class TaskVariableApiTest {

    private final TaskVariableApi api = new TaskVariableApi();

    
    /**
     * 
     *
     * Removes a variable that is visible to a task. A variable is visible to a task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        api.deleteTaskVariable(id, varName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a variable from the context of a given task. The variable must be visible from the task. It is visible from the task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        Boolean deserializeValue = null;
        VariableValueDto response = api.getTaskVariable(id, varName, deserializeValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a binary variable from the context of a given task. Applicable for byte array and file variables. The variable must be visible from the task. It is visible from the task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskVariableBinaryTest() throws ApiException {
        String id = null;
        String varName = null;
        File response = api.getTaskVariableBinary(id, varName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves all variables visible from the task. A variable is visible from the task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskVariablesTest() throws ApiException {
        String id = null;
        Boolean deserializeValue = null;
        Map<String, VariableValueDto> response = api.getTaskVariables(id, deserializeValue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates or deletes the variables visible from the task. Updates precede deletions. So, if a variable is updated AND deleted, the deletion overrides the update. A variable is visible from the task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyTaskVariablesTest() throws ApiException {
        String id = null;
        PatchVariablesDto patchVariablesDto = null;
        api.modifyTaskVariables(id, patchVariablesDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates a process variable that is visible from the Task scope. A variable is visible from the task if it is a local task variable, or declared in a parent scope of the task. See the documentation on [variable scopes and visibility](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables#variable-scopes-and-variable-visibility).  **Note**: If a variable doesn&#39;t exist, the variable is created in the top-most scope visible from the task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTaskVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        VariableValueDto variableValueDto = null;
        api.putTaskVariable(id, varName, variableValueDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Sets the serialized value for a binary variable or the binary value for a file variable visible from the task. A variable is visible from the task if it is a local task variable or declared in a parent scope of the task. See documentation on [visiblity of variables](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBinaryTaskVariableTest() throws ApiException {
        String id = null;
        String varName = null;
        File data = null;
        String valueType = null;
        api.setBinaryTaskVariable(id, varName, data, valueType);

        // TODO: test validations
    }
    
}
