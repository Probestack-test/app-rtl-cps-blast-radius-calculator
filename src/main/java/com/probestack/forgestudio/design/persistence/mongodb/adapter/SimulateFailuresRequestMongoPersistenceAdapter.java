package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.SimulateFailuresRequestDomainRepository;
import com.probestack.forgestudio.design.model.SimulateFailuresRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.SimulateFailuresRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.SimulateFailuresRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class SimulateFailuresRequestMongoPersistenceAdapter implements SimulateFailuresRequestDomainRepository {
    private final SimulateFailuresRequestMongoRepository repository;

    public SimulateFailuresRequestMongoPersistenceAdapter(
            SimulateFailuresRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public SimulateFailuresRequest save(SimulateFailuresRequest simulateFailuresRequest) {
        SimulateFailuresRequestDocument document = toDocument(simulateFailuresRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<SimulateFailuresRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<SimulateFailuresRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private SimulateFailuresRequestDocument toDocument(
            SimulateFailuresRequest simulateFailuresRequest) {
        SimulateFailuresRequestDocument document = new SimulateFailuresRequestDocument();
        BeanUtils.copyProperties(simulateFailuresRequest, document);
        return document;
    }

    private SimulateFailuresRequest toDomain(SimulateFailuresRequestDocument document) {
        SimulateFailuresRequest domain = new SimulateFailuresRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
