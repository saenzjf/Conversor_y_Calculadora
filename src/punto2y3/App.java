package punto2y3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(">> BIENVENIDO <<");
        System.out.println("Escoja que desea hacer:");
        System.out.println("1. Conversor de monedas.");
        System.out.println("2. Calculadora simple.");

        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                ConversorMonedas conversor = new ConversorMonedas();
                conversor.iniciar();
                break;
            
            case 2:
                Calculadora cal = new Calculadora(); 
                cal.iniciar();
                break;
        
            default:
                System.out.println("Escoja una opción valida.");
                break;
        }
    }
}
