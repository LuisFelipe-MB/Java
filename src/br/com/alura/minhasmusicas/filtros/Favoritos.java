package br.com.alura.minhasmusicas.filtros;

import br.com.alura.minhasmusicas.modelos.Audio;

public class Favoritos {
    private Audio meusFavoritos;


    public void adicionarAosFavoritos(Audio audio) {
        System.out.println("O " + audio.getTitulo() + " foi adicionado aos favoritos");
        this.meusFavoritos = audio;
    }

    public Audio getMeusFavoritos() {
        return meusFavoritos;
    }

}
