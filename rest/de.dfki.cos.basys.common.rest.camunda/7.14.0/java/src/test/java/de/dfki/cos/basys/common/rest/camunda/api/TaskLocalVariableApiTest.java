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
import de.dfki.cos.basys.common.rest.camunda.dto.ExceptionDto;
import java.io.File;
import de.dfki.cos.basys.common.rest.camunda.dto.PatchVariablesDto;
import de.dfki.cos.basys.common.rest.camunda.dto.VariableValueDto;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskLocalVariableApi
 */
public class TaskLocalVariableApiTest {

    private final TaskLocalVariableApi api = new TaskLocalVariableApi();

    /**
     * 
     *
     * Removes a local variable from a task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTaskLocalVariableTest() throws ApiException {
        //String id = null;
        //String varName = null;
        //api.deleteTaskLocalVariable(id, varName);
        // TODO: test validations
    }

    /**
     * 
     *
     * Retrieves a variable from the context of a given task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskLocalVariableTest() throws ApiException {
        //String id = null;
        //String varName = null;
        //Boolean deserializeValue = null;
        //VariableValueDto response = api.getTaskLocalVariable(id, varName, deserializeValue);
        // TODO: test validations
    }

    /**
     * 
     *
     * Retrieves a binary variable from the context of a given task by id. Applicable for byte array and file variables.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskLocalVariableBinaryTest() throws ApiException {
        //String id = null;
        //String varName = null;
        //File response = api.getTaskLocalVariableBinary(id, varName);
        // TODO: test validations
    }

    /**
     * 
     *
     * Retrieves all variables of a given task by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaskLocalVariablesTest() throws ApiException {
        //String id = null;
        //Boolean deserializeValues = null;
        //Map<String, VariableValueDto> response = api.getTaskLocalVariables(id, deserializeValues);
        // TODO: test validations
    }

    /**
     * 
     *
     * Updates or deletes the variables in the context of a task. Updates precede deletions. So, if a variable is updated AND deleted, the deletion overrides the update.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modifyTaskLocalVariablesTest() throws ApiException {
        //String id = null;
        //PatchVariablesDto patchVariablesDto = null;
        //api.modifyTaskLocalVariables(id, patchVariablesDto);
        // TODO: test validations
    }

    /**
     * 
     *
     * Sets a variable in the context of a given task.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void putTaskLocalVariableTest() throws ApiException {
        //String id = null;
        //String varName = null;
        //VariableValueDto variableValueDto = null;
        //api.putTaskLocalVariable(id, varName, variableValueDto);
        // TODO: test validations
    }

    /**
     * 
     *
     * Sets the serialized value for a binary variable or the binary value for a file variable.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setBinaryTaskLocalVariableTest() throws ApiException {
        //String id = null;
        //String varName = null;
        //File data = null;
        //String valueType = null;
        //api.setBinaryTaskLocalVariable(id, varName, data, valueType);
        // TODO: test validations
    }

}
