Repositorio con 3 ejercicios en java sobre transformación entre enfoques iterativo y recursivo: suma de un arreglo, máximo de un arreglo e invertir una cadena.
Compilar:
javac Ejercicio1.java Ejercicio2.java Ejercicio3.java

Ejecutar
java Ejercicio1
java Ejercicio2
java Ejercicio3

Ejercicio 1: Suma de un arreglo

Se parte de la función iterativa sumar(int[] a) que suma todos los elementos. Se implementó sumaRecursiva(int[] a, int n), La cual es la siguiente:
static int sumaRecursiva(int[] a, int n){
        if(n==0)
            return 0;
        return sumaRecursiva(a,n-1)+a[n-1];
}
El caso base ocurre cuando n es igual a uno.
El caso recursivo ocurre en el return en donde se llama nuevamente a la funcion con el arreglo y n-1.
La progresion hacia el caso base se da aqui, y es que en cada llamada de sumaRecursiva, n se va acercando a 0.

La recurrencia de este algoritmo es de T(n).

Comparacion de versiones iterativa y recursiva:
- Complejidad temporal: ambas son O(n).
- Complejidad espacial: La iterativa es O(1) mientras que la recursiva es O(n) debido al uso de la pila.

Al ejecutar el programa se le solicitara al usuario ingresar el tamaño de un arreglo e ingresar el arreglo, y luego muestra el resultado de la suma usando ambas funciones.

Ejemplo para la entrada y salida:
- Entrada:
5
1 2 3 4 5

- Salida:
Arreglo leido:
1 2 3 4 5
Suma Iterativa: 15
Suma Recursiva: 15

Ejercicio 2: Maximo dentro de un arreglo
Dado el algoritmo recursivo basado en divide y vencerás maximo(a, i, j), se implementó la versión iterativa maximoIterativo(int[] a).

Complejidad de la solución recursiva:
Recurrencia: T(n)
Espacial: O(log n)

Complejidad de la solución iterativa:
Temporal: O(n)
Espacial: O(1)

El enfoque divide y vencerás es natural recursivamente porque descompone el problema en subproblemas idénticos y combina soluciones (estructura de árbol).
Pasar de O(log n) a O(1) mejora el uso de la memoria, pero no reduce el tiempo que tarda en correr.

Uso:
Ejercicio2 genera un arreglo aleatorio de n=5 valores, compara ambas funciones y muestra el máximo.

Ejemplo de una salida esperada:
Arreglo generado aleatoriamente
34 7 89 12 56 
El valor maximo en ambas funciones es el mismo
Maximo recursivo: 89
Maximo iterativo: 89

Ejercicio 3
Versión iterativa proporcionada usa StringBuilder para construir la cadena invertida. Se implementó invertirRecursivo(String s, int n) de la siguiente manera:

static String invertirRecursivo(String s, int n){
    if(n == 0) return s.charAt(0) + ""; // caso base
    String last = s.charAt(n) + "";
    return last + invertirRecursivo(s, n-1); // caso recursivo
}

El caso base ocurre si n es igual a cero, es decir, cuando es el primer caracter de la cadena. retornando este mismo.
El caso recursivo ocurre al concatenar s.charAt(n) delante del resultado recursivo.
La progrsion hacia el caso base se da al reducir n en cada llamada.

Complejidad:

Iterativa:
Temporal: O(n)
Espacial: O(n)

Recursiva:
Temporal: O(n^2)
Espacial: O(n)

El programa le solicita al usuario que ingrese una cadena, retornando la cadena invertida aplicando ambas soluciones. 

Ejemplo de una entrada y salida esperada:
Entrada:
hola mundo

Output:
Cadena Invertida de forma recursiva:
odnum aloh
Cadena Invertida de forma iterativa:
odnum aloh
