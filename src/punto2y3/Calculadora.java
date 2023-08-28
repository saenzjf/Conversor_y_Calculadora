package punto2y3;

import java.util.Scanner;

public class Calculadora {
    
    public void iniciar() {
        double resultado = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elija una operación:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opcion = entrada.nextInt();

        System.out.print("Ingrese el primer número: ");
        double num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        double num2 = entrada.nextInt();

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            
            case 2:
                resultado = restar(num1, num2);
                break;
            
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            
            case 4:
                resultado = dividir(num1, num2);
                break;
        
            default:
                System.out.println("Opción inválida");
                break;
        }
        System.out.println("El resultado es: "+resultado);
    }

    public double sumar(double num1, double num2) {
        return (double) num1 + num2;
    }

    public double restar(double num1, double num2) {
        return (double) num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return (double) num1 * num2;
    }

    public double dividir(double num1, double num2) {
        if(num2 ==0){
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) num1 / num2;
    }
}
