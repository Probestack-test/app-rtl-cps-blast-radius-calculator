package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulationScenariosInnerRevenueImpact
 */
@JsonTypeName("FailureSimulation_scenarios_inner_revenueImpact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulationScenariosInnerRevenueImpact {

  private Double lostRevenueUSD;

  private Double compensationCostUSD;

  private Double slaCreditsOwedUSD;

  private Double totalCostUSD;

  public FailureSimulationScenariosInnerRevenueImpact lostRevenueUSD(Double lostRevenueUSD) {
    this.lostRevenueUSD = lostRevenueUSD;
    return this;
  }

  /**
   * Get lostRevenueUSD
   * @return lostRevenueUSD
  */
    @Schema(name = "lostRevenueUSD", example = "31250.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lostRevenueUSD")
  public Double getLostRevenueUSD() {
    return lostRevenueUSD;
  }

  public void setLostRevenueUSD(Double lostRevenueUSD) {
    this.lostRevenueUSD = lostRevenueUSD;
  }

  public FailureSimulationScenariosInnerRevenueImpact compensationCostUSD(Double compensationCostUSD) {
    this.compensationCostUSD = compensationCostUSD;
    return this;
  }

  /**
   * Get compensationCostUSD
   * @return compensationCostUSD
  */
    @Schema(name = "compensationCostUSD", example = "8500.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("compensationCostUSD")
  public Double getCompensationCostUSD() {
    return compensationCostUSD;
  }

  public void setCompensationCostUSD(Double compensationCostUSD) {
    this.compensationCostUSD = compensationCostUSD;
  }

  public FailureSimulationScenariosInnerRevenueImpact slaCreditsOwedUSD(Double slaCreditsOwedUSD) {
    this.slaCreditsOwedUSD = slaCreditsOwedUSD;
    return this;
  }

  /**
   * Get slaCreditsOwedUSD
   * @return slaCreditsOwedUSD
  */
    @Schema(name = "slaCreditsOwedUSD", example = "15000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("slaCreditsOwedUSD")
  public Double getSlaCreditsOwedUSD() {
    return slaCreditsOwedUSD;
  }

  public void setSlaCreditsOwedUSD(Double slaCreditsOwedUSD) {
    this.slaCreditsOwedUSD = slaCreditsOwedUSD;
  }

  public FailureSimulationScenariosInnerRevenueImpact totalCostUSD(Double totalCostUSD) {
    this.totalCostUSD = totalCostUSD;
    return this;
  }

  /**
   * Get totalCostUSD
   * @return totalCostUSD
  */
    @Schema(name = "totalCostUSD", example = "54750.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalCostUSD")
  public Double getTotalCostUSD() {
    return totalCostUSD;
  }

  public void setTotalCostUSD(Double totalCostUSD) {
    this.totalCostUSD = totalCostUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulationScenariosInnerRevenueImpact failureSimulationScenariosInnerRevenueImpact = (FailureSimulationScenariosInnerRevenueImpact) o;
    return Objects.equals(this.lostRevenueUSD, failureSimulationScenariosInnerRevenueImpact.lostRevenueUSD) &&
        Objects.equals(this.compensationCostUSD, failureSimulationScenariosInnerRevenueImpact.compensationCostUSD) &&
        Objects.equals(this.slaCreditsOwedUSD, failureSimulationScenariosInnerRevenueImpact.slaCreditsOwedUSD) &&
        Objects.equals(this.totalCostUSD, failureSimulationScenariosInnerRevenueImpact.totalCostUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lostRevenueUSD, compensationCostUSD, slaCreditsOwedUSD, totalCostUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulationScenariosInnerRevenueImpact {\n");
    sb.append("    lostRevenueUSD: ").append(toIndentedString(lostRevenueUSD)).append("\n");
    sb.append("    compensationCostUSD: ").append(toIndentedString(compensationCostUSD)).append("\n");
    sb.append("    slaCreditsOwedUSD: ").append(toIndentedString(slaCreditsOwedUSD)).append("\n");
    sb.append("    totalCostUSD: ").append(toIndentedString(totalCostUSD)).append("\n");
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

