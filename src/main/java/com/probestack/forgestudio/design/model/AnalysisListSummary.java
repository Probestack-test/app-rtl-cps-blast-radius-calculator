package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalysisListSummary
 */
@JsonTypeName("AnalysisList_summary")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class AnalysisListSummary {

  private Integer totalAnalyses;

  private Integer minimalRiskCount;

  private Integer lowRiskCount;

  private Integer mediumRiskCount;

  private Integer highRiskCount;

  private Integer catastrophicCount;

  private Double totalRevenueAtRiskUSD;

  public AnalysisListSummary totalAnalyses(Integer totalAnalyses) {
    this.totalAnalyses = totalAnalyses;
    return this;
  }

  /**
   * Get totalAnalyses
   * @return totalAnalyses
  */
    @Schema(name = "totalAnalyses", example = "247", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalAnalyses")
  public Integer getTotalAnalyses() {
    return totalAnalyses;
  }

  public void setTotalAnalyses(Integer totalAnalyses) {
    this.totalAnalyses = totalAnalyses;
  }

  public AnalysisListSummary minimalRiskCount(Integer minimalRiskCount) {
    this.minimalRiskCount = minimalRiskCount;
    return this;
  }

  /**
   * Get minimalRiskCount
   * @return minimalRiskCount
  */
    @Schema(name = "minimalRiskCount", example = "98", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("minimalRiskCount")
  public Integer getMinimalRiskCount() {
    return minimalRiskCount;
  }

  public void setMinimalRiskCount(Integer minimalRiskCount) {
    this.minimalRiskCount = minimalRiskCount;
  }

  public AnalysisListSummary lowRiskCount(Integer lowRiskCount) {
    this.lowRiskCount = lowRiskCount;
    return this;
  }

  /**
   * Get lowRiskCount
   * @return lowRiskCount
  */
    @Schema(name = "lowRiskCount", example = "72", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lowRiskCount")
  public Integer getLowRiskCount() {
    return lowRiskCount;
  }

  public void setLowRiskCount(Integer lowRiskCount) {
    this.lowRiskCount = lowRiskCount;
  }

  public AnalysisListSummary mediumRiskCount(Integer mediumRiskCount) {
    this.mediumRiskCount = mediumRiskCount;
    return this;
  }

  /**
   * Get mediumRiskCount
   * @return mediumRiskCount
  */
    @Schema(name = "mediumRiskCount", example = "48", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mediumRiskCount")
  public Integer getMediumRiskCount() {
    return mediumRiskCount;
  }

  public void setMediumRiskCount(Integer mediumRiskCount) {
    this.mediumRiskCount = mediumRiskCount;
  }

  public AnalysisListSummary highRiskCount(Integer highRiskCount) {
    this.highRiskCount = highRiskCount;
    return this;
  }

  /**
   * Get highRiskCount
   * @return highRiskCount
  */
    @Schema(name = "highRiskCount", example = "22", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("highRiskCount")
  public Integer getHighRiskCount() {
    return highRiskCount;
  }

  public void setHighRiskCount(Integer highRiskCount) {
    this.highRiskCount = highRiskCount;
  }

  public AnalysisListSummary catastrophicCount(Integer catastrophicCount) {
    this.catastrophicCount = catastrophicCount;
    return this;
  }

  /**
   * Get catastrophicCount
   * @return catastrophicCount
  */
    @Schema(name = "catastrophicCount", example = "7", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("catastrophicCount")
  public Integer getCatastrophicCount() {
    return catastrophicCount;
  }

  public void setCatastrophicCount(Integer catastrophicCount) {
    this.catastrophicCount = catastrophicCount;
  }

  public AnalysisListSummary totalRevenueAtRiskUSD(Double totalRevenueAtRiskUSD) {
    this.totalRevenueAtRiskUSD = totalRevenueAtRiskUSD;
    return this;
  }

  /**
   * Get totalRevenueAtRiskUSD
   * @return totalRevenueAtRiskUSD
  */
    @Schema(name = "totalRevenueAtRiskUSD", example = "845000.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("totalRevenueAtRiskUSD")
  public Double getTotalRevenueAtRiskUSD() {
    return totalRevenueAtRiskUSD;
  }

  public void setTotalRevenueAtRiskUSD(Double totalRevenueAtRiskUSD) {
    this.totalRevenueAtRiskUSD = totalRevenueAtRiskUSD;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisListSummary analysisListSummary = (AnalysisListSummary) o;
    return Objects.equals(this.totalAnalyses, analysisListSummary.totalAnalyses) &&
        Objects.equals(this.minimalRiskCount, analysisListSummary.minimalRiskCount) &&
        Objects.equals(this.lowRiskCount, analysisListSummary.lowRiskCount) &&
        Objects.equals(this.mediumRiskCount, analysisListSummary.mediumRiskCount) &&
        Objects.equals(this.highRiskCount, analysisListSummary.highRiskCount) &&
        Objects.equals(this.catastrophicCount, analysisListSummary.catastrophicCount) &&
        Objects.equals(this.totalRevenueAtRiskUSD, analysisListSummary.totalRevenueAtRiskUSD);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalAnalyses, minimalRiskCount, lowRiskCount, mediumRiskCount, highRiskCount, catastrophicCount, totalRevenueAtRiskUSD);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisListSummary {\n");
    sb.append("    totalAnalyses: ").append(toIndentedString(totalAnalyses)).append("\n");
    sb.append("    minimalRiskCount: ").append(toIndentedString(minimalRiskCount)).append("\n");
    sb.append("    lowRiskCount: ").append(toIndentedString(lowRiskCount)).append("\n");
    sb.append("    mediumRiskCount: ").append(toIndentedString(mediumRiskCount)).append("\n");
    sb.append("    highRiskCount: ").append(toIndentedString(highRiskCount)).append("\n");
    sb.append("    catastrophicCount: ").append(toIndentedString(catastrophicCount)).append("\n");
    sb.append("    totalRevenueAtRiskUSD: ").append(toIndentedString(totalRevenueAtRiskUSD)).append("\n");
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

