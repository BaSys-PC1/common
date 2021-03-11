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
 * RestartProcessInstanceModificationInstructionDto
 */
@JsonPropertyOrder({
  RestartProcessInstanceModificationInstructionDto.JSON_PROPERTY_TYPE,
  RestartProcessInstanceModificationInstructionDto.JSON_PROPERTY_ACTIVITY_ID,
  RestartProcessInstanceModificationInstructionDto.JSON_PROPERTY_TRANSITION_ID
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class RestartProcessInstanceModificationInstructionDto {
  /**
   * **Mandatory**. One of the following values: &#x60;startBeforeActivity&#x60;, &#x60;startAfterActivity&#x60;, &#x60;startTransition&#x60;.  * A &#x60;startBeforeActivity&#x60; instruction requests to enter a given activity. * A &#x60;startAfterActivity&#x60; instruction requests to execute the single outgoing sequence flow of a given activity. * A &#x60;startTransition&#x60; instruction requests to execute a specific sequence flow.
   */
  public enum TypeEnum {
    STARTBEFOREACTIVITY("startBeforeActivity"),
    
    STARTAFTERACTIVITY("startAfterActivity"),
    
    STARTTRANSITION("startTransition");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_ACTIVITY_ID = "activityId";
  private String activityId;

  public static final String JSON_PROPERTY_TRANSITION_ID = "transitionId";
  private String transitionId;


  public RestartProcessInstanceModificationInstructionDto type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * **Mandatory**. One of the following values: &#x60;startBeforeActivity&#x60;, &#x60;startAfterActivity&#x60;, &#x60;startTransition&#x60;.  * A &#x60;startBeforeActivity&#x60; instruction requests to enter a given activity. * A &#x60;startAfterActivity&#x60; instruction requests to execute the single outgoing sequence flow of a given activity. * A &#x60;startTransition&#x60; instruction requests to execute a specific sequence flow.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "**Mandatory**. One of the following values: `startBeforeActivity`, `startAfterActivity`, `startTransition`.  * A `startBeforeActivity` instruction requests to enter a given activity. * A `startAfterActivity` instruction requests to execute the single outgoing sequence flow of a given activity. * A `startTransition` instruction requests to execute a specific sequence flow.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public RestartProcessInstanceModificationInstructionDto activityId(String activityId) {
    this.activityId = activityId;
    return this;
  }

   /**
   * **Can be used with instructions of types** &#x60;startBeforeActivity&#x60; and &#x60;startAfterActivity&#x60;. Specifies the sequence flow to start.
   * @return activityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Can be used with instructions of types** `startBeforeActivity` and `startAfterActivity`. Specifies the sequence flow to start.")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public RestartProcessInstanceModificationInstructionDto transitionId(String transitionId) {
    this.transitionId = transitionId;
    return this;
  }

   /**
   * **Can be used with instructions of types** &#x60;startTransition&#x60;. Specifies the sequence flow to start.
   * @return transitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**Can be used with instructions of types** `startTransition`. Specifies the sequence flow to start.")
  @JsonProperty(JSON_PROPERTY_TRANSITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTransitionId() {
    return transitionId;
  }


  public void setTransitionId(String transitionId) {
    this.transitionId = transitionId;
  }


  /**
   * Return true if this RestartProcessInstanceModificationInstructionDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestartProcessInstanceModificationInstructionDto restartProcessInstanceModificationInstructionDto = (RestartProcessInstanceModificationInstructionDto) o;
    return Objects.equals(this.type, restartProcessInstanceModificationInstructionDto.type) &&
        Objects.equals(this.activityId, restartProcessInstanceModificationInstructionDto.activityId) &&
        Objects.equals(this.transitionId, restartProcessInstanceModificationInstructionDto.transitionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, activityId, transitionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestartProcessInstanceModificationInstructionDto {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    transitionId: ").append(toIndentedString(transitionId)).append("\n");
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

