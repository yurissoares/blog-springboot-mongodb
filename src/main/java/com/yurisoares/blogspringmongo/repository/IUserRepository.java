package com.yurisoares.blogspringmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.yurisoares.blogspringmongo.domain.User;

@Repository
public interface IUserRepository extends MongoRepository<User, String> {

}
