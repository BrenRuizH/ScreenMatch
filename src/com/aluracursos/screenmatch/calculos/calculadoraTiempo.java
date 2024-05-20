package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;

public class calculadoraTiempo {

    private int tiempoReal;
    public void incluye(Pelicula pelicula) {

        tiempoReal += pelicula.getDuracionMinutos();
    }
}
