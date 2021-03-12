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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import de.dfki.cos.basys.common.rest.camunda.dto.AtomLink;
import de.dfki.cos.basys.common.rest.camunda.dto.DeploymentDtoAllOf;
import de.dfki.cos.basys.common.rest.camunda.dto.LinkableDto;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * DeploymentDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-12T00:15:55.778Z[GMT]")
public class DeploymentDto {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TENANT_ID = "tenantId";
  @SerializedName(SERIALIZED_NAME_TENANT_ID)
  private String tenantId;

  public static final String SERIALIZED_NAME_DEPLOYMENT_TIME = "deploymentTime";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_TIME)
  private OffsetDateTime deploymentTime;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private List<AtomLink> links = null;


  public DeploymentDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The id of the deployment.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the deployment.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public DeploymentDto tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * The tenant id of the deployment.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant id of the deployment.")

  public String getTenantId() {
    return tenantId;
  }


  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public DeploymentDto deploymentTime(OffsetDateTime deploymentTime) {
    
    this.deploymentTime = deploymentTime;
    return this;
  }

   /**
   * The time when the deployment was created.
   * @return deploymentTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time when the deployment was created.")

  public OffsetDateTime getDeploymentTime() {
    return deploymentTime;
  }


  public void setDeploymentTime(OffsetDateTime deploymentTime) {
    this.deploymentTime = deploymentTime;
  }


  public DeploymentDto source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * The source of the deployment.
   * @return source
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The source of the deployment.")

  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public DeploymentDto name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the deployment.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the deployment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DeploymentDto links(List<AtomLink> links) {
    
    this.links = links;
    return this;
  }

  public DeploymentDto addLinksItem(AtomLink linksItem) {
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

  public List<AtomLink> getLinks() {
    return links;
  }


  public void setLinks(List<AtomLink> links) {
    this.links = links;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentDto deploymentDto = (DeploymentDto) o;
    return Objects.equals(this.id, deploymentDto.id) &&
        Objects.equals(this.tenantId, deploymentDto.tenantId) &&
        Objects.equals(this.deploymentTime, deploymentDto.deploymentTime) &&
        Objects.equals(this.source, deploymentDto.source) &&
        Objects.equals(this.name, deploymentDto.name) &&
        Objects.equals(this.links, deploymentDto.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, deploymentTime, source, name, links);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    deploymentTime: ").append(toIndentedString(deploymentTime)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
