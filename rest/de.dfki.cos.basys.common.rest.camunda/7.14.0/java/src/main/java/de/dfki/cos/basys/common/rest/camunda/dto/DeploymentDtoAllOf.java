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


package de.dfki.cos.basys.common.rest.camunda.dto;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * DeploymentDtoAllOf
 */
@JsonPropertyOrder({
  DeploymentDtoAllOf.JSON_PROPERTY_ID,
  DeploymentDtoAllOf.JSON_PROPERTY_TENANT_ID,
  DeploymentDtoAllOf.JSON_PROPERTY_DEPLOYMENT_TIME,
  DeploymentDtoAllOf.JSON_PROPERTY_SOURCE,
  DeploymentDtoAllOf.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class DeploymentDtoAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_DEPLOYMENT_TIME = "deploymentTime";
  private OffsetDateTime deploymentTime;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;


  public DeploymentDtoAllOf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DeploymentDtoAllOf tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the deployment.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the deployment.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public DeploymentDtoAllOf deploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
    return this;
  }

   /**
   * The time when the deployment was created.
   * @return deploymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the deployment was created.")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDeploymentTime() {
    return deploymentTime;
  }


  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
  }


  public DeploymentDtoAllOf source(String source) {
    this.source = source;
    return this;
  }

   /**
   * The source of the deployment.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the deployment.")
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public DeploymentDtoAllOf name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the deployment.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this DeploymentDto_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDtoAllOf deploymentDtoAllOf = (DeploymentDtoAllOf) o;
    return Objects.equals(this.id, deploymentDtoAllOf.id) &&
        Objects.equals(this.tenantId, deploymentDtoAllOf.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDtoAllOf.deploymentTime) &&
        Objects.equals(this.source, deploymentDtoAllOf.source) &&
        Objects.equals(this.name, deploymentDtoAllOf.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

