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
 * SimulateFailuresRequestScenariosInner
 */
@JsonTypeName("simulateFailures_request_scenarios_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class SimulateFailuresRequestScenariosInner {

  private String scenarioName;

  /**
   * How the change fails.
   */
  public enum FailureModeEnum {
    ERROR_RATE("ERROR_RATE"),
    
    LATENCY_SPIKE("LATENCY_SPIKE"),
    
    COMPLETE_OUTAGE("COMPLETE_OUTAGE"),
    
    DATA_CORRUPTION("DATA_CORRUPTION"),
    
    PARTIAL_DEGRADATION("PARTIAL_DEGRADATION"),
    
    MEMORY_LEAK("MEMORY_LEAK"),
    
    CASCADING_FAILURE("CASCADING_FAILURE");

    private String value;

    FailureModeEnum(String value) {
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
    public static FailureModeEnum fromValue(String value) {
      for (FailureModeEnum b : FailureModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private FailureModeEnum failureMode;

  private BigDecimal errorRatePercent;

  private Integer latencyIncreaseMs;

  /**
   * When the failure occurs.
   */
  public enum TimeOfDayEnum {
    OFF_PEAK("OFF_PEAK"),
    
    NORMAL("NORMAL"),
    
    PEAK("PEAK"),
    
    CRITICAL_WINDOW("CRITICAL_WINDOW");

    private String value;

    TimeOfDayEnum(String value) {
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
    public static TimeOfDayEnum fromValue(String value) {
      for (TimeOfDayEnum b : TimeOfDayEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private TimeOfDayEnum timeOfDay = TimeOfDayEnum.PEAK;

  private Integer durationMinutes;

  public SimulateFailuresRequestScenariosInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SimulateFailuresRequestScenariosInner(String scenarioName, FailureModeEnum failureMode) {
    this.scenarioName = scenarioName;
    this.failureMode = failureMode;
  }

  public SimulateFailuresRequestScenariosInner scenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
    return this;
  }

  /**
   * Human-readable name for the scenario.
   * @return scenarioName
  */
  @NotNull   @Schema(name = "scenarioName", example = "5% error rate at peak", description = "Human-readable name for the scenario.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scenarioName")
  public String getScenarioName() {
    return scenarioName;
  }

  public void setScenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
  }

  public SimulateFailuresRequestScenariosInner failureMode(FailureModeEnum failureMode) {
    this.failureMode = failureMode;
    return this;
  }

  /**
   * How the change fails.
   * @return failureMode
  */
  @NotNull   @Schema(name = "failureMode", example = "ERROR_RATE", description = "How the change fails.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failureMode")
  public FailureModeEnum getFailureMode() {
    return failureMode;
  }

  public void setFailureMode(FailureModeEnum failureMode) {
    this.failureMode = failureMode;
  }

  public SimulateFailuresRequestScenariosInner errorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
    return this;
  }

  /**
   * Required when failureMode = ERROR_RATE.
   * @return errorRatePercent
  */
  @Valid   @Schema(name = "errorRatePercent", example = "5.0", description = "Required when failureMode = ERROR_RATE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorRatePercent")
  public BigDecimal getErrorRatePercent() {
    return errorRatePercent;
  }

  public void setErrorRatePercent(BigDecimal errorRatePercent) {
    this.errorRatePercent = errorRatePercent;
  }

  public SimulateFailuresRequestScenariosInner latencyIncreaseMs(Integer latencyIncreaseMs) {
    this.latencyIncreaseMs = latencyIncreaseMs;
    return this;
  }

  /**
   * Required when failureMode = LATENCY_SPIKE.
   * @return latencyIncreaseMs
  */
    @Schema(name = "latencyIncreaseMs", example = "500", description = "Required when failureMode = LATENCY_SPIKE.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("latencyIncreaseMs")
  public Integer getLatencyIncreaseMs() {
    return latencyIncreaseMs;
  }

  public void setLatencyIncreaseMs(Integer latencyIncreaseMs) {
    this.latencyIncreaseMs = latencyIncreaseMs;
  }

  public SimulateFailuresRequestScenariosInner timeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * When the failure occurs.
   * @return timeOfDay
  */
    @Schema(name = "timeOfDay", example = "PEAK", description = "When the failure occurs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOfDay")
  public TimeOfDayEnum getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public SimulateFailuresRequestScenariosInner durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  /**
   * How long before detection/rollback.
   * @return durationMinutes
  */
    @Schema(name = "durationMinutes", example = "15", description = "How long before detection/rollback.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMinutes")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }

  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateFailuresRequestScenariosInner simulateFailuresRequestScenariosInner = (SimulateFailuresRequestScenariosInner) o;
    return Objects.equals(this.scenarioName, simulateFailuresRequestScenariosInner.scenarioName) &&
        Objects.equals(this.failureMode, simulateFailuresRequestScenariosInner.failureMode) &&
        Objects.equals(this.errorRatePercent, simulateFailuresRequestScenariosInner.errorRatePercent) &&
        Objects.equals(this.latencyIncreaseMs, simulateFailuresRequestScenariosInner.latencyIncreaseMs) &&
        Objects.equals(this.timeOfDay, simulateFailuresRequestScenariosInner.timeOfDay) &&
        Objects.equals(this.durationMinutes, simulateFailuresRequestScenariosInner.durationMinutes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioName, failureMode, errorRatePercent, latencyIncreaseMs, timeOfDay, durationMinutes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateFailuresRequestScenariosInner {\n");
    sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
    sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
    sb.append("    errorRatePercent: ").append(toIndentedString(errorRatePercent)).append("\n");
    sb.append("    latencyIncreaseMs: ").append(toIndentedString(latencyIncreaseMs)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
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

