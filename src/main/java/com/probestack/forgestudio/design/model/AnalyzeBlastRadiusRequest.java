package com.probestack.forgestudio.design.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalyzeBlastRadiusRequest
 */
@JsonTypeName("analyzeBlastRadius_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class AnalyzeBlastRadiusRequest {

  private String targetService;

  private String targetVersion;

  private String currentVersion;

  /**
   * Environment the change targets.
   */
  public enum EnvironmentEnum {
    STAGING("STAGING"),
    
    PRODUCTION("PRODUCTION");

    private String value;

    EnvironmentEnum(String value) {
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
    public static EnvironmentEnum fromValue(String value) {
      for (EnvironmentEnum b : EnvironmentEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private EnvironmentEnum environment;

  /**
   * Nature of the change.
   */
  public enum ChangeTypeEnum {
    FEATURE("FEATURE"),
    
    BUGFIX("BUGFIX"),
    
    HOTFIX("HOTFIX"),
    
    CONFIG_CHANGE("CONFIG_CHANGE"),
    
    INFRA_CHANGE("INFRA_CHANGE"),
    
    DEPENDENCY_UPGRADE("DEPENDENCY_UPGRADE"),
    
    DATABASE_MIGRATION("DATABASE_MIGRATION"),
    
    API_CONTRACT_CHANGE("API_CONTRACT_CHANGE"),
    
    ROLLBACK("ROLLBACK");

    private String value;

    ChangeTypeEnum(String value) {
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
    public static ChangeTypeEnum fromValue(String value) {
      for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private ChangeTypeEnum changeType;

  private String changeSummary;

  @Valid
  private List<String> affectedEndpoints;

  private Integer changeWindowMinutes;

  private Integer proposedCanaryPercent;

  private String requestedBy;

  private URI pullRequestUrl;

  public AnalyzeBlastRadiusRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalyzeBlastRadiusRequest(String targetService, String targetVersion, EnvironmentEnum environment, ChangeTypeEnum changeType) {
    this.targetService = targetService;
    this.targetVersion = targetVersion;
    this.environment = environment;
    this.changeType = changeType;
  }

  public AnalyzeBlastRadiusRequest targetService(String targetService) {
    this.targetService = targetService;
    return this;
  }

  /**
   * Service being changed.
   * @return targetService
  */
  @NotNull   @Schema(name = "targetService", example = "payment-processor", description = "Service being changed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetService")
  public String getTargetService() {
    return targetService;
  }

  public void setTargetService(String targetService) {
    this.targetService = targetService;
  }

  public AnalyzeBlastRadiusRequest targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Version being deployed.
   * @return targetVersion
  */
  @NotNull   @Schema(name = "targetVersion", example = "v2.5.0", description = "Version being deployed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetVersion")
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public AnalyzeBlastRadiusRequest currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Version currently deployed (baseline).
   * @return currentVersion
  */
    @Schema(name = "currentVersion", example = "v2.4.1", description = "Version currently deployed (baseline).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentVersion")
  public String getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }

  public AnalyzeBlastRadiusRequest environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Environment the change targets.
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", description = "Environment the change targets.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public AnalyzeBlastRadiusRequest changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Nature of the change.
   * @return changeType
  */
  @NotNull   @Schema(name = "changeType", example = "API_CONTRACT_CHANGE", description = "Nature of the change.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public AnalyzeBlastRadiusRequest changeSummary(String changeSummary) {
    this.changeSummary = changeSummary;
    return this;
  }

  /**
   * What's actually changing (human-readable).
   * @return changeSummary
  */
    @Schema(name = "changeSummary", example = "Removing discount_code field from /charge request; adding discount_v2 field.", description = "What's actually changing (human-readable).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeSummary")
  public String getChangeSummary() {
    return changeSummary;
  }

  public void setChangeSummary(String changeSummary) {
    this.changeSummary = changeSummary;
  }

  public AnalyzeBlastRadiusRequest affectedEndpoints(List<String> affectedEndpoints) {
    this.affectedEndpoints = affectedEndpoints;
    return this;
  }

  public AnalyzeBlastRadiusRequest addAffectedEndpointsItem(String affectedEndpointsItem) {
    if (this.affectedEndpoints == null) {
      this.affectedEndpoints = new ArrayList<>();
    }
    this.affectedEndpoints.add(affectedEndpointsItem);
    return this;
  }

  /**
   * Specific API endpoints affected by the change.
   * @return affectedEndpoints
  */
    @Schema(name = "affectedEndpoints", example = "[\"POST /api/v1/charge\",\"POST /api/v1/refund\"]", description = "Specific API endpoints affected by the change.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("affectedEndpoints")
  public List<String> getAffectedEndpoints() {
    return affectedEndpoints;
  }

  public void setAffectedEndpoints(List<String> affectedEndpoints) {
    this.affectedEndpoints = affectedEndpoints;
  }

  public AnalyzeBlastRadiusRequest changeWindowMinutes(Integer changeWindowMinutes) {
    this.changeWindowMinutes = changeWindowMinutes;
    return this;
  }

  /**
   * How long the rollout will take.
   * @return changeWindowMinutes
  */
    @Schema(name = "changeWindowMinutes", example = "30", description = "How long the rollout will take.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeWindowMinutes")
  public Integer getChangeWindowMinutes() {
    return changeWindowMinutes;
  }

  public void setChangeWindowMinutes(Integer changeWindowMinutes) {
    this.changeWindowMinutes = changeWindowMinutes;
  }

  public AnalyzeBlastRadiusRequest proposedCanaryPercent(Integer proposedCanaryPercent) {
    this.proposedCanaryPercent = proposedCanaryPercent;
    return this;
  }

  /**
   * Optional. Proposed canary traffic %.
   * minimum: 1
   * maximum: 100
   * @return proposedCanaryPercent
  */
  @Min(1) @Max(100)   @Schema(name = "proposedCanaryPercent", example = "5", description = "Optional. Proposed canary traffic %.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("proposedCanaryPercent")
  public Integer getProposedCanaryPercent() {
    return proposedCanaryPercent;
  }

  public void setProposedCanaryPercent(Integer proposedCanaryPercent) {
    this.proposedCanaryPercent = proposedCanaryPercent;
  }

  public AnalyzeBlastRadiusRequest requestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
    return this;
  }

  /**
   * Engineer requesting the analysis.
   * @return requestedBy
  */
    @Schema(name = "requestedBy", example = "amit.kumar@forgesphere.example.com", description = "Engineer requesting the analysis.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedBy")
  public String getRequestedBy() {
    return requestedBy;
  }

  public void setRequestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
  }

  public AnalyzeBlastRadiusRequest pullRequestUrl(URI pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
    return this;
  }

  /**
   * Optional PR reference for audit.
   * @return pullRequestUrl
  */
  @Valid   @Schema(name = "pullRequestUrl", example = "https://github.com/forgesphere/payment-service/pull/4821", description = "Optional PR reference for audit.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pullRequestUrl")
  public URI getPullRequestUrl() {
    return pullRequestUrl;
  }

  public void setPullRequestUrl(URI pullRequestUrl) {
    this.pullRequestUrl = pullRequestUrl;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyzeBlastRadiusRequest analyzeBlastRadiusRequest = (AnalyzeBlastRadiusRequest) o;
    return Objects.equals(this.targetService, analyzeBlastRadiusRequest.targetService) &&
        Objects.equals(this.targetVersion, analyzeBlastRadiusRequest.targetVersion) &&
        Objects.equals(this.currentVersion, analyzeBlastRadiusRequest.currentVersion) &&
        Objects.equals(this.environment, analyzeBlastRadiusRequest.environment) &&
        Objects.equals(this.changeType, analyzeBlastRadiusRequest.changeType) &&
        Objects.equals(this.changeSummary, analyzeBlastRadiusRequest.changeSummary) &&
        Objects.equals(this.affectedEndpoints, analyzeBlastRadiusRequest.affectedEndpoints) &&
        Objects.equals(this.changeWindowMinutes, analyzeBlastRadiusRequest.changeWindowMinutes) &&
        Objects.equals(this.proposedCanaryPercent, analyzeBlastRadiusRequest.proposedCanaryPercent) &&
        Objects.equals(this.requestedBy, analyzeBlastRadiusRequest.requestedBy) &&
        Objects.equals(this.pullRequestUrl, analyzeBlastRadiusRequest.pullRequestUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetService, targetVersion, currentVersion, environment, changeType, changeSummary, affectedEndpoints, changeWindowMinutes, proposedCanaryPercent, requestedBy, pullRequestUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyzeBlastRadiusRequest {\n");
    sb.append("    targetService: ").append(toIndentedString(targetService)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changeSummary: ").append(toIndentedString(changeSummary)).append("\n");
    sb.append("    affectedEndpoints: ").append(toIndentedString(affectedEndpoints)).append("\n");
    sb.append("    changeWindowMinutes: ").append(toIndentedString(changeWindowMinutes)).append("\n");
    sb.append("    proposedCanaryPercent: ").append(toIndentedString(proposedCanaryPercent)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    pullRequestUrl: ").append(toIndentedString(pullRequestUrl)).append("\n");
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

