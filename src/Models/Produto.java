package Models;

public abstract class Produto implements CalcularPreco{
    private String nome;
    protected Double valor;
    protected int dias;

    public Produto (String nome, Double valor, int dias) {
        this.nome = nome;
        this.valor = valor;
        this.dias = dias;
    }

    @Override
    public double calcularPreco() {
        return 0;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    public int getDias() {
        return dias;
    }
}
