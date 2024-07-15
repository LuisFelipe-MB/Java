package br.com.alura.minhasmusicas.modelos;

public class Podcast extends Audio{
    private String host, descricao;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Está reproduzindo um podcast");
    }

    @Override
    public int getClassificacao() {
        if (this.getTotalCurtidas() >= 10000) {
            return 5;
        }
        if (this.getTotalCurtidas() >= 1000) {
            return 3;
        }

        return 1;
    }
}
