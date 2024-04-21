package Servicos;

import Models.Produto;

public class informacoes {
    public static Double mostrarValor(Produto produto){
        System.out.println("Calculado preço...");
        System.out.println("Preço final: " + produto.calcularPreco());
        System.out.println("Produto adicionado com sucesso!");
        System.out.println(" ");
        return produto.calcularPreco();
    }
    public static void mostrarProduto(Produto produto){
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Dias alugados: " + produto.getDias());
        System.out.println("Preço final: " + produto.calcularPreco());
        System.out.println(" ");
    }
}
