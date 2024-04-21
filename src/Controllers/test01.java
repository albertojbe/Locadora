package Controllers;
//calcular preço do produto com base na taxa por dias alugados
//adicionar ao carrinho
//mostrar extrato
//ponto de vista do caixa

import Models.Produto;
import Views.Caixa;
import Views.informacoes;
import Views.passarProduto;
import java.util.ArrayList;

public class test01 {
    static ArrayList<Produto> carrinho = new ArrayList<Produto>();
    static Double valorTotal = 0.0;
    public static void main(String[] args) {
        while(true) {
            int opcao = Caixa.mostrarOpcoes();
            if (opcao == 1) {
                Produto produto = passarProduto.passarFilme();
                double valorFinal = informacoes.mostrarValor(produto);
                carrinho.add(produto);
                valorTotal += valorFinal;
            } else if (opcao == 2) {
                Produto produto = passarProduto.passarSerie();
                double valorFinal = informacoes.mostrarValor(produto);
                carrinho.add(produto);
                valorTotal += valorFinal;
            } else if (opcao == 3) {
                Produto produto = passarProduto.passarDisco();
                double valorFinal = informacoes.mostrarValor(produto);
                carrinho.add(produto);
                valorTotal += valorFinal;
            } else if (opcao == 4) {
                for (Produto produto : carrinho) {
                    informacoes.mostrarProduto(produto);
                }
                System.out.println("Valor total: " + valorTotal);
                System.out.println(" ");
            } else if (opcao == 5) {
                System.out.println("Atendimento encerrado.");
                break;
            }
        }
    }
}