import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Por favor, dame el primer número de la operación. ");
        while (!num.hasNextFloat()){
            num.nextLine();
            System.out.println("Ese numero no es valido");
        }
        float numero1;
        numero1=num.nextFloat();
        System.out.println("Por favor, dame el Segundo número de la operación. ");
        while (!num.hasNextFloat()){
            num.nextLine();
            System.out.println("Ese numero no es valido");
        }
        float numero2;
        numero2=num.nextFloat();

        System.out.println("Ahora escoja una operacion:\n Sumar Presione 1\n Restar Presione 2\n Multiplicar Presione 3\n Dividir Presione 4");
        boolean validar=false;
        int seleccion=0;
        while(!(validar == true)) {
            while (!num.hasNextInt()) {
                num.nextLine();
                System.out.println("Ese numero no es valido");
            }
            int comp= num.nextInt();
            if (0 < comp && comp <= 4) {
                seleccion= seleccion+comp;
                validar = true;
            }else{
                System.out.println("Esa operacion no existe");
            }
        }
        float resultado = 0;
        if(seleccion == 1){
            resultado = numero1+numero2;
        }
        if(seleccion==2){
            resultado = numero1-numero2;
        }
        if(seleccion==3){
            resultado = numero1*numero2;
        }
        if(seleccion==4){
            resultado = numero1/numero2;
        }
        System.out.println("El resultado es: "+resultado);

    }

}
