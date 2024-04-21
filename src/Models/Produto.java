package Models;

public abstract class Produto implements CalcularPreco{
    private String nome;
    protected Double valor;

    public Produto (String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public double calcularPreco(int dias) {
        return 0;
    }

    public Double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
