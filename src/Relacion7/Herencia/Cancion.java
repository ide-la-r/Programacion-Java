
package Relacion7.Herencia;

public class Cancion extends Multimedia{
    private String artista;
    private String editor;
    private String genero;
    
    public Cancion(String titulo, String formato, double duracion, String artista, String editor, String genero){
        super(titulo, formato, duracion);
        this.artista = artista;
        this.editor = editor;
        if (genero.equals("pop") ||genero.equals("rock") ||genero.equals("flamenco") ||genero.equals("hiphop") ||genero.equals("R&B") ||genero.equals("reggaeton") ||formato.equals("flv")) {
            this.genero = genero;
        }
        else{
            this.genero = "rock";
        }
    }

    public String getArtista(){
        return artista;
    }

    public String getEditor(){
        return editor;
    }

    public String getGenero(){
        return genero;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += super.toString();
        res += ", su artista es " + this.artista + ", su editor " + this.editor + "y su genero es: " + this.genero;
        return res;
    }
    
}