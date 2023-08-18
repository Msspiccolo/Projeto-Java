package dev.maria_stella;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro nome:  ");
        Scanner Nome = new Scanner(System.in);
        String nome = Nome.nextLine();
        System.out.println(nome);
        Nome.close();

    }
}