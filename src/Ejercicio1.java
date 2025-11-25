import java.util.Scanner;

public class Ejercicio1 {
    //Se proporciona el siguiente algoritmo iterativo
    static int sumar(int[] a){
        int total=0;
        for(int i=0;i<a.length;i++){
            total+=a[i];
        }
        return total;
    }
    /*
    #1 Convertir este algoritmo a una version completamente recursiva, sin utilizar
    variables globales
    #2 Identificar Explicitamente:
        a) caso base
        b) caso recursivo
        c) progresion hacia el caso base
    #3 Escribir la recurrencia T(n) asociada al algoritmo
    #4 Comparar formalmente:
        a) Complejidad temporal de ambas versiones
        b) Complejidad espacial (uso de pila vs variables locales)
    #5 Implementar un programa en java que:
        a) Solicite al usuario la secuencia del arreglo (valores separados por espacio)
        b) Muestre el resultado utilizando ambas funciones (iterativa y recursiva)
    */

    static int sumaRecursiva(int[] a, int n){
        if(n==0)
            return 0;
        return sumaRecursiva(a,n-1)+a[n-1];
    }

    public static  void main(String[] args) {
        System.out.print("Intruzca el numero de elementos del arreglo: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        int[] a = new int[n];
        System.out.println();
        System.out.print("Introduzca una secuencia de numeros separados por espacio: ");
        rellenarArray(sc, a, n);
        sc.close();
        System.out.println();

        System.out.println("Arreglo leido: ");
        printArray(a);
        System.out.println("Suma Iterativa: "+sumar(a));
        System.out.println("Suma Recursiva: "+sumaRecursiva(a,a.length));
    }

    public static void rellenarArray(Scanner s, int[] a, int n){
        for(int i=0;i<n;i++){
            if(s.hasNextInt()){
                a[i]=s.nextInt();
            }
        }
    }
    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
