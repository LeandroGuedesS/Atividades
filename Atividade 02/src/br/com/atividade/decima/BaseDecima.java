package br.com.atividade.decima;

public abstract class BaseDecima {
    
    protected Double distanciaPercorrida;

    protected Double tempoDecorrido;

    protected Double velocidadeMedia;

    protected Double litros;

    public Double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public Double getTempoDecorrido() {
        return tempoDecorrido;
    }

    public Double getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public Double getLitros() {
        return litros;
    }

    public BaseDecima() {
    }

    public BaseDecima(Double distanciaPercorrida, Double tempoDecorrido, Double velocidadeMedia, Double litros) {
        this.distanciaPercorrida = distanciaPercorrida;
        this.tempoDecorrido = tempoDecorrido;
        this.velocidadeMedia = velocidadeMedia;
        this.litros = litros;
    }
    
    public abstract void calculoExecutavel();
}