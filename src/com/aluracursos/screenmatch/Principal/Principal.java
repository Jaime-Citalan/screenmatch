package com.aluracursos.screenmatch.Principal;

import com.aluracursos.escreenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.escreenmatch.calculos.FiltroRecomendaciones;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Lo imposible", 2012);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua( 9.5);
        miPelicula.evalua( 9.0);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie jovenS = new Serie("EL Joven Sheldom", 2024);
        jovenS.setTemporadas(2);
        jovenS.setMinutosPorEpisodios(50);
        jovenS.setEpisodiosPorTemporadas(60);
        jovenS.muestraFichaTecnica();
        System.out.println(jovenS.getDuracionEnMinutos());

        Serie laPiloto = new Serie("La piloto", 2024);
        laPiloto.setTemporadas(1);
        laPiloto.setMinutosPorEpisodios(45);
        laPiloto.setEpisodiosPorTemporadas(89);
        laPiloto.muestraFichaTecnica();
        System.out.println(laPiloto.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Intensamente", 2022);
        otraPelicula.setDuracionEnMinutos(60);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(laPiloto);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus peliculas favoritas es de: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("Historia");
        episodio.setSerie(laPiloto);
        episodio.setTotalVisualizaciones(100);

        filtroRecomendaciones.filtra(episodio);

        var peliculaDeJaime = new Pelicula("Intensamente", 2015);
        peliculaDeJaime.setDuracionEnMinutos(80);


        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(peliculaDeJaime);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaDePeliculas.size());
        System.out.println("La primer peliculas es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas);

        System.out.println("toString de la pelicula: " + listaDePeliculas.get(0).toString());




    }
}
