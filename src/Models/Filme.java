package Models;

public class Filme extends Produto{
    private static final Double TAXA_FILME = 0.1;

    public Filme(String nome, Double valor, int dias) {
        super(nome, valor, dias);
    }

    @Override
    public double calcularPreco() {
        return this.valor * (1 + TAXA_FILME) * this.dias;
    }
}
