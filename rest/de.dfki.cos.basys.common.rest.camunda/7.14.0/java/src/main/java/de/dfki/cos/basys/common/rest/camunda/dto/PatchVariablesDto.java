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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * PatchVariablesDto
 */
@JsonPropertyOrder({
  PatchVariablesDto.JSON_PROPERTY_MODIFICATIONS,
  PatchVariablesDto.JSON_PROPERTY_DELETIONS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class PatchVariablesDto {
  public static final String JSON_PROPERTY_MODIFICATIONS = "modifications";
  private Map<String, VariableValueDto> modifications = null;

  public static final String JSON_PROPERTY_DELETIONS = "deletions";
  private List<String> deletions = null;


  public PatchVariablesDto modifications(Map<String, VariableValueDto> modifications) {
    this.modifications = modifications;
    return this;
  }

  public PatchVariablesDto putModificationsItem(String key, VariableValueDto modificationsItem) {
    if (this.modifications == null) {
      this.modifications = new HashMap<String, VariableValueDto>();
    }
    this.modifications.put(key, modificationsItem);
    return this;
  }

   /**
   * A JSON object containing variable key-value pairs.
   * @return modifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A JSON object containing variable key-value pairs.")
  @JsonProperty(JSON_PROPERTY_MODIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, VariableValueDto> getModifications() {
    return modifications;
  }


  public void setModifications(Map<String, VariableValueDto> modifications) {
    this.modifications = modifications;
  }


  public PatchVariablesDto deletions(List<String> deletions) {
    this.deletions = deletions;
    return this;
  }

  public PatchVariablesDto addDeletionsItem(String deletionsItem) {
    if (this.deletions == null) {
      this.deletions = new ArrayList<String>();
    }
    this.deletions.add(deletionsItem);
    return this;
  }

   /**
   * An array of String keys of variables to be deleted.
   * @return deletions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of String keys of variables to be deleted.")
  @JsonProperty(JSON_PROPERTY_DELETIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDeletions() {
    return deletions;
  }


  public void setDeletions(List<String> deletions) {
    this.deletions = deletions;
  }


  /**
   * Return true if this PatchVariablesDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchVariablesDto patchVariablesDto = (PatchVariablesDto) o;
    return Objects.equals(this.modifications, patchVariablesDto.modifications) &&
        Objects.equals(this.deletions, patchVariablesDto.deletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modifications, deletions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchVariablesDto {\n");
    sb.append("    modifications: ").append(toIndentedString(modifications)).append("\n");
    sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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

