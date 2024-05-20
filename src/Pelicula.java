public class Pelicula {

    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoPlan;
    double sumaEvaluaciones;
    int totalEvaluaciones;

    void muestraFichaTecnica() {
        System.out.println("El nombre de la pelicula es " + nombre);
        System.out.println("Fue lanzada en " + fechaLanzamiento);
        System.out.println("Duración en minutos es " + duracionMinutos);
    }

    void evalua(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluaciones ++;
    }

    double calculaMedia() {
        return sumaEvaluaciones / totalEvaluaciones;
    }
}
