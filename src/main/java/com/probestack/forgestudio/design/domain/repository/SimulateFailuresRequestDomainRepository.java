package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.SimulateFailuresRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for SimulateFailuresRequest domain operations.
 */
public interface SimulateFailuresRequestDomainRepository {
    SimulateFailuresRequest save(SimulateFailuresRequest simulateFailuresRequest);

    Optional<SimulateFailuresRequest> findById(String id);

    List<SimulateFailuresRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
