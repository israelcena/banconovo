package br.com.banconovo.banconovo.model;

import lombok.Data;
import java.util.UUID;

@Data
public class DefaultClient {
  private UUID id;
  private String name;
  private String email;
  private String password;
}
