package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Thresholds for automated rollback.
 */
@Schema(name = "simulateFailures_request_autoRollbackThresholds", description = "Thresholds for automated rollback.")
@JsonTypeName("simulateFailures_request_autoRollbackThresholds")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class SimulateFailuresRequestAutoRollbackThresholds {

  private BigDecimal errorRatePercent;

  private Integer latencyP99Ms;

  private Integer customerComplaintsPerMinute;

  public SimulateFailuresRequestAutoRollbackThresholds errorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
    return this;
  }

  /**
   * Get errorRatePercent
   * @return errorRatePercent
  */
  @Valid   @Schema(name = "errorRatePercent", example = "2.0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorRatePercent")
  public BigDecimal getErrorRatePercent() {
    return errorRatePercent;
  }

  public void setErrorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
  }

  public SimulateFailuresRequestAutoRollbackThresholds latencyP99Ms(Integer latencyP99Ms) {
    this.latencyP99Ms = latencyP99Ms;
    return this;
  }

  /**
   * Get latencyP99Ms
   * @return latencyP99Ms
  */
    @Schema(name = "latencyP99Ms", example = "1000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latencyP99Ms")
  public Integer getLatencyP99Ms() {
    return latencyP99Ms;
  }

  public void setLatencyP99Ms(Integer latencyP99Ms) {
    this.latencyP99Ms = latencyP99Ms;
  }

  public SimulateFailuresRequestAutoRollbackThresholds customerComplaintsPerMinute(Integer customerComplaintsPerMinute) {
    this.customerComplaintsPerMinute = customerComplaintsPerMinute;
    return this;
  }

  /**
   * Get customerComplaintsPerMinute
   * @return customerComplaintsPerMinute
  */
    @Schema(name = "customerComplaintsPerMinute", example = "10", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("customerComplaintsPerMinute")
  public Integer getCustomerComplaintsPerMinute() {
    return customerComplaintsPerMinute;
  }

  public void setCustomerComplaintsPerMinute(Integer customerComplaintsPerMinute) {
    this.customerComplaintsPerMinute = customerComplaintsPerMinute;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateFailuresRequestAutoRollbackThresholds simulateFailuresRequestAutoRollbackThresholds = (SimulateFailuresRequestAutoRollbackThresholds) o;
    return Objects.equals(this.errorRatePercent, simulateFailuresRequestAutoRollbackThresholds.errorRatePercent) &&
        Objects.equals(this.latencyP99Ms, simulateFailuresRequestAutoRollbackThresholds.latencyP99Ms) &&
        Objects.equals(this.customerComplaintsPerMinute, simulateFailuresRequestAutoRollbackThresholds.customerComplaintsPerMinute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorRatePercent, latencyP99Ms, customerComplaintsPerMinute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateFailuresRequestAutoRollbackThresholds {\n");
    sb.append("    errorRatePercent: ").append(toIndentedString(errorRatePercent)).append("\n");
    sb.append("    latencyP99Ms: ").append(toIndentedString(latencyP99Ms)).append("\n");
    sb.append("    customerComplaintsPerMinute: ").append(toIndentedString(customerComplaintsPerMinute)).append("\n");
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

