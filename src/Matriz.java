import java.util.ArrayList;

public class Matriz {
    ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();

    public void agregarCelda(int fila, int columna, String valor) {
        Celda celda = new Celda(fila, columna, valor);
        matrizCuadrada.add(celda);
    }

    public void mostrarMatriz() {
        for (Celda celda : matrizCuadrada) {
            System.out.println("Fila: " + celda.fila + ", Columna: " + celda.columna + ", Valor: " + celda.valor);
        }
    }

    public String obtenerValor(int fila, int columna) {
        for (Celda celda : matrizCuadrada) {
            if (celda.fila == fila && celda.columna == columna) {
                return celda.valor;
            }
        }
        return "La fila y columna indicada no ha sido asignada";
    }
}