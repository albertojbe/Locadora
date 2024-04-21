//calcular preço do produto com base na taxa por dias alugados
//adicionar ao carrinho
//mostrar extrato
//ponto de vista do caixa

import Models.Produto;
import Servicos.Caixa;
import Servicos.Carrinho;
import Servicos.informacoes;

public class test01 {
    public static void main(String[] args) {
        while(true) {
            int opcao = Caixa.mostrarOpcoes();
            if (opcao == 1) {
                Carrinho.adicionarFilme();
            } else if (opcao == 2) {
                Carrinho.adicionarSerie();
            } else if (opcao == 3) {
                Carrinho.adicionarSerie();
            } else if (opcao == 4) {
                Carrinho.mostrarCarrinho();
            } else if (opcao == 5) {
                Carrinho.finalizarCarrinho();
                break;
            }
        }
    }
}