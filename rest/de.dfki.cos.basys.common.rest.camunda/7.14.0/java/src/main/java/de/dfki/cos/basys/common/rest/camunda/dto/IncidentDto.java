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
 * IncidentDto
 */
@JsonPropertyOrder({
  IncidentDto.JSON_PROPERTY_ID,
  IncidentDto.JSON_PROPERTY_PROCESS_DEFINITION_ID,
  IncidentDto.JSON_PROPERTY_PROCESS_INSTANCE_ID,
  IncidentDto.JSON_PROPERTY_EXECUTION_ID,
  IncidentDto.JSON_PROPERTY_INCIDENT_TIMESTAMP,
  IncidentDto.JSON_PROPERTY_INCIDENT_TYPE,
  IncidentDto.JSON_PROPERTY_ACTIVITY_ID,
  IncidentDto.JSON_PROPERTY_FAILED_ACTIVITY_ID,
  IncidentDto.JSON_PROPERTY_CAUSE_INCIDENT_ID,
  IncidentDto.JSON_PROPERTY_ROOT_CAUSE_INCIDENT_ID,
  IncidentDto.JSON_PROPERTY_CONFIGURATION,
  IncidentDto.JSON_PROPERTY_TENANT_ID,
  IncidentDto.JSON_PROPERTY_INCIDENT_MESSAGE,
  IncidentDto.JSON_PROPERTY_JOB_DEFINITION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class IncidentDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_PROCESS_DEFINITION_ID = "processDefinitionId";
  private String processDefinitionId;

  public static final String JSON_PROPERTY_PROCESS_INSTANCE_ID = "processInstanceId";
  private String processInstanceId;

  public static final String JSON_PROPERTY_EXECUTION_ID = "executionId";
  private String executionId;

  public static final String JSON_PROPERTY_INCIDENT_TIMESTAMP = "incidentTimestamp";
  private JsonNullable<OffsetDateTime> incidentTimestamp = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_INCIDENT_TYPE = "incidentType";
  private String incidentType;

  public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
  private String activityId;

  public static final String JSON_PROPERTY_FAILED_ACTIVITY_ID = "failedActivityId";
  private String failedActivityId;

  public static final String JSON_PROPERTY_CAUSE_INCIDENT_ID = "causeIncidentId";
  private String causeIncidentId;

  public static final String JSON_PROPERTY_ROOT_CAUSE_INCIDENT_ID = "rootCauseIncidentId";
  private String rootCauseIncidentId;

  public static final String JSON_PROPERTY_CONFIGURATION = "configuration";
  private String _configuration;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_INCIDENT_MESSAGE = "incidentMessage";
  private String incidentMessage;

  public static final String JSON_PROPERTY_JOB_DEFINITION_ID = "jobDefinitionId";
  private String jobDefinitionId;


  public IncidentDto id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the incident.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the incident.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public IncidentDto processDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
    return this;
  }

   /**
   * The id of the process definition this incident is associated with.
   * @return processDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process definition this incident is associated with.")
  @JsonProperty(JSON_PROPERTY_PROCESS_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessDefinitionId() {
    return processDefinitionId;
  }


  public void setProcessDefinitionId(String processDefinitionId) {
    this.processDefinitionId = processDefinitionId;
  }


  public IncidentDto processInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
    return this;
  }

   /**
   * The id of the process instance this incident is associated with.
   * @return processInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the process instance this incident is associated with.")
  @JsonProperty(JSON_PROPERTY_PROCESS_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProcessInstanceId() {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId) {
    this.processInstanceId = processInstanceId;
  }


  public IncidentDto executionId(String executionId) {
    this.executionId = executionId;
    return this;
  }

   /**
   * The id of the execution this incident is associated with.
   * @return executionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the execution this incident is associated with.")
  @JsonProperty(JSON_PROPERTY_EXECUTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExecutionId() {
    return executionId;
  }


  public void setExecutionId(String executionId) {
    this.executionId = executionId;
  }


  public IncidentDto incidentTimestamp(OffsetDateTime incidentTimestamp) {
    this.incidentTimestamp = JsonNullable.<OffsetDateTime>of(incidentTimestamp);
    return this;
  }

   /**
   * The time this incident happened. By [default](https://docs.camunda.org/manual/7.14/reference/rest/overview/date-format/), the date must have the format &#x60;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ&#x60;, e.g., &#x60;2013-01-23T14:42:45.000+0200&#x60;.
   * @return incidentTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time this incident happened. By [default](https://docs.camunda.org/manual/7.14/reference/rest/overview/date-format/), the date must have the format `yyyy-MM-dd'T'HH:mm:ss.SSSZ`, e.g., `2013-01-23T14:42:45.000+0200`.")
  @JsonIgnore

  public OffsetDateTime getIncidentTimestamp() {
        return incidentTimestamp.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCIDENT_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OffsetDateTime> getIncidentTimestamp_JsonNullable() {
    return incidentTimestamp;
  }
  
  @JsonProperty(JSON_PROPERTY_INCIDENT_TIMESTAMP)
  public void setIncidentTimestamp_JsonNullable(JsonNullable<OffsetDateTime> incidentTimestamp) {
    this.incidentTimestamp = incidentTimestamp;
  }

  public void setIncidentTimestamp(OffsetDateTime incidentTimestamp) {
    this.incidentTimestamp = JsonNullable.<OffsetDateTime>of(incidentTimestamp);
  }


  public IncidentDto incidentType(String incidentType) {
    this.incidentType = incidentType;
    return this;
  }

   /**
   * The type of incident, for example: &#x60;failedJobs&#x60; will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](https://docs.camunda.org/manual/7.14/user-guide/process-engine/incidents/#incident-types) for a list of incident types.
   * @return incidentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The type of incident, for example: `failedJobs` will be returned in case of an incident which identified a failed job during the execution of a process instance. See the [User Guide](https://docs.camunda.org/manual/7.14/user-guide/process-engine/incidents/#incident-types) for a list of incident types.")
  @JsonProperty(JSON_PROPERTY_INCIDENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIncidentType() {
    return incidentType;
  }


  public void setIncidentType(String incidentType) {
    this.incidentType = incidentType;
  }


  public IncidentDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * The id of the activity this incident is associated with.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity this incident is associated with.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public IncidentDto failedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
    return this;
  }

   /**
   * The id of the activity on which the last exception occurred.
   * @return failedActivityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the activity on which the last exception occurred.")
  @JsonProperty(JSON_PROPERTY_FAILED_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFailedActivityId() {
    return failedActivityId;
  }


  public void setFailedActivityId(String failedActivityId) {
    this.failedActivityId = failedActivityId;
  }


  public IncidentDto causeIncidentId(String causeIncidentId) {
    this.causeIncidentId = causeIncidentId;
    return this;
  }

   /**
   * The id of the associated cause incident which has been triggered.
   * @return causeIncidentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the associated cause incident which has been triggered.")
  @JsonProperty(JSON_PROPERTY_CAUSE_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCauseIncidentId() {
    return causeIncidentId;
  }


  public void setCauseIncidentId(String causeIncidentId) {
    this.causeIncidentId = causeIncidentId;
  }


  public IncidentDto rootCauseIncidentId(String rootCauseIncidentId) {
    this.rootCauseIncidentId = rootCauseIncidentId;
    return this;
  }

   /**
   * The id of the associated root cause incident which has been triggered.
   * @return rootCauseIncidentId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the associated root cause incident which has been triggered.")
  @JsonProperty(JSON_PROPERTY_ROOT_CAUSE_INCIDENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRootCauseIncidentId() {
    return rootCauseIncidentId;
  }


  public void setRootCauseIncidentId(String rootCauseIncidentId) {
    this.rootCauseIncidentId = rootCauseIncidentId;
  }


  public IncidentDto _configuration(String _configuration) {
    this._configuration = _configuration;
    return this;
  }

   /**
   * The payload of this incident.
   * @return _configuration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The payload of this incident.")
  @JsonProperty(JSON_PROPERTY_CONFIGURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getConfiguration() {
    return _configuration;
  }


  public void setConfiguration(String _configuration) {
    this._configuration = _configuration;
  }


  public IncidentDto tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The id of the tenant this incident is associated with.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the tenant this incident is associated with.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public IncidentDto incidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
    return this;
  }

   /**
   * The message of this incident.
   * @return incidentMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The message of this incident.")
  @JsonProperty(JSON_PROPERTY_INCIDENT_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIncidentMessage() {
    return incidentMessage;
  }


  public void setIncidentMessage(String incidentMessage) {
    this.incidentMessage = incidentMessage;
  }


  public IncidentDto jobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
    return this;
  }

   /**
   * The job definition id the incident is associated with.
   * @return jobDefinitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job definition id the incident is associated with.")
  @JsonProperty(JSON_PROPERTY_JOB_DEFINITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJobDefinitionId() {
    return jobDefinitionId;
  }


  public void setJobDefinitionId(String jobDefinitionId) {
    this.jobDefinitionId = jobDefinitionId;
  }


  /**
   * Return true if this IncidentDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentDto incidentDto = (IncidentDto) o;
    return Objects.equals(this.id, incidentDto.id) &&
        Objects.equals(this.processDefinitionId, incidentDto.processDefinitionId) &&
        Objects.equals(this.processInstanceId, incidentDto.processInstanceId) &&
        Objects.equals(this.executionId, incidentDto.executionId) &&
        Objects.equals(this.incidentTimestamp, incidentDto.incidentTimestamp) &&
        Objects.equals(this.incidentType, incidentDto.incidentType) &&
        Objects.equals(this.activityId, incidentDto.activityId) &&
        Objects.equals(this.failedActivityId, incidentDto.failedActivityId) &&
        Objects.equals(this.causeIncidentId, incidentDto.causeIncidentId) &&
        Objects.equals(this.rootCauseIncidentId, incidentDto.rootCauseIncidentId) &&
        Objects.equals(this._configuration, incidentDto._configuration) &&
        Objects.equals(this.tenantId, incidentDto.tenantId) &&
        Objects.equals(this.incidentMessage, incidentDto.incidentMessage) &&
        Objects.equals(this.jobDefinitionId, incidentDto.jobDefinitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, processDefinitionId, processInstanceId, executionId, incidentTimestamp, incidentType, activityId, failedActivityId, causeIncidentId, rootCauseIncidentId, _configuration, tenantId, incidentMessage, jobDefinitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    processDefinitionId: ").append(toIndentedString(processDefinitionId)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
    sb.append("    incidentTimestamp: ").append(toIndentedString(incidentTimestamp)).append("\n");
    sb.append("    incidentType: ").append(toIndentedString(incidentType)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    failedActivityId: ").append(toIndentedString(failedActivityId)).append("\n");
    sb.append("    causeIncidentId: ").append(toIndentedString(causeIncidentId)).append("\n");
    sb.append("    rootCauseIncidentId: ").append(toIndentedString(rootCauseIncidentId)).append("\n");
    sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    incidentMessage: ").append(toIndentedString(incidentMessage)).append("\n");
    sb.append("    jobDefinitionId: ").append(toIndentedString(jobDefinitionId)).append("\n");
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

