package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.Credential;

@Repository
interface CredentialRepository extends MongoRepository<Credential, String> {

}
