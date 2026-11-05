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
 * BlastRadiusAnalysisImpactDirectConsumersInner
 */
@JsonTypeName("BlastRadiusAnalysis_impact_directConsumers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisImpactDirectConsumersInner {

  private String serviceName;

  private Double trafficSharePercent;

  /**
   * Gets or Sets criticality
   */
  public enum CriticalityEnum {
    _0("TIER_0"),
    
    _1("TIER_1"),
    
    _2("TIER_2"),
    
    _3("TIER_3");

    private String value;

    CriticalityEnum(String value) {
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
    public static CriticalityEnum fromValue(String value) {
      for (CriticalityEnum b : CriticalityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private CriticalityEnum criticality;

  private Boolean fallbackAvailable;

  public BlastRadiusAnalysisImpactDirectConsumersInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlastRadiusAnalysisImpactDirectConsumersInner(String serviceName, Double trafficSharePercent, CriticalityEnum criticality) {
    this.serviceName = serviceName;
    this.trafficSharePercent = trafficSharePercent;
    this.criticality = criticality;
  }

  public BlastRadiusAnalysisImpactDirectConsumersInner serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  */
  @NotNull   @Schema(name = "serviceName", example = "checkout-service", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }

  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  public BlastRadiusAnalysisImpactDirectConsumersInner trafficSharePercent(Double trafficSharePercent) {
    this.trafficSharePercent = trafficSharePercent;
    return this;
  }

  /**
   * How much traffic this consumer sends.
   * @return trafficSharePercent
  */
  @NotNull   @Schema(name = "trafficSharePercent", example = "42.5", description = "How much traffic this consumer sends.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("trafficSharePercent")
  public Double getTrafficSharePercent() {
    return trafficSharePercent;
  }

  public void setTrafficSharePercent(Double trafficSharePercent) {
    this.trafficSharePercent = trafficSharePercent;
  }

  public BlastRadiusAnalysisImpactDirectConsumersInner criticality(CriticalityEnum criticality) {
    this.criticality = criticality;
    return this;
  }

  /**
   * Get criticality
   * @return criticality
  */
  @NotNull   @Schema(name = "criticality", example = "TIER_0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("criticality")
  public CriticalityEnum getCriticality() {
    return criticality;
  }

  public void setCriticality(CriticalityEnum criticality) {
    this.criticality = criticality;
  }

  public BlastRadiusAnalysisImpactDirectConsumersInner fallbackAvailable(Boolean fallbackAvailable) {
    this.fallbackAvailable = fallbackAvailable;
    return this;
  }

  /**
   * Whether this consumer has a fallback path.
   * @return fallbackAvailable
  */
    @Schema(name = "fallbackAvailable", example = "false", description = "Whether this consumer has a fallback path.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fallbackAvailable")
  public Boolean getFallbackAvailable() {
    return fallbackAvailable;
  }

  public void setFallbackAvailable(Boolean fallbackAvailable) {
    this.fallbackAvailable = fallbackAvailable;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisImpactDirectConsumersInner blastRadiusAnalysisImpactDirectConsumersInner = (BlastRadiusAnalysisImpactDirectConsumersInner) o;
    return Objects.equals(this.serviceName, blastRadiusAnalysisImpactDirectConsumersInner.serviceName) &&
        Objects.equals(this.trafficSharePercent, blastRadiusAnalysisImpactDirectConsumersInner.trafficSharePercent) &&
        Objects.equals(this.criticality, blastRadiusAnalysisImpactDirectConsumersInner.criticality) &&
        Objects.equals(this.fallbackAvailable, blastRadiusAnalysisImpactDirectConsumersInner.fallbackAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceName, trafficSharePercent, criticality, fallbackAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisImpactDirectConsumersInner {\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    trafficSharePercent: ").append(toIndentedString(trafficSharePercent)).append("\n");
    sb.append("    criticality: ").append(toIndentedString(criticality)).append("\n");
    sb.append("    fallbackAvailable: ").append(toIndentedString(fallbackAvailable)).append("\n");
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

