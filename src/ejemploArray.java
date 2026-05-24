import java.util.Arrays;

public class ejemploArray {

    public static void main(String[] args) {
        System.out.println("Ejemplo Array");

        //es una estructura que permite almacenar varios datos dentro de una sola variable
        String[] vocales = {"a","e","i","o","u"}; //Arreglo de tipo string
        int[] numeros = {1,2,3,4,5,6}; //Areglo de tipo numerico
        boolean[] boleano = {true, false}; //Arreglo de tipo booleano

        //Cada dato dentro del array tiene una posicion llamada indice
        //En un arreglo el primer indice siempre empieza desde 0

        //Para mostrar un dato dentro almacenado dentro de un arreglo, se debe colocar
        //la posicion o indice donde se encuentra ubicado
        System.out.println("\nLa primera vocal es la: "+ vocales[0]);//Porque el dato "a" esta ubidado en el indice 0
        System.out.println("\nEl segundo numero es: "+ numeros[1]); //Porque el segundo numero esta ubicado en el indice 1
        System.out.println("\nEn el dia sale el sol: "+ boleano[0]); //Porque el valor verdadero esta ubicado en el indice 0


        //Para mostrar todos los datos almacenados dentro de un arreglo, se debe usar un ciclo for o while
        System.out.print("\nLos numeros son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +" ");
        }

    }

}
