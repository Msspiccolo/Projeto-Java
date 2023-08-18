package dev.maria_stella;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro nome:  ");
        Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto
        String nome = sc.nextLine();//Colocar a primeira palavra com letra minuscula e a segunda em diante com a primeira maiuscula
        System.out.println(nome);
        sc.close();









    }
}