package Servicos;
import Models.*;


public class passarProduto {
    public static Filme passarFilme() {
        String nome, nome2;
        System.out.println("Nome: ");
        nome2 = Teclado.scan.nextLine();
        nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        System.out.println("Dias alugados: ");
        int dias = Teclado.scan.nextInt();
        return new Filme(nome, preco, dias);
    }
    public static Serie passarSerie() {
        String nome, nome2;
        System.out.println("Nome: ");
        nome2 = Teclado.scan.nextLine();
        nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        System.out.println("Dias alugados: ");
        int dias = Teclado.scan.nextInt();
        return new Serie(nome, preco, dias);
    }
    public static Disco passarDisco() {
        String nome, nome2;
        System.out.println("Nome: ");
        nome2 = Teclado.scan.nextLine();
        nome = Teclado.scan.nextLine();
        System.out.println("Preço: ");
        double preco = Teclado.scan.nextDouble();
        System.out.println("Dias alugados: ");
        int dias = Teclado.scan.nextInt();
        return new Disco(nome, preco, dias);
    }
}
