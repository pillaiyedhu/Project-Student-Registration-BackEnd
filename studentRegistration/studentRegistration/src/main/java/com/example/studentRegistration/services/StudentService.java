package com.example.studentRegistration.services;

import com.example.studentRegistration.entity.StudentEntity;
import com.example.studentRegistration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class StudentService {


    @Autowired
    private StudentRepository repo;

    public StudentEntity saveUpdate(StudentEntity studentEntity){
        repo.save(studentEntity);
        return studentEntity;
    }

    public List<StudentEntity> listall(){
        return repo.findAll();
    }

    public String deleteEntity(int id){
        repo.deleteById(id);
        return "Record Deleted Successfully";
    }

    public Optional<StudentEntity> searchStudent(int id){
        return repo.findById(id);
    }




}
