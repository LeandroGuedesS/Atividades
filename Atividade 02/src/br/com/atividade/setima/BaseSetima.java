package br.com.atividade.setima;

public abstract class BaseSetima {
    
    protected double base;

    protected double altura;

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public BaseSetima() {
    }

    public BaseSetima(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public abstract void calculoExecutavel();
}
