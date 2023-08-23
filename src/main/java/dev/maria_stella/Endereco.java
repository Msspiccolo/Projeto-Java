package dev.maria_stella;

import java.util.Objects;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String numCasa;
    private String complemento;
    private String estado;
    private String cep;

    public Endereco(String rua, String bairro, String cidade, String numCasa, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numCasa = numCasa;
        this.estado = estado;
        this.cep = cep;
    }

    public Endereco(String rua, String bairro, String cidade, String numCasa, String complemento, String estado, String cep) {
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.numCasa = numCasa;
        this.complemento = complemento;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Objects.equals(rua, endereco.rua) && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(numCasa, endereco.numCasa) && Objects.equals(complemento, endereco.complemento) && Objects.equals(estado, endereco.estado) && Objects.equals(cep, endereco.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rua, bairro, cidade, numCasa, complemento, estado, cep);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "rua='" + rua + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", numCasa='" + numCasa + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", cep='" + cep + '\'' +
                '}';
    }
}
