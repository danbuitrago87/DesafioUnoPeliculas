import java.util.Scanner;
public class Lectura {
    public static void main (String[] args){
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite el nombre de la pelicula: ");
        String nombrePelicula=entrada.nextLine();
        System.out.println("Digite la fecha de lanzamiento de la pelicula: ");
        String fechaLanzamiento=entrada.nextLine();
        System.out.println("Digite la nota de la pelicula: ");
        String nota=entrada.nextLine();
        System.out.println(nombrePelicula);
        System.out.println(fechaLanzamiento);
        System.out.println(nota);
    }
}
