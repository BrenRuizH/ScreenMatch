package com.aluracursos.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoPlan;
    private double sumaEvaluaciones;
    private int totalEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public boolean isIncluidoPlan() {
        return incluidoPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public void setIncluidoPlan(boolean incluidoPlan) {
        this.incluidoPlan = incluidoPlan;
    }

    public int getTotalEvaluaciones() {
        return totalEvaluaciones;
    }

    public void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Fue lanzada en " + fechaLanzamiento);
        System.out.println("Duración en minutos es " + getDuracionMinutos());
    }

    public void evalua(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    public double calculaMedia() {
        return sumaEvaluaciones / totalEvaluaciones;
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
