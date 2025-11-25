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

    String invertirRecursivo(String s, int n){
        StringBuilder sb = new StringBuilder();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.print("Introduzca una cadena: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        System.out.println(invertir(s));
        sc.close();
    }
}
