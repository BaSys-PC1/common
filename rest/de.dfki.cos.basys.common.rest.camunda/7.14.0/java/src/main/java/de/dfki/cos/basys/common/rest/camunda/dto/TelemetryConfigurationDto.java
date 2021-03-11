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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * TelemetryConfigurationDto
 */
@JsonPropertyOrder({
  TelemetryConfigurationDto.JSON_PROPERTY_ENABLE_TELEMETRY
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class TelemetryConfigurationDto {
  public static final String JSON_PROPERTY_ENABLE_TELEMETRY = "enableTelemetry";
  private JsonNullable<Boolean> enableTelemetry = JsonNullable.<Boolean>undefined();


  public TelemetryConfigurationDto enableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = JsonNullable.<Boolean>of(enableTelemetry);
    return this;
  }

   /**
   * Specifies if the telemetry data should be sent or not.
   * @return enableTelemetry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if the telemetry data should be sent or not.")
  @JsonIgnore

  public Boolean getEnableTelemetry() {
        return enableTelemetry.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ENABLE_TELEMETRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Boolean> getEnableTelemetry_JsonNullable() {
    return enableTelemetry;
  }
  
  @JsonProperty(JSON_PROPERTY_ENABLE_TELEMETRY)
  public void setEnableTelemetry_JsonNullable(JsonNullable<Boolean> enableTelemetry) {
    this.enableTelemetry = enableTelemetry;
  }

  public void setEnableTelemetry(Boolean enableTelemetry) {
    this.enableTelemetry = JsonNullable.<Boolean>of(enableTelemetry);
  }


  /**
   * Return true if this TelemetryConfigurationDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TelemetryConfigurationDto telemetryConfigurationDto = (TelemetryConfigurationDto) o;
    return Objects.equals(this.enableTelemetry, telemetryConfigurationDto.enableTelemetry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableTelemetry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TelemetryConfigurationDto {\n");
    sb.append("    enableTelemetry: ").append(toIndentedString(enableTelemetry)).append("\n");
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

