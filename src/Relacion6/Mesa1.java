
package Relacion6;

public class Mesa1 {
    
    //Atributos de clase
    int nºpatas;
    double altura;
    double anchura;
    double largo;
    String material;
    boolean nueva;//true es que es nuevo y false que no.
    
    public Mesa1(boolean nueva, String material, double largo, double anchura, double altura, int nºpatas){
    this.nueva = nueva;
    this.material = material;
    this.largo = largo;
    this.anchura = anchura;
    this.altura = altura;
    this.nºpatas = nºpatas;
    
        if (!(this.material.equalsIgnoreCase("metal") || this.material.equalsIgnoreCase("plastico"))) {
            this.material = "madera";
        }
}
}
