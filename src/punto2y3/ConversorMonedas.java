package punto2y3;

import java.util.Scanner;

public class ConversorMonedas {
    
    public void iniciar(){

        double tasa = 4000;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escoja que conversión desea:");
        System.out.println("1. COP a USD.");
        System.out.println("2. USD a COP.");
        int opcionConversor = entrada.nextInt();

        System.out.print("Ingrese el valor que desea convertir: ");
        double valorAconvertir = entrada.nextDouble();
        
        if (opcionConversor == 1) {
            COP_USD(valorAconvertir, tasa);
        } 
        else if(opcionConversor == 2) {
            USD_COP(valorAconvertir, tasa);
        }else{
            System.out.println("Ingresó opción invalida.");
        }
    }

    public void COP_USD(double valorAconvertir, double tasa){
        double resultado = valorAconvertir/tasa;

        System.out.println(valorAconvertir+" COP en USD son: "+resultado); 
    }

    public void USD_COP(double valorAconvertir, double tasa){
        double resultado = valorAconvertir * tasa;
        System.out.println(valorAconvertir+" USD en COP son: "+resultado);
    }


}
