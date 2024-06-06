package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo {
     private int temporadas;
     private boolean activa;
     private int episodiosPorTemporadas;
     private int minutosPorEpisodios;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }



    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
    }

    @Override
    public String toString() {
        return "Serie: " +this.getNombre()+ " ("+ this.getFechaDeLanzamiento();

    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
}
