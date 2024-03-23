package br.com.atividade.oitava;

public abstract class BaseOitava {

    protected double salario;

    protected double percentual;

    public double getSalario() {
        return salario;
    }

    public double getPercentual() {
        return percentual;
    }

    public BaseOitava() {
    }

    public BaseOitava(double salario, double percentual) {
        this.salario = salario;
        this.percentual = percentual;
    }
    
    public abstract void calculoExecutavel();
}
