package Models;

public class Serie extends Produto{
    private static final double TAXA_SERIE = 0.05;
    public Serie(String nome, Double valor, int dia) {
        super(nome, valor, dia);
    }

    @Override
    public double calcularPreco() {
        return this.valor * this.dias * (TAXA_SERIE + 1);
    }
}
