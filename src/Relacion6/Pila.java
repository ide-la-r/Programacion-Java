
package Relacion6;

public class Pila {
    private int pila [];
    int indice;
    
    public Pila(int tamaño){
        this.pila = new int [tamaño];
        this.indice = -1;
    }
    
    // esto lo que hace es que al indice le suma uno para que sea 0 si no da error, luego se le suma uno para que vaya al siguente cuando vuelvas a meter algo, y despues en elfinal lo igualas al elemento que has introducido.
    public void Insertar(int elemento){
        if (this.indice + 1 < this.pila.length) {
            this.indice++;
            this.pila [this.indice] = elemento;
        }
        else{
            System.out.println("Pila llena,");
        }
    }
    
    //esto lo que hace es devolver el ultimo elemento(numero que hay dentro) de la pila, que es el indice y es un public int y no un get porque devuelve un elemento de una propiedad y no una propiedad.
    public int Cima(){
        return this.pila[this.indice];
    }
    
    // el enunciadomte dice que devuelva el elemento de dentro lo cual lo igualamos a una variable y luego le ponemos que sea 0 para eliminar el elemento de dentro, y luego bajamos una posicion.
    public int Extraer(){
        int tmp = this.pila[this.indice];
        this.pila[this.indice] = 0;
        this.indice--;
        return tmp;
    }
    
    public boolean Vacia(){
        //return this.indice == this.pila.length - 1; Esta es mas correcta
        boolean vacia = true;
        if (this.indice >= 0) {
            vacia = false;
        }
        return vacia;
    }
    
    public boolean Llena(){
        //return this.indice == this.pila.length - 1; Esta esta mas correcta.
        boolean llena = false;
        if (this.indice == this.pila.length - 1) {
            llena = true;
        }
        return llena;
    }
    
    //Esto lo que hace es hacer un for para que se vean todas las cosas del array y pone los valores del for alrreves y de menor a mayor porque te lo dice alrreves
    @Override
    public String toString(){
        String res = "";
        for (int i = this.pila.length; i >= 0; i++) {
            res += this.pila[i] + "\n";
        }
        return res;
    }
}
