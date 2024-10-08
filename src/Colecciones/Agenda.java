
package Colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class Agenda {
    ArrayList<Persona> personas;
    public Agenda(){
        personas = new ArrayList<>();
    }
    
    public void aniadirPersona(Persona p){
        personas.add(p);
        System.out.println("Persona añadida con exito.");
    }
    
    public void borrarPersona(String dni){
        boolean salir = false;
        int i = 0;
        while (!salir) {            
            if (personas.get(i).getDni() == dni) {
                personas.remove(i);
                salir = true;
            }
            i++;
        }
    }
    
    public void buscarPersona(String dni){
        int tam = personas.size();
        for (int i = 0; i < tam; i++) {
            if (personas.get(i).getDni() == dni) {
                System.out.println(personas.get(i));
            } else{
                System.out.println("No se ha encontrado la persona que buscas");
            }
        }
    }
    
    public void mostrarAgenda(){
        for (Persona persona:personas) {
            System.out.println(persona);
        }
    }
    
    public void ordenarAgenda(){
        Collections.sort(personas, (p1,p2) -> p1.getApellido().compareTo(p2.getApellido()));
    }
}
