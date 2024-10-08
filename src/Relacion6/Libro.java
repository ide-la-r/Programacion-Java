package Relacion6;

public class Libro {
    private int ISBM;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    public Libro(int ISBM, String titulo, String autor, int numeroPaginas){
        this.ISBM = ISBM;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    public int getISBM(){
        return this.ISBM;
    }
    
    public void setISBM(int nuevo){
        this.ISBM = nuevo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setTitulo(String nuevo){
        this.titulo = nuevo;
    }
    
    public String getAutor(){
        return this.autor;
    }
    
    public void setAutor(String nuevo){
        this.autor = nuevo;
    }
    
    public int getnumeroPaginas(){
        return this.numeroPaginas;
    }
    
    public void setnumeroPaginas(int nuevo){
        this.numeroPaginas = nuevo;
    }
    
    @Override
    public String toString(){
        String res ="";
        res += "El libro " + this.titulo + " con " + this.ISBM + " creado por " + this.autor + " tiene " + this.numeroPaginas;
        return res;
    }
    
}
