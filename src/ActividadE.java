//Elevar un numero a su potencia utilizando ciclo for

import java.util.Scanner;

public class ActividadE {
    public static void main(String[] args) {
        System.out.println("Elevar un numero a su potencia utilizando ciclo for\n");

        //Declaramos las variables
        int numero;
        int potencia;
        int resultado = 1;

        //Ingresamos los datos de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numero base: ");
        numero = entrada.nextInt();
        System.out.println("Ingrese la potencia: ");
        potencia = entrada.nextInt();

        //Calculamos la potencia
        for (int i = 1; i <= potencia; i++) {
            resultado = resultado * numero;
        }

        //Mostramos el resultado
        System.out.println("El resultado de " + numero + " elevado a " + potencia + " es: " + resultado);

    }
}
