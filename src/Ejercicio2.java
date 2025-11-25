import java.util.Scanner;

public class Ejercicio2 {
    //Se proporciona el siguiente algoritmo recursivo basado en divide y venceras:
    static int maximo(int[] a, int i, int j){
        if(i==j)
            return a[i];

        int mid =(i+j)/2;
        int left = maximo(a,i,mid);
        int right = maximo(a,mid+1,j);

        return Math.max(left,right);
    }

    //Tareas:
    /*
    * #1 Reescribir este algoritmo en una version totalmente iterativa, sin utilizar recursion.
    * #2 Se permite simular la pila manualmente solo si el estudiante lo justifica teóricamete
    * #3 Demostrar por escrito:
    *   a. Por qué el enfoque divide y venceras es mas natural de forma recursiva
    *   b. Qué sucede con la complejidad espacial al pasar de O(log n) a O(1)
    * #4 Implementar un programa que:
    *   a. Genere un arreglo de N elementos aleatorios
    *   b. Compare el resultado de ambas versiones (recursiva e iterativa)
    *   c. Muestre el valor máximo encontrado
    * */

    //Version iterativa para obtener el maximo de un arreglo
    static int maximoIterativo(int[] a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = randomArray(5);
        int maxR = maximo(a, 0, a.length-1);
        int maxI = maximoIterativo(a);

        System.out.println("Arreglo generado aleatoriamente");
        printArray(a);
        if(maxR==maxI){
            System.out.println("El valor maximo en ambas funciones es el mismo");
        } else {
            System.out.println("El valor maximo en ambas funciones es distinto");
        }
        System.out.println("Maximo recursivo: " + maxR);
        System.out.println("Maximo iterativo: " + maxI);
    }

    //Funcion que genera un arreglo aleatorio de n valores
    public static int[] randomArray(int n){
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=(int)(Math.random()*100);
        }
        return a;
    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
