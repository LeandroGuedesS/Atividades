package br.com.atividade.nona;

public abstract class BaseNona {
    
    protected Double celcius;

    public Double getCelcius() {
        return celcius;
    }

    public BaseNona() {
    }

    public BaseNona(Double celcius) {
        this.celcius = celcius;
    }

    public abstract void calculoExecutavel();
}
