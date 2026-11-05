package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.SimulateFailuresRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for SimulateFailuresRequest documents.
 */
public interface SimulateFailuresRequestMongoRepository extends MongoRepository<SimulateFailuresRequestDocument, String> {
}
