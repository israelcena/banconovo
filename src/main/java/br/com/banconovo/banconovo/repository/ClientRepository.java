package br.com.banconovo.banconovo.repository;

import br.com.banconovo.banconovo.model.DefaultClient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ClientRepository extends CrudRepository<DefaultClient, Long> {
}
