public class Decisiones {
    public static void main (String[] args){
        int FechaDeLanzamiento=1999;
        boolean IncluidoPlan= false;
        double Calificacion=8.2;
        String tipoPlan="plus";
//        if(FechaDeLanzamiento>=2022){
//            System.out.println("Peliculas recientes");
//        }else{
//            System.out.println("Peliculas Retro");
//        }
        if (IncluidoPlan && tipoPlan.equals("plus")){
            System.out.println("Disfruta tu pelicula");
        }else{
            System.out.println("Debes inscribir el plan plus");
        }
    }
}
