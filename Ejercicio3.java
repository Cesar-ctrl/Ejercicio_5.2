import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca una calificacion entre ek 1.0 y el 0.0");
        System.out.print("Puntuación Calificación\n>= 0.9 Sobresaliente\n>= 0.8 Notable\n>= 0.7 Bien\n>= 0.6 Suficiente\n< 0.6 Insuficiente\n");
        boolean prueba = true;
        float calificacion = 0;
        while(prueba) {
            while (!entrada.hasNextFloat()) {
                entrada.nextLine();
                System.out.println("Eso no es válido, prueba otra vez");
            }
            float validar = entrada.nextFloat();
            if (0.0 < validar && validar < 1.0) {
                calificacion = calificacion + validar;
                prueba = false;
            }else{
                System.out.println("Esa calificación no es válida");
                prueba = true;
            }
        }
        if (calificacion>=0.9){
            System.out.print("Sobresaliente: "+ calificacion);
        }
        if (0.9>calificacion && calificacion>=0.8){
            System.out.print("Notable: "+ calificacion);
        }
        if (0.8>calificacion && calificacion>=0.7){
            System.out.print("Bien: "+ calificacion);
        }
        if (0.7>calificacion && calificacion>=0.6){
            System.out.print("Suficiente: "+ calificacion);
        }
        if (calificacion<=0.6){
            System.out.print("Insuficiente: "+ calificacion);
        }
    }
}

