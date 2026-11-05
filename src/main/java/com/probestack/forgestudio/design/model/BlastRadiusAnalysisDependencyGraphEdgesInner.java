package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisDependencyGraphEdgesInner
 */
@JsonTypeName("BlastRadiusAnalysis_dependencyGraph_edges_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisDependencyGraphEdgesInner {

  private String from;

  private String to;

  private Integer callVolumePerMinute;

  private Boolean hasFallback;

  public BlastRadiusAnalysisDependencyGraphEdgesInner from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  */
    @Schema(name = "from", example = "checkout-service", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("from")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public BlastRadiusAnalysisDependencyGraphEdgesInner to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  */
    @Schema(name = "to", example = "payment-processor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("to")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public BlastRadiusAnalysisDependencyGraphEdgesInner callVolumePerMinute(Integer callVolumePerMinute) {
    this.callVolumePerMinute = callVolumePerMinute;
    return this;
  }

  /**
   * Get callVolumePerMinute
   * @return callVolumePerMinute
  */
    @Schema(name = "callVolumePerMinute", example = "4200", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("callVolumePerMinute")
  public Integer getCallVolumePerMinute() {
    return callVolumePerMinute;
  }

  public void setCallVolumePerMinute(Integer callVolumePerMinute) {
    this.callVolumePerMinute = callVolumePerMinute;
  }

  public BlastRadiusAnalysisDependencyGraphEdgesInner hasFallback(Boolean hasFallback) {
    this.hasFallback = hasFallback;
    return this;
  }

  /**
   * Get hasFallback
   * @return hasFallback
  */
    @Schema(name = "hasFallback", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hasFallback")
  public Boolean getHasFallback() {
    return hasFallback;
  }

  public void setHasFallback(Boolean hasFallback) {
    this.hasFallback = hasFallback;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisDependencyGraphEdgesInner blastRadiusAnalysisDependencyGraphEdgesInner = (BlastRadiusAnalysisDependencyGraphEdgesInner) o;
    return Objects.equals(this.from, blastRadiusAnalysisDependencyGraphEdgesInner.from) &&
        Objects.equals(this.to, blastRadiusAnalysisDependencyGraphEdgesInner.to) &&
        Objects.equals(this.callVolumePerMinute, blastRadiusAnalysisDependencyGraphEdgesInner.callVolumePerMinute) &&
        Objects.equals(this.hasFallback, blastRadiusAnalysisDependencyGraphEdgesInner.hasFallback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, callVolumePerMinute, hasFallback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisDependencyGraphEdgesInner {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    callVolumePerMinute: ").append(toIndentedString(callVolumePerMinute)).append("\n");
    sb.append("    hasFallback: ").append(toIndentedString(hasFallback)).append("\n");
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

