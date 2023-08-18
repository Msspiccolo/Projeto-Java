package dev.maria_stella;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto
        for (int i = 0; i < 10 ; i++) {
            System.out.println("Digite o primeiro nome:  ");
            String nome = sc.nextLine();//Colocar a primeira palavra com letra minuscula e a segunda em diante com a primeira maiuscula

            System.out.println("Digite o seu CPF:  ");
            String cpf = sc.nextLine();

            System.out.println("Digite a sua data de Nascimento:  ");
            String dataNascimento = sc.nextLine();

            Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
            pessoas.add(pessoa);
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getCpf());
            System.out.println(pessoa.getDataNascimento());
        }
        sc.close();



    }
}