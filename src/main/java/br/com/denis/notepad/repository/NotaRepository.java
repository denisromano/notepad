package br.com.denis.notepad.repository;

import br.com.denis.notepad.model.Nota;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotaRepository extends MongoRepository<Nota, String> {

    Nota findByTitulo(String titulo);
}
