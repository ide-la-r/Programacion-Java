
package Relacion8;

public abstract class Instrumento {
    private String marca;
    private String fechaF;
    boolean tocando;
    boolean roto;
    
    Partitura partitura;
    
    public Instrumento(String marca, String fechaF, Partitura partitura){
        this.marca = marca;
        this.fechaF = fechaF;
        this.partitura = partitura;
        this.tocando = false;//no esta tocando
        this.roto = false;// no esta roto
    }
    
    public Instrumento(String marca, String fechaF){
        this.marca = marca;
        this.fechaF = fechaF;
        this.tocando = false;
        this.partitura = new Partitura("desconocido", "desconocido");//inicializamos la partitura y le ponemos los nombres desconocidos
        //Creamos la partitura
        int aleaNotas = (int) (Math.random() *91+10);//Hacemos el valor aleatorio.
        for (int i = 0; i < aleaNotas; i++) {//hacemos un for hasta el valor que nos da el math.random de antes
            this.aniadirNotas();
        }
        this.roto = false;
    }
    
    public boolean aniadirNotas(){
        String valores[] = {"do","re","mi","fa","sol","la","si"};//Hacemos el array con las partituras de esta manera asi es mas corto
        int aleaValor = (int) (Math.random()*7);
        int aleaDur = (int) (Math.random()*5+1);//hacemos los dos math.random que nos dice el ejercicio
        return this.partitura.addNotas(new NotaMusical (valores[aleaValor], aleaDur));// y aqui a la partitura añadimos las notas
    }
    
    public abstract String tocarPartitura();//es abstracto porwue como eres un instrumento no puede tocarse el.
    
    public void pararTocar(){
        if (this.tocando) {
            this.tocando = false;
        }
    }
}
