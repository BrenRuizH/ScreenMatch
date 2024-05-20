package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {

    private int temporada;
    private int episodiosTemporada;
    private int minutosEpisodio;

    @Override
    public int getDuracionMinutos() {
        return temporada * episodiosTemporada * minutosEpisodio;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpisodiosTemporada() {
        return episodiosTemporada;
    }

    public void setEpisodiosTemporada(int episodiosTemporada) {
        this.episodiosTemporada = episodiosTemporada;
    }

    public int getMinutosEpisodio() {
        return minutosEpisodio;
    }

    public void setMinutosEpisodio(int minutosEpisodio) {
        this.minutosEpisodio = minutosEpisodio;
    }
}
