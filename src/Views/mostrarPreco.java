package Views;

import Models.Produto;

public class mostrarPreco {
    public static Produto mostrarValor(Produto produto){
        System.out.println("Dias alugados: ");
        int diasAlugados = Teclado.scan.nextInt();
        System.out.println("Calculado preço...");
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Preço: " + produto.calcularPreco(diasAlugados));
        System.out.println("Produto adicionado com sucesso!");
        return produto;
    }
}
