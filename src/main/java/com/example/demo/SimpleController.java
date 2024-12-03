package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/simple")
    public ResponseEntity<String> simpleEndpoint() {
        return ResponseEntity.ok("OK");
    }
}