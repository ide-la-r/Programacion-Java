
package Colecciones;
import java.util.HashSet;
public class Conjunto {//el tamaño es dinamico, no pueden haber elementos repetidos dentro de los conjuntos, los metodos son los mismos que los del arraylist

    public static void main(String[] args) {
        HashSet<String> bolsa = new HashSet<>();
        bolsa.add("isma");
        bolsa.add("se");
        bolsa.add("SE");
        bolsa.add("Duerme");
        bolsa.add("isma");
        bolsa.add("isma");
        bolsa.removeAll(bolsa);//elimina los elementos de la coleccion que les paso por parametros
        bolsa.retainAll(bolsa);//elimina los que yo no le paso por parametros, se les puede pasar ora lista
        System.out.println(bolsa);//esto sale los elementos sin ordenar porque es un conjuntos
    }
    
}
