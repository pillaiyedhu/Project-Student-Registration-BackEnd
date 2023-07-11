package com.example.studentRegistration.repository;

import com.example.studentRegistration.entity.StudentEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends MongoRepository<StudentEntity,Integer> {
}
