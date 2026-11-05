package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisDependencyGraph;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisImpact;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysisRecommendations;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * BlastRadiusAnalysis
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class BlastRadiusAnalysis {

  private UUID analysisId;

  private String targetService;

  private String targetVersion;

  private String currentVersion;

  /**
   * Gets or Sets environment
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
   * Gets or Sets changeType
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

  /**
   * Gets or Sets status
   */
  public enum StatusEnum {
    QUEUED("QUEUED"),
    
    TRACING_DEPENDENCIES("TRACING_DEPENDENCIES"),
    
    ANALYZING_TRAFFIC("ANALYZING_TRAFFIC"),
    
    CALCULATING_IMPACT("CALCULATING_IMPACT"),
    
    COMPLETED("COMPLETED"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private StatusEnum status;

  /**
   * Overall computed risk.
   */
  public enum RiskLevelEnum {
    MINIMAL("MINIMAL"),
    
    LOW("LOW"),
    
    MEDIUM("MEDIUM"),
    
    HIGH("HIGH"),
    
    CATASTROPHIC("CATASTROPHIC");

    private String value;

    RiskLevelEnum(String value) {
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
    public static RiskLevelEnum fromValue(String value) {
      for (RiskLevelEnum b : RiskLevelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }
  private RiskLevelEnum riskLevel;

  private BigDecimal riskScore;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime submittedAt;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime completedAt;

  private String requestedBy;

  private BlastRadiusAnalysisImpact impact;

  private BlastRadiusAnalysisDependencyGraph dependencyGraph;

  private BlastRadiusAnalysisRecommendations recommendations;

  private String aiSummary;

  private String auditReference;

  public BlastRadiusAnalysis() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public BlastRadiusAnalysis(UUID analysisId, String targetService, String targetVersion, EnvironmentEnum environment, StatusEnum status, RiskLevelEnum riskLevel, OffsetDateTime submittedAt, BlastRadiusAnalysisImpact impact, BlastRadiusAnalysisRecommendations recommendations) {
    this.analysisId = analysisId;
    this.targetService = targetService;
    this.targetVersion = targetVersion;
    this.environment = environment;
    this.status = status;
    this.riskLevel = riskLevel;
    this.submittedAt = submittedAt;
    this.impact = impact;
    this.recommendations = recommendations;
  }

  public BlastRadiusAnalysis analysisId(UUID analysisId) {
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

  public BlastRadiusAnalysis targetService(String targetService) {
    this.targetService = targetService;
    return this;
  }

  /**
   * Get targetService
   * @return targetService
  */
  @NotNull   @Schema(name = "targetService", example = "payment-processor", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetService")
  public String getTargetService() {
    return targetService;
  }

  public void setTargetService(String targetService) {
    this.targetService = targetService;
  }

  public BlastRadiusAnalysis targetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
    return this;
  }

  /**
   * Get targetVersion
   * @return targetVersion
  */
  @NotNull   @Schema(name = "targetVersion", example = "v2.5.0", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("targetVersion")
  public String getTargetVersion() {
    return targetVersion;
  }

  public void setTargetVersion(String targetVersion) {
    this.targetVersion = targetVersion;
  }

  public BlastRadiusAnalysis currentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
    return this;
  }

  /**
   * Get currentVersion
   * @return currentVersion
  */
    @Schema(name = "currentVersion", example = "v2.4.1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currentVersion")
  public String getCurrentVersion() {
    return currentVersion;
  }

  public void setCurrentVersion(String currentVersion) {
    this.currentVersion = currentVersion;
  }

  public BlastRadiusAnalysis environment(EnvironmentEnum environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Get environment
   * @return environment
  */
  @NotNull   @Schema(name = "environment", example = "PRODUCTION", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("environment")
  public EnvironmentEnum getEnvironment() {
    return environment;
  }

  public void setEnvironment(EnvironmentEnum environment) {
    this.environment = environment;
  }

  public BlastRadiusAnalysis changeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
    return this;
  }

  /**
   * Get changeType
   * @return changeType
  */
    @Schema(name = "changeType", example = "API_CONTRACT_CHANGE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeType")
  public ChangeTypeEnum getChangeType() {
    return changeType;
  }

  public void setChangeType(ChangeTypeEnum changeType) {
    this.changeType = changeType;
  }

  public BlastRadiusAnalysis changeSummary(String changeSummary) {
    this.changeSummary = changeSummary;
    return this;
  }

  /**
   * Get changeSummary
   * @return changeSummary
  */
    @Schema(name = "changeSummary", example = "Removing discount_code field from /charge request; adding discount_v2 field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("changeSummary")
  public String getChangeSummary() {
    return changeSummary;
  }

  public void setChangeSummary(String changeSummary) {
    this.changeSummary = changeSummary;
  }

  public BlastRadiusAnalysis status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @NotNull   @Schema(name = "status", example = "COMPLETED", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BlastRadiusAnalysis riskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
    return this;
  }

  /**
   * Overall computed risk.
   * @return riskLevel
  */
  @NotNull   @Schema(name = "riskLevel", example = "HIGH", description = "Overall computed risk.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("riskLevel")
  public RiskLevelEnum getRiskLevel() {
    return riskLevel;
  }

  public void setRiskLevel(RiskLevelEnum riskLevel) {
    this.riskLevel = riskLevel;
  }

  public BlastRadiusAnalysis riskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
    return this;
  }

  /**
   * Numeric risk score.
   * minimum: 0
   * maximum: 100
   * @return riskScore
  */
  @Valid @DecimalMin("0") @DecimalMax("100")   @Schema(name = "riskScore", example = "78", description = "Numeric risk score.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("riskScore")
  public BigDecimal getRiskScore() {
    return riskScore;
  }

  public void setRiskScore(BigDecimal riskScore) {
    this.riskScore = riskScore;
  }

  public BlastRadiusAnalysis submittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

  /**
   * Get submittedAt
   * @return submittedAt
  */
  @NotNull @Valid   @Schema(name = "submittedAt", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("submittedAt")
  public OffsetDateTime getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(OffsetDateTime submittedAt) {
    this.submittedAt = submittedAt;
  }

  public BlastRadiusAnalysis completedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
    return this;
  }

  /**
   * Get completedAt
   * @return completedAt
  */
  @Valid   @Schema(name = "completedAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("completedAt")
  public OffsetDateTime getCompletedAt() {
    return completedAt;
  }

  public void setCompletedAt(OffsetDateTime completedAt) {
    this.completedAt = completedAt;
  }

  public BlastRadiusAnalysis requestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
    return this;
  }

  /**
   * Get requestedBy
   * @return requestedBy
  */
    @Schema(name = "requestedBy", example = "amit.kumar@forgesphere.example.com", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("requestedBy")
  public String getRequestedBy() {
    return requestedBy;
  }

  public void setRequestedBy(String requestedBy) {
    this.requestedBy = requestedBy;
  }

  public BlastRadiusAnalysis impact(BlastRadiusAnalysisImpact impact) {
    this.impact = impact;
    return this;
  }

  /**
   * Get impact
   * @return impact
  */
  @NotNull @Valid   @Schema(name = "impact", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("impact")
  public BlastRadiusAnalysisImpact getImpact() {
    return impact;
  }

  public void setImpact(BlastRadiusAnalysisImpact impact) {
    this.impact = impact;
  }

  public BlastRadiusAnalysis dependencyGraph(BlastRadiusAnalysisDependencyGraph dependencyGraph) {
    this.dependencyGraph = dependencyGraph;
    return this;
  }

  /**
   * Get dependencyGraph
   * @return dependencyGraph
  */
  @Valid   @Schema(name = "dependencyGraph", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("dependencyGraph")
  public BlastRadiusAnalysisDependencyGraph getDependencyGraph() {
    return dependencyGraph;
  }

  public void setDependencyGraph(BlastRadiusAnalysisDependencyGraph dependencyGraph) {
    this.dependencyGraph = dependencyGraph;
  }

  public BlastRadiusAnalysis recommendations(BlastRadiusAnalysisRecommendations recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  /**
   * Get recommendations
   * @return recommendations
  */
  @NotNull @Valid   @Schema(name = "recommendations", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("recommendations")
  public BlastRadiusAnalysisRecommendations getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(BlastRadiusAnalysisRecommendations recommendations) {
    this.recommendations = recommendations;
  }

  public BlastRadiusAnalysis aiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
    return this;
  }

  /**
   * AI-generated plain-English summary.
   * @return aiSummary
  */
    @Schema(name = "aiSummary", example = "HIGH risk change. If this fails at 5% error rate during peak, 245K users and $125K/hour revenue are at risk. Enterprise tier (1200 users) has no fallback. Recommendation: 2% canary at 2 AM, auto-rollback at 1% error rate, requires VP+ approval.", description = "AI-generated plain-English summary.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("aiSummary")
  public String getAiSummary() {
    return aiSummary;
  }

  public void setAiSummary(String aiSummary) {
    this.aiSummary = aiSummary;
  }

  public BlastRadiusAnalysis auditReference(String auditReference) {
    this.auditReference = auditReference;
    return this;
  }

  /**
   * Get auditReference
   * @return auditReference
  */
    @Schema(name = "auditReference", example = "audit://blast-radius/analysis-9c8f1a3b", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    BlastRadiusAnalysis blastRadiusAnalysis = (BlastRadiusAnalysis) o;
    return Objects.equals(this.analysisId, blastRadiusAnalysis.analysisId) &&
        Objects.equals(this.targetService, blastRadiusAnalysis.targetService) &&
        Objects.equals(this.targetVersion, blastRadiusAnalysis.targetVersion) &&
        Objects.equals(this.currentVersion, blastRadiusAnalysis.currentVersion) &&
        Objects.equals(this.environment, blastRadiusAnalysis.environment) &&
        Objects.equals(this.changeType, blastRadiusAnalysis.changeType) &&
        Objects.equals(this.changeSummary, blastRadiusAnalysis.changeSummary) &&
        Objects.equals(this.status, blastRadiusAnalysis.status) &&
        Objects.equals(this.riskLevel, blastRadiusAnalysis.riskLevel) &&
        Objects.equals(this.riskScore, blastRadiusAnalysis.riskScore) &&
        Objects.equals(this.submittedAt, blastRadiusAnalysis.submittedAt) &&
        Objects.equals(this.completedAt, blastRadiusAnalysis.completedAt) &&
        Objects.equals(this.requestedBy, blastRadiusAnalysis.requestedBy) &&
        Objects.equals(this.impact, blastRadiusAnalysis.impact) &&
        Objects.equals(this.dependencyGraph, blastRadiusAnalysis.dependencyGraph) &&
        Objects.equals(this.recommendations, blastRadiusAnalysis.recommendations) &&
        Objects.equals(this.aiSummary, blastRadiusAnalysis.aiSummary) &&
        Objects.equals(this.auditReference, blastRadiusAnalysis.auditReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisId, targetService, targetVersion, currentVersion, environment, changeType, changeSummary, status, riskLevel, riskScore, submittedAt, completedAt, requestedBy, impact, dependencyGraph, recommendations, aiSummary, auditReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlastRadiusAnalysis {\n");
    sb.append("    analysisId: ").append(toIndentedString(analysisId)).append("\n");
    sb.append("    targetService: ").append(toIndentedString(targetService)).append("\n");
    sb.append("    targetVersion: ").append(toIndentedString(targetVersion)).append("\n");
    sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
    sb.append("    changeSummary: ").append(toIndentedString(changeSummary)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    riskLevel: ").append(toIndentedString(riskLevel)).append("\n");
    sb.append("    riskScore: ").append(toIndentedString(riskScore)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
    sb.append("    requestedBy: ").append(toIndentedString(requestedBy)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    dependencyGraph: ").append(toIndentedString(dependencyGraph)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    aiSummary: ").append(toIndentedString(aiSummary)).append("\n");
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

