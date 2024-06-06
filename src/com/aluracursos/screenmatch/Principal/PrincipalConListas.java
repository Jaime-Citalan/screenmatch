package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Loimposible", 2012);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Las crónicas de Narnia", 2022);
        otraPelicula.evalua(6);
        var peliculaDeJaime = new Pelicula("Intensamente", 2015);
        Serie laPiloto = new Serie("La piloto", 2024);
        peliculaDeJaime.evalua(8);
        Serie jovenS = new Serie("El Joven Sheldom", 2024);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeJaime);
        lista.add(jovenS);

        for(Titulo item: lista) {
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
            System.out.println(pelicula.getClasificacion());
            }

        }

        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Sandra Bulog");
        listaDeArtistas.add("Arnol Chuazeneguer");
        listaDeArtistas.add("Silvestre Stalone");
        System.out.println(listaDeArtistas);

        Collections.sort(listaDeArtistas);
        System.out.println("Lista de artistas ordenada:" + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha: "+lista);


    }
}
