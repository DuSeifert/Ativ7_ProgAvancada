package org.example;

public class Produto {

    private int codigo;
    private String nome;
    private double preco;


    public Produto(int codigo, String nome, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void exibirInfo(){
        System.out.println("{");
        System.out.println("\tcodigo: " + codigo);
        System.out.println("\tnome: " + nome);
        System.out.println("\tpreco: " + preco);
        System.out.println("}");
    }

}
