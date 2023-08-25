package dev.maria_stella;

import java.util.Objects;

public class Livro {
    private String titulo;
    private String autor;
    private String genero;
    private String editora;
    private String isbn;

    public Livro(String titulo, String autor, String genero, String editora, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.editora = editora;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo) && Objects.equals(autor, livro.autor) && Objects.equals(genero, livro.genero) && Objects.equals(editora, livro.editora) && Objects.equals(isbn, livro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, genero, editora, isbn);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", genero='" + genero + '\'' +
                ", editora='" + editora + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }

}
