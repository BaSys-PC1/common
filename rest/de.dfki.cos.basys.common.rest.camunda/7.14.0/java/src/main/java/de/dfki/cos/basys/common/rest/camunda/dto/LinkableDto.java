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
import de.dfki.cos.basys.common.rest.camunda.dto.AtomLink;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import de.dfki.cos.basys.common.rest.camunda.JSON;


/**
 * LinkableDto
 */
@JsonPropertyOrder({
  LinkableDto.JSON_PROPERTY_LINKS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T21:54:35.456Z[GMT]")
public class LinkableDto {
  public static final String JSON_PROPERTY_LINKS = "links";
  private List<AtomLink> links = null;


  public LinkableDto links(List<AtomLink> links) {
    this.links = links;
    return this;
  }

  public LinkableDto addLinksItem(AtomLink linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<AtomLink>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * The links associated to this resource, with &#x60;method&#x60;, &#x60;href&#x60; and &#x60;rel&#x60;.
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The links associated to this resource, with `method`, `href` and `rel`.")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<AtomLink> getLinks() {
    return links;
  }


  public void setLinks(List<AtomLink> links) {
    this.links = links;
  }


  /**
   * Return true if this LinkableDto object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkableDto linkableDto = (LinkableDto) o;
    return Objects.equals(this.links, linkableDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkableDto {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

