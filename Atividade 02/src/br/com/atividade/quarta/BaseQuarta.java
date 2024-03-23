package br.com.atividade.quarta;

public abstract class BaseQuarta {
    
    protected int valorInicial;

    public int getValorInicial() {
        return valorInicial;
    }

    public BaseQuarta() {
    }

    public BaseQuarta(int valorInicial) {
        this.valorInicial = valorInicial;
    }
    
    public abstract void calculoExecutavel();
}
