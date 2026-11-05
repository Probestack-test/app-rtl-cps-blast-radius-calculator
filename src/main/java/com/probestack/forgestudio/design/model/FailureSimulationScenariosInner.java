package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.FailureSimulationScenariosInnerRecoverability;
import com.probestack.forgestudio.design.model.FailureSimulationScenariosInnerRevenueImpact;
import com.probestack.forgestudio.design.model.FailureSimulationScenariosInnerUserImpact;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulationScenariosInner
 */
@JsonTypeName("FailureSimulation_scenarios_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulationScenariosInner {

  private String scenarioName;

  /**
   * Gets or Sets failureMode
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

  /**
   * Gets or Sets timeOfDay
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
  private TimeOfDayEnum timeOfDay;

  private Integer durationMinutes;

  private FailureSimulationScenariosInnerUserImpact userImpact;

  private FailureSimulationScenariosInnerRevenueImpact revenueImpact;

  private FailureSimulationScenariosInnerRecoverability recoverability;

  @Valid
  private List<String> cascadeRisk;

  /**
   * Gets or Sets verdict
   */
  public enum VerdictEnum {
    ACCEPTABLE("ACCEPTABLE"),
    
    HIGH_RISK("HIGH_RISK"),
    
    UNACCEPTABLE("UNACCEPTABLE");

    private String value;

    VerdictEnum(String value) {
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
    public static VerdictEnum fromValue(String value) {
      for (VerdictEnum b : VerdictEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private VerdictEnum verdict;

  public FailureSimulationScenariosInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailureSimulationScenariosInner(String scenarioName, FailureModeEnum failureMode, FailureSimulationScenariosInnerUserImpact userImpact, FailureSimulationScenariosInnerRevenueImpact revenueImpact, FailureSimulationScenariosInnerRecoverability recoverability) {
    this.scenarioName = scenarioName;
    this.failureMode = failureMode;
    this.userImpact = userImpact;
    this.revenueImpact = revenueImpact;
    this.recoverability = recoverability;
  }

  public FailureSimulationScenariosInner scenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
    return this;
  }

  /**
   * Get scenarioName
   * @return scenarioName
  */
  @NotNull   @Schema(name = "scenarioName", example = "5% error rate at peak", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scenarioName")
  public String getScenarioName() {
    return scenarioName;
  }

  public void setScenarioName(String scenarioName) {
    this.scenarioName = scenarioName;
  }

  public FailureSimulationScenariosInner failureMode(FailureModeEnum failureMode) {
    this.failureMode = failureMode;
    return this;
  }

  /**
   * Get failureMode
   * @return failureMode
  */
  @NotNull   @Schema(name = "failureMode", example = "ERROR_RATE", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("failureMode")
  public FailureModeEnum getFailureMode() {
    return failureMode;
  }

  public void setFailureMode(FailureModeEnum failureMode) {
    this.failureMode = failureMode;
  }

  public FailureSimulationScenariosInner timeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
    return this;
  }

  /**
   * Get timeOfDay
   * @return timeOfDay
  */
    @Schema(name = "timeOfDay", example = "PEAK", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timeOfDay")
  public TimeOfDayEnum getTimeOfDay() {
    return timeOfDay;
  }

  public void setTimeOfDay(TimeOfDayEnum timeOfDay) {
    this.timeOfDay = timeOfDay;
  }

  public FailureSimulationScenariosInner durationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
    return this;
  }

  /**
   * Get durationMinutes
   * @return durationMinutes
  */
    @Schema(name = "durationMinutes", example = "15", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("durationMinutes")
  public Integer getDurationMinutes() {
    return durationMinutes;
  }

  public void setDurationMinutes(Integer durationMinutes) {
    this.durationMinutes = durationMinutes;
  }

  public FailureSimulationScenariosInner userImpact(FailureSimulationScenariosInnerUserImpact userImpact) {
    this.userImpact = userImpact;
    return this;
  }

  /**
   * Get userImpact
   * @return userImpact
  */
  @NotNull @Valid   @Schema(name = "userImpact", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("userImpact")
  public FailureSimulationScenariosInnerUserImpact getUserImpact() {
    return userImpact;
  }

  public void setUserImpact(FailureSimulationScenariosInnerUserImpact userImpact) {
    this.userImpact = userImpact;
  }

  public FailureSimulationScenariosInner revenueImpact(FailureSimulationScenariosInnerRevenueImpact revenueImpact) {
    this.revenueImpact = revenueImpact;
    return this;
  }

  /**
   * Get revenueImpact
   * @return revenueImpact
  */
  @NotNull @Valid   @Schema(name = "revenueImpact", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("revenueImpact")
  public FailureSimulationScenariosInnerRevenueImpact getRevenueImpact() {
    return revenueImpact;
  }

  public void setRevenueImpact(FailureSimulationScenariosInnerRevenueImpact revenueImpact) {
    this.revenueImpact = revenueImpact;
  }

  public FailureSimulationScenariosInner recoverability(FailureSimulationScenariosInnerRecoverability recoverability) {
    this.recoverability = recoverability;
    return this;
  }

  /**
   * Get recoverability
   * @return recoverability
  */
  @NotNull @Valid   @Schema(name = "recoverability", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recoverability")
  public FailureSimulationScenariosInnerRecoverability getRecoverability() {
    return recoverability;
  }

  public void setRecoverability(FailureSimulationScenariosInnerRecoverability recoverability) {
    this.recoverability = recoverability;
  }

  public FailureSimulationScenariosInner cascadeRisk(List<String> cascadeRisk) {
    this.cascadeRisk = cascadeRisk;
    return this;
  }

  public FailureSimulationScenariosInner addCascadeRiskItem(String cascadeRiskItem) {
    if (this.cascadeRisk == null) {
      this.cascadeRisk = new ArrayList<>();
    }
    this.cascadeRisk.add(cascadeRiskItem);
    return this;
  }

  /**
   * Which downstream services would also break.
   * @return cascadeRisk
  */
    @Schema(name = "cascadeRisk", example = "[\"checkout-service\",\"order-service\",\"notification-service\"]", description = "Which downstream services would also break.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cascadeRisk")
  public List<String> getCascadeRisk() {
    return cascadeRisk;
  }

  public void setCascadeRisk(List<String> cascadeRisk) {
    this.cascadeRisk = cascadeRisk;
  }

  public FailureSimulationScenariosInner verdict(VerdictEnum verdict) {
    this.verdict = verdict;
    return this;
  }

  /**
   * Get verdict
   * @return verdict
  */
    @Schema(name = "verdict", example = "UNACCEPTABLE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("verdict")
  public VerdictEnum getVerdict() {
    return verdict;
  }

  public void setVerdict(VerdictEnum verdict) {
    this.verdict = verdict;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulationScenariosInner failureSimulationScenariosInner = (FailureSimulationScenariosInner) o;
    return Objects.equals(this.scenarioName, failureSimulationScenariosInner.scenarioName) &&
        Objects.equals(this.failureMode, failureSimulationScenariosInner.failureMode) &&
        Objects.equals(this.timeOfDay, failureSimulationScenariosInner.timeOfDay) &&
        Objects.equals(this.durationMinutes, failureSimulationScenariosInner.durationMinutes) &&
        Objects.equals(this.userImpact, failureSimulationScenariosInner.userImpact) &&
        Objects.equals(this.revenueImpact, failureSimulationScenariosInner.revenueImpact) &&
        Objects.equals(this.recoverability, failureSimulationScenariosInner.recoverability) &&
        Objects.equals(this.cascadeRisk, failureSimulationScenariosInner.cascadeRisk) &&
        Objects.equals(this.verdict, failureSimulationScenariosInner.verdict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarioName, failureMode, timeOfDay, durationMinutes, userImpact, revenueImpact, recoverability, cascadeRisk, verdict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulationScenariosInner {\n");
    sb.append("    scenarioName: ").append(toIndentedString(scenarioName)).append("\n");
    sb.append("    failureMode: ").append(toIndentedString(failureMode)).append("\n");
    sb.append("    timeOfDay: ").append(toIndentedString(timeOfDay)).append("\n");
    sb.append("    durationMinutes: ").append(toIndentedString(durationMinutes)).append("\n");
    sb.append("    userImpact: ").append(toIndentedString(userImpact)).append("\n");
    sb.append("    revenueImpact: ").append(toIndentedString(revenueImpact)).append("\n");
    sb.append("    recoverability: ").append(toIndentedString(recoverability)).append("\n");
    sb.append("    cascadeRisk: ").append(toIndentedString(cascadeRisk)).append("\n");
    sb.append("    verdict: ").append(toIndentedString(verdict)).append("\n");
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

