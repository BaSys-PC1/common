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
import de.dfki.cos.basys.common.rest.camunda.dto.ProcessInstanceModificationInstructionDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * ProcessInstanceModificationDto
 */
@JsonPropertyOrder({
  ProcessInstanceModificationDto.JSON_PROPERTY_SKIP_CUSTOM_LISTENERS,
  ProcessInstanceModificationDto.JSON_PROPERTY_SKIP_IO_MAPPINGS,
  ProcessInstanceModificationDto.JSON_PROPERTY_INSTRUCTIONS,
  ProcessInstanceModificationDto.JSON_PROPERTY_ANNOTATION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class ProcessInstanceModificationDto {
  public static final String JSON_PROPERTY_SKIP_CUSTOM_LISTENERS = "skipCustomListeners";
  private JsonNullable<Boolean> skipCustomListeners = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_SKIP_IO_MAPPINGS = "skipIoMappings";
  private JsonNullable<Boolean> skipIoMappings = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_INSTRUCTIONS = "instructions";
  private List<ProcessInstanceModificationInstructionDto> instructions = null;

  public static final String JSON_PROPERTY_ANNOTATION = "annotation";
  private String annotation;


  public ProcessInstanceModificationDto skipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = JsonNullable.<Boolean>of(skipCustomListeners);
    return this;
  }

   /**
   * Skip execution listener invocation for activities that are started or ended as part of this request.
   * @return skipCustomListeners
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution listener invocation for activities that are started or ended as part of this request.")
  @JsonIgnore

  public Boolean getSkipCustomListeners() {
        return skipCustomListeners.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSkipCustomListeners_JsonNullable() {
    return skipCustomListeners;
  }
  
  @JsonProperty(JSON_PROPERTY_SKIP_CUSTOM_LISTENERS)
  public void setSkipCustomListeners_JsonNullable(JsonNullable<Boolean> skipCustomListeners) {
    this.skipCustomListeners = skipCustomListeners;
  }

  public void setSkipCustomListeners(Boolean skipCustomListeners) {
    this.skipCustomListeners = JsonNullable.<Boolean>of(skipCustomListeners);
  }


  public ProcessInstanceModificationDto skipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = JsonNullable.<Boolean>of(skipIoMappings);
    return this;
  }

   /**
   * Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.
   * @return skipIoMappings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip execution of [input/output variable mappings](https://docs.camunda.org/manual/7.14/user-guide/process-engine/variables/#input-output-variable-mapping) for activities that are started or ended as part of this request.")
  @JsonIgnore

  public Boolean getSkipIoMappings() {
        return skipIoMappings.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getSkipIoMappings_JsonNullable() {
    return skipIoMappings;
  }
  
  @JsonProperty(JSON_PROPERTY_SKIP_IO_MAPPINGS)
  public void setSkipIoMappings_JsonNullable(JsonNullable<Boolean> skipIoMappings) {
    this.skipIoMappings = skipIoMappings;
  }

  public void setSkipIoMappings(Boolean skipIoMappings) {
    this.skipIoMappings = JsonNullable.<Boolean>of(skipIoMappings);
  }


  public ProcessInstanceModificationDto instructions(List<ProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
    return this;
  }

  public ProcessInstanceModificationDto addInstructionsItem(ProcessInstanceModificationInstructionDto instructionsItem) {
    if (this.instructions == null) {
      this.instructions = new ArrayList<ProcessInstanceModificationInstructionDto>();
    }
    this.instructions.add(instructionsItem);
    return this;
  }

   /**
   * JSON array of modification instructions. The instructions are executed in the order they are in.
   * @return instructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "JSON array of modification instructions. The instructions are executed in the order they are in.")
  @JsonProperty(JSON_PROPERTY_INSTRUCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ProcessInstanceModificationInstructionDto> getInstructions() {
    return instructions;
  }


  public void setInstructions(List<ProcessInstanceModificationInstructionDto> instructions) {
    this.instructions = instructions;
  }


  public ProcessInstanceModificationDto annotation(String annotation) {
    this.annotation = annotation;
    return this;
  }

   /**
   * An arbitrary text annotation set by a user for auditing reasons.
   * @return annotation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An arbitrary text annotation set by a user for auditing reasons.")
  @JsonProperty(JSON_PROPERTY_ANNOTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAnnotation() {
    return annotation;
  }


  public void setAnnotation(String annotation) {
    this.annotation = annotation;
  }


  /**
   * Return true if this ProcessInstanceModificationDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessInstanceModificationDto processInstanceModificationDto = (ProcessInstanceModificationDto) o;
    return Objects.equals(this.skipCustomListeners, processInstanceModificationDto.skipCustomListeners) &&
        Objects.equals(this.skipIoMappings, processInstanceModificationDto.skipIoMappings) &&
        Objects.equals(this.instructions, processInstanceModificationDto.instructions) &&
        Objects.equals(this.annotation, processInstanceModificationDto.annotation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skipCustomListeners, skipIoMappings, instructions, annotation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessInstanceModificationDto {\n");
    sb.append("    skipCustomListeners: ").append(toIndentedString(skipCustomListeners)).append("\n");
    sb.append("    skipIoMappings: ").append(toIndentedString(skipIoMappings)).append("\n");
    sb.append("    instructions: ").append(toIndentedString(instructions)).append("\n");
    sb.append("    annotation: ").append(toIndentedString(annotation)).append("\n");
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

