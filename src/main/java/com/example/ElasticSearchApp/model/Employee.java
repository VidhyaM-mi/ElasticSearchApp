package com.example.ElasticSearchApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "mycluster")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    @Id
    private String eid;
    private String ename;
    private String email;
    private String contact;

}
