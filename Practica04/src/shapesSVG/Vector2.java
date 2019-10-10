package shapesSVG;

/**
 * Programa que da el dibujo de un Vector.
 * @autor Andrea Rojas. 
 */
public class Vector2{
    /**
     * Atributos de la clase Vector2.
     */
    private double x;
    private double y;
    private double magnitud;

    

    /**
     * Constructor que recibe dos variables.
     * @param x Primer coordenada.
     * @param y Segunda coordenada.
     */
    public Vector2(double x, double y){
        this.x = x;
        this.y = y;
    }



    /**
     *Constructor que da un Vector.
     *@param x Primer coordenada.
     *@param y Segunda coordenada.
     */
    public Vector2(){
        this.x = 0.0;
        this.y = 0.0;
    }



    /**
     * Método que obtiene la distancia entre el Vector2 y el otroVector.
     * @param diferenciaX Diferencia de x del Vector2 y otroVector.
     * @param diferenciaY Diferencia de y del Vector2 y otroVector.
     * @param cuadradoX Cuadrado de la diferencia de x del Vector y otroVector.
     * @param cuadradoY Cuadrado de la diferencia de y del Vector y otroVector.
     * @param raiz Raíz de la diferencia de x y y del Vector y otroVector, al cuadrado.
     * @return raiz Valor de la distancia.
     */
     public double distancia(Vector2 otroVector2){
        double diferenciaX = (otroVector2.x - this.x);
        double diferenciaY = (otroVector2.y -  this.y);
        double cuadradoX = Math.pow(diferenciaX, 2);
        double cuadradoY = Math.pow(diferenciaY, 2);
        double raiz = Math.sqrt(cuadradoX + cuadradoY);
        return raiz;
     }
     


    /**
     * Método que dibuja un Vector2.
     * @param aux Características de el Vector2.
     * @return aux Regresa el dibujo de un Vector2.
     */
    public String toSVG(){
        String aux = new String("<circle cx=´5´" + this.x + "cy=´5´" + this.y + "r=´2.5´" + "stroke=´purple´" + "stroke-width=´5´" + "fill=´pink´/>");
        return aux;
    }



    /**
     *Metodo que recibe dos variables y regresa una cadena.
     * @param x Primer coordenada.
     * @param y Segunda coordenada.
     * @return a Da una cadena.
     */
    public String toString (double x, double y){
        String a = "El vector 2 tiene dos valores, uno en x que vale: " + this.x + "y otro en y que vale: " + this.y;
        return a;
    }



    /**
     *Método que compara dos vectores para ver si son iguales.
     *@return true Si los dos vectores son iguales.
     *@return false Si no son iguales los dos vectores.
     */
     @Override //NO COMPILA
     public boolean equals(Vector2 otroVector2){
        if (otroVector2 instanceof Vector2){
            Vector2 v = (Vector2) otroVector2; //DUDA
            if (otroVector2.x == this.x && otroVector2.y == this.y){
                return true;
                this.equals("hola"); //DUDA
            }else return false;
        }else return ("El objeto dado no pertenece a la clase Vector2");
     }     
}