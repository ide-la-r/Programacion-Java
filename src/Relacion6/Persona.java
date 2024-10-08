//Ejercicio 73
package Relacion6;

public class Persona {
    String nombre;
    int edad;
    char sexo;
    String pais;
    //Si es mayor es true.

    public Persona(String nombre, int edad, char sexo, String pais, boolean mayor){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.pais = pais;
    }
    
    public String saludar(){
        return "Hola me llamo " + this.nombre + " y soy de " + this.pais;
    }
    
    //Apartado b con sobrecarga, se pone el return fuera y tienes que crear una variable para poder sacar luego el res fuera.
    public String saludar(int opcion){
        String res = "";
        switch(opcion){
            case 1: res = "Hola me llamo " + this.nombre + " y soy de " + this.pais;
            break;
            case 2: res =  "Saludo 2 ";
            break;
            case 3: res = "Saludo 3 ";
            break;
        }
        return res;
    }
    
    public void mostrarDatos(){
        System.out.println("Tu nombre es: " + this.nombre);
        System.out.println("Tu edad es: " + this.edad);
        System.out.println("Eres: " + this.sexo);
        System.out.println("Eres del pais: " + this.pais);
    }
    
    //Esto lo que hace es el candidato, y devuelve solo si es true o false, que es lo unico que pide el ejercicio.
    public boolean EsMayorEdad(){
        boolean mayor = true;
        if (this.edad < 18) {
            mayor = false;
        }
        return mayor;
    }
    
    public String ToString(){
        String res ="";
        res += "Tu nombre es: " + this.nombre;
        res += "Tu edad es: " + this.edad;
        res += "Eres: " + this.sexo;
        res += "Eres del pais: " + this.pais;
        return res;
    }
    
}
