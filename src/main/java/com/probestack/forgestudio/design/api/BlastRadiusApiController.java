package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AnalysisList;
import com.probestack.forgestudio.design.model.AnalyzeBlastRadiusRequest;
import com.probestack.forgestudio.design.model.BlastRadiusAnalysis;
import com.probestack.forgestudio.design.model.FailureSimulation;
import java.time.OffsetDateTime;
import com.probestack.forgestudio.design.model.SimulateFailuresRequest;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.BlastRadiusService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-05T04:20:45.971217974Z[GMT]")
@Controller
@RequestMapping("${openapi.blastRadiusCalculator.base-path:/v1}")
public class BlastRadiusApiController implements BlastRadiusApi {

    private static final Logger log = LoggerFactory.getLogger(BlastRadiusApiController.class);

    private final BlastRadiusService blastRadiusService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public BlastRadiusApiController(BlastRadiusService blastRadiusService, GeneratedRequestValidator generatedRequestValidator) {
        this.blastRadiusService = blastRadiusService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<BlastRadiusAnalysis> analyzeBlastRadius(@RequestBody() AnalyzeBlastRadiusRequest analyzeBlastRadiusRequest) {
        log.info("Processing analyzeBlastRadius request");
        try {
            generatedRequestValidator.validate("analyzeBlastRadius", analyzeBlastRadiusRequest);
            var response = blastRadiusService.analyzeBlastRadius(analyzeBlastRadiusRequest);
            log.info("analyzeBlastRadius completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process analyzeBlastRadius: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<BlastRadiusAnalysis> getBlastRadiusAnalysis(@PathVariable() UUID analysisId, @RequestParam(value = "includeDependencyGraph", required = false, defaultValue = "true") Boolean includeDependencyGraph, @RequestParam(value = "includeRevenueBreakdown", required = false, defaultValue = "true") Boolean includeRevenueBreakdown) {
        log.info("Processing getBlastRadiusAnalysis request");
        try {
            var response = blastRadiusService.getBlastRadiusAnalysis(analysisId, includeDependencyGraph, includeRevenueBreakdown);
            log.info("getBlastRadiusAnalysis completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getBlastRadiusAnalysis: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<AnalysisList> listBlastRadiusAnalyses(@RequestParam(value = "targetService", required = false) String targetService, @RequestParam(value = "environment", required = false) String environment, @RequestParam(value = "riskLevel", required = false) String riskLevel, @RequestParam(value = "changeType", required = false) String changeType, @RequestParam(value = "requiresApproval", required = false) Boolean requiresApproval, @RequestParam(value = "fromDate", required = false) OffsetDateTime fromDate, @RequestParam(value = "toDate", required = false) OffsetDateTime toDate, @RequestParam(value = "page", required = false, defaultValue = "0") Integer page, @RequestParam(value = "size", required = false, defaultValue = "20") Integer size) {
        log.info("Processing listBlastRadiusAnalyses request");
        try {
            var response = blastRadiusService.listBlastRadiusAnalyses(targetService, environment, riskLevel, changeType, requiresApproval, fromDate, toDate, page, size);
            log.info("listBlastRadiusAnalyses completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listBlastRadiusAnalyses: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<FailureSimulation> simulateFailures(@PathVariable() UUID analysisId, @RequestBody() SimulateFailuresRequest simulateFailuresRequest) {
        log.info("Processing simulateFailures request");
        try {
            generatedRequestValidator.validate("simulateFailures", simulateFailuresRequest);
            var response = blastRadiusService.simulateFailures(analysisId, simulateFailuresRequest);
            log.info("simulateFailures completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process simulateFailures: {}", e.getMessage(), e);
            throw e;
        }
    }
}
