package com.example.HealFitNest.Repository;

import com.example.HealFitNest.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<Users,String> {
}
