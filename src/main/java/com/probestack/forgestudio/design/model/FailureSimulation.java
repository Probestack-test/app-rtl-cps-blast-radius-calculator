package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.FailureSimulationOverallRecommendation;
import com.probestack.forgestudio.design.model.FailureSimulationScenariosInner;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulation
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulation {

  private UUID simulationId;

  private UUID analysisId;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime generatedAt;

  @Valid
  private List<@Valid FailureSimulationScenariosInner> scenarios = new ArrayList<>();

  private FailureSimulationOverallRecommendation overallRecommendation;

  private String auditReference;

  public FailureSimulation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailureSimulation(UUID simulationId, UUID analysisId, OffsetDateTime generatedAt, List<@Valid FailureSimulationScenariosInner> scenarios, FailureSimulationOverallRecommendation overallRecommendation) {
    this.simulationId = simulationId;
    this.analysisId = analysisId;
    this.generatedAt = generatedAt;
    this.scenarios = scenarios;
    this.overallRecommendation = overallRecommendation;
  }

  public FailureSimulation simulationId(UUID simulationId) {
    this.simulationId = simulationId;
    return this;
  }

  /**
   * Get simulationId
   * @return simulationId
  */
  @NotNull @Valid   @Schema(name = "simulationId", example = "b1a2c3d4-e5f6-7890-1234-567890abcdef", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("simulationId")
  public UUID getSimulationId() {
    return simulationId;
  }

  public void setSimulationId(UUID simulationId) {
    this.simulationId = simulationId;
  }

  public FailureSimulation analysisId(UUID analysisId) {
    this.analysisId = analysisId;
    return this;
  }

  /**
   * Get analysisId
   * @return analysisId
  */
  @NotNull @Valid   @Schema(name = "analysisId", example = "9c8f1a3b-6d7e-4a12-8f5e-123456789abc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("analysisId")
  public UUID getAnalysisId() {
    return analysisId;
  }

  public void setAnalysisId(UUID analysisId) {
    this.analysisId = analysisId;
  }

  public FailureSimulation generatedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
    return this;
  }

  /**
   * Get generatedAt
   * @return generatedAt
  */
  @NotNull @Valid   @Schema(name = "generatedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("generatedAt")
  public OffsetDateTime getGeneratedAt() {
    return generatedAt;
  }

  public void setGeneratedAt(OffsetDateTime generatedAt) {
    this.generatedAt = generatedAt;
  }

  public FailureSimulation scenarios(List<@Valid FailureSimulationScenariosInner> scenarios) {
    this.scenarios = scenarios;
    return this;
  }

  public FailureSimulation addScenariosItem(FailureSimulationScenariosInner scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

  /**
   * Get scenarios
   * @return scenarios
  */
  @NotNull @Valid   @Schema(name = "scenarios", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("scenarios")
  public List<@Valid FailureSimulationScenariosInner> getScenarios() {
    return scenarios;
  }

  public void setScenarios(List<@Valid FailureSimulationScenariosInner> scenarios) {
    this.scenarios = scenarios;
  }

  public FailureSimulation overallRecommendation(FailureSimulationOverallRecommendation overallRecommendation) {
    this.overallRecommendation = overallRecommendation;
    return this;
  }

  /**
   * Get overallRecommendation
   * @return overallRecommendation
  */
  @NotNull @Valid   @Schema(name = "overallRecommendation", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("overallRecommendation")
  public FailureSimulationOverallRecommendation getOverallRecommendation() {
    return overallRecommendation;
  }

  public void setOverallRecommendation(FailureSimulationOverallRecommendation overallRecommendation) {
    this.overallRecommendation = overallRecommendation;
  }

  public FailureSimulation auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://blast-radius/simulation-b1a2c3d4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("auditReference")
  public String getAuditReference() {
    return auditReference;
  }

  public void setAuditReference(String auditReference) {
    this.auditReference = auditReference;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulation failureSimulation = (FailureSimulation) o;
    return Objects.equals(this.simulationId, failureSimulation.simulationId) &&
        Objects.equals(this.analysisId, failureSimulation.analysisId) &&
        Objects.equals(this.generatedAt, failureSimulation.generatedAt) &&
        Objects.equals(this.scenarios, failureSimulation.scenarios) &&
        Objects.equals(this.overallRecommendation, failureSimulation.overallRecommendation) &&
        Objects.equals(this.auditReference, failureSimulation.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(simulationId, analysisId, generatedAt, scenarios, overallRecommendation, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulation {\n");
    sb.append("    simulationId: ").append(toIndentedString(simulationId)).append("\n");
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    generatedAt: ").append(toIndentedString(generatedAt)).append("\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
    sb.append("    overallRecommendation: ").append(toIndentedString(overallRecommendation)).append("\n");
    sb.append("    auditReference: ").append(toIndentedString(auditReference)).append("\n");
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

