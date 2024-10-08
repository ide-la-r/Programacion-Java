package Relacion6;

public class Pelotas {
    int radio;
    int dureza;
    
    public Pelotas(int radio, int dureza) {
        this.radio = radio;
        this.dureza = dureza;
        
        if (radio < 10 || radio > 63) {
            System.out.println("Error has introducido un valor de radio que no esta entre 10 y 63");
        }
        
        if (dureza < 1 || dureza > 7) {
            System.out.println("Error has introducido una dureza inferior a 1 o superior a 7");
        }
    }
    
    @Override
    public String toString(){
     String res = "";
     res = "El radio de la pelota es: " + this.radio + "\n";
     res += "La dureza de la pelota es: " + this.dureza + "\n";
     return res;
    }
}

