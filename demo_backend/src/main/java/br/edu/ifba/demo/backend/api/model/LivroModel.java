package br.edu.ifba.demo.backend.api.model;

import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "livro")

public class LivroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_livro")
    private long id_livro;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "editora")
    private String editora;

    @Column(name = "ano_publicacao")
    private Date ano_publicacao;

    @Column(name = "genero")
    private String genero;

    @Column(name = "isbn")
    private String isbn;

    @Column(name = "num_paginas")
    private String num_paginas;

    @Column(name = "sinopse")
    private String sinopse;

    @Column(name = "idioma")
    private String idioma;

    @Column(name = "data_cadastro")
    private LocalDateTime data_cadastro;

    @Column(name = "preco")
    private double preco;

}
