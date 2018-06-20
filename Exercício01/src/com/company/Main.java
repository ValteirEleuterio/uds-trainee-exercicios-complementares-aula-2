package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer opcaoMenu = 0;
        Macaco gorila = new Macaco("Chita");
        Integer bananasComidas, metrosPercorridos;
        String nomeMacaco;
        while (opcaoMenu != 3){
            bananasComidas = gorila.getBananasComidas();
            metrosPercorridos = gorila.getMetrosPercorridos();
            nomeMacaco = gorila.getNome();

            Scanner sc = new Scanner(System.in);
            System.out.println(nomeMacaco + " comeu " + bananasComidas + " bananas e percorreu " + metrosPercorridos +
                               " metros " +
                               "Escolha uma opção:" +
                               "\n[1]Andar [2]Comer banana [3]Sair");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu){
                case 1: gorila.andar();break;
                case 2: gorila.comerBananas();break;
                case 3: System.out.println("Saindo...");break;
                default: System.out.println("Numero digitado não é valido!");
            }
        }
    }
}
