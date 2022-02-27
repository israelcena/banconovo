package br.com.banconovo.banconovo.dto;

import br.com.banconovo.banconovo.model.DefaultClient;
import lombok.Data;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Data
public class ResponseClient {
  private UUID id;
  private String name;
  private String email;

  public ResponseClient(DefaultClient defaultClient){
    this.id = defaultClient.getId();
    this.name = defaultClient.getName();
    this.email = defaultClient.getEmail();
  }

  public static List<ResponseClient> toResponse(Iterable<DefaultClient> defaultClients){
//    defaultClients.stream().map(ResponseClient::new).collect(Collectors.toList());
    return StreamSupport.stream(defaultClients.spliterator(), false).map(ResponseClient::new).collect(Collectors.toList());
  }
}
