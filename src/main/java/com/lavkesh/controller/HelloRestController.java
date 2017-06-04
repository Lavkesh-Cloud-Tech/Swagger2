package com.lavkesh.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hello")
public class HelloRestController {

  @GetMapping(value = "/{name}", produces = "application/json")
  public ResponseEntity<?> getHelloMessage(@PathVariable String name) {
    String result = "Hello " + name;
    Map<String, String> response = new HashMap<>();
    response.put("message", result);
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
