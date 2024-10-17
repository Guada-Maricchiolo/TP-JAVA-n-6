import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Matriz matriz = new Matriz();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el valor para la celda (FIN para terminar): ");
            String valor = sc.nextLine();

            if (valor.equalsIgnoreCase("FIN")) {
                break;
            }

            System.out.println("Ingrese la posición donde desea almacenar el valor: ");

            System.out.print("Fila: ");
            int fila = sc.nextInt();

            System.out.print("Columna: ");
            int columna = sc.nextInt();

            sc.nextLine();

            matriz.agregarCelda(fila, columna, valor);
        }

        matriz.mostrarMatriz();

        System.out.println("Ingrese la posición para obtener el valor: ");
        System.out.print("Ingrese fila: ");
        int fila = sc.nextInt();

        System.out.print("Ingrese columna: ");
        int columna = sc.nextInt();

        String valor = matriz.obtenerValor(fila, columna);
        System.out.println("Valor: " + valor);
    }
}