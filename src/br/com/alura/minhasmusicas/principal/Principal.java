package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.filtros.Favoritos;
import br.com.alura.minhasmusicas.filtros.Recomendacao;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {

        Podcast pod01 = new Podcast();
        pod01.setTitulo("Conversa fiada #03");
        pod01.setDuracao(120);
        pod01.setHost("Cabralzim");
        pod01.setDescricao("Como você saria de uma fria?");
        pod01.reproduzir();
        pod01.curtir();
        System.out.println(pod01.getTotalDeReproducoes());

        Musica musc01 = new Musica();
        musc01.setTitulo("Nada pode calar um adorador");
        musc01.setDuracao(3);
        musc01.setAlbum("Melhores da Eyshila");
        musc01.setArtista("Eyshila");
        musc01.setGenero("Gospel");
        musc01.setTotalCurtidas(6000);

        Recomendacao recomendacao = new Recomendacao();
        recomendacao.recomendar(musc01);

        Favoritos fav = new Favoritos();
        fav.adicionarAosFavoritos(musc01);

        System.out.println(fav.getMeusFavoritos().getTitulo());


    }
}
