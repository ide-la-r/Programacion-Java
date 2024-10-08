package Relacion7;

public class Cielo {

    private int filas;
    private int columnas;
    private Estrella cielo[][];

    public Cielo(int filas, int columnas) {
        this.filas = filas;
        this.columnas = columnas;
        this.cielo = new Estrella[filas][columnas];
        crearCieloVacio();
    }

    private void crearCieloVacio() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                cielo[i][j] = null;
            }
        }
    }

    public void ponerEstrellas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            int x = (int) (Math.random() * filas); // en vez de filas si la quitamos esta propiedad porque no lo ha pedido seria: this.cielo.length para filas
            int y = (int) (Math.random() * columnas);// this.cielo[0].length te dice las columnas

            while (cielo[x][y] != null) {
                x = (int) (Math.random() * filas);
                y = (int) (Math.random() * columnas);
            }

            cielo[x][y] = new Estrella(x, y);
        }
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (cielo[i][j] != null) {
                    res += cielo[i][j];
                } else {
                    res += ' ';
                }
            }
            res += '\n';
        }
        return res;
    }
}
