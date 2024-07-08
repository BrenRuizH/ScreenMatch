package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.exception.ErrorConversionDuracionException;
import com.google.gson.annotations.SerializedName;

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

    public Titulo(TitutloOmdb miTituloOmdb) {
        this.nombre = miTituloOmdb.title();
        this.fechaLanzamiento = Integer.valueOf(miTituloOmdb.year());
        if(miTituloOmdb.runtime().contains("N/A")) {
            throw new ErrorConversionDuracionException("No pude convertir la duración, porque contiene un N/A");
        }
        this.duracionMinutos = Integer.valueOf(miTituloOmdb.runtime().substring(0, 3).replace(" ", ""));
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

    @Override
    public String toString() {
        return "(Nombre=" + nombre +
                ", Fecha de Lanzamiento=" + fechaLanzamiento +
                ", Duración=" + duracionMinutos + ")";
    }
}
