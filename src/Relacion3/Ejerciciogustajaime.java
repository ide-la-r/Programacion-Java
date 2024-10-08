
package Relacion3;

public class Ejerciciogustajaime {

    public static void main(String[] args) {
        int num= 0;
        int num2 = 1;
        
        for (int i = 1; i <=5; i++) {
            if (i!=5) {
                System.out.print(num+", ");
                System.out.print(num2+", ");
                num+=num2;
                num2+=num;
            }
            else {
                System.out.print(num+", ");
                System.out.print(num2);
            }
        }
    }
    
}
