//Imprimir astericos según el numero digitado, ejemplo si digitado 4
//imprime **** (4 asteriscos), utilizando ciclos.

import java.util.Scanner;

public class ActividadG {
    public static void main(String[] args) {

        System.out.println(" Inicio del proyecto");
        Scanner entrada = new Scanner(System.in);

        //Declaramos las variables
        int numero;
        int contador = 1;

        //Ingresamos los datos de entrada
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();

        //Ciclo para contar e imprimir los * segun el numero ingresado
        while (contador <= numero) {

            System.out.print("*");
            contador++;

        }
    }
}
