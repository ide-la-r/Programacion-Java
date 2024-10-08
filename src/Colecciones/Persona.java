
package Colecciones;

import java.util.Objects;

public class Persona {
    
    private String dni;
    private String nombre;
    private String apellido;
    private boolean sexo;//true es hombre
    private int edad;
    private int peso;
    
    public Persona(String dni, String nombre, String apellido, boolean sexo, int edad, int peso){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
    }
    
    public Persona(String dni){
        this.dni = dni;
        this.nombre = "";
        this.apellido = "";
        this.sexo = true;
        this.edad = 0;
        this.peso = 0;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.dni);
        hash = 11 * hash + Objects.hashCode(this.nombre);
        hash = 11 * hash + Objects.hashCode(this.apellido);
        hash = 11 * hash + (this.sexo ? 1 : 0);
        hash = 11 * hash + this.edad;
        hash = 11 * hash + this.peso;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.sexo != other.sexo) {
            return false;
        }
        if (this.edad != other.edad) {
            return false;
        }
        if (this.peso != other.peso) {
            return false;
        }
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.apellido, other.apellido);
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", sexo=" + sexo + ", edad=" + edad + ", peso=" + peso + '}';
    }
    
    
    
}
