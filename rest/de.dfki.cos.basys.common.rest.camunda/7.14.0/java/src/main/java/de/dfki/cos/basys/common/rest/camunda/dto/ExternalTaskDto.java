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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * An External Task object with the following properties
 */
@ApiModel(description = "An External Task object with the following properties")
@JsonPropertyOrder({
  ExternalTaskDto.JSON_PROPERTY_ACTIVITY_ID,
  ExternalTaskDto.JSON_PROPERTY_ACTIVITY_INSTANCE_ID,
  ExternalTaskDto.JSON_PROPERTY_ERROR_MESSAGE,
  ExternalTaskDto.JSON_PROPERTY_EXECUTION_ID,
  ExternalTaskDto.JSON_PROPERTY_ID,
  ExternalTaskDto.JSON_PROPERTY_LOCK_EXPIRATION_TIME,
  ExternalTaskDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  ExternalTaskDto.JSON_PROPERTY_PROCESS_DEFINITION_KEY,
  ExternalTaskDto.JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG,
  ExternalTaskDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  ExternalTaskDto.JSON_PROPERTY_TENANT_ID,
  ExternalTaskDto.JSON_PROPERTY_RETRIES,
  ExternalTaskDto.JSON_PROPERTY_SUSPENDED,
  ExternalTaskDto.JSON_PROPERTY_WORKER_ID,
  ExternalTaskDto.JSON_PROPERTY_TOPIC_NAME,
  ExternalTaskDto.JSON_PROPERTY_PRIORITY,
  ExternalTaskDto.JSON_PROPERTY_BUSINESS_KEY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class ExternalTaskDto {
  public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
  private String activityId;

  public static final String JSON_PROPERTY_ACTIVITY_INSTANCE_ID = "activityInstanceId";
  private String activityInstanceId;

  public static final String JSON_PROPERTY_ERROR_MESSAGE = "errorMessage";
  private String errorMessage;

  public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
  private String executionId;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LOCK_EXPIRATION_TIME = "lockExpirationTime";
  private JsonNullable<OffsetDateTime> lockExpirationTime = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_KEY = "processDefinitionKey";
  private String processDefinitionKey;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG = "processDefinitionVersionTag";
  private String processDefinitionVersionTag;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private String processInstanceId;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_RETRIES = "retries";
  private JsonNullable<Integer> retries = JsonNullable.<Integer>undefined();

  public static final String JSON_PROPERTY_SUSPENDED = "suspended";
  private JsonNullable<Boolean> suspended = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_WORKER_ID = "workerId";
  private String workerId;

  public static final String JSON_PROPERTY_TOPIC_NAME = "topicName";
  private String topicName;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private JsonNullable<Long> priority = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_BUSINESS_KEY = "businessKey";
  private String businessKey;


  public ExternalTaskDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity that this external task belongs to.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity that this external task belongs to.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public ExternalTaskDto activityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
    return this;
  }

   /**
   * The id of the activity instance that the external task belongs to.
   * @return activityInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity instance that the external task belongs to.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityInstanceId() {
    return activityInstanceId;
  }


  public void setActivityInstanceId(String activityInstanceId) {
    this.activityInstanceId = activityInstanceId;
  }


  public ExternalTaskDto errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * The full error message submitted with the latest reported failure executing this task; &#x60;null&#x60; if no failure was reported previously or if no error message was submitted
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The full error message submitted with the latest reported failure executing this task; `null` if no failure was reported previously or if no error message was submitted")
  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ExternalTaskDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * The id of the execution that the external task belongs to.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the execution that the external task belongs to.")
  @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public ExternalTaskDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the external task.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the external task.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ExternalTaskDto lockExpirationTime(OffsetDateTime lockExpirationTime) {
    this.lockExpirationTime = JsonNullable.<OffsetDateTime>of(lockExpirationTime);
    return this;
  }

   /**
   * The date that the task&#39;s most recent lock expires or has expired.
   * @return lockExpirationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The date that the task's most recent lock expires or has expired.")
  @JsonIgnore

  public OffsetDateTime getLockExpirationTime() {
        return lockExpirationTime.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCK_EXPIRATION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getLockExpirationTime_JsonNullable() {
    return lockExpirationTime;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCK_EXPIRATION_TIME)
  public void setLockExpirationTime_JsonNullable(JsonNullable<OffsetDateTime> lockExpirationTime) {
    this.lockExpirationTime = lockExpirationTime;
  }

  public void setLockExpirationTime(OffsetDateTime lockExpirationTime) {
    this.lockExpirationTime = JsonNullable.<OffsetDateTime>of(lockExpirationTime);
  }


  public ExternalTaskDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition the external task is defined in.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition the external task is defined in.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public ExternalTaskDto processDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
    return this;
  }

   /**
   * The key of the process definition the external task is defined in.
   * @return processDefinitionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The key of the process definition the external task is defined in.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionKey() {
    return processDefinitionKey;
  }


  public void setProcessDefinitionKey(String processDefinitionKey) {
    this.processDefinitionKey = processDefinitionKey;
  }


  public ExternalTaskDto processDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
    return this;
  }

   /**
   * The version tag of the process definition the external task is defined in.
   * @return processDefinitionVersionTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The version tag of the process definition the external task is defined in.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_VERSION_TAG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionVersionTag() {
    return processDefinitionVersionTag;
  }


  public void setProcessDefinitionVersionTag(String processDefinitionVersionTag) {
    this.processDefinitionVersionTag = processDefinitionVersionTag;
  }


  public ExternalTaskDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The id of the process instance the external task belongs to.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance the external task belongs to.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public ExternalTaskDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The id of the tenant the external task belongs to.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant the external task belongs to.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public ExternalTaskDto retries(Integer retries) {
    this.retries = JsonNullable.<Integer>of(retries);
    return this;
  }

   /**
   * The number of retries the task currently has left.
   * @return retries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of retries the task currently has left.")
  @JsonIgnore

  public Integer getRetries() {
        return retries.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RETRIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Integer> getRetries_JsonNullable() {
    return retries;
  }
  
  @JsonProperty(JSON_PROPERTY_RETRIES)
  public void setRetries_JsonNullable(JsonNullable<Integer> retries) {
    this.retries = retries;
  }

  public void setRetries(Integer retries) {
    this.retries = JsonNullable.<Integer>of(retries);
  }


  public ExternalTaskDto suspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
    return this;
  }

   /**
   * A flag indicating whether the external task is suspended or not.
   * @return suspended
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A flag indicating whether the external task is suspended or not.")
  @JsonIgnore

  public Boolean getSuspended() {
        return suspended.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSuspended_JsonNullable() {
    return suspended;
  }
  
  @JsonProperty(JSON_PROPERTY_SUSPENDED)
  public void setSuspended_JsonNullable(JsonNullable<Boolean> suspended) {
    this.suspended = suspended;
  }

  public void setSuspended(Boolean suspended) {
    this.suspended = JsonNullable.<Boolean>of(suspended);
  }


  public ExternalTaskDto workerId(String workerId) {
    this.workerId = workerId;
    return this;
  }

   /**
   * The id of the worker that posesses or posessed the most recent lock.
   * @return workerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the worker that posesses or posessed the most recent lock.")
  @JsonProperty(JSON_PROPERTY_WORKER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWorkerId() {
    return workerId;
  }


  public void setWorkerId(String workerId) {
    this.workerId = workerId;
  }


  public ExternalTaskDto topicName(String topicName) {
    this.topicName = topicName;
    return this;
  }

   /**
   * The topic name of the external task.
   * @return topicName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The topic name of the external task.")
  @JsonProperty(JSON_PROPERTY_TOPIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTopicName() {
    return topicName;
  }


  public void setTopicName(String topicName) {
    this.topicName = topicName;
  }


  public ExternalTaskDto priority(Long priority) {
    this.priority = JsonNullable.<Long>of(priority);
    return this;
  }

   /**
   * The priority of the external task.
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The priority of the external task.")
  @JsonIgnore

  public Long getPriority() {
        return priority.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Long> getPriority_JsonNullable() {
    return priority;
  }
  
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  public void setPriority_JsonNullable(JsonNullable<Long> priority) {
    this.priority = priority;
  }

  public void setPriority(Long priority) {
    this.priority = JsonNullable.<Long>of(priority);
  }


  public ExternalTaskDto businessKey(String businessKey) {
    this.businessKey = businessKey;
    return this;
  }

   /**
   * The business key of the process instance the external task belongs to.
   * @return businessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The business key of the process instance the external task belongs to.")
  @JsonProperty(JSON_PROPERTY_BUSINESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessKey() {
    return businessKey;
  }


  public void setBusinessKey(String businessKey) {
    this.businessKey = businessKey;
  }


  /**
   * Return true if this ExternalTaskDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalTaskDto externalTaskDto = (ExternalTaskDto) o;
    return Objects.equals(this.activityId, externalTaskDto.activityId) &&
        Objects.equals(this.activityInstanceId, externalTaskDto.activityInstanceId) &&
        Objects.equals(this.errorMessage, externalTaskDto.errorMessage) &&
        Objects.equals(this.executionId, externalTaskDto.executionId) &&
        Objects.equals(this.id, externalTaskDto.id) &&
        Objects.equals(this.lockExpirationTime, externalTaskDto.lockExpirationTime) &&
        Objects.equals(this.processDefinitionId, externalTaskDto.processDefinitionId) &&
        Objects.equals(this.processDefinitionKey, externalTaskDto.processDefinitionKey) &&
        Objects.equals(this.processDefinitionVersionTag, externalTaskDto.processDefinitionVersionTag) &&
        Objects.equals(this.processInstanceId, externalTaskDto.processInstanceId) &&
        Objects.equals(this.tenantId, externalTaskDto.tenantId) &&
        Objects.equals(this.retries, externalTaskDto.retries) &&
        Objects.equals(this.suspended, externalTaskDto.suspended) &&
        Objects.equals(this.workerId, externalTaskDto.workerId) &&
        Objects.equals(this.topicName, externalTaskDto.topicName) &&
        Objects.equals(this.priority, externalTaskDto.priority) &&
        Objects.equals(this.businessKey, externalTaskDto.businessKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, activityInstanceId, errorMessage, executionId, id, lockExpirationTime, processDefinitionId, processDefinitionKey, processDefinitionVersionTag, processInstanceId, tenantId, retries, suspended, workerId, topicName, priority, businessKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalTaskDto {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityInstanceId: ").append(toIndentedString(activityInstanceId)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lockExpirationTime: ").append(toIndentedString(lockExpirationTime)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processDefinitionKey: ").append(toIndentedString(processDefinitionKey)).append("\n");
    sb.append("    processDefinitionVersionTag: ").append(toIndentedString(processDefinitionVersionTag)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    suspended: ").append(toIndentedString(suspended)).append("\n");
    sb.append("    workerId: ").append(toIndentedString(workerId)).append("\n");
    sb.append("    topicName: ").append(toIndentedString(topicName)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    businessKey: ").append(toIndentedString(businessKey)).append("\n");
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

