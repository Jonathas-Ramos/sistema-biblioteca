package br.com.biblioteca.repository;

import br.com.biblioteca.model.Emprestimo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprestimoRepository extends MongoRepository<Emprestimo, String> {
}