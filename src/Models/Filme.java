package Models;

public class Filme extends Produto{
    private static final Double TAXA_FILME = 0.1;

    public Filme(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularPreco(int dias) {
        return this.valor * (1 + TAXA_FILME) * dias;
    }
}
