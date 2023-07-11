package com.example.studentRegistration.controller;

import com.example.studentRegistration.entity.StudentEntity;
import com.example.studentRegistration.repository.StudentRepository;
import com.example.studentRegistration.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/show")
    public List<StudentEntity> getAll(){
        return studentService.listall();
    }

    @PostMapping(path = "/save")
    public StudentEntity postData(@RequestBody StudentEntity student){

        studentService.saveUpdate(student);
        return student;
    }

    @PutMapping(path = "/update")
    public StudentEntity updateEntity(@RequestBody StudentEntity student){
        studentService.saveUpdate(student);
        return student;
    }


    @DeleteMapping(path="/delete/{id}")
    public void deleteEntity(@PathVariable(name ="id") int id){
        studentService.deleteEntity(id);
    }

    @RequestMapping(path = "/search/{id}")
    public StudentEntity searchEntity(@PathVariable(name = "id") int id){

       return studentService.searchStudent(id).get();
    }


}
