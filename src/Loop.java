import java.util.Scanner;

public class Loop {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        double nota=0;
        double mediaEvaluaciones=0;
        for(int i=0;i<3;i++){
            System.out.println("Digite la nota de la pelicula: ");
            nota=scanner.nextDouble();
            mediaEvaluaciones=mediaEvaluaciones+nota;
        }
        System.out.println("La media de las evaluaciones es: "+ (mediaEvaluaciones/3));
    }
}
