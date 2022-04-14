package br.com.banconovo.banconovo.controller;

import br.com.banconovo.banconovo.dto.ResponseClient;
import br.com.banconovo.banconovo.model.DefaultClient;
import br.com.banconovo.banconovo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClientController {

  private final ClientService clientService;

  @GetMapping
  public ResponseEntity<List<ResponseClient>> listAllClients(){
    Iterable<DefaultClient> clients = clientService.findAll();
    return ResponseEntity.ok(ResponseClient.toResponse(clients));
  }

  @PostMapping@ResponseStatus(HttpStatus.CREATED)
  public ResponseEntity<ResponseClient> handlerCreateClient(@RequestBody DefaultClient defaultClient, UriComponentsBuilder uriComponentsBuilder){
    clientService.saveOne(defaultClient);
    URI uri = uriComponentsBuilder.path("/clientes/{id}").buildAndExpand(defaultClient.getId()).toUri();
    return ResponseEntity.created(uri).body(new ResponseClient(defaultClient));
  }

  @GetMapping("/{id}")
  public ResponseEntity<ResponseClient> detailClient(@PathVariable Long id) {
    return ResponseEntity.ok(new ResponseClient(clientService.findClientById(id)));
  }

  @DeleteMapping("/{id}")@ResponseStatus(HttpStatus.OK)
  public ResponseEntity deleteThisClient (@PathVariable Long id) {
    clientService.deleteClient(id);
    return ResponseEntity.ok().build();
  }
}
