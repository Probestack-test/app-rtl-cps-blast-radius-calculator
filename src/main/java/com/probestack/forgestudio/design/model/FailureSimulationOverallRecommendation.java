package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulationOverallRecommendation
 */
@JsonTypeName("FailureSimulation_overallRecommendation")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulationOverallRecommendation {

  private Boolean proceed;

  private String reasoning;

  private String alternativeApproach;

  @Valid
  private List<String> suggestedApprovalRequirements;

  public FailureSimulationOverallRecommendation() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public FailureSimulationOverallRecommendation(Boolean proceed, String reasoning) {
    this.proceed = proceed;
    this.reasoning = reasoning;
  }

  public FailureSimulationOverallRecommendation proceed(Boolean proceed) {
    this.proceed = proceed;
    return this;
  }

  /**
   * Get proceed
   * @return proceed
  */
  @NotNull   @Schema(name = "proceed", example = "false", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("proceed")
  public Boolean getProceed() {
    return proceed;
  }

  public void setProceed(Boolean proceed) {
    this.proceed = proceed;
  }

  public FailureSimulationOverallRecommendation reasoning(String reasoning) {
    this.reasoning = reasoning;
    return this;
  }

  /**
   * Get reasoning
   * @return reasoning
  */
  @NotNull   @Schema(name = "reasoning", example = "All scenarios exceed acceptable revenue loss ($50K threshold). Recommend splitting the change into smaller increments or deploying in a dedicated maintenance window with 1% canary.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("reasoning")
  public String getReasoning() {
    return reasoning;
  }

  public void setReasoning(String reasoning) {
    this.reasoning = reasoning;
  }

  public FailureSimulationOverallRecommendation alternativeApproach(String alternativeApproach) {
    this.alternativeApproach = alternativeApproach;
    return this;
  }

  /**
   * Get alternativeApproach
   * @return alternativeApproach
  */
    @Schema(name = "alternativeApproach", example = "Deploy as a deprecation first (keep discount_code, add discount_v2), then remove in a follow-up release.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alternativeApproach")
  public String getAlternativeApproach() {
    return alternativeApproach;
  }

  public void setAlternativeApproach(String alternativeApproach) {
    this.alternativeApproach = alternativeApproach;
  }

  public FailureSimulationOverallRecommendation suggestedApprovalRequirements(List<String> suggestedApprovalRequirements) {
    this.suggestedApprovalRequirements = suggestedApprovalRequirements;
    return this;
  }

  public FailureSimulationOverallRecommendation addSuggestedApprovalRequirementsItem(String suggestedApprovalRequirementsItem) {
    if (this.suggestedApprovalRequirements == null) {
      this.suggestedApprovalRequirements = new ArrayList<>();
    }
    this.suggestedApprovalRequirements.add(suggestedApprovalRequirementsItem);
    return this;
  }

  /**
   * Get suggestedApprovalRequirements
   * @return suggestedApprovalRequirements
  */
    @Schema(name = "suggestedApprovalRequirements", example = "[\"VP Engineering\",\"CISO\",\"Customer Success Lead\"]", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("suggestedApprovalRequirements")
  public List<String> getSuggestedApprovalRequirements() {
    return suggestedApprovalRequirements;
  }

  public void setSuggestedApprovalRequirements(List<String> suggestedApprovalRequirements) {
    this.suggestedApprovalRequirements = suggestedApprovalRequirements;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulationOverallRecommendation failureSimulationOverallRecommendation = (FailureSimulationOverallRecommendation) o;
    return Objects.equals(this.proceed, failureSimulationOverallRecommendation.proceed) &&
        Objects.equals(this.reasoning, failureSimulationOverallRecommendation.reasoning) &&
        Objects.equals(this.alternativeApproach, failureSimulationOverallRecommendation.alternativeApproach) &&
        Objects.equals(this.suggestedApprovalRequirements, failureSimulationOverallRecommendation.suggestedApprovalRequirements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(proceed, reasoning, alternativeApproach, suggestedApprovalRequirements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulationOverallRecommendation {\n");
    sb.append("    proceed: ").append(toIndentedString(proceed)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    alternativeApproach: ").append(toIndentedString(alternativeApproach)).append("\n");
    sb.append("    suggestedApprovalRequirements: ").append(toIndentedString(suggestedApprovalRequirements)).append("\n");
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

