package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisRecommendationsDeployWindow
 */
@JsonTypeName("BlastRadiusAnalysis_recommendations_deployWindow")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisRecommendationsDeployWindow {

  private String recommendedStart;

  private String recommendedEnd;

  private String reason;

  public BlastRadiusAnalysisRecommendationsDeployWindow() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlastRadiusAnalysisRecommendationsDeployWindow(String recommendedStart, String recommendedEnd, String reason) {
    this.recommendedStart = recommendedStart;
    this.recommendedEnd = recommendedEnd;
    this.reason = reason;
  }

  public BlastRadiusAnalysisRecommendationsDeployWindow recommendedStart(String recommendedStart) {
    this.recommendedStart = recommendedStart;
    return this;
  }

  /**
   * Get recommendedStart
   * @return recommendedStart
  */
  @NotNull   @Schema(name = "recommendedStart", example = "2026-11-05T02:00:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendedStart")
  public String getRecommendedStart() {
    return recommendedStart;
  }

  public void setRecommendedStart(String recommendedStart) {
    this.recommendedStart = recommendedStart;
  }

  public BlastRadiusAnalysisRecommendationsDeployWindow recommendedEnd(String recommendedEnd) {
    this.recommendedEnd = recommendedEnd;
    return this;
  }

  /**
   * Get recommendedEnd
   * @return recommendedEnd
  */
  @NotNull   @Schema(name = "recommendedEnd", example = "2026-11-05T06:00:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendedEnd")
  public String getRecommendedEnd() {
    return recommendedEnd;
  }

  public void setRecommendedEnd(String recommendedEnd) {
    this.recommendedEnd = recommendedEnd;
  }

  public BlastRadiusAnalysisRecommendationsDeployWindow reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Get reason
   * @return reason
  */
  @NotNull   @Schema(name = "reason", example = "Lowest traffic window; 90% less user impact than peak.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisRecommendationsDeployWindow blastRadiusAnalysisRecommendationsDeployWindow = (BlastRadiusAnalysisRecommendationsDeployWindow) o;
    return Objects.equals(this.recommendedStart, blastRadiusAnalysisRecommendationsDeployWindow.recommendedStart) &&
        Objects.equals(this.recommendedEnd, blastRadiusAnalysisRecommendationsDeployWindow.recommendedEnd) &&
        Objects.equals(this.reason, blastRadiusAnalysisRecommendationsDeployWindow.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedStart, recommendedEnd, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisRecommendationsDeployWindow {\n");
    sb.append("    recommendedStart: ").append(toIndentedString(recommendedStart)).append("\n");
    sb.append("    recommendedEnd: ").append(toIndentedString(recommendedEnd)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

