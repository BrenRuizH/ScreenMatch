public class Principal {

    public static void main(String[] args) {

        // Crear una instancia de pelicula
        Pelicula miPelicula = new Pelicula();
        miPelicula.nombre = "Encanto";
        miPelicula.fechaLanzamiento = 2021;
        miPelicula.duracionMinutos = 120;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Y fue lanzada en " + miPelicula.fechaLanzamiento);

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1998;
        otraPelicula.duracionMinutos = 180;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("Y fue lanzada en " + otraPelicula.fechaLanzamiento);
    }
}
