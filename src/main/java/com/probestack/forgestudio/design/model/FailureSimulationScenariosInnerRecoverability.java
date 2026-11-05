package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulationScenariosInnerRecoverability
 */
@JsonTypeName("FailureSimulation_scenarios_inner_recoverability")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulationScenariosInnerRecoverability {

  private Boolean autoRollbackPossible;

  private Integer estimatedRecoveryMinutes;

  private Boolean requiresManualIntervention;

  private Boolean dataLossPossible;

  public FailureSimulationScenariosInnerRecoverability autoRollbackPossible(Boolean autoRollbackPossible) {
    this.autoRollbackPossible = autoRollbackPossible;
    return this;
  }

  /**
   * Get autoRollbackPossible
   * @return autoRollbackPossible
  */
    @Schema(name = "autoRollbackPossible", example = "true", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRollbackPossible")
  public Boolean getAutoRollbackPossible() {
    return autoRollbackPossible;
  }

  public void setAutoRollbackPossible(Boolean autoRollbackPossible) {
    this.autoRollbackPossible = autoRollbackPossible;
  }

  public FailureSimulationScenariosInnerRecoverability estimatedRecoveryMinutes(Integer estimatedRecoveryMinutes) {
    this.estimatedRecoveryMinutes = estimatedRecoveryMinutes;
    return this;
  }

  /**
   * Get estimatedRecoveryMinutes
   * @return estimatedRecoveryMinutes
  */
    @Schema(name = "estimatedRecoveryMinutes", example = "8", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedRecoveryMinutes")
  public Integer getEstimatedRecoveryMinutes() {
    return estimatedRecoveryMinutes;
  }

  public void setEstimatedRecoveryMinutes(Integer estimatedRecoveryMinutes) {
    this.estimatedRecoveryMinutes = estimatedRecoveryMinutes;
  }

  public FailureSimulationScenariosInnerRecoverability requiresManualIntervention(Boolean requiresManualIntervention) {
    this.requiresManualIntervention = requiresManualIntervention;
    return this;
  }

  /**
   * Get requiresManualIntervention
   * @return requiresManualIntervention
  */
    @Schema(name = "requiresManualIntervention", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiresManualIntervention")
  public Boolean getRequiresManualIntervention() {
    return requiresManualIntervention;
  }

  public void setRequiresManualIntervention(Boolean requiresManualIntervention) {
    this.requiresManualIntervention = requiresManualIntervention;
  }

  public FailureSimulationScenariosInnerRecoverability dataLossPossible(Boolean dataLossPossible) {
    this.dataLossPossible = dataLossPossible;
    return this;
  }

  /**
   * Get dataLossPossible
   * @return dataLossPossible
  */
    @Schema(name = "dataLossPossible", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dataLossPossible")
  public Boolean getDataLossPossible() {
    return dataLossPossible;
  }

  public void setDataLossPossible(Boolean dataLossPossible) {
    this.dataLossPossible = dataLossPossible;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulationScenariosInnerRecoverability failureSimulationScenariosInnerRecoverability = (FailureSimulationScenariosInnerRecoverability) o;
    return Objects.equals(this.autoRollbackPossible, failureSimulationScenariosInnerRecoverability.autoRollbackPossible) &&
        Objects.equals(this.estimatedRecoveryMinutes, failureSimulationScenariosInnerRecoverability.estimatedRecoveryMinutes) &&
        Objects.equals(this.requiresManualIntervention, failureSimulationScenariosInnerRecoverability.requiresManualIntervention) &&
        Objects.equals(this.dataLossPossible, failureSimulationScenariosInnerRecoverability.dataLossPossible);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRollbackPossible, estimatedRecoveryMinutes, requiresManualIntervention, dataLossPossible);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulationScenariosInnerRecoverability {\n");
    sb.append("    autoRollbackPossible: ").append(toIndentedString(autoRollbackPossible)).append("\n");
    sb.append("    estimatedRecoveryMinutes: ").append(toIndentedString(estimatedRecoveryMinutes)).append("\n");
    sb.append("    requiresManualIntervention: ").append(toIndentedString(requiresManualIntervention)).append("\n");
    sb.append("    dataLossPossible: ").append(toIndentedString(dataLossPossible)).append("\n");
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

