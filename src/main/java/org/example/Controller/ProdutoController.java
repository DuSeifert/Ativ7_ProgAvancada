package org.example.Controller;

import org.example.Produto;
import java.util.ArrayList;

public class ProdutoController {

    ArrayList<Produto> produtos = new ArrayList<>();


    public void cadastrarProduto(Produto produto) {

        boolean jaExiste = false;

        for (Produto p : produtos) {
            if (p.getCodigo() == produto.getCodigo()) {
                jaExiste = true;
                break;
            }
        }

        if (!jaExiste) {
            produtos.add(produto);

            System.out.println("\nProduto cadastrado com sucesso!\n");
        }
        else{
            System.out.println("\nCódigo de produto já cadastrado\n");
        }

    }

    public void procurarProduto(int codigo) {
        Produto produto = null;

        for (Produto produtoAux : produtos) {
            if (produtoAux.getCodigo() == codigo) {
                produto = produtoAux;
                break;
            }
        }

        if(produto == null){
            System.out.println("\nProduto não encontrado.\n");
        }
        else{
            System.out.println("\nProduto encontrado:\n");
            produto.exibirInfo();
        }

    }


}
