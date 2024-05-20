package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraTiempo {

    private int tiempoReal;

    public int getTiempoReal() {
        return tiempoReal;
    }

    public void incluye(Titulo titulo) {

        this.tiempoReal += titulo.getDuracionMinutos();
    }
}
