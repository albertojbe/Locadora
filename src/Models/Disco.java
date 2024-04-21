package Models;

public class Disco extends Produto{
    private static final Double TAXA_DISCO = 0.20;

    public Disco(String nome, Double valor, int dias) {
        super(nome, valor, dias);
    }

    @Override
    public double calcularPreco() {
        return this.valor * this.dias * (TAXA_DISCO + 1);
    }

}
