public class MatrixTests{
    public static void scalarProduct_test(){
        System.out.println("scalar product failed");
    }
    public static void add_test(){
        System.out.println("addition failed");
    }
    public static void matrixProduct_test(){
        System.out.println("matrix product failed");
    }
    public static void setElement_test(){
        System.out.println("setElement failed");
    }
    public static void getElement_test(){
        System.out.println("Get element failed");
    }
    public static void determinant_test(){
        System.out.println("Determinant failed");
    }
    public static void equals_test(){
        System.out.println("equals failed");
    }

    public static void main(String[] args) {
        scalarProduct_test();
        add_test();
        matrixProduct_test();
        setElement_test();
        getElement_test();
        determinant_test();
        equals_test();
        int arreglo[][] = new int[20][20];
        for(int i = 0; i < arreglo.length; i++){
            for(int j = 0; j < arreglo[0].length; j++){
               arreglo[i][j]= sumando[i][j] + sumando2[i][j];
               arreglo[i][j] = arreglo[i][j]*n;
               
                System.out.println(arreglo[i][j]);
            }
        }System.out.println();
    }
}