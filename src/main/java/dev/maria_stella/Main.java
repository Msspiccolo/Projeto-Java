package dev.maria_stella;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o primeiro nome:  ");
        Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto
        String nome = sc.nextLine();//Colocar a primeira palavra com letra minuscula e a segunda em diante com a primeira maiuscula

        System.out.println("Digite o seu CPF:  ");
        String cpf = sc.nextLine();

        System.out.println("Digite a sua data de Nascimento:  ");
        String dataNascimento = sc.nextLine();

        Pessoa pessoa  = new Pessoa(nome,dataNascimento,cpf);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getCpf());
        System.out.println(pessoa.getDataNascimento());

        sc.close();








    }
}