import java.util.ArrayList;
import java.util.Arrays;

public class Control{

    public static boolean problema1(String palabra){
        char[] arreglo1 = palabra.toCharArray();
        int longitud = arreglo1.length; 
        for(int n = 0; n < arreglo1.length; n++){
            if(arreglo1[n] != arreglo1[arreglo1.length]){
                return false;    
            }
            longitud--; 
        }
        return true;
    }
    
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
    
    
     public static void problema3(int[] arreglo){
     /*   for(int x = 0; x < arreglo.length; x++){
            int[] arregloUno = new int[arreglo.length];
            return Arrays.sort(arregloUno);
        }
     */
     }
    
    public static boolean problema4(int[] arreglo, int buscando){
        return true;
    }
    
    public static boolean problema5(int n){
        if (n == 1) return false;
        if (n == 2) return true;
        for (int i = 2; i < n; i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    
    public static int[] problema6(int n){
        ArrayList<Integer> primos = new ArrayList<>();
        for(int i=2; i < n; i++){
            if(problema5(i)){
                primos.add(i);
            }
        }
         return convierte(primos);
    }

    public static int[] convierte(ArrayList<Integer> lista){
        int[] arreglo = new int[lista.size()];
        for(int l = 0; l < lista.size(); l++){
            arreglo[l] = lista.get(l);
        } 
        return arreglo;
    }
    


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