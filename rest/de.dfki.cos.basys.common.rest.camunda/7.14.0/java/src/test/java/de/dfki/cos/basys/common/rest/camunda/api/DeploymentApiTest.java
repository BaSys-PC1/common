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
import de.dfki.cos.basys.common.rest.camunda.dto.CountResultDto;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentDto;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentResourceDto;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentWithDefinitionsDto;
import de.dfki.cos.basys.common.rest.camunda.dto.ExceptionDto;
import java.io.File;
import org.threeten.bp.OffsetDateTime;
import de.dfki.cos.basys.common.rest.camunda.dto.ParseExceptionDto;
import de.dfki.cos.basys.common.rest.camunda.dto.RedeploymentDto;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DeploymentApi
 */
@Ignore
public class DeploymentApiTest {

    private final DeploymentApi api = new DeploymentApi();

    
    /**
     * 
     *
     * Creates a deployment.  **Security Consideration**  Deployments can contain custom code in form of scripts or EL expressions to customize process behavior. This may be abused for remote execution of arbitrary code.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createDeploymentTest() throws ApiException {
        String tenantId = null;
        String deploymentSource = null;
        Boolean deployChangedOnly = null;
        Boolean enableDuplicateFiltering = null;
        String deploymentName = null;
        File data = null;
        DeploymentWithDefinitionsDto response = api.createDeployment(tenantId, deploymentSource, deployChangedOnly, enableDuplicateFiltering, deploymentName, data);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a deployment by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDeploymentTest() throws ApiException {
        String id = null;
        Boolean cascade = null;
        Boolean skipCustomListeners = null;
        Boolean skipIoMappings = null;
        api.deleteDeployment(id, cascade, skipCustomListeners, skipIoMappings);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a deployment by id, according to the &#x60;Deployment&#x60; interface of the engine.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentTest() throws ApiException {
        String id = null;
        List<DeploymentDto> response = api.getDeployment(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves a deployment resource by resource id for the given deployment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentResourceTest() throws ApiException {
        String id = null;
        String resourceId = null;
        DeploymentResourceDto response = api.getDeploymentResource(id, resourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves the binary content of a deployment resource for the given deployment by id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentResourceDataTest() throws ApiException {
        String id = null;
        String resourceId = null;
        File response = api.getDeploymentResourceData(id, resourceId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieves all deployment resources of a given deployment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentResourcesTest() throws ApiException {
        String id = null;
        List<DeploymentResourceDto> response = api.getDeploymentResources(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for deployments that fulfill given parameters. Parameters may be the properties of deployments, such as the id or name or a range of the deployment time. The size of the result set can be retrieved by using the [Get Deployment count](https://docs.camunda.org/manual/7.14/reference/rest/deployment/get-query-count/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentsTest() throws ApiException {
        String id = null;
        String name = null;
        String nameLike = null;
        String source = null;
        Boolean withoutSource = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDeploymentsWithoutTenantId = null;
        OffsetDateTime after = null;
        OffsetDateTime before = null;
        String sortBy = null;
        String sortOrder = null;
        Integer firstResult = null;
        Integer maxResults = null;
        List<DeploymentDto> response = api.getDeployments(id, name, nameLike, source, withoutSource, tenantIdIn, withoutTenantId, includeDeploymentsWithoutTenantId, after, before, sortBy, sortOrder, firstResult, maxResults);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Queries for the number of deployments that fulfill given parameters. Takes the same parameters as the [Get Deployments](https://docs.camunda.org/manual/7.14/reference/rest/deployment/get-query/) method.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDeploymentsCountTest() throws ApiException {
        String id = null;
        String name = null;
        String nameLike = null;
        String source = null;
        Boolean withoutSource = null;
        String tenantIdIn = null;
        Boolean withoutTenantId = null;
        Boolean includeDeploymentsWithoutTenantId = null;
        OffsetDateTime after = null;
        OffsetDateTime before = null;
        CountResultDto response = api.getDeploymentsCount(id, name, nameLike, source, withoutSource, tenantIdIn, withoutTenantId, includeDeploymentsWithoutTenantId, after, before);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Re-deploys an existing deployment.  The deployment resources to re-deploy can be restricted by using the properties &#x60;resourceIds&#x60; or &#x60;resourceNames&#x60;. If no deployment resources to re-deploy are passed then all existing resources of the given deployment are re-deployed.  **Warning**: Deployments can contain custom code in form of scripts or EL expressions to customize process behavior. This may be abused for remote execution of arbitrary code. See the section on [security considerations for custom code](https://docs.camunda.org/manual/7.14/user-guide/process-engine/securing-custom-code/) in the user guide for details.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void redeployTest() throws ApiException {
        String id = null;
        RedeploymentDto redeploymentDto = null;
        DeploymentWithDefinitionsDto response = api.redeploy(id, redeploymentDto);

        // TODO: test validations
    }
    
}
