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
import de.dfki.cos.basys.common.rest.camunda.dto.IdentityLinkDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TaskIdentityLinkApi
 */
@Ignore
public class TaskIdentityLinkApiTest {

    private final TaskIdentityLinkApi api = new TaskIdentityLinkApi();

    
    /**
     * 
     *
     * Adds an identity link to a task by id. Can be used to link any user or group to a task and specify a relation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addIdentityLinkTest() throws ApiException {
        String id = null;
        IdentityLinkDto identityLinkDto = null;
        api.addIdentityLink(id, identityLinkDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Removes an identity link from a task by id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIdentityLinkTest() throws ApiException {
        String id = null;
        IdentityLinkDto identityLinkDto = null;
        api.deleteIdentityLink(id, identityLinkDto);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Gets the identity links for a task by id, which are the users and groups that are in *some* relation to it (including assignee and owner).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIdentityLinksTest() throws ApiException {
        String id = null;
        String type = null;
        List<IdentityLinkDto> response = api.getIdentityLinks(id, type);

        // TODO: test validations
    }
    
}
