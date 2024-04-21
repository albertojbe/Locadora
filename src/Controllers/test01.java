package Controllers;
//calcular preço do produto com base na taxa por dias alugados
//adicionar ao carrinho
//mostrar extrato
//ponto de vista do caixa

import Models.Produto;
import Views.mostrarPreco;
import Views.passarProduto;

import java.util.ArrayList;

public class test01 {
    static ArrayList<Produto> carrinho = new ArrayList<Produto>();
    public static void main(String[] args) {

    }
    public void adicionarAoCarrinho(int opcao) {
        if (opcao == 1) {
            carrinho.add(mostrarPreco.mostrarValor(passarProduto.passarFilme()));
        }
        if (opcao == 2) {
            carrinho.add(mostrarPreco.mostrarValor(passarProduto.passarSerie()));
        }
        if (opcao == 3) {
            carrinho.add(mostrarPreco.mostrarValor(passarProduto.passarDisco()));
        }
        if (opcao == 4) {
            for (Produto produto : carrinho) {
                System.out.println(produto);
            }
        }
    }
}