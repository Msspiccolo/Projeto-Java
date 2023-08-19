package dev.maria_stella;

import java.time.LocalDate;
import java.util.Objects;

public class Pessoa
{
    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    //Sempre criar um construtor nas classes
    public Pessoa(String nome, LocalDate dataNascimento, String cpf) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;

    }
    public int getIdade(){
        if(dataNascimento.getMonthValue() < LocalDate.now().getMonthValue()){

            return (LocalDate.now().getYear() - dataNascimento.getYear());
        }
           return (LocalDate.now().getYear() - dataNascimento.getYear())-1;

    }

    //Colocar Get and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    //Equals and Hash Codes
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(nome, pessoa.nome) && Objects.equals(dataNascimento, pessoa.dataNascimento) && Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, dataNascimento, cpf);
    }

}
