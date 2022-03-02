package br.com.banconovo.banconovo.repository;

import br.com.banconovo.banconovo.model.DefaultClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;
@Repository
public interface ClientRepository extends CrudRepository<DefaultClient, UUID> {
  List<DefaultClient> findByName(String name);
  DefaultClient findClientById(UUID id);

  @Override
  void deleteById(UUID uuid);
}
