package br.com.jptech.domain;

public class Pet {
    private Long id;

    private String nome;

    private String tipo;

    private String raca;

    private int idade;

    private String cor;

    private float peso;

    public Pet(String nome, String tipo, String raca, int idade, String cor, float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Pet(){}

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public float getPeso() {
        return peso;
    }
}

