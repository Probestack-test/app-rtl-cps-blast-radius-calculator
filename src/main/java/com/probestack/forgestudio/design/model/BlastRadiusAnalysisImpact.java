package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisImpactCustomerTierImpactInner;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisImpactDirectConsumersInner;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisImpactRegionsAffectedInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisImpact
 */
@JsonTypeName("BlastRadiusAnalysis_impact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisImpact {

  private Integer usersAffected;

  private Double usersAffectedPercent;

  @Valid
  private List<@Valid BlastRadiusAnalysisImpactDirectConsumersInner> directConsumers = new ArrayList<>();

  private Integer downstreamServices;

  private Integer downstreamDepth;

  @Valid
  private List<@Valid BlastRadiusAnalysisImpactRegionsAffectedInner> regionsAffected = new ArrayList<>();

  @Valid
  private List<@Valid BlastRadiusAnalysisImpactCustomerTierImpactInner> customerTierImpact;

  private Double revenueAtRiskUSDPerHour;

  /**
   * Gets or Sets dataLossRisk
   */
  public enum DataLossRiskEnum {
    NONE("NONE"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CATASTROPHIC("CATASTROPHIC");

    private String value;

    DataLossRiskEnum(String value) {
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
    public static DataLossRiskEnum fromValue(String value) {
      for (DataLossRiskEnum b : DataLossRiskEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private DataLossRiskEnum dataLossRisk;

  public BlastRadiusAnalysisImpact() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlastRadiusAnalysisImpact(Integer usersAffected, List<@Valid BlastRadiusAnalysisImpactDirectConsumersInner> directConsumers, Integer downstreamServices, List<@Valid BlastRadiusAnalysisImpactRegionsAffectedInner> regionsAffected) {
    this.usersAffected = usersAffected;
    this.directConsumers = directConsumers;
    this.downstreamServices = downstreamServices;
    this.regionsAffected = regionsAffected;
  }

  public BlastRadiusAnalysisImpact usersAffected(Integer usersAffected) {
    this.usersAffected = usersAffected;
    return this;
  }

  /**
   * Estimated users hit if the change fails.
   * @return usersAffected
  */
  @NotNull   @Schema(name = "usersAffected", example = "245000", description = "Estimated users hit if the change fails.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("usersAffected")
  public Integer getUsersAffected() {
    return usersAffected;
  }

  public void setUsersAffected(Integer usersAffected) {
    this.usersAffected = usersAffected;
  }

  public BlastRadiusAnalysisImpact usersAffectedPercent(Double usersAffectedPercent) {
    this.usersAffectedPercent = usersAffectedPercent;
    return this;
  }

  /**
   * Percentage of total user base.
   * @return usersAffectedPercent
  */
    @Schema(name = "usersAffectedPercent", example = "18.5", description = "Percentage of total user base.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("usersAffectedPercent")
  public Double getUsersAffectedPercent() {
    return usersAffectedPercent;
  }

  public void setUsersAffectedPercent(Double usersAffectedPercent) {
    this.usersAffectedPercent = usersAffectedPercent;
  }

  public BlastRadiusAnalysisImpact directConsumers(List<@Valid BlastRadiusAnalysisImpactDirectConsumersInner> directConsumers) {
    this.directConsumers = directConsumers;
    return this;
  }

  public BlastRadiusAnalysisImpact addDirectConsumersItem(BlastRadiusAnalysisImpactDirectConsumersInner directConsumersItem) {
    if (this.directConsumers == null) {
      this.directConsumers = new ArrayList<>();
    }
    this.directConsumers.add(directConsumersItem);
    return this;
  }

  /**
   * Services that directly call the target service.
   * @return directConsumers
  */
  @NotNull @Valid   @Schema(name = "directConsumers", description = "Services that directly call the target service.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("directConsumers")
  public List<@Valid BlastRadiusAnalysisImpactDirectConsumersInner> getDirectConsumers() {
    return directConsumers;
  }

  public void setDirectConsumers(List<@Valid BlastRadiusAnalysisImpactDirectConsumersInner> directConsumers) {
    this.directConsumers = directConsumers;
  }

  public BlastRadiusAnalysisImpact downstreamServices(Integer downstreamServices) {
    this.downstreamServices = downstreamServices;
    return this;
  }

  /**
   * Total downstream services in the dependency chain.
   * @return downstreamServices
  */
  @NotNull   @Schema(name = "downstreamServices", example = "14", description = "Total downstream services in the dependency chain.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("downstreamServices")
  public Integer getDownstreamServices() {
    return downstreamServices;
  }

  public void setDownstreamServices(Integer downstreamServices) {
    this.downstreamServices = downstreamServices;
  }

  public BlastRadiusAnalysisImpact downstreamDepth(Integer downstreamDepth) {
    this.downstreamDepth = downstreamDepth;
    return this;
  }

  /**
   * Maximum depth of the dependency chain.
   * @return downstreamDepth
  */
    @Schema(name = "downstreamDepth", example = "4", description = "Maximum depth of the dependency chain.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("downstreamDepth")
  public Integer getDownstreamDepth() {
    return downstreamDepth;
  }

  public void setDownstreamDepth(Integer downstreamDepth) {
    this.downstreamDepth = downstreamDepth;
  }

  public BlastRadiusAnalysisImpact regionsAffected(List<@Valid BlastRadiusAnalysisImpactRegionsAffectedInner> regionsAffected) {
    this.regionsAffected = regionsAffected;
    return this;
  }

  public BlastRadiusAnalysisImpact addRegionsAffectedItem(BlastRadiusAnalysisImpactRegionsAffectedInner regionsAffectedItem) {
    if (this.regionsAffected == null) {
      this.regionsAffected = new ArrayList<>();
    }
    this.regionsAffected.add(regionsAffectedItem);
    return this;
  }

  /**
   * Geographic regions impacted.
   * @return regionsAffected
  */
  @NotNull @Valid   @Schema(name = "regionsAffected", description = "Geographic regions impacted.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("regionsAffected")
  public List<@Valid BlastRadiusAnalysisImpactRegionsAffectedInner> getRegionsAffected() {
    return regionsAffected;
  }

  public void setRegionsAffected(List<@Valid BlastRadiusAnalysisImpactRegionsAffectedInner> regionsAffected) {
    this.regionsAffected = regionsAffected;
  }

  public BlastRadiusAnalysisImpact customerTierImpact(List<@Valid BlastRadiusAnalysisImpactCustomerTierImpactInner> customerTierImpact) {
    this.customerTierImpact = customerTierImpact;
    return this;
  }

  public BlastRadiusAnalysisImpact addCustomerTierImpactItem(BlastRadiusAnalysisImpactCustomerTierImpactInner customerTierImpactItem) {
    if (this.customerTierImpact == null) {
      this.customerTierImpact = new ArrayList<>();
    }
    this.customerTierImpact.add(customerTierImpactItem);
    return this;
  }

  /**
   * Impact broken down by customer tier.
   * @return customerTierImpact
  */
  @Valid   @Schema(name = "customerTierImpact", description = "Impact broken down by customer tier.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerTierImpact")
  public List<@Valid BlastRadiusAnalysisImpactCustomerTierImpactInner> getCustomerTierImpact() {
    return customerTierImpact;
  }

  public void setCustomerTierImpact(List<@Valid BlastRadiusAnalysisImpactCustomerTierImpactInner> customerTierImpact) {
    this.customerTierImpact = customerTierImpact;
  }

  public BlastRadiusAnalysisImpact revenueAtRiskUSDPerHour(Double revenueAtRiskUSDPerHour) {
    this.revenueAtRiskUSDPerHour = revenueAtRiskUSDPerHour;
    return this;
  }

  /**
   * Total revenue at risk per hour.
   * @return revenueAtRiskUSDPerHour
  */
    @Schema(name = "revenueAtRiskUSDPerHour", example = "125000.0", description = "Total revenue at risk per hour.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("revenueAtRiskUSDPerHour")
  public Double getRevenueAtRiskUSDPerHour() {
    return revenueAtRiskUSDPerHour;
  }

  public void setRevenueAtRiskUSDPerHour(Double revenueAtRiskUSDPerHour) {
    this.revenueAtRiskUSDPerHour = revenueAtRiskUSDPerHour;
  }

  public BlastRadiusAnalysisImpact dataLossRisk(DataLossRiskEnum dataLossRisk) {
    this.dataLossRisk = dataLossRisk;
    return this;
  }

  /**
   * Get dataLossRisk
   * @return dataLossRisk
  */
    @Schema(name = "dataLossRisk", example = "MEDIUM", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataLossRisk")
  public DataLossRiskEnum getDataLossRisk() {
    return dataLossRisk;
  }

  public void setDataLossRisk(DataLossRiskEnum dataLossRisk) {
    this.dataLossRisk = dataLossRisk;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisImpact blastRadiusAnalysisImpact = (BlastRadiusAnalysisImpact) o;
    return Objects.equals(this.usersAffected, blastRadiusAnalysisImpact.usersAffected) &&
        Objects.equals(this.usersAffectedPercent, blastRadiusAnalysisImpact.usersAffectedPercent) &&
        Objects.equals(this.directConsumers, blastRadiusAnalysisImpact.directConsumers) &&
        Objects.equals(this.downstreamServices, blastRadiusAnalysisImpact.downstreamServices) &&
        Objects.equals(this.downstreamDepth, blastRadiusAnalysisImpact.downstreamDepth) &&
        Objects.equals(this.regionsAffected, blastRadiusAnalysisImpact.regionsAffected) &&
        Objects.equals(this.customerTierImpact, blastRadiusAnalysisImpact.customerTierImpact) &&
        Objects.equals(this.revenueAtRiskUSDPerHour, blastRadiusAnalysisImpact.revenueAtRiskUSDPerHour) &&
        Objects.equals(this.dataLossRisk, blastRadiusAnalysisImpact.dataLossRisk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usersAffected, usersAffectedPercent, directConsumers, downstreamServices, downstreamDepth, regionsAffected, customerTierImpact, revenueAtRiskUSDPerHour, dataLossRisk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisImpact {\n");
    sb.append("    usersAffected: ").append(toIndentedString(usersAffected)).append("\n");
    sb.append("    usersAffectedPercent: ").append(toIndentedString(usersAffectedPercent)).append("\n");
    sb.append("    directConsumers: ").append(toIndentedString(directConsumers)).append("\n");
    sb.append("    downstreamServices: ").append(toIndentedString(downstreamServices)).append("\n");
    sb.append("    downstreamDepth: ").append(toIndentedString(downstreamDepth)).append("\n");
    sb.append("    regionsAffected: ").append(toIndentedString(regionsAffected)).append("\n");
    sb.append("    customerTierImpact: ").append(toIndentedString(customerTierImpact)).append("\n");
    sb.append("    revenueAtRiskUSDPerHour: ").append(toIndentedString(revenueAtRiskUSDPerHour)).append("\n");
    sb.append("    dataLossRisk: ").append(toIndentedString(dataLossRisk)).append("\n");
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

