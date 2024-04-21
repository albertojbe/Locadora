package Models;

public class Disco extends Produto{
    private static final Double TAXA_DISCO = 0.20;

    public Disco(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularPreco(int dias) {
        return this.valor * dias * (TAXA_DISCO + 1);
    }
}
