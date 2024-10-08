
package Relacion8;

public class Partitura {
    String nombre;
    String autor;
    private NotaMusical lista[];
    
    public Partitura(String nombre,String autor){
        this.nombre = nombre;
        this.autor = autor;
        this.lista = new NotaMusical[100];
        for (int i = 0; i < this.lista.length; i++) {
            this.lista[i] = null;//Dice jaime que vayamos cogiendo esto que en javascript hara falta hacerlo.
        }
    }
    
    public int nnumNotas(){
        int totalNotas = 0;
        for (int i = 0; i < this.lista.length; i++) {
            if (lista[i] != null) {
                totalNotas++;
            }
        }
        return totalNotas;
    }
    
    public boolean addNotas(NotaMusical nueva){//Aqui podriamos hacer un constructor de copia oorque se puede liar, pero como nueva se termina al terminar el metodo no pasa nada.
        int i = 0;
        boolean exito = false;
        while ((i < this.lista.length) && (!exito)) {//Aqui lo que hacemos es para no hacerlo feo le ponemos lo de exito y asi se controla a la perfeccion que sale si es = a true         
            if (this.lista[i] == null) {
                this.lista[i] = nueva;
                exito = true;
            }
            i++;
        }
        return exito;
    }
    
    public NotaMusical[] getPartitura(){//Esto es para tener la lista en piano porque es privada
        return this.lista;
    }
    
    @Override
    public String toString(){
        String res = this.nombre + " de " + this.autor; //Aqui scamos el nombre y el autor
        for (int i = 0; i < this.lista.length; i++) {//hacemos el bucle hasta el ultimo de la lista
            if (i %10 == 0) {//aqui decimos que si el numero del array se divide entre 10 y da 0 se da un salto de linea porque dice que cada 10 hays uno
                res += "\n";
            }
            if (this.lista[i] != null) {//y aqui decimos que si lista de i es diferente a null pues sacamos la nota.
                res += this.lista[i].toString() + "";
            }
        }
        return res;
    }
}
