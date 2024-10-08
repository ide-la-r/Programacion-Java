
package Cadenas;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class mapas {

    public static void main(String[] args) {
        HashMap<String, Integer> mappy = new HashMap<>();
        Set <String> clavesitas = null;// esto lo hacemos para meter las claves porque las claves te lo devuelven en un conjunto
        Collection<Integer> valores = null;//y esto para los valoresm siempre se meten en estas dos cosas.
        
        mappy.put("Aurora",3);
        mappy.put("Anni",34);
        mappy.put("Paula",27);
        mappy.put("Nuria",15);
        
        Integer valor = mappy.get("Paula");// esto coge el cajon donde tenga la key Paula, si lo pones minuscula sale null
        
        System.out.println(mappy.size());//esto lo que devuelve es un entero para ver los cajones que tiene
        System.out.println(mappy);//sacas el mapa por pantalla, no esta ordenado
        
        System.out.println(mappy.containsKey("Ismael"));// esto lo que hace que te devuelve si ese valor esta dentro del mapa, devuelve el booleano
        System.out.println(mappy.containsValue(3));// esto te devuelve si ese elemento existe o no, independientemente de las veces que salga.
        
        valor = mappy.remove("Aurora");// esto lo que hace es, que quita a aurora de la lista y nos devuelve su valor anttes de ser eliminado
        System.out.println(valor);
        mappy.remove("Nuria",15); // esto lo que hace es que borra el valor de el mapa pero solo si nuria tiene el valor 15 si tiene otro no.
        
        //.clear() lo mismo de siempre
        //.isEmpty() lo mismo de siempre
        
        //mappy.keySet();  esto lo que hace es darme todas las claves
        
        clavesitas = mappy.keySet();// siempre va a set para las claves
        System.out.println(clavesitas);
        
        valores = mappy.values();// y siempre van a ser collection para los valores
        System.out.println(valores);
        
        for (String elem : clavesitas) {// asi recorre las claves y las saca por pantalla, tiene que ser string porque las claves enn este caso son String
            System.out.println(elem);
        }
        
        for (HashMap.Entry<String,Integer> elem : mappy.entrySet()) {// aqui como el elemento es mapa se pone el mapa y los tipos que hay dentro del mapa, y el mappy.entrySet() lo que hace es para entrar en cada una de las tuplas
            System.out.println(elem);// si pones elem.getkey saca solo las claves y con los valores igual
        }
        
        
    }
    
}
