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

        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1998;
        otraPelicula.duracionMinutos = 180;

        //otraPelicula.muestraFichaTecnica();
    }
}
