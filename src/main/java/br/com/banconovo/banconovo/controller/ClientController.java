package br.com.banconovo.banconovo.controller;

import br.com.banconovo.banconovo.model.DefaultClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController@RequestMapping("/clientes")
public class ClientController {

  @GetMapping
  public String listClients(){
    return "All Clients here";
  }

  @PostMapping
  public DefaultClient includeClient(DefaultClient newClient) {
    return newClient;
  }
}
