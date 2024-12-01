package br.edu.ifba.demo.backend.api.dto;

import java.sql.Date;
import java.time.LocalDateTime;

import br.edu.ifba.demo.backend.api.model.LivroModel;

public class LivroDTO {

    private long id_livro;
    private String titulo;
    private String autor;
    private String editora;
    private Date ano_publicacao;
    private String genero;
    private String isbn;
    private String num_paginas;
    private String sinopse;
    private String idioma;
    private LocalDateTime data_cadastro;
    private double preco;

    public static LivroDTO converter(LivroModel livroModel){
        var livro = new LivroDTO();
        livro.set

    }

}
