package dev.maria_stella;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto
        System.out.println("Quantas pessoas você deseja cadastrar? ");
        int qnt = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < qnt; i++) {
            System.out.println("Digite o primeiro nome:  ");
            String nome = sc.nextLine();//Colocar a primeira palavra com letra minuscula e a segunda em diante com a primeira maiuscula

            System.out.println("Digite o seu CPF:  ");
            String cpf = sc.nextLine();

            System.out.println("Digite a sua data de Nascimento:  ");
            LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

            Pessoa pessoa = new Pessoa(nome, dataNascimento, cpf);
            pessoas.add(pessoa);

        }
        sc.close();
        for (int i = 0; i < qnt; i++) {
            Pessoa pessoa = pessoas.get(i);
            System.out.println(pessoa.getNome());
            System.out.println(pessoa.getCpf());
            System.out.println(pessoa.getDataNascimento());
            System.out.println(pessoa.getIdade());
        }








    }
}