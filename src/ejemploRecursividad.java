import java.util.Scanner;

public class ejemploRecursividad {



    public static void cuentaRegresiva(int numero){//Creamos el metodo cuentaRegresiva, cuyo argumento es un numero

        if (numero == 0){//Se ejecuta la funcion hasta que se cumpla esta condicion
            System.out.println("Fin de la cuenta regresiva");
            return; //Se utiliza para terminar el programa
        }
        //Se muestra el numero
        System.out.println(numero);

        //el metodo se llama a si mismo
        cuentaRegresiva(numero-1);//el valor de numero empieza a restarse 1 a si mismo hasta que se cumpla la condicion

    }

    public static void main(String[] args) {
        System.out.println("Ejemplo de Recursividad\n");


        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = entrada.nextInt();

        System.out.println("Inicia la cuenta regresiva desde "+numero);

        //Se llama el metodo y se ejecuta hasta cumplir la condicion y detenerse
        cuentaRegresiva(numero);
    }


}
