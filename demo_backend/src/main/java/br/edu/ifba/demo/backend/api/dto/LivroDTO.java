package br.edu.ifba.demo.backend.api.dto;

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

    public static LivroDTO converter(LivroModel livroModel) {
        var livro = new UsuarioDTO();
        livro.setId_usuario(livroModel.getId_usuario());
        livro.setLogin(livroModel.getLogin());
        livro.setSenha(livroModel.getSenha());
        livro.setCreate_at(livroModel.getCreateAt());
        livro.setLast_login(livroModel.getLastLogin());
        return livro;
    }

}
