package br.com.atividade.segunda;

public abstract class BaseSegunda {
    
    protected double primeiroValor;
    
    protected double segundoValor;

    public double getPrimeiroValor() {
        return primeiroValor;
    }

    public double getSegundoValor() {
        return segundoValor;
    }

    public BaseSegunda() {
    }

    public BaseSegunda(double primeiroValor, double segundoValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
    }

    public abstract void calculoExecutavel();
}
