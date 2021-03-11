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
import de.dfki.cos.basys.common.rest.camunda.dto.ResourceOptionsDto;
import de.dfki.cos.basys.common.rest.camunda.dto.UserCredentialsDto;
import de.dfki.cos.basys.common.rest.camunda.dto.UserDto;
import de.dfki.cos.basys.common.rest.camunda.dto.UserProfileDto;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Options
     *
     * The &#x60;/user&#x60; resource supports two custom &#x60;OPTIONS&#x60; requests, one for the resource as such and one for individual user instances. The &#x60;OPTIONS&#x60; request allows checking for the set of available operations that the currently authenticated user can perform on the /user resource. If the user can perform an operation or not may depend on various things, including the user&#39;s authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void availableOperationsTest() throws ApiException {
        //ResourceOptionsDto response = api.availableOperations();
        // TODO: test validations
    }

    /**
     * Options
     *
     * The &#x60;/user&#x60; resource supports two custom &#x60;OPTIONS&#x60; requests, one for the resource as such and one for individual user instances. The &#x60;OPTIONS&#x60; request allows checking for the set of available operations that the currently authenticated user can perform on the /user resource. If the user can perform an operation or not may depend on various things, including the user&#39;s authorizations to interact with this resource and the internal configuration of the process engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void availableUserOperationsTest() throws ApiException {
        //String id = null;
        //ResourceOptionsDto response = api.availableUserOperations(id);
        // TODO: test validations
    }

    /**
     * Create
     *
     * Create a new user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUserTest() throws ApiException {
        //UserDto userDto = null;
        //api.createUser(userDto);
        // TODO: test validations
    }

    /**
     * Delete
     *
     * Deletes a user by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteUserTest() throws ApiException {
        //String id = null;
        //api.deleteUser(id);
        // TODO: test validations
    }

    /**
     * Get List Count
     *
     * Queries for the number of deployments that fulfill given parameters. Takes the same parameters as the [Get Users](https://docs.camunda.org/manual/7.14/reference/rest/user/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserCountTest() throws ApiException {
        //String id = null;
        //String idIn = null;
        //String firstName = null;
        //String firstNameLike = null;
        //String lastName = null;
        //String lastNameLike = null;
        //String email = null;
        //String emailLike = null;
        //String memberOfGroup = null;
        //String memberOfTenant = null;
        //String potentialStarter = null;
        //CountResultDto response = api.getUserCount(id, idIn, firstName, firstNameLike, lastName, lastNameLike, email, emailLike, memberOfGroup, memberOfTenant, potentialStarter);
        // TODO: test validations
    }

    /**
     * Get Profile
     *
     * Retrieves a user&#39;s profile.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUserProfileTest() throws ApiException {
        //String id = null;
        //List<UserProfileDto> response = api.getUserProfile(id);
        // TODO: test validations
    }

    /**
     * Get List
     *
     * Query for a list of users using a list of parameters. The size of the result set can be retrieved by using the Get User Count method. [Get User Count](https://docs.camunda.org/manual/7.14/reference/rest/user/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getUsersTest() throws ApiException {
        //String id = null;
        //String idIn = null;
        //String firstName = null;
        //String firstNameLike = null;
        //String lastName = null;
        //String lastNameLike = null;
        //String email = null;
        //String emailLike = null;
        //String memberOfGroup = null;
        //String memberOfTenant = null;
        //String potentialStarter = null;
        //String sortBy = null;
        //String sortOrder = null;
        //Integer firstResult = null;
        //Integer maxResults = null;
        //List<UserProfileDto> response = api.getUsers(id, idIn, firstName, firstNameLike, lastName, lastNameLike, email, emailLike, memberOfGroup, memberOfTenant, potentialStarter, sortBy, sortOrder, firstResult, maxResults);
        // TODO: test validations
    }

    /**
     * Unlock User
     *
     * Unlocks a user by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void unlockUserTest() throws ApiException {
        //String id = null;
        //api.unlockUser(id);
        // TODO: test validations
    }

    /**
     * Update Credentials
     *
     * Updates a user&#39;s credentials (password)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateCredentialsTest() throws ApiException {
        //String id = null;
        //String password = null;
        //String authenticatedUserPassword = null;
        //UserCredentialsDto userCredentialsDto = null;
        //Object response = api.updateCredentials(id, password, authenticatedUserPassword, userCredentialsDto);
        // TODO: test validations
    }

}
