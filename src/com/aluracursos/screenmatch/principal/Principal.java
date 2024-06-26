package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.CalculadoraTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        // Crear una instancia de pelicula
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.setIncluidoPlan(true);

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        // Esto es un constructor
        Serie casaDragon = new Serie("La Casa del Dragón", 2022);
        casaDragon.setTemporada(1);
        casaDragon.setMinutosEpisodio(50);
        casaDragon.setEpisodiosTemporada(10);

        System.out.println("*******************************************************");
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionMinutos(180);

        System.out.println("*******************************************************");
        CalculadoraTiempo calculadora = new CalculadoraTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo necesario para ver tus títulos favoritos estás vacaciones " + calculadora.getTiempoReal() + " minutos.");

        System.out.println("*******************************************************");
        FiltroRecomendacion filtro = new FiltroRecomendacion();
        filtro.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La Casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);

        filtro.filtra(episodio);

        // ****************************************************************
        var peliculaBruno = new Pelicula("El Señor de los Anillos", 2001);
        peliculaBruno.setDuracionMinutos(180);

        // Todos los objetos que coloquemos dentro del ArrayList serán de tipo Pelicula
        ArrayList<Pelicula> listaPeliculas = new ArrayList<>();
        listaPeliculas.add(peliculaBruno);
        listaPeliculas.add(miPelicula);
        listaPeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista: " + listaPeliculas.size());
        System.out.println("La primer película es: "+ listaPeliculas.get(0).getNombre());

        System.out.println(listaPeliculas.toString());

        System.out.println("toString de la películas: " + listaPeliculas.get(0).toString());
    }
}
