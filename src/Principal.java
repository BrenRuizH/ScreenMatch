public class Principal {

    public static void main(String[] args) {

        // Crear una instancia de pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaLanzamiento = 2021;
        miPelicula.duracionMinutos = 120;

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);

        System.out.println(miPelicula.getTotalEvaluaciones());
        System.out.println(miPelicula.calculaMedia());
    }
}
