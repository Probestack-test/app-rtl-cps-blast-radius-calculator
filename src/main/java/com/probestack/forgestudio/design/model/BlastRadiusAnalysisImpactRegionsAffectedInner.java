package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisImpactRegionsAffectedInner
 */
@JsonTypeName("BlastRadiusAnalysis_impact_regionsAffected_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisImpactRegionsAffectedInner {

  private String region;

  private Integer usersInRegion;

  private Double trafficPercent;

  public BlastRadiusAnalysisImpactRegionsAffectedInner region(String region) {
    this.region = region;
    return this;
  }

  /**
   * Get region
   * @return region
  */
    @Schema(name = "region", example = "us-east-1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("region")
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public BlastRadiusAnalysisImpactRegionsAffectedInner usersInRegion(Integer usersInRegion) {
    this.usersInRegion = usersInRegion;
    return this;
  }

  /**
   * Get usersInRegion
   * @return usersInRegion
  */
    @Schema(name = "usersInRegion", example = "145000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usersInRegion")
  public Integer getUsersInRegion() {
    return usersInRegion;
  }

  public void setUsersInRegion(Integer usersInRegion) {
    this.usersInRegion = usersInRegion;
  }

  public BlastRadiusAnalysisImpactRegionsAffectedInner trafficPercent(Double trafficPercent) {
    this.trafficPercent = trafficPercent;
    return this;
  }

  /**
   * Get trafficPercent
   * @return trafficPercent
  */
    @Schema(name = "trafficPercent", example = "62.5", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("trafficPercent")
  public Double getTrafficPercent() {
    return trafficPercent;
  }

  public void setTrafficPercent(Double trafficPercent) {
    this.trafficPercent = trafficPercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisImpactRegionsAffectedInner blastRadiusAnalysisImpactRegionsAffectedInner = (BlastRadiusAnalysisImpactRegionsAffectedInner) o;
    return Objects.equals(this.region, blastRadiusAnalysisImpactRegionsAffectedInner.region) &&
        Objects.equals(this.usersInRegion, blastRadiusAnalysisImpactRegionsAffectedInner.usersInRegion) &&
        Objects.equals(this.trafficPercent, blastRadiusAnalysisImpactRegionsAffectedInner.trafficPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, usersInRegion, trafficPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisImpactRegionsAffectedInner {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    usersInRegion: ").append(toIndentedString(usersInRegion)).append("\n");
    sb.append("    trafficPercent: ").append(toIndentedString(trafficPercent)).append("\n");
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

