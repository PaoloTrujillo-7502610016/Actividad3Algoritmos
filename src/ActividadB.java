//Calcular el promedio de n Notas digitadas

import java.util.Scanner;

public class ActividadB {

    public static void main(String[] args) {

        //Declaramos las variables que vamos a utilizar
        Scanner entrada = new Scanner(System.in);
        int cantidadNotas;
        double nota;
        double sumaNotas = 0;
        double promedio;

        //Solicitamos la cantidad de notas a calcular
        System.out.println("Calcular el promedio de n Notas digitadas");
        System.out.println("Ingrese la cantidad de notas a calcular (max 6):");

        cantidadNotas = entrada.nextInt();

        //Ciclo para ingresar cada una de las notas
        for (int i = 1; i <= cantidadNotas; i++) {
            System.out.println("Ingrese la nota " + i);
            nota = entrada.nextDouble();

            sumaNotas = sumaNotas + nota;
        }

        //Calcular el promedio
        promedio = sumaNotas/cantidadNotas;

        //Mostrar resultado
        System.out.println("El promedio de notas es: " + promedio);

    }
}
