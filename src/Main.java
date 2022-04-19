import java.util.Scanner;

public class Main {
    public static  void main(String[] args) {
        while (true) {
            //Mostrar menu
            System.out.println("Conversor de monedas\r\n"
                    + "1.Dolares\r\n"
                    + "2.Libras\r\n"
                    + "3.Yenes\r\n"
                    + "0.Salir");
            //Recogemos el valor que escribe el usuario y lo  añade a la variable opciones
            int opciones = leerInt();
            switch (opciones) {
                case 1:
                    System.out.println("Introduzca la cantidad:");
                    double cantidadDolar;
                    cantidadDolar = leerDouble();
                    Moneda dolar = new Dolar(cantidadDolar);
                    System.out.println("La cantidad en euros es: " + dolar.cantidadEuros());
                    break;
                case 2:
                    System.out.println("Introduzca la cantidad:");
                    double cantidadLibra = leerDouble();
                    Moneda libra = new Libra(cantidadLibra);
                    System.out.println("La cantidad en euros es: " + libra.cantidadEuros());
                    break;
                case 3:
                    System.out.println("La cantidad es:");
                    double cantidadYen = leerDouble();
                    Moneda yen = new Yen(cantidadYen);
                    System.out.println("La cantidad en euros es: " + yen.cantidadEuros());
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opcion no valida");
                }


             }
         }

    private static double leerDouble() {
        Scanner escaner = new Scanner(System.in);
        return escaner.nextDouble();

    }

    private static int leerInt() {
        Scanner escanerInt = new Scanner(System.in);
        return escanerInt.nextInt();

    }

    }
