package br.com.alura.minhasmusicas.modelos;

public class Musica extends Audio{
    private String album, artista, genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public void reproduzir() {
        super.reproduzir();
        System.out.println("Está reproduzindo uma música");
    }

    public int getClassificacao() {
        if (this.getTotalDeReproducoes() >= 10000) {
            return 5;
        }
        if (this.getTotalDeReproducoes() >= 1000) {
            return 3;
        }

        return 1;
    }
}
