package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private Strig nome;
    private string cor;
    private integer idade;

    public Gato() {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public Strig getNome() {
        return nome;
    }

    public void setNome(Strig nome) {
        this.nome = nome;
    }

    public string getCor() {
        return cor;
    }

    public void setCor(string cor) {
        this.cor = cor;
    }

    public integer getIdade() {
        return idade;
    }

    public void setIdade(integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome=" + nome +
                ", cor=" + cor +
                ", idade=" + idade +
                '}';
    }
}
