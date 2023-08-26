package dev.maria_stella;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estante {
    private static Estante estante;

    private List<Livro> livros;

    public static Estante getInstance() {
        if (estante == null){
            estante = new Estante();
        }
        return estante;
    }
    private Estante() {
        livros = new ArrayList<>();
    }

    private Estante(List<Livro> livros) {
        this.livros = livros;
    }

    public Livro escolheLivro(int posicao) {
        Livro livro = livros.get(posicao);
        removeLivro(livro);
        return livro;

    }

    public Livro escolheLivro(String nome) {
        for (int i = 0; i < livros.size(); i++) {
            Livro livro = livros.get(i);
            if (livro.getTitulo().equals(nome)) {
                removeLivro(livro);
                return livro;
            }
        }
        return null;
    }

    public void colocarLivro(Livro livro) {
        livros.add(livro);

    }


    private void removeLivro(Livro escolheLivro) {
        livros.remove(escolheLivro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Estante estante = (Estante) o;
        return Objects.equals(livros, estante.livros);
    }

    @Override
    public int hashCode() {
        return Objects.hash(livros);
    }

    @Override
    public String toString() {
        return "Estante{" +
                "livros=" + livros +
                '}';
    }
}
