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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * ProcessInstanceDtoAllOf
 */
@JsonPropertyOrder({
  ProcessInstanceDtoAllOf.JSON_PROPERTY_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_DEFINITION_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_BUSINESS_KEY,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_CASE_INSTANCE_ID,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_ENDED,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_SUSPENDED,
  ProcessInstanceDtoAllOf.JSON_PROPERTY_TENANT_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class ProcessInstanceDtoAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_DEFINITION_ID = "definitionId";
  private String definitionId;

  public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
  private String businessKey;

  public static final String JSON_PROPERTY_CASE_INSTANCE_ID = "caseInstanceId";
  private String caseInstanceId;

  public static final String JSON_PROPERTY_ENDED = "ended";
  private Boolean ended;

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private Boolean suspended;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;


  public ProcessInstanceDtoAllOf id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the process instance.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ProcessInstanceDtoAllOf definitionId(String definitionId) {
    this.definitionId = definitionId;
    return this;
  }

   /**
   * The id of the process definition that this process instance belongs to.
   * @return definitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition that this process instance belongs to.")
  @JsonProperty(JSON_PROPERTY_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDefinitionId() {
    return definitionId;
  }


  public void setDefinitionId(String definitionId) {
    this.definitionId = definitionId;
  }


  public ProcessInstanceDtoAllOf businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  public ProcessInstanceDtoAllOf caseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
    return this;
  }

   /**
   * The id of the case instance associated with the process instance.
   * @return caseInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the case instance associated with the process instance.")
  @JsonProperty(JSON_PROPERTY_CASE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaseInstanceId() {
    return caseInstanceId;
  }


  public void setCaseInstanceId(String caseInstanceId) {
    this.caseInstanceId = caseInstanceId;
  }


  public ProcessInstanceDtoAllOf ended(Boolean ended) {
    this.ended = ended;
    return this;
  }

   /**
   * A flag indicating whether the process instance has ended or not. Deprecated: will always be false!
   * @return ended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process instance has ended or not. Deprecated: will always be false!")
  @JsonProperty(JSON_PROPERTY_ENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnded() {
    return ended;
  }


  public void setEnded(Boolean ended) {
    this.ended = ended;
  }


  public ProcessInstanceDtoAllOf suspended(Boolean suspended) {
    this.suspended = suspended;
    return this;
  }

   /**
   * A flag indicating whether the process instance is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the process instance is suspended or not.")
  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSuspended() {
    return suspended;
  }


  public void setSuspended(Boolean suspended) {
    this.suspended = suspended;
  }


  public ProcessInstanceDtoAllOf tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the process instance.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the process instance.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  /**
   * Return true if this ProcessInstanceDto_allOf object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceDtoAllOf processInstanceDtoAllOf = (ProcessInstanceDtoAllOf) o;
    return Objects.equals(this.id, processInstanceDtoAllOf.id) &&
        Objects.equals(this.definitionId, processInstanceDtoAllOf.definitionId) &&
        Objects.equals(this.businessKey, processInstanceDtoAllOf.businessKey) &&
        Objects.equals(this.caseInstanceId, processInstanceDtoAllOf.caseInstanceId) &&
        Objects.equals(this.ended, processInstanceDtoAllOf.ended) &&
        Objects.equals(this.suspended, processInstanceDtoAllOf.suspended) &&
        Objects.equals(this.tenantId, processInstanceDtoAllOf.tenantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, definitionId, businessKey, caseInstanceId, ended, suspended, tenantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceDtoAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    definitionId: ").append(toIndentedString(definitionId)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
    sb.append("    caseInstanceId: ").append(toIndentedString(caseInstanceId)).append("\n");
    sb.append("    ended: ").append(toIndentedString(ended)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

