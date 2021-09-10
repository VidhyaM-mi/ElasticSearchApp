package com.example.ElasticSearchApp.repository;

import com.example.ElasticSearchApp.model.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("customer")
@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    List<Employee> findByEname(String ename);
    List<Employee> findByEid(String eid);

}
