package br.com.atividade.quinta;

public abstract class BaseQuinta {

    protected String nome;

    protected String endereco;

    protected String telefone;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public BaseQuinta() {
    }

    public BaseQuinta(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }
    
    public abstract void calculoExecutavel();
}
