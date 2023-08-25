package dev.maria_stella;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Metodo estatico permite executa-lo sem instanciar a classe
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto
        int opcao = menu();

        List<Pessoa> pessoas = new ArrayList<>();
        while (opcao != 5) {
            switch (opcao) {
                case 1 -> {
                    System.out.println("Quantas pessoas você deseja cadastrar? ");
                    int qnt = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < qnt; i++) {
                        pessoas.add(cadastrarPessoa());
                    }
                    opcao = menu();
                }
                case 2 -> {
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa);
                    }
                    opcao = menu();
                }
            }
        }


        sc.close();







    }

    public static Pessoa cadastrarPessoa(){
        Scanner sc = new Scanner(System.in);
        Endereco endereco = cadastrarEndereco();
        System.out.println("Digite o primeiro nome:  ");
        String nome = sc.nextLine();//Colocar a primeira palavra com letra minuscula e a segunda em diante com a primeira maiuscula

        System.out.println("Digite o seu CPF:  ");
        String cpf = sc.nextLine();

        System.out.println("Digite a sua data de Nascimento:  ");
        LocalDate dataNascimento = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.println("Digite o seu E-mail:  ");
        String email = sc.nextLine();

        System.out.println("Digite o seu Telefone:  ");
        String telefone = sc.nextLine();

        sc.close();

        return new Pessoa (nome, dataNascimento, cpf,email,telefone,endereco);
    }

    public static Endereco cadastrarEndereco(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da sua rua:  ");
        String rua = sc.nextLine();
        System.out.println("Digite o nome do seu bairro:  ");
        String bairro = sc.nextLine();
        System.out.println("Digite a sua cidade:  ");
        String cidade = sc.nextLine();
        System.out.println("Digite o seu estado:  ");
        String estado = sc.nextLine();
        System.out.println("Digite o seu CEP:  ");
        String cep = sc.nextLine();
        System.out.println("Digite o número da sua casa:  ");
        String numCasa = sc.nextLine();
        System.out.println("Digite o complemento:  ");
        String complemento = sc.nextLine();
        sc.close();
        return new Endereco(rua,bairro,cidade,numCasa,complemento,estado,cep);
    }


    public static int menu(){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        System.out.println("Digite 1 para Cadastrar pessoa:   ");
        System.out.println("Digite 2 para Alterar pessoa:   ");
        System.out.println("Digite 3 para Excluir pessoa:   ");
        System.out.println("Digite 4 para Ler pessoa:   ");
        System.out.println("Digite 5 para Sair:    ");
        opcao = sc.nextInt();
        sc.close();
        return opcao;

    }










}

