package com.aluracursos.escreenmatch.calculos;

public class FiltroRecomendaciones {

    public void filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Muy bien evaluado en el momento");
        }else if (clasificacion.getClasificacion() >= 2){
            System.out.println("Popular en el momento");
        }else {
            System.out.println("Guardalo en tú lista para verlo después");
        }
    }
}
