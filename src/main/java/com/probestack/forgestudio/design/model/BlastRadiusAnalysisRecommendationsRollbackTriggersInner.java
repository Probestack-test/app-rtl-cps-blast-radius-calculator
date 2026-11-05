package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisRecommendationsRollbackTriggersInner
 */
@JsonTypeName("BlastRadiusAnalysis_recommendations_rollbackTriggers_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisRecommendationsRollbackTriggersInner {

  private String metric;

  private BigDecimal threshold;

  private Integer windowSeconds;

  /**
   * Gets or Sets action
   */
  public enum ActionEnum {
    ALERT("ALERT"),
    
    PAUSE_ROLLOUT("PAUSE_ROLLOUT"),
    
    AUTO_ROLLBACK("AUTO_ROLLBACK");

    private String value;

    ActionEnum(String value) {
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
    public static ActionEnum fromValue(String value) {
      for (ActionEnum b : ActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ActionEnum action;

  public BlastRadiusAnalysisRecommendationsRollbackTriggersInner metric(String metric) {
    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
  */
    @Schema(name = "metric", example = "error_rate_pct", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("metric")
  public String getMetric() {
    return metric;
  }

  public void setMetric(String metric) {
    this.metric = metric;
  }

  public BlastRadiusAnalysisRecommendationsRollbackTriggersInner threshold(BigDecimal threshold) {
    this.threshold = threshold;
    return this;
  }

  /**
   * Get threshold
   * @return threshold
  */
  @Valid   @Schema(name = "threshold", example = "1.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("threshold")
  public BigDecimal getThreshold() {
    return threshold;
  }

  public void setThreshold(BigDecimal threshold) {
    this.threshold = threshold;
  }

  public BlastRadiusAnalysisRecommendationsRollbackTriggersInner windowSeconds(Integer windowSeconds) {
    this.windowSeconds = windowSeconds;
    return this;
  }

  /**
   * Get windowSeconds
   * @return windowSeconds
  */
    @Schema(name = "windowSeconds", example = "60", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("windowSeconds")
  public Integer getWindowSeconds() {
    return windowSeconds;
  }

  public void setWindowSeconds(Integer windowSeconds) {
    this.windowSeconds = windowSeconds;
  }

  public BlastRadiusAnalysisRecommendationsRollbackTriggersInner action(ActionEnum action) {
    this.action = action;
    return this;
  }

  /**
   * Get action
   * @return action
  */
    @Schema(name = "action", example = "AUTO_ROLLBACK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }

  public void setAction(ActionEnum action) {
    this.action = action;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisRecommendationsRollbackTriggersInner blastRadiusAnalysisRecommendationsRollbackTriggersInner = (BlastRadiusAnalysisRecommendationsRollbackTriggersInner) o;
    return Objects.equals(this.metric, blastRadiusAnalysisRecommendationsRollbackTriggersInner.metric) &&
        Objects.equals(this.threshold, blastRadiusAnalysisRecommendationsRollbackTriggersInner.threshold) &&
        Objects.equals(this.windowSeconds, blastRadiusAnalysisRecommendationsRollbackTriggersInner.windowSeconds) &&
        Objects.equals(this.action, blastRadiusAnalysisRecommendationsRollbackTriggersInner.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, threshold, windowSeconds, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisRecommendationsRollbackTriggersInner {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    windowSeconds: ").append(toIndentedString(windowSeconds)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

