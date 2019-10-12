import java.util.ArrayList;
import java.util.Arrays;

/**
 * Práctica 05. Variables de control, arreglos y algoritmos.
 * Objetivo: mejorar el manejo de las variables de control.
 * Desarrollo: resolver problemas simples completando el método. 
 *  @autor Andrea
 **/

public class Control{

    /**
     * Problema 1. Identifica si una palabra es palíndromo, 
     * por ejemplo “reconocer” es un palíndromo y  agua no lo es.
     * @param palabra -- Palabra que se recibe del usuario.
     * @return true- La palabra es palíndromo.
     * @return false -- La palabra no es palíndromo.
     */

    public static boolean problema1(String palabra){
        char[] arreglo1 = palabra.toCharArray();
        int longitud = arreglo1.length-1; 
        for(int n = 0; n < longitud; n++){
            if(arreglo1[n] != arreglo1[longitud]){
                return false;    
            }
            for(int m = longitud; longitud >= n; longitud--){
                return true;
            }
        }
        return true;
    }
    
    /**
     * Problema 2. Dado un arreglo A y un número K, 
     * determinar si hay 2 números en el arreglo que sumen K.
     * Por ejemplo [10, 15, 3, 7] y K = 17, regresa true porque 10 + 7 es 17.
     * @param arreglo -- Arreglo de números enteros que proporciona el usuario.
     * @param k -- Número entero a rectificar.
     * @return true -- El número entero a rectificar es suma de dos de los 
     *                 números enteros pertenecientes al arreglo.
     * @return false -- El npumero entero a rectificar no es suma de dos de los
     *                  números enteros pertenecientes al arreglo.
     */

    public static boolean problema2(int[] arreglo, int k){
        for(int a = 0; a < arreglo.length; a++){
            for(int fin = arreglo.length-1; fin >= a; fin--){
               if(arreglo[a] + arreglo[fin] == k){
                    return true;
               }
            }
        }
        return false;
    }
   
    /**
     * Problema 3. Dado un arreglo A, retornar el mismo arreglo pero ordenado.
     * @param arreglo -- Arreglo de enteros dado por el usuario.
     */

    public static void problema3(int[] arreglo){
        int [] arregloUno = new int[arreglo.length];
        Arrays.sort(arregloUno);
        for(int i = 0; i < arregloUno.length; i++){
            System.out.println(arregloUno[i]);
        } 
    }

    /**
     * Problema 4. Dado un arreglo ordenado A, busca un número K.
     * @param arreglo -- Arreglo ordenado que proporciona el usuario.
     * @param buscando -- Número entero que se busca dentro del arreglo ordenado.
     * @return true -- El número entero sí está en el arreglo ordenado.
     * @return false -- EL número entero no está en el arreglo ordenado.
     */

    public static boolean problema4(int[] arreglo, int buscando){
        int k = buscando;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] != k) return false;
        }
        return true;
    }

    /**
     * Problema 5. Saber si un número K es primo.
     * Por ejemplo 17 regresa true, porque es primo. 
     * @param n -- Número entero dado por el usuario para verificar si es primo.
     * @return true -- El número entero es primo.
     * @return false -- El número entero no es primo.
     */
    
    public static boolean problema5(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }

    /** 
     * Problema 6. Regresa todos los números primos menores a N. 
     * Por ejemplo si N es 18 los números primos menores son 2, 3, 5, 7, 11, 13, 17.
     * @param n -- Número entero dado por el usuario, del cual se van a
     *             regresar los números primos que le anteceden.
     * @return primos -- Arreglo compuesto por los números primos que anteceden 
     *                   al número entero dado.
    **/
    
    public static int[] problema6(int n){
        ArrayList<Integer> primos = new ArrayList<>();
        for(int i=2; i < n; i++){
            if(problema5(i)){
                primos.add(i);
            }
        }
        return convierte(primos);
    }

    /**
     * Método complemento problema6.
     * Convierte una lista en un arreglo.
     * @param lista -- Lista dada.
     * @return arreglo -- Regresa el arreglo que contiene los elementos de la lista anterior.
     */

    public static int[] convierte(ArrayList<Integer> lista){
        int[] arreglo = new int[lista.size()];
        for(int l = 0; l < lista.size(); l++){
            arreglo[l] = lista.get(l);
        } 
        return arreglo;
    }
    
    /**
     * Pruebas que ayudan a comprobar si la solución a los problemas anteriores
     * es correcta.
     * @param args -- Cadena de arreglos.
     */
    public static void main(String[] args) {
        String resultado = "";
        int[] desordenado = {9,8,7,6,5,4,3,2,1};
        int[] ordenado    = {1,2,3,4,5,6,7,8,9};
        int[] primos10 = {2,3,5,7};
        if(problema1("oso")==true && problema1("palabra")==false)resultado+="P1 bien\n";else resultado+="P1 mal\n";
        if(problema2(desordenado, 17)==true) resultado+="P2 bien\n";else resultado+="P2 mal\n";
        problema3(desordenado);
        if(Arrays.equals(desordenado,ordenado) == true)resultado+="P3 bien\n";else resultado+="P3 mal\n";
        if(problema4(desordenado,2)== true && problema4(desordenado,18)== false)resultado+="P4 bien\n";else resultado+="P4 mal\n";
        if(problema5(7)==true && problema5(6)==false)resultado+="P5 bien\n";else resultado+="P5 mal\n";
        if(Arrays.equals(problema6(10), primos10) == true)resultado+="P6 bien\n";else resultado+="P6 mal\n";
        System.out.println(resultado);   
    }
}