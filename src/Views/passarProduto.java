package Views;
import Models.*;


public class passarProduto {
    public static Filme passarFilme() {
        System.out.println("Nome: ");
        String nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        return new Filme(nome, preco);
    }
    public static Serie passarSerie() {
        System.out.println("Nome: ");
        String nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        return new Serie(nome, preco);
    }
    public static Disco passarDisco() {
        System.out.println("Nome: ");
        String nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        return new Disco(nome, preco);
    }
}
