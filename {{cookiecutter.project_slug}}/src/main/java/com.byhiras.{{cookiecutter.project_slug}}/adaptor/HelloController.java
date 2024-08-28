package com.byhiras.{{cookiecutter.project_slug}}.adaptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/hello", consumes = "application/json")
@Slf4j
public class HelloController {

  @GetMapping
  public ResponseEntity<?> sayHello() {
    return ResponseEntity.ok("Hello World!");
  }
}
