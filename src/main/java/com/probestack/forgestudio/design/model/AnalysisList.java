package com.probestack.forgestudio.design.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.probestack.forgestudio.design.model.AnalysisListSummary;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysis;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AnalysisList
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")public class AnalysisList {

  @Valid
  private List<@Valid BlastRadiusAnalysis> content = new ArrayList<>();

  private Integer totalElements;

  private Integer totalPages;

  private Integer page;

  private Integer size;

  private AnalysisListSummary summary;

  public AnalysisList() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AnalysisList(List<@Valid BlastRadiusAnalysis> content, Integer totalElements, Integer totalPages) {
    this.content = content;
    this.totalElements = totalElements;
    this.totalPages = totalPages;
  }

  public AnalysisList content(List<@Valid BlastRadiusAnalysis> content) {
    this.content = content;
    return this;
  }

  public AnalysisList addContentItem(BlastRadiusAnalysis contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   * @return content
  */
  @NotNull @Valid   @Schema(name = "content", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("content")
  public List<@Valid BlastRadiusAnalysis> getContent() {
    return content;
  }

  public void setContent(List<@Valid BlastRadiusAnalysis> content) {
    this.content = content;
  }

  public AnalysisList totalElements(Integer totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   * @return totalElements
  */
  @NotNull   @Schema(name = "totalElements", example = "247", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalElements")
  public Integer getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Integer totalElements) {
    this.totalElements = totalElements;
  }

  public AnalysisList totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
  */
  @NotNull   @Schema(name = "totalPages", example = "13", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("totalPages")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  public AnalysisList page(Integer page) {
    this.page = page;
    return this;
  }

  /**
   * Get page
   * @return page
  */
    @Schema(name = "page", example = "0", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("page")
  public Integer getPage() {
    return page;
  }

  public void setPage(Integer page) {
    this.page = page;
  }

  public AnalysisList size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
    @Schema(name = "size", example = "20", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public AnalysisList summary(AnalysisListSummary summary) {
    this.summary = summary;
    return this;
  }

  /**
   * Get summary
   * @return summary
  */
  @Valid   @Schema(name = "summary", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary")
  public AnalysisListSummary getSummary() {
    return summary;
  }

  public void setSummary(AnalysisListSummary summary) {
    this.summary = summary;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisList analysisList = (AnalysisList) o;
    return Objects.equals(this.content, analysisList.content) &&
        Objects.equals(this.totalElements, analysisList.totalElements) &&
        Objects.equals(this.totalPages, analysisList.totalPages) &&
        Objects.equals(this.page, analysisList.page) &&
        Objects.equals(this.size, analysisList.size) &&
        Objects.equals(this.summary, analysisList.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, totalElements, totalPages, page, size, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisList {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

