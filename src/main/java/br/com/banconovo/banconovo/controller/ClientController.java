package br.com.banconovo.banconovo.controller;

import br.com.banconovo.banconovo.dto.ResponseClient;
import br.com.banconovo.banconovo.model.DefaultClient;
import br.com.banconovo.banconovo.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.UUID;

@RestController@RequestMapping("/clientes")
public class ClientController {

  @Autowired
  private ClientRepository clientRepository;

  @GetMapping
  public Iterable<ResponseClient> listClients(){
    return ResponseClient.toResponse(clientRepository.findAll());
  }

  @PostMapping@ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<ResponseClient> handlerCreateClient(@RequestBody DefaultClient defaultClient, UriComponentsBuilder uriComponentsBuilder){
    clientRepository.save(defaultClient);
    URI uri = uriComponentsBuilder.path("/cliente/{id}").buildAndExpand(defaultClient.getId()).toUri();
    return ResponseEntity.created(uri).body(new ResponseClient(defaultClient));
  }

  @GetMapping("/{id}")
  public ResponseEntity<ResponseClient> detailClient(@PathVariable UUID id) throws Exception {
    return ResponseEntity.ok(new ResponseClient(clientRepository.findClientById(id)));
  }
}
