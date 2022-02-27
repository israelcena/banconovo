package br.com.banconovo.banconovo.controller;

import br.com.banconovo.banconovo.dto.ResponseClient;
import br.com.banconovo.banconovo.model.DefaultClient;
import br.com.banconovo.banconovo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController@RequestMapping("/clientes")
public class ClientController {

  @Autowired
  private ClientRepository clientRepository;

  @GetMapping
  public Iterable<ResponseClient> listClients(){
    return ResponseClient.toResponse(clientRepository.findAll());
  }

  @PostMapping@ResponseStatus(HttpStatus.CREATED)
  public DefaultClient includeClient(@RequestBody DefaultClient newClient) {
     return clientRepository.save(newClient);
  }
}
