package Models;

public class Serie extends Produto{
    private static final double TAXA_SERIE = 0.05;
    public Serie(String nome, Double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularPreco(int dias) {
        return valor * dias * (TAXA_SERIE + 1);
    }
}
