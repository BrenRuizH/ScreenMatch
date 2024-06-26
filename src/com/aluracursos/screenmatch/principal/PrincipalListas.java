package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalListas {

    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaBruno = new Pelicula("El Señor de los Anillos", 2001);
        peliculaBruno.evalua(10);
        Serie casaDragon = new Serie("La Casa del Dragón", 2022);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(peliculaBruno);
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(casaDragon);

        for (Titulo item: lista) {
            System.out.println(item.getNombre());
            // Si la instancia es del tipo Película crea una variable pelicula de ese tipo
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
                System.out.println(pelicula.getClasificacion());
            }
        }

        ArrayList<String> listaArtisitas = new ArrayList<>();
        listaArtisitas.add("Penélope Cruz");
        listaArtisitas.add("Antonio Banderas");
        listaArtisitas.add("Ricardo Darín");

        System.out.println("Lista de Artistas NO Ordenada: " +  listaArtisitas);
        Collections.sort(listaArtisitas);
        System.out.println("Lista de Artistas Ordenada: " +  listaArtisitas);
        System.out.println(lista);
        System.out.println("Lista de Títulos Ordenada: " +  lista);

        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println("Lista Ordenada por Fecha: " + lista);
    }
}
