package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisRecommendationsDeployWindow;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisRecommendationsRollbackTriggersInner;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysisRecommendations
 */
@JsonTypeName("BlastRadiusAnalysis_recommendations")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysisRecommendations {

  private Integer recommendedCanaryPercent;

  @Valid
  private List<@Valid BlastRadiusAnalysisRecommendationsRollbackTriggersInner> rollbackTriggers = new ArrayList<>();

  private BlastRadiusAnalysisRecommendationsDeployWindow deployWindow;

  private Boolean requiresApproval;

  @Valid
  private List<String> requiredApprovers;

  @Valid
  private List<String> preDeployChecks;

  @Valid
  private List<String> warningNotes;

  public BlastRadiusAnalysisRecommendations() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlastRadiusAnalysisRecommendations(Integer recommendedCanaryPercent, List<@Valid BlastRadiusAnalysisRecommendationsRollbackTriggersInner> rollbackTriggers, BlastRadiusAnalysisRecommendationsDeployWindow deployWindow, Boolean requiresApproval) {
    this.recommendedCanaryPercent = recommendedCanaryPercent;
    this.rollbackTriggers = rollbackTriggers;
    this.deployWindow = deployWindow;
    this.requiresApproval = requiresApproval;
  }

  public BlastRadiusAnalysisRecommendations recommendedCanaryPercent(Integer recommendedCanaryPercent) {
    this.recommendedCanaryPercent = recommendedCanaryPercent;
    return this;
  }

  /**
   * Suggested initial canary traffic %.
   * minimum: 1
   * maximum: 100
   * @return recommendedCanaryPercent
  */
  @NotNull @Min(1) @Max(100)   @Schema(name = "recommendedCanaryPercent", example = "2", description = "Suggested initial canary traffic %.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendedCanaryPercent")
  public Integer getRecommendedCanaryPercent() {
    return recommendedCanaryPercent;
  }

  public void setRecommendedCanaryPercent(Integer recommendedCanaryPercent) {
    this.recommendedCanaryPercent = recommendedCanaryPercent;
  }

  public BlastRadiusAnalysisRecommendations rollbackTriggers(List<@Valid BlastRadiusAnalysisRecommendationsRollbackTriggersInner> rollbackTriggers) {
    this.rollbackTriggers = rollbackTriggers;
    return this;
  }

  public BlastRadiusAnalysisRecommendations addRollbackTriggersItem(BlastRadiusAnalysisRecommendationsRollbackTriggersInner rollbackTriggersItem) {
    if (this.rollbackTriggers == null) {
      this.rollbackTriggers = new ArrayList<>();
    }
    this.rollbackTriggers.add(rollbackTriggersItem);
    return this;
  }

  /**
   * Metrics that should trigger automatic rollback.
   * @return rollbackTriggers
  */
  @NotNull @Valid   @Schema(name = "rollbackTriggers", description = "Metrics that should trigger automatic rollback.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("rollbackTriggers")
  public List<@Valid BlastRadiusAnalysisRecommendationsRollbackTriggersInner> getRollbackTriggers() {
    return rollbackTriggers;
  }

  public void setRollbackTriggers(List<@Valid BlastRadiusAnalysisRecommendationsRollbackTriggersInner> rollbackTriggers) {
    this.rollbackTriggers = rollbackTriggers;
  }

  public BlastRadiusAnalysisRecommendations deployWindow(BlastRadiusAnalysisRecommendationsDeployWindow deployWindow) {
    this.deployWindow = deployWindow;
    return this;
  }

  /**
   * Get deployWindow
   * @return deployWindow
  */
  @NotNull @Valid   @Schema(name = "deployWindow", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("deployWindow")
  public BlastRadiusAnalysisRecommendationsDeployWindow getDeployWindow() {
    return deployWindow;
  }

  public void setDeployWindow(BlastRadiusAnalysisRecommendationsDeployWindow deployWindow) {
    this.deployWindow = deployWindow;
  }

  public BlastRadiusAnalysisRecommendations requiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
    return this;
  }

  /**
   * Get requiresApproval
   * @return requiresApproval
  */
  @NotNull   @Schema(name = "requiresApproval", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("requiresApproval")
  public Boolean getRequiresApproval() {
    return requiresApproval;
  }

  public void setRequiresApproval(Boolean requiresApproval) {
    this.requiresApproval = requiresApproval;
  }

  public BlastRadiusAnalysisRecommendations requiredApprovers(List<String> requiredApprovers) {
    this.requiredApprovers = requiredApprovers;
    return this;
  }

  public BlastRadiusAnalysisRecommendations addRequiredApproversItem(String requiredApproversItem) {
    if (this.requiredApprovers == null) {
      this.requiredApprovers = new ArrayList<>();
    }
    this.requiredApprovers.add(requiredApproversItem);
    return this;
  }

  /**
   * Who must approve before deploy.
   * @return requiredApprovers
  */
    @Schema(name = "requiredApprovers", example = "[\"vp-engineering@forgesphere.example.com\",\"ciso@forgesphere.example.com\"]", description = "Who must approve before deploy.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requiredApprovers")
  public List<String> getRequiredApprovers() {
    return requiredApprovers;
  }

  public void setRequiredApprovers(List<String> requiredApprovers) {
    this.requiredApprovers = requiredApprovers;
  }

  public BlastRadiusAnalysisRecommendations preDeployChecks(List<String> preDeployChecks) {
    this.preDeployChecks = preDeployChecks;
    return this;
  }

  public BlastRadiusAnalysisRecommendations addPreDeployChecksItem(String preDeployChecksItem) {
    if (this.preDeployChecks == null) {
      this.preDeployChecks = new ArrayList<>();
    }
    this.preDeployChecks.add(preDeployChecksItem);
    return this;
  }

  /**
   * Additional checks required before deploying.
   * @return preDeployChecks
  */
    @Schema(name = "preDeployChecks", example = "[\"Contract Chronicle verification passed\",\"Shadow Mirror 24h with 10% traffic\",\"Rollback Commander ready with previous version\"]", description = "Additional checks required before deploying.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("preDeployChecks")
  public List<String> getPreDeployChecks() {
    return preDeployChecks;
  }

  public void setPreDeployChecks(List<String> preDeployChecks) {
    this.preDeployChecks = preDeployChecks;
  }

  public BlastRadiusAnalysisRecommendations warningNotes(List<String> warningNotes) {
    this.warningNotes = warningNotes;
    return this;
  }

  public BlastRadiusAnalysisRecommendations addWarningNotesItem(String warningNotesItem) {
    if (this.warningNotes == null) {
      this.warningNotes = new ArrayList<>();
    }
    this.warningNotes.add(warningNotesItem);
    return this;
  }

  /**
   * Get warningNotes
   * @return warningNotes
  */
    @Schema(name = "warningNotes", example = "[\"Enterprise customers use /charge exclusively — SLA impact is severe.\",\"No fallback path exists in checkout-service; cascade risk is high.\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warningNotes")
  public List<String> getWarningNotes() {
    return warningNotes;
  }

  public void setWarningNotes(List<String> warningNotes) {
    this.warningNotes = warningNotes;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlastRadiusAnalysisRecommendations blastRadiusAnalysisRecommendations = (BlastRadiusAnalysisRecommendations) o;
    return Objects.equals(this.recommendedCanaryPercent, blastRadiusAnalysisRecommendations.recommendedCanaryPercent) &&
        Objects.equals(this.rollbackTriggers, blastRadiusAnalysisRecommendations.rollbackTriggers) &&
        Objects.equals(this.deployWindow, blastRadiusAnalysisRecommendations.deployWindow) &&
        Objects.equals(this.requiresApproval, blastRadiusAnalysisRecommendations.requiresApproval) &&
        Objects.equals(this.requiredApprovers, blastRadiusAnalysisRecommendations.requiredApprovers) &&
        Objects.equals(this.preDeployChecks, blastRadiusAnalysisRecommendations.preDeployChecks) &&
        Objects.equals(this.warningNotes, blastRadiusAnalysisRecommendations.warningNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recommendedCanaryPercent, rollbackTriggers, deployWindow, requiresApproval, requiredApprovers, preDeployChecks, warningNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysisRecommendations {\n");
    sb.append("    recommendedCanaryPercent: ").append(toIndentedString(recommendedCanaryPercent)).append("\n");
    sb.append("    rollbackTriggers: ").append(toIndentedString(rollbackTriggers)).append("\n");
    sb.append("    deployWindow: ").append(toIndentedString(deployWindow)).append("\n");
    sb.append("    requiresApproval: ").append(toIndentedString(requiresApproval)).append("\n");
    sb.append("    requiredApprovers: ").append(toIndentedString(requiredApprovers)).append("\n");
    sb.append("    preDeployChecks: ").append(toIndentedString(preDeployChecks)).append("\n");
    sb.append("    warningNotes: ").append(toIndentedString(warningNotes)).append("\n");
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

