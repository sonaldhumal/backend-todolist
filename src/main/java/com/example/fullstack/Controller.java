package com.example.fullstack;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/welcome/{name}")
    public ResponseEntity<String> hello(@PathVariable String name){
        return ResponseEntity.ok("Welcome To My Full STack APP.!! Dear "+name);
    }
}
