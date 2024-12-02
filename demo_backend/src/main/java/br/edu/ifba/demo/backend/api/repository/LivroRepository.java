package br.edu.ifba.demo.backend.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.ifba.demo.backend.api.model.LivroModel;

import java.util.Optional;
import java.util.List;


@Repository
public interface LivroRepository extends JpaRepository<LivroModel, Long> {

    // Método para buscar um livro pelo título
    Optional<LivroModel> findByTitulo(String titulo);
    Optional<LivroModel> findByIsbn(String isbn);
}