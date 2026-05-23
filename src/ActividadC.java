//Realizar la serie de Fibonacci

import java.util.Scanner;

public class ActividadC {
    public static void main(String[] args) {

        System.out.println("\nMostrar la serie de Fibonacci\n");

        //Declaramos las variables a utilizar:
        int cantidad;
        int numero1 = 0;//El primer valor de numero1 es 0
        int numero2 = 1;//El primer valor de numero2 es 1
        int suma;

        //Ingresamos la cantidad de numeros a mostrar
        System.out.println("Ingrese la cantidad de numeros de Fibonacci a mostrar (max 20):\n");

        Scanner entrada = new Scanner(System.in);
        cantidad = entrada.nextInt();

        //Ciclo para calcular los numeros
        System.out.println("Serie de Fibonacci: \n");
        for (int i = 1; i <= cantidad; i++) {

            System.out.println( numero1 + " ");//Muestra el valor de numero1 (0+0)
            suma = numero1 + numero2; //Suma el valor de numero1 + numero2
            numero1 = numero2; //El nuevo valor de numero1 ahora es el que tenia numero2
            numero2 = suma; //El nuevo valor de numero2 es la suma de los numeros anteriores
            //Se repite el ciclo de suma y reemplazo de valores hasta llegar al limite de cantidad
        }
    }
}
