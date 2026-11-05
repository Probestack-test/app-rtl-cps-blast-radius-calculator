package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.probestack.forgestudio.design.model.SimulateFailuresRequestAutoRollbackThresholds;
import com.probestack.forgestudio.design.model.SimulateFailuresRequestScenariosInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * SimulateFailuresRequest
 */
@JsonTypeName("simulateFailures_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class SimulateFailuresRequest {

  @Valid
  private List<@Valid SimulateFailuresRequestScenariosInner> scenarios = new ArrayList<>();

  private SimulateFailuresRequestAutoRollbackThresholds autoRollbackThresholds;

  public SimulateFailuresRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SimulateFailuresRequest(List<@Valid SimulateFailuresRequestScenariosInner> scenarios) {
    this.scenarios = scenarios;
  }

  public SimulateFailuresRequest scenarios(List<@Valid SimulateFailuresRequestScenariosInner> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  public SimulateFailuresRequest addScenariosItem(SimulateFailuresRequestScenariosInner scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

  /**
   * Failure scenarios to simulate.
   * @return scenarios
  */
  @NotNull @Valid @Size(min = 1)   @Schema(name = "scenarios", description = "Failure scenarios to simulate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scenarios")
  public List<@Valid SimulateFailuresRequestScenariosInner> getScenarios() {
    return scenarios;
  }

  public void setScenarios(List<@Valid SimulateFailuresRequestScenariosInner> scenarios) {
    this.scenarios = scenarios;
  }

  public SimulateFailuresRequest autoRollbackThresholds(SimulateFailuresRequestAutoRollbackThresholds autoRollbackThresholds) {
    this.autoRollbackThresholds = autoRollbackThresholds;
    return this;
  }

  /**
   * Get autoRollbackThresholds
   * @return autoRollbackThresholds
  */
  @Valid   @Schema(name = "autoRollbackThresholds", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("autoRollbackThresholds")
  public SimulateFailuresRequestAutoRollbackThresholds getAutoRollbackThresholds() {
    return autoRollbackThresholds;
  }

  public void setAutoRollbackThresholds(SimulateFailuresRequestAutoRollbackThresholds autoRollbackThresholds) {
    this.autoRollbackThresholds = autoRollbackThresholds;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulateFailuresRequest simulateFailuresRequest = (SimulateFailuresRequest) o;
    return Objects.equals(this.scenarios, simulateFailuresRequest.scenarios) &&
        Objects.equals(this.autoRollbackThresholds, simulateFailuresRequest.autoRollbackThresholds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarios, autoRollbackThresholds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulateFailuresRequest {\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
    sb.append("    autoRollbackThresholds: ").append(toIndentedString(autoRollbackThresholds)).append("\n");
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

