package org.example;

import org.example.Controller.ProdutoController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ProdutoController lista = new ProdutoController();

    lista.cadastrarProduto(new Produto(1, "edu", 21));
    lista.cadastrarProduto(new Produto(2, "caio", 23));
    lista.cadastrarProduto(new Produto(3, "migas", 43));
    lista.cadastrarProduto(new Produto(4, "daniaelea", 54));


    int opc;

    do{

        System.out.println("\n --- Menu --- \n");
        System.out.println("1 -- Cadastrar produto");
        System.out.println("2 -- Buscar produto por código\n");
        System.out.println("0 -- Sair");
        System.out.print("Escolha uma opção: ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                System.out.println("\nOpção de cadastro selecionada:\n");

                lista.cadastrarProduto(new Produto(novoCodigo(sc), novoNome(sc), novoPreco(sc)));
                //lista.cadastrarProduto(new Produto(codigo, nome, preco));

                break;
            case 2:
                System.out.println("\nOpção de busca selecionada:\n");

                System.out.println("Qual o codigo do produto?");
                int cod = sc.nextInt();
                sc.nextLine();

                lista.procurarProduto(cod);

                break;

            default:
                if(opc != 0){
                    System.out.println("Opção inválida. Tente novamente.");
                }
                break;
        }

    }while(opc != 0);

        System.out.println("Bye bye :(");
        sc.close();
    }

    static int novoCodigo(Scanner sc) {
        System.out.println("Digite o codigo: ");
        int codigo = sc.nextInt();
        sc.nextLine();

        return codigo;
    }

    static String novoNome(Scanner sc) {
        System.out.println("Digite o nome: ");

        return sc.nextLine();
    }

    static double novoPreco(Scanner sc) {
        System.out.println("Digite o preco: ");

        return sc.nextDouble();
    }

}