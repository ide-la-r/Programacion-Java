
package Excepciones;

public class Impar {
    int numero = 0;
    public Impar(int numero)throws IllegalArgumentException{
        if (numero%2 == 0) {
            throw new IllegalArgumentException("El numero es par!");
        }
        this.numero = numero;//no hace falta poner el else porque si se para arriba no hace falta se para el programa.
    }
    
    @Override
    public String toString(){
        String res = "";
        if (numero == 0) {
            res += "No hay ningun valor asignado porque has introducido un numero que no esta admitido.";
        }
        else{
            res += "El numero que hay en la variable numero es: " + numero;
        }
        return res;
    }
}
