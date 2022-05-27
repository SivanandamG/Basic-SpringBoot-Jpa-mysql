package com.app.siva.service;


import com.app.siva.model.Emp;
import com.app.siva.repository.EmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmpRepo repo;

    public Emp saveEmp(Emp emp){
        return repo.save(emp);
    }

    public List<Emp> getEmpAll(){
        return repo.findAll();
    }
    public List<Emp> saveEmp(List <Emp> empList){
        return repo.saveAll(empList);
    }


    public Emp getEmp(long id){
        return repo.findById(id).orElse(null );
    }
//    public Emp getbyName(String name){
//        return repo.findByName(name);
//    }

    public String delbyId(long id){
         repo.deleteById(id);
        return "ID with " + id + "is removed";
    }

    public  Emp updateEmp(Emp emp){
        Emp upEmp = repo.findById(emp.getEmpId()).orElse(null);
        upEmp.setEmpName(emp.getEmpName());
        upEmp.setEmpRole(emp.getEmpRole());
        return repo.save(upEmp);
    }
}
