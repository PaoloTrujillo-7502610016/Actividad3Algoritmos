//Imprimir números que sean múltiplo de 4 y 6 con limite 10000

import java.util.Scanner;

public class ActividadF {

    public static void main(String[] args) {
        System.out.println("Imprimir números que sean múltiplo de 4 y 6 con limite 10000\n");

        //Declaramos las variables
        int numero = 0;
        int limite;

        //Ingresamos los datos de entrada
        System.out.println("Ingrese un numero entre 1 y 10000: ");
        Scanner entrada = new Scanner(System.in);
        limite = entrada.nextInt();

        if (limite > 10000) {
            System.out.println("!Ha excededido el limite de 10000¡");
        }else{
            //Ciclo para veificar la condicion
            System.out.println("Los numeros multiplos de 4 y 6 con limite hasta "+limite+ " son:");
            while (numero <= limite) {//Mientras se cumpla esta condicion

                //Verificar si numero es multiplo de 4 y 6
                if (numero % 4 == 0 && numero % 6 == 0) {
                    System.out.println(numero);
                }
                numero++;
            }
        }

    }
}
