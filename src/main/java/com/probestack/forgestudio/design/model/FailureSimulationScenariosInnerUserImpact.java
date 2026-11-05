package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * FailureSimulationScenariosInnerUserImpact
 */
@JsonTypeName("FailureSimulation_scenarios_inner_userImpact")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class FailureSimulationScenariosInnerUserImpact {

  private Integer estimatedUsersAffected;

  private Integer errorsBeforeRollback;

  private Integer supportTicketsExpected;

  private Integer socialMediaMentions;

  public FailureSimulationScenariosInnerUserImpact estimatedUsersAffected(Integer estimatedUsersAffected) {
    this.estimatedUsersAffected = estimatedUsersAffected;
    return this;
  }

  /**
   * Get estimatedUsersAffected
   * @return estimatedUsersAffected
  */
    @Schema(name = "estimatedUsersAffected", example = "245000", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("estimatedUsersAffected")
  public Integer getEstimatedUsersAffected() {
    return estimatedUsersAffected;
  }

  public void setEstimatedUsersAffected(Integer estimatedUsersAffected) {
    this.estimatedUsersAffected = estimatedUsersAffected;
  }

  public FailureSimulationScenariosInnerUserImpact errorsBeforeRollback(Integer errorsBeforeRollback) {
    this.errorsBeforeRollback = errorsBeforeRollback;
    return this;
  }

  /**
   * Get errorsBeforeRollback
   * @return errorsBeforeRollback
  */
    @Schema(name = "errorsBeforeRollback", example = "4280", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errorsBeforeRollback")
  public Integer getErrorsBeforeRollback() {
    return errorsBeforeRollback;
  }

  public void setErrorsBeforeRollback(Integer errorsBeforeRollback) {
    this.errorsBeforeRollback = errorsBeforeRollback;
  }

  public FailureSimulationScenariosInnerUserImpact supportTicketsExpected(Integer supportTicketsExpected) {
    this.supportTicketsExpected = supportTicketsExpected;
    return this;
  }

  /**
   * Get supportTicketsExpected
   * @return supportTicketsExpected
  */
    @Schema(name = "supportTicketsExpected", example = "342", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("supportTicketsExpected")
  public Integer getSupportTicketsExpected() {
    return supportTicketsExpected;
  }

  public void setSupportTicketsExpected(Integer supportTicketsExpected) {
    this.supportTicketsExpected = supportTicketsExpected;
  }

  public FailureSimulationScenariosInnerUserImpact socialMediaMentions(Integer socialMediaMentions) {
    this.socialMediaMentions = socialMediaMentions;
    return this;
  }

  /**
   * Get socialMediaMentions
   * @return socialMediaMentions
  */
    @Schema(name = "socialMediaMentions", example = "48", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("socialMediaMentions")
  public Integer getSocialMediaMentions() {
    return socialMediaMentions;
  }

  public void setSocialMediaMentions(Integer socialMediaMentions) {
    this.socialMediaMentions = socialMediaMentions;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FailureSimulationScenariosInnerUserImpact failureSimulationScenariosInnerUserImpact = (FailureSimulationScenariosInnerUserImpact) o;
    return Objects.equals(this.estimatedUsersAffected, failureSimulationScenariosInnerUserImpact.estimatedUsersAffected) &&
        Objects.equals(this.errorsBeforeRollback, failureSimulationScenariosInnerUserImpact.errorsBeforeRollback) &&
        Objects.equals(this.supportTicketsExpected, failureSimulationScenariosInnerUserImpact.supportTicketsExpected) &&
        Objects.equals(this.socialMediaMentions, failureSimulationScenariosInnerUserImpact.socialMediaMentions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimatedUsersAffected, errorsBeforeRollback, supportTicketsExpected, socialMediaMentions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FailureSimulationScenariosInnerUserImpact {\n");
    sb.append("    estimatedUsersAffected: ").append(toIndentedString(estimatedUsersAffected)).append("\n");
    sb.append("    errorsBeforeRollback: ").append(toIndentedString(errorsBeforeRollback)).append("\n");
    sb.append("    supportTicketsExpected: ").append(toIndentedString(supportTicketsExpected)).append("\n");
    sb.append("    socialMediaMentions: ").append(toIndentedString(socialMediaMentions)).append("\n");
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

