package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.CredentialDAO;

@Repository
public interface CredentialRepository extends MongoRepository<CredentialDAO, String> {

}
