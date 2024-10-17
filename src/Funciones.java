import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Funciones {
    static Scanner scanner = new Scanner(System.in);
    public static void ejercicio1(){
        // Punto 1: Crear ArrayList de números ingresados manualmente hasta ingresar uno negativo
        ArrayList<Integer> numeros = new ArrayList<>();
        int numero;
        System.out.println("Punto 1: Ingrese un número: ENTERO (para continuar) / NEGATIVO (para salir)):");
        do {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            if (numero >= 0) {
                numeros.add(numero);
            }
        } while (numero >= 0);
        System.out.println("--------------------");
        System.out.println("Números ingresados: " + numeros);
        System.out.println("--------------------");
    }
    public static void ejercicio2(){
        // Punto 2: Leer 20 números, determinar mayor, menor y calcular el rango
        ArrayList<Integer> numeros20 = new ArrayList<>();
        System.out.println("\nPunto 2: Ingrese 20 números:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros20.add(scanner.nextInt());
        }

        int mayor = numeros20.get(0);
        int menor = numeros20.get(0);

        for (int num : numeros20) {
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }
        System.out.println("--------------------");
        System.out.println("Mayor número: " + mayor);
        System.out.println("Menor número: " + menor);
        System.out.println("Rango: " + (mayor - menor));
        System.out.println("--------------------");
    }
    public static void ejercicio3(){
        // Punto 3: Generar 20 números pares aleatorios y calcular estadísticas
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        Random random = new Random();
        int suma = 0;

        while (numerosAleatorios.size() < 20) {
            int num = random.nextInt(50) * 2 + 2; // Números pares entre 2 y 100
            numerosAleatorios.add(num);
            suma += num;
        }

        double promedio = suma / 20.0;
        int iguales = 0, mayores = 0, menores = 0;

        for (int num : numerosAleatorios) {
            if (num == promedio) {
                iguales++;
            } else if (num > promedio) {
                mayores++;
            } else {
                menores++;
            }
        }
        System.out.println("--------------------");
        System.out.println("\nPunto 3: Números generados: " + numerosAleatorios);
        System.out.println("Promedio aritmético: " + promedio);
        System.out.println("Números iguales al promedio: " + iguales);
        System.out.println("Números mayores que el promedio: " + mayores);
        System.out.println("Números menores que el promedio: " + menores);
        System.out.println("--------------------");
    }
    public static void ejercicio4(){
        ArrayList<Integer> ramdom = new ArrayList<>();
        for(int i=0; i<50;i++){
            int aletoreo =(int)(Math.random()*100);
            ramdom.add(aletoreo);
        }
        for(Integer num : ramdom){
            System.out.println(num);
        }
        System.out.print("Ingrese un el valor que desea buscar:");
        Integer nro = scanner.nextInt();
        boolean respuesta = false;
        int index = 0;
        for(Integer n : ramdom){
                if(n == nro){
                    System.out.println("Número encontrado en la pos " + index+" !");
                    respuesta = true;
                    break;
                }
            index++;
        }
        if (respuesta == false){
            System.out.println("El número no se encontro!");
        }
    }
    public static ArrayList<Integer> CargaEjercicio5(){
        ArrayList<Integer> numerosAleatorios = new ArrayList<>();
        System.out.println("Ingrese 10 números enteros:");
        for(int i=0; i<10;i++){
            System.out.print("Número " +(i+1)+" :");
            Integer numero = scanner.nextInt();
            numerosAleatorios.add(numero);
        }
        return numerosAleatorios;
    }
    public static void CrearArrayEjercicio5(ArrayList<Integer> numeros){
        ArrayList<Integer> array1 = numeros;
        ArrayList<Integer> array2 = numeros;
        Collections.sort(array1);
        System.out.println("-------------------------------");
        System.out.println("---Lista ordenada ascendente---");
        for(Integer num : array1){
            System.out.print(num+"\t");
        }
        System.out.println();
        Collections.sort(array2, Collections.reverseOrder());
        System.out.println("--------------------------------");
        System.out.println("---Lista ordenada descendente---");
        for(Integer num : array2){
            System.out.print(num+"\t");
        }
        System.out.println();
        System.out.println("--------------------------------");
    }

}
