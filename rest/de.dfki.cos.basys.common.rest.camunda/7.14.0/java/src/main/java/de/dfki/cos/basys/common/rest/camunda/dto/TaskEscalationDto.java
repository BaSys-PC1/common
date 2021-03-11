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
import de.dfki.cos.basys.common.rest.camunda.dto.VariableValueDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * TaskEscalationDto
 */
@JsonPropertyOrder({
  TaskEscalationDto.JSON_PROPERTY_ESCALATION_CODE,
  TaskEscalationDto.JSON_PROPERTY_VARIABLES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class TaskEscalationDto {
  public static final String JSON_PROPERTY_ESCALATION_CODE = "escalationCode";
  private String escalationCode;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private Map<String, VariableValueDto> variables = null;


  public TaskEscalationDto escalationCode(String escalationCode) {
    this.escalationCode = escalationCode;
    return this;
  }

   /**
   * An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.
   * @return escalationCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An escalation code that indicates the predefined escalation. It is used to identify the BPMN escalation handler.")
  @JsonProperty(JSON_PROPERTY_ESCALATION_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEscalationCode() {
    return escalationCode;
  }


  public void setEscalationCode(String escalationCode) {
    this.escalationCode = escalationCode;
  }


  public TaskEscalationDto variables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
    return this;
  }

  public TaskEscalationDto putVariablesItem(String key, VariableValueDto variablesItem) {
    if (this.variables == null) {
      this.variables = new HashMap<String, VariableValueDto>();
    }
    this.variables.put(key, variablesItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs.
   * @return variables
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs.")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, VariableValueDto> getVariables() {
    return variables;
  }


  public void setVariables(Map<String, VariableValueDto> variables) {
    this.variables = variables;
  }


  /**
   * Return true if this TaskEscalationDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskEscalationDto taskEscalationDto = (TaskEscalationDto) o;
    return Objects.equals(this.escalationCode, taskEscalationDto.escalationCode) &&
        Objects.equals(this.variables, taskEscalationDto.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalationCode, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskEscalationDto {\n");
    sb.append("    escalationCode: ").append(toIndentedString(escalationCode)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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

