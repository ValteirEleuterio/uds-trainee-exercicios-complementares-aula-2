package com.company;

public class Macaco extends Animal{
    private Integer metrosPercorridos = 0;
    private Integer bananasComidas = 0;

    public Macaco(String nome){
        super(nome);
    }
    public void comerBananas(){
        bananasComidas++;
    }

    public Integer getMetrosPercorridos() {
        return metrosPercorridos;
    }

    public Integer getBananasComidas() {
        return bananasComidas;
    }

    @Override
    public void andar() {
        metrosPercorridos ++;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }
}
