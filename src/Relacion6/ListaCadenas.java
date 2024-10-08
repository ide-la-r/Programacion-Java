
package Relacion6;

public class ListaCadenas {
    private String lista[];
    private int posVacia;
    
    public ListaCadenas(int tamaño){
        this.lista = new String [tamaño];
        this.posVacia = 0;
        
        //Inicializo el array lista y lo lleno de huecos.
        for (int i = 0; i < tamaño; i++) {
            this.lista[i]="";
        }
    }
    //Aqui lo que hago es pasar lo que quiero meter en esa posicion, y comprobar que pos vacia sea diferente a -1.
    public void anidir(String tu){
        if (this.posVacia != -1) {
            this.lista[this.posVacia] = tu;
            this.actualizarPos();
        }
    }
    //Esto lo que hace es decir cual es la primera posicion que esta vacia en la lista.
    public void actualizarPos(){
        //Busco hueco vacio
        boolean encontrado = false;
        int i = 0;
        while (i < this.lista.length && !encontrado) {            
            if (this.lista[i].equals("")) {
                this.posVacia = i;
                encontrado = true;
            }
            i++;
        }
        if (!encontrado) {
            this.posVacia = -1;
        }
    }
    
    public void aniadir(String elemento, int pos){
        if (pos >= 0 && pos < this.lista.length) {
            this.lista[pos] = elemento;
            this.actualizarPos();
        }
        else{
            System.out.println("Error la posicion indicada no es una posicion indicada");
        }
    }
}