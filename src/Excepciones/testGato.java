
package Excepciones;

public class testGato {

    public static void main(String[] args) {
        boolean salir = true;
        Gato gatito = null;
        try {
            gatito = new Gato("katy", 3);
            if (gatito.getNombre().length() < 3|| gatito.getEdad() < 0) {
                salir = false;
            }
            if (!salir) {
                throw new  Exception();
            }
            System.out.println(gatito);
        } catch (Exception e) {
            System.out.println("has introducido un nombre que tiene menos de 3 caracteres o la edad es inferior a 0");
        }
        
    }
    
}
/*hola tonto te amo mucho*/