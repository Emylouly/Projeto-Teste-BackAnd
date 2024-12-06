package br.edu.ifba.demo.backend.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifba.demo.backend.api.model.LivroModel;
import br.edu.ifba.demo.backend.api.repository.LivroRepository;

@RestController
@RequestMapping("/livro")
public class LivroController {
	
	private LivroRepository livroRepository;
	
	public LivroController(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

    //teste de rota
    @GetMapping
    public String teste(){

        return "Testando Rota Livros";

    }

    // Método que retornar todos os livros do banco de dados
    @GetMapping("/listall")
    public List <LivroModel> listall(){

        var livro = livroRepository.findAll();
        return livro;
        
    }

    // Método que retornar o usuario associado ao ID passado como parametro
    @GetMapping("/buscarporid/{id}")
    public LivroModel findById(@PathVariable ("id") Long id){
        Optional<LivroModel> livro = livroRepository.findById(id);
        if(livro.isPresent())
            return livro.get();
        
        return null;

    }

    // Método que retornar o usuario associado ao titulo passado como parametro
	@GetMapping("/buscarportitulo/{titulo}")
    public LivroModel findByTitulo(@PathVariable("titulo") String titulo) {
        Optional<LivroModel> livro = livroRepository.findByTitulo(titulo);
        if (livro.isPresent())
            return livro.get();
        
        return null;
    }

    // Método que retornar o usuario associado ao isbn passado como parametro
	@GetMapping("/buscarporisbn/{isbn}")
    public LivroModel findByIsbn(@PathVariable("isbn") String isbn) {
        Optional<LivroModel> livro = livroRepository.findByIsbn(isbn);
        if (livro.isPresent())
            return livro.get();
        
        return null;
    }

    // Método para deletar pelo ID
    @DeleteMapping("/deletelivro/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") Long id) {
        if (livroRepository.existsById(id)) {
            livroRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // Retorna 204 No Content
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); // Retorna 404 Not Found
        }
    }


    //Metodo para adicionar um novo livro
    @PostMapping
	  public ResponseEntity<LivroModel> addLivro(@RequestBody LivroModel livro) {
		  LivroModel savedLivro = livroRepository.save(livro);
		  return new ResponseEntity<>(savedLivro, HttpStatus.CREATED);
	  }

}