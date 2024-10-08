package Excepciones;

public class Gato {
    private String nombre;
    private int edad;
    private boolean salir = true;
    
    public Gato(String nombre, int edad){
        try {
            if (this.nombre.length() < 3 || this.edad < 0) {
                salir = false;
            }
            if (!salir) {
                throw new Exception();
            }
            this.nombre = nombre;
            this.edad = edad;
        } catch (Exception e) {
            System.out.println("Has introducido algo mal");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString (){
        String res = "";
        res += "El gatito " + this.nombre + " tiene " + this.edad +" años de edad.";
        return res;
    }
    
}
