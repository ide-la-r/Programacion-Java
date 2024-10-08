package Excepciones;

public class PiscinaException extends RuntimeException {

    public PiscinaException() {
        super();
    }
    
    public PiscinaException(String msj){
        super(msj);
    }   
}
