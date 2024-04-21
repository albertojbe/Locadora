package Servicos;

import Models.Produto;

import java.util.ArrayList;

public class Carrinho {
    static ArrayList<Produto> carrinho = new ArrayList<Produto>();
    static Double valorTotal = 0.0;

    public static void adicionarFilme(){
        Produto produto = passarProduto.passarFilme();
        double valorFinal = informacoes.mostrarValor(produto);
        carrinho.add(produto);
        valorTotal += valorFinal;
    }
    public static void adicionarSerie(){
        Produto produto = passarProduto.passarSerie();
        double valorFinal = informacoes.mostrarValor(produto);
        carrinho.add(produto);
        valorTotal += valorFinal;
    }
    public static void adicionarDisco(){
        Produto produto = passarProduto.passarDisco();
        double valorFinal = informacoes.mostrarValor(produto);
        carrinho.add(produto);
        valorTotal += valorFinal;
    }
    public static void mostrarCarrinho(){
        for (Produto produto : carrinho) {
            informacoes.mostrarProduto(produto);
        }
        System.out.println("Valor total: " + valorTotal);
        System.out.println(" ");
    }
    public static void finalizarCarrinho(){
        System.out.println("Compra realizado com sucesso!");
        System.out.println("Valor Total: " + valorTotal);
    }
}
