package br.com.atividade.sexta;

public abstract class BaseSexta {
    
    protected double saldoAtual;

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public BaseSexta() {
    }

    public BaseSexta(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
    
    public abstract void calculoExecutavel();
}
