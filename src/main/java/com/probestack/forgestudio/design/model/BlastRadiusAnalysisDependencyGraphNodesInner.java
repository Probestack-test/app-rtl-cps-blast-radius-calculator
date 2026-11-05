package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisDependencyGraphNodesInner
 */
@JsonTypeName("BlastRadiusAnalysis_dependencyGraph_nodes_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisDependencyGraphNodesInner {

  private String serviceName;

  /**
   * Gets or Sets tier
   */
  public enum TierEnum {
    TARGET("TARGET"),
    
    DIRECT_CONSUMER("DIRECT_CONSUMER"),
    
    INDIRECT_CONSUMER("INDIRECT_CONSUMER"),
    
    DOWNSTREAM("DOWNSTREAM");

    private String value;

    TierEnum(String value) {
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
    public static TierEnum fromValue(String value) {
      for (TierEnum b : TierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TierEnum tier;

  private Double estimatedImpactPercent;

  public BlastRadiusAnalysisDependencyGraphNodesInner serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
    @Schema(name = "serviceName", example = "payment-processor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public BlastRadiusAnalysisDependencyGraphNodesInner tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Get tier
   * @return tier
  */
    @Schema(name = "tier", example = "TARGET", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tier")
  public TierEnum getTier() {
    return tier;
  }

  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  public BlastRadiusAnalysisDependencyGraphNodesInner estimatedImpactPercent(Double estimatedImpactPercent) {
    this.estimatedImpactPercent = estimatedImpactPercent;
    return this;
  }

  /**
   * Get estimatedImpactPercent
   * @return estimatedImpactPercent
  */
    @Schema(name = "estimatedImpactPercent", example = "100.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedImpactPercent")
  public Double getEstimatedImpactPercent() {
    return estimatedImpactPercent;
  }

  public void setEstimatedImpactPercent(Double estimatedImpactPercent) {
    this.estimatedImpactPercent = estimatedImpactPercent;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisDependencyGraphNodesInner blastRadiusAnalysisDependencyGraphNodesInner = (BlastRadiusAnalysisDependencyGraphNodesInner) o;
    return Objects.equals(this.serviceName, blastRadiusAnalysisDependencyGraphNodesInner.serviceName) &&
        Objects.equals(this.tier, blastRadiusAnalysisDependencyGraphNodesInner.tier) &&
        Objects.equals(this.estimatedImpactPercent, blastRadiusAnalysisDependencyGraphNodesInner.estimatedImpactPercent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, tier, estimatedImpactPercent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisDependencyGraphNodesInner {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    estimatedImpactPercent: ").append(toIndentedString(estimatedImpactPercent)).append("\n");
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

