import java.util.Scanner;

public class Ejercicio3 {
    //Se proporciona el siguiente algoritmo iterativo
    static String invertir(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    //Tareas
    /*
    * 1. Convertir este algoritmo en una version completamente recursiva, utilizando
    * unicamente operaciones basicas sobre cadenas
    * 2. Identificar:
    *   a) caso base
        b) caso recursivo
        c) Como se reduce el problema en cada llamada
    * 3. Analizar la complejidad temporal de:
    *   a. version iterativa
    *   b. version recursiva basica
    * 4. Implementar un programa que:
    *   a. Solicite al usuario una cadena
    *   b. muestre la cadena invertida usando ambos enfoques
    * */
    /*
    String invertir(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }*/

    //Version recursiva para invertir la cadena
    static String invertirRecursivo(String s, int n){
        if(n == 0){//Caso base
            return s.charAt(0)+"";
        }
        String last = s.charAt(n)+"";
        return last+invertirRecursivo(s,n-1); //Caso recursivo
    }

    //Programa que solicita una cadena al usuario
    public static void main(String[] args) {
        System.out.print("Introduzca una cadena: ");
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        System.out.println(cadena);
        //Se muestra la cadena invertida usando ambos enfoques
        System.out.println("Cadena Invertida de forma recursiva: ");
        System.out.println(invertirRecursivo(cadena,cadena.length()-1));
        System.out.println("Cadena Invertida de forma iterativa: ");
        System.out.println(invertir(cadena));
        sc.close();
    }
}
