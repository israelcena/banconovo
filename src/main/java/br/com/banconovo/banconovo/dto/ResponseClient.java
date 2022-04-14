package br.com.banconovo.banconovo.dto;

import br.com.banconovo.banconovo.model.DefaultClient;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Getter
@Setter
public class ResponseClient {
//  private Long id;
  private String name;
  private String email;

  public ResponseClient(DefaultClient defaultClient){
//    this.id = defaultClient.getId();
    this.name = defaultClient.getName();
    this.email = defaultClient.getEmail();
  }

  public static List<ResponseClient> toResponse(Iterable<DefaultClient> defaultClients){
    return StreamSupport.stream(defaultClients.spliterator(), false).map(ResponseClient::new).collect(Collectors.toList());
  }
}
