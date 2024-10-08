
package Relacion7.Herencia;

public class Multimedia {
    String titulo;
    String formato;
    double duracion;
    
    public Multimedia(String titulo, String formato, double duracion){
        this.titulo = titulo;
        if (formato.equals("mp3") ||formato.equals("wav") ||formato.equals("aac") ||formato.equals("mp4") ||formato.equals("mkv") ||formato.equals("mov") ||formato.equals("flv")) {
            this.formato = formato;
        }
        else{
            this.formato = "mp3";
        }
        this.duracion = duracion;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getFormato(){
        return formato;
    }

    public double getDuracion(){
        return duracion;
    }
    
    public boolean equals(Multimedia igual){
        if ((this.formato.equals(igual.formato))&&(this.duracion == igual.duracion)) {
            return true;//True es que son iguales, y false que no
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "Tiene el titulo " + this.titulo + " el formato " + this.formato + " y de duracion " + this.duracion;
        return res;
    }
    
}