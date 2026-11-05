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
 * BlastRadiusAnalysisImpactCustomerTierImpactInner
 */
@JsonTypeName("BlastRadiusAnalysis_impact_customerTierImpact_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisImpactCustomerTierImpactInner {

  /**
   * Gets or Sets tier
   */
  public enum TierEnum {
    ENTERPRISE("ENTERPRISE"),
    
    PRO("PRO"),
    
    FREE("FREE"),
    
    ANONYMOUS("ANONYMOUS");

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

  private Integer usersAffected;

  private Double revenueAtRiskUSDPerHour;

  /**
   * Gets or Sets slaBreachRisk
   */
  public enum SlaBreachRiskEnum {
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CRITICAL("CRITICAL");

    private String value;

    SlaBreachRiskEnum(String value) {
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
    public static SlaBreachRiskEnum fromValue(String value) {
      for (SlaBreachRiskEnum b : SlaBreachRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private SlaBreachRiskEnum slaBreachRisk;

  public BlastRadiusAnalysisImpactCustomerTierImpactInner tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Get tier
   * @return tier
  */
    @Schema(name = "tier", example = "ENTERPRISE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tier")
  public TierEnum getTier() {
    return tier;
  }

  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  public BlastRadiusAnalysisImpactCustomerTierImpactInner usersAffected(Integer usersAffected) {
    this.usersAffected = usersAffected;
    return this;
  }

  /**
   * Get usersAffected
   * @return usersAffected
  */
    @Schema(name = "usersAffected", example = "1200", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usersAffected")
  public Integer getUsersAffected() {
    return usersAffected;
  }

  public void setUsersAffected(Integer usersAffected) {
    this.usersAffected = usersAffected;
  }

  public BlastRadiusAnalysisImpactCustomerTierImpactInner revenueAtRiskUSDPerHour(Double revenueAtRiskUSDPerHour) {
    this.revenueAtRiskUSDPerHour = revenueAtRiskUSDPerHour;
    return this;
  }

  /**
   * Get revenueAtRiskUSDPerHour
   * @return revenueAtRiskUSDPerHour
  */
    @Schema(name = "revenueAtRiskUSDPerHour", example = "45000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revenueAtRiskUSDPerHour")
  public Double getRevenueAtRiskUSDPerHour() {
    return revenueAtRiskUSDPerHour;
  }

  public void setRevenueAtRiskUSDPerHour(Double revenueAtRiskUSDPerHour) {
    this.revenueAtRiskUSDPerHour = revenueAtRiskUSDPerHour;
  }

  public BlastRadiusAnalysisImpactCustomerTierImpactInner slaBreachRisk(SlaBreachRiskEnum slaBreachRisk) {
    this.slaBreachRisk = slaBreachRisk;
    return this;
  }

  /**
   * Get slaBreachRisk
   * @return slaBreachRisk
  */
    @Schema(name = "slaBreachRisk", example = "CRITICAL", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaBreachRisk")
  public SlaBreachRiskEnum getSlaBreachRisk() {
    return slaBreachRisk;
  }

  public void setSlaBreachRisk(SlaBreachRiskEnum slaBreachRisk) {
    this.slaBreachRisk = slaBreachRisk;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisImpactCustomerTierImpactInner blastRadiusAnalysisImpactCustomerTierImpactInner = (BlastRadiusAnalysisImpactCustomerTierImpactInner) o;
    return Objects.equals(this.tier, blastRadiusAnalysisImpactCustomerTierImpactInner.tier) &&
        Objects.equals(this.usersAffected, blastRadiusAnalysisImpactCustomerTierImpactInner.usersAffected) &&
        Objects.equals(this.revenueAtRiskUSDPerHour, blastRadiusAnalysisImpactCustomerTierImpactInner.revenueAtRiskUSDPerHour) &&
        Objects.equals(this.slaBreachRisk, blastRadiusAnalysisImpactCustomerTierImpactInner.slaBreachRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, usersAffected, revenueAtRiskUSDPerHour, slaBreachRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisImpactCustomerTierImpactInner {\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    usersAffected: ").append(toIndentedString(usersAffected)).append("\n");
    sb.append("    revenueAtRiskUSDPerHour: ").append(toIndentedString(revenueAtRiskUSDPerHour)).append("\n");
    sb.append("    slaBreachRisk: ").append(toIndentedString(slaBreachRisk)).append("\n");
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

