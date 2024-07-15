package br.com.alura.minhasmusicas.filtros;

import br.com.alura.minhasmusicas.modelos.Audio;

public class Recomendacao {

    public void recomendar(Audio audio) {
        if (audio.getClassificacao() == 5) {
            System.out.println("Um dos mais curtidos do momento");
        } else if (audio.getClassificacao() >= 3) {
            System.out.println("Tem boa avaliação do publico");
        } else {
            System.out.println("Pouco popular");
        }
    }
}
