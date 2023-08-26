package dev.maria_stella;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Metodo estatico permite executa-lo sem instanciar a classe

    /**
     *
     * Como o scanner está sendo utilizado ao longo dos métodos, transformei ele em um atributo da classe Main
     * Assim o scanner só é instanciado uma vez e pode ser utilizado em todos os métodos
     *
     **/
    private static final Scanner sc = new Scanner(System.in);//Colocar as variáveis com nomes que mantenham o contexto


    public static void main(String[] args) {



        List<Pessoa> pessoas = new ArrayList<>();
        int opcao = menu();
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
                    for (Pessoa pessoa : pessoas) { //Mesma coisa que o "for(int i = 0; i< pessoas.size(); i++)"
                        System.out.println(pessoa);
                    }
                    opcao = menu();
                }
            }
        }
        sc.close();
    }

    public static Pessoa cadastrarPessoa(){
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
        return new Pessoa (nome, dataNascimento, cpf,email,telefone,endereco);
    }

    public static Endereco cadastrarEndereco(){
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
        return new Endereco(rua,bairro,cidade,numCasa,complemento,estado,cep);
    }


    public static int menu(){
        System.out.println("Digite 1 para Cadastrar uma nova pessoa:   ");
        System.out.println("Digite 2 para Ver todas as pessoas:   ");
        System.out.println("Digite 3 para Alterar uma pessoa:   ");
        System.out.println("Digite 4 para Excluir uma pessoa:   ");
        System.out.println("Digite 5 para Sair:    ");
        return sc.nextInt();
    }










}

