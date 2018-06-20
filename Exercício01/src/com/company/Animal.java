package com.company;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void andar();

    public String getNome() {
        return nome;
    }
}
