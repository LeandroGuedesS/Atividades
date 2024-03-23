package br.com.atividade.terceira;

public abstract class BaseTerceira {
    
    protected Double primeiroValor;

    protected Double segundoValor;

    protected Double terceiroValor;

    public Double getPrimeiroValor() {
        return primeiroValor;
    }

    public Double getSegundoValor() {
        return segundoValor;
    }

    public Double getTerceiroValor() {
        return terceiroValor;
    }

    public BaseTerceira() {
    }

    public BaseTerceira(Double primeiroValor, Double segundoValor, Double terceiroValor) {
        this.primeiroValor = primeiroValor;
        this.segundoValor = segundoValor;
        this.terceiroValor = terceiroValor;
    }

    public abstract void calculoExecutavel();
}
