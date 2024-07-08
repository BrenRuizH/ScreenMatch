package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.exception.ErrorConversionDuracionException;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TitutloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalBusqueda {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner lectura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        List<Titulo> titulos = new ArrayList<>();

        while (true) {
            System.out.println("Escriba el nombre de la película: ");
            var busqueda = lectura.nextLine();

            if(busqueda.equalsIgnoreCase("salir")) {
                break;
            }

            String direccion = "https://www.omdbapi.com/?t=" +
                    busqueda.replace(" ", "+") +
                    "&apikey=5137789a";

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);



                // Titulo miTitulo = gson.fromJson(json, Titulo.class);
                TitutloOmdb miTituloOmdb = gson.fromJson(json, TitutloOmdb.class);
                System.out.println(miTituloOmdb);

                Titulo miTitulo = new Titulo(miTituloOmdb);
                System.out.println("Título ya convertido: " + miTitulo);

                titulos.add(miTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Ocurrió un error: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error en la URI, verifique la dirección.");
            } catch (ErrorConversionDuracionException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("Titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();
        System.out.println("Finalizó la ejecución del programa!");
    }
}
