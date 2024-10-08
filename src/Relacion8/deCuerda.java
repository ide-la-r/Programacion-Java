
package Relacion8;

public abstract class deCuerda extends Instrumento{
    int nCuerdas;
    boolean tipo; //true pulsada y false percutida
    
    public deCuerda(String marca, String fechaF, Partitura partitura, int num, boolean tipo){
        super(marca, fechaF, partitura);
        this.nCuerdas = num;
        this.tipo = tipo;
    }
    
    public deCuerda(String marca, String fechaF, int num, boolean tipo){
        super(marca, fechaF);
        this.nCuerdas = num;
        this.tipo = tipo;
    }
    
    //public abstract String tocarPartitura();
    //public abstract void afinar();
}


//Los de viento uy madera son lo mismo solo que habria que poner boolean para lo de maquetas etc.