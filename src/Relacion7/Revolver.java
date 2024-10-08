
package Relacion7;

public class Revolver {
    private String marca;
    private String modelo;
    private int tamañoTambor;
    private balas tambor[];
    private int posicionMartillo;
    
    public Revolver(String marca, String modelo, int tamañoTambor){
        this.marca = marca;
        this.modelo = modelo;
        this.tamañoTambor = tamañoTambor;
        this.tambor = new balas[tamañoTambor];
        this.posicionMartillo = 0;
        llenarTambor();
    }
    
    private void llenarTambor(){
        int calibreAleatorio ;
        int longitudAleatoria;
        for (int i = 0; i < this.tambor.length; i++) {
            calibreAleatorio = (int) (Math.random()* (20-5+1)+5);
            longitudAleatoria = (int) (Math.random()* (70-20+1)+20);
            this.tambor[i] = new balas(calibreAleatorio, longitudAleatoria);
        }
    }
    
    public String disparar(){
        if (tambor[this.posicionMartillo] != null) {
            balas balaDisparada = tambor[this.posicionMartillo];
            tambor[this.posicionMartillo] = null;
            moverTambor();
            return balaDisparada.toString();
        }
        else{
            moverTambor();
            return "No hay bala en este hueco";
        }
    }
    
    private void moverTambor(){
        this.posicionMartillo = (this.posicionMartillo + 1) % this.tamañoTambor;
    }
    
    @Override
    public String toString(){
        String res = "";
        res += "La marca de este revolver es: " + this.marca + " el modelo: " + this.modelo + " el tamaño del tambor es: " + this.tamañoTambor + "\n";
        for (int i = 0; i < this.tambor.length; i++) {
            if (this.tambor[i] != null) {
                res += "En el hueco " + i + ": " + this.tambor[i].toString() + "\n";
            }
            else{
                res += "No hay ninguna vala en el hueco " + i + "\n";
            }
        }
        return res;
    }
    
    public class balas {
        private int calibre;
        private int longitud;
        
        public balas(int calibre, int longitud){
            this.calibre = calibre;
            this.longitud = longitud;
        }
        
        public balas(){
            this.calibre = 9;
            this.longitud = 40;
        }
        
        @Override
        public String toString(){
            String res = "";
            res += "Bala de calibre " + this.calibre + "mm y longitud " + this.longitud + "mm";
            return res;
        }
    }
}
