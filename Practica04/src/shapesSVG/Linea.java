package shapesSVG;

/**
 * Programa que da el dibujo de una Línea.
 * @autor Andrea Rojas. 
 */
public class Linea{
    /**
     * Atributos de la clase Línea.
     */
    private Vector2 a
    private Vector2 b;
    private double longitud;



      /**
     * Constructor que recibe dos Vectores.
     * @param Vector2 a Primer línea.
     * @param Vector2 b Segunda línea.
     */
    public Linea(Vector2 a1, Vector2 b1){
        this.a = a1;
        this.b = b1;
    }



    //FALTA SEGUNDO PUNTO: Linea(x1: Número,y1: Número, x2: Número, y2: Número)



    /**
     *Constructor que da una Línea.
     *@param Vector2 a Primer línea.
     *@param Vector2 b Segunda línea.
     */
    public Linea(){
        this.x = 0.0;
        this.y = 0.0;
    }



      /**
     * Método que dibuja una Línea.
     * @param aux Características de la Línea.
     * @return aux Regresa el dibujo de la Línea.
     */
    public String toSVG(){
        String aux = new String("<circle cx=´5´" + this.x + "cy=´5´" + this.y + "r=´2.5´" + "stroke=´purple´" + "stroke-width=´5´" + "fill=´pink´/>");
        return aux;
    }
