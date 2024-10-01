public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");
        int FechaDeLanzamiento=1999;
        boolean IncluidoPlan= true;
        double Calificacion=8.2;
        double Media=(8.2+6.0+9.0)/3;
        System.out.println("Media: "+Media);
        String sinopsis= "Matrix es una pelicula de Ciencia Ficción creada en " +FechaDeLanzamiento+
                " cuya calificación es " + Calificacion;
        System.out.println("Sinopsis: "+sinopsis);
        int puntuacion=(int) Media/2; //CASTING DE DOUBLE (Media) A INT (puntuacion)
        System.out.println("Su puntuación es: " + puntuacion);
    }
}