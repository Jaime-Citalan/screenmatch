package com.aluracursos.screenmatch.modelos;
//DECLARAMOS ATRIBUTOS

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;
    // CREACION DE GETTERS

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    // CREACIÓN DE SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    //**********************************************************
//DECLARAMOS METODOS

    public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;

    }

    public void muestraFichaTecnica(){
        System.out.println("El nombre de la pelicula es: " + nombre);
        System.out.println("La fecha de lanzamiento es: " + fechaDeLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionEnMinutos() + " Minutos");


    }
    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }
    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;
    }
}
