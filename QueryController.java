package com.textosql.demo.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/text-to-sql")
public class QueryController {

    private SqlGenerator sqlGenerator;

    @PostMapping(value = "/query")
    ResponseEntity<String> query(@RequestBody QueryRequest queryRequest) {
        String sqlQuery = sqlGenerator.generate(queryRequest.question());
        return ResponseEntity.ok(sqlQuery);
    }

    record QueryRequest(String question) {
    }

}
