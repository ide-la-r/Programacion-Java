
package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio125 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        boolean salir = false;
        System.out.println("Elige una de estas opcciones: ");
        System.out.println("1. Agregar");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("4. Modificar");
        System.out.println("5. Insertar en posición");
        System.out.println("6. Mostrar");
        System.out.println("7. Salir");
        
        int opcion;
        while (!salir) {
            System.out.print("Ingrese una opción: "); 
            opcion = teclado.nextInt();       
            switch (opcion) {
                case 1:
                    System.out.println("Introduce un numero en el ArrayList: ");
                    lista.add(teclado.nextInt());
                    System.out.println("Se ha agregado el numero correctamente.");
                    break;
                case 2:
                    System.out.println("Introduce el numero que desees buscar: ");
                    int buscar = teclado.nextInt();
                    if (lista.contains(buscar)) {
                        System.out.println("Se ha encontrado el numero "+buscar+" en la lista.");
                    } else{
                        System.out.println("No se ha encontrado el numero "+buscar+" en la lista.");
                    }
                    break;
                case 3:
                    System.out.println("Indica el numero que desees eliminar de la lista.");
                    int eliminar = teclado.nextInt();
                    if (lista.contains(eliminar)) {
                        lista.remove(Integer.valueOf(eliminar));//buscar que hace 
                        System.out.println("El numero "+eliminar+" ha sido eliminado");
                    } else{
                        System.out.println("El numero "+eliminar+ " no se encuentra dentro de la lista");
                    }
                    break;
                case 4:
                    System.out.println("Introduce un numero que desees modificar por otro: ");
                    int modificar = teclado.nextInt();
                    int nuevo;
                    if (lista.contains(modificar)) {
                        System.out.println("Introduce el nuevo numero: ");
                        nuevo = teclado.nextInt();
                        lista.set(lista.indexOf(modificar), nuevo);//el indexOf lo que hace es coger la primera aparicion de el numero que le dices, tambien esta lastOf que es la ultima
                        System.out.println("El numero "+modificar+" ha sido cambiado por el numero "+nuevo);
                    } else{
                        System.out.println("El numero que deseas cambiar no esta en la lista");
                    }
                    break;
                case 5:
                    System.out.println("Introduce el numero que deseas meter: ");
                    int insertar = teclado.nextInt();
                    System.out.println("Introduce la posicion en la que deseas meter ese numero: ");
                    int posicion = teclado.nextInt();
                    if (lista.size()>=posicion-1 && posicion>0) {
                        lista.add(posicion-1, insertar);//la posicion va primero y el numero despues
                        System.out.println("Numero "+insertar+" introducido en la posicion "+posicion);
                    } else{
                        System.out.println("El numero o la posicion introducidos no son correctas");
                    }
                    break;
                case 6:
                    System.out.println(lista);
                    break;
                case 7:
                    System.out.println("Nos vemos gracias por acceder a mi menu!");
                    salir = true;
                    break;
            }
        }
    }
}
