package com.fingeso.test.Repository;

import com.fingeso.test.Model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, Long >{

    public User findUsuarioById(String id);
}