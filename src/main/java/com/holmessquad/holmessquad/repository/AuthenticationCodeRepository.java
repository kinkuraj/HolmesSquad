/**
 * 
 */
package com.holmessquad.holmessquad.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.holmessquad.holmessquad.entity.AuthenticationCode;

/**
 * @author saravanakumar
 *
 */
@Repository
interface AuthenticationCodeRepository extends MongoRepository<AuthenticationCode, String> {

}
