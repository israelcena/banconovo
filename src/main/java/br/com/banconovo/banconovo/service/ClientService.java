package br.com.banconovo.banconovo.service;

import br.com.banconovo.banconovo.model.DefaultClient;
import br.com.banconovo.banconovo.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientService {

  private final ClientRepository clientRepository;

  public Iterable<DefaultClient> findAll() {
    return clientRepository.findAll();
  }

  public void saveOne(DefaultClient defaultClient) {
    clientRepository.save(defaultClient);
  }

  public DefaultClient findClientById(Long id) {
    return clientRepository.findById(id).orElseThrow(() -> new IllegalStateException("Client not Found"));
  }

  public void deleteClient(Long id) {
    clientRepository.deleteById(id);
  }
}
