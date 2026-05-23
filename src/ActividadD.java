//Realizar el Factorial de Un numero

import java.util.Scanner;

public class ActividadD {
    public static void main(String[] args) {

        System.out.println("\nRealizar el factorial de un numero");

        //Declaramos las variables que vamos a utilizar
        int numero;
        int factorial = 1;

        //Ingresamor el numero al que le vamos a calcular el factorial
        System.out.println("\nIngrese un numero: ");
        Scanner entrada = new Scanner(System.in);
        numero = entrada.nextInt();

        //Ciclo para calcular el factorial
        for (int i = 1; i <= numero; i++) {
            factorial = factorial * i;
        }

        //Mostrar resultado
        System.out.println("\nEl factorial de "+numero+" es: "+factorial);

    }
}
