
package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class listasTest {

    public static void main(String[] args) {
        //ArrayList <T> nombre = new ArrayList();
        /*los <> indican que ahi tiene que ir un objeto si o si*/
        ArrayList<Integer> lista = new ArrayList<>();//lista de objetos que representan numeros
        
        System.out.println(lista);
        for (int i = 0; i < 10; i++) {
            lista.add(i);
        }
        System.out.println(lista);
        lista.add(5, 13);//esto mete en la posicion 5 el 13 y el que estaba ahi pasa a ser 6 posicion
        int tam = lista.size();//el size es el .length, a partir de ahora se pone en una variable aparte
        for (int i = 0; i < tam; i++) {
            System.out.println(lista.get(i));//saca lo que hay en la collecion en ese cajon
        }
        
        lista.set(6, 12);
        System.out.println(lista);
        
        lista.remove(11);//esto lo que hace es que te quita la posicion 11
        lista.remove((Integer)11);//esto lo que hace es que elimina los elementos que sean 11
        
        if (lista.isEmpty()) {//esto dice si la lista esta vacia (te devuelve un booleano)
            System.out.println("La lista esta vacia");
        }
        
        if (lista.contains(12)) {// esto dice que si el numero 12 esta en la lista
            System.out.println("El elemento esta en la lista");
        }
        
        System.out.println(lista.indexOf((Integer)13));//esto lo que hace es devolverte la primera posicion del 13
        lista.clear();//BORRA todo de la lista
        
        for(Integer elemento:lista){//esto lo hace automatico, saca el elemento(variable que se puede llamar como sea) de la lista de toda la lista.
            System.out.println(elemento);
        }
        
        //para borrar las cosas de una lista se usan los iteradores
        Iterator<Integer> arnold = lista.iterator();
        //.hasNext me devuelve verdader o falso si hay almenos un elemento dentro de la lista
        
        while(arnold.hasNext()){
            int ele = arnold.next();
            if (ele %2 == 0) {
                arnold.remove();
            }
        }
        
    }
    
}
