package br.com.banconovo.banconovo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/healthcheck")@RestController
public class healthCheck {
  @GetMapping
  public String check(){
    return "Server is Alive";
  }
  @PostMapping
  public String postCheck(){
    return "Post is ok";
  }
}
