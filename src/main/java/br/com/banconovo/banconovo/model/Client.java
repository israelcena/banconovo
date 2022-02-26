package br.com.banconovo.banconovo.model;

import lombok.Data;
import java.util.UUID;

@Data
public class Client {
  private UUID id;
  private String name;
}
