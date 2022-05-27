package com.app.siva.controller;


import com.app.siva.model.Emp;
import com.app.siva.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Snapdeal")
public class Controller {

    @Autowired
    private EmpService service;

    @GetMapping("/get/all/Employers")
    public ResponseEntity<List<Emp>> getAllEmp(){
        try{
            return new ResponseEntity<>(service.getEmpAll(),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PostMapping("/post/Employer")
    public ResponseEntity<Emp> setEmp (@RequestBody Emp emp){
        try{
            return new ResponseEntity<>(service.saveEmp(emp),HttpStatus.CREATED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @DeleteMapping("/delete/Employer/{id}")
    public ResponseEntity<String> delEmp (@PathVariable long id){
        try{
            return new ResponseEntity<>(service.delbyId(id),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("/get/Employer/{id}")
    public ResponseEntity<Emp> getEmp (@PathVariable long id){
        try{
            return new ResponseEntity<Emp>( service.getEmp(id),HttpStatus.OK);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @PutMapping("/put/Employer")
    public ResponseEntity<Emp> putEmp (@RequestBody Emp emp){
        try{
            return  new ResponseEntity<>(service.saveEmp(emp), HttpStatus.CREATED);//service.updateEmp(emp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @PatchMapping("/patch/Employer")
    public ResponseEntity<Emp> patchEmp (@RequestBody Emp emp){
        try{
            return new ResponseEntity<>(service.updateEmp(emp),HttpStatus.ACCEPTED);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}