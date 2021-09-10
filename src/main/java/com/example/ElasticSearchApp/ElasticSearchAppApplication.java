package com.example.ElasticSearchApp;

import com.example.ElasticSearchApp.model.Employee;
import com.example.ElasticSearchApp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@SpringBootApplication
@RestController
public class ElasticSearchAppApplication {

    @Autowired
    private EmployeeRepository repository;

    @PostMapping("/saveEmployee")
    public int saveEmployee(@RequestBody List<Employee> employees) {
        repository.saveAll(employees);
        return employees.size();
    }

    @GetMapping("/findAll")
    public Iterable<Employee> findAllEmployees() {
        return repository.findAll();
    }

    @GetMapping("/findByEname/{ename}")
    public List<Employee> findByEname(@PathVariable String ename) {
        return repository.findByEname(ename);
    }

    @GetMapping("/findByEid/{eid}")
    public List<Employee> findByEid(@PathVariable String eid) {
        return repository.findByEid(eid);
    }

    public static void main(String[] args) {
        SpringApplication.run(ElasticSearchAppApplication.class, args);
    }
}
