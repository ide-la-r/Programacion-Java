
package Colecciones;

import java.util.ArrayList;

public class colaDeSupermercado {
    private ArrayList<Persona> cola;
    
    public colaDeSupermercado(){
        this.cola = new ArrayList<>();
    }
    
    public boolean EstaVacia(){
        return cola.isEmpty();//devuelve un booleano que dice si esta vacio o no.
    }
    
    public void Entrar(Persona p){
        cola.add(p);
    }
    
    public void Salir(){
        if (EstaVacia()) {
            System.out.println("No hay nada para sacar");
        }else{
            System.out.println(cola.get(0));
            cola.remove(0);
        }
    }
    
    public Persona Primero(){
        if (EstaVacia()) {
            return null;
        }else{
            return cola.get(0);
        }
    }
    
    public int Cantidad(){
        return cola.size();
    }
    
}
