/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consumoagua2;

import java.util.Scanner;

public class ConsumoAgua2 {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        
        
        double[] consumoMensual = new double[12];
        double consumoTotal = 0;
        
        
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese el consumo de agua en litros para el mes " + (i + 1) + ": ");
            consumoMensual[i] = info.nextDouble();
            consumoTotal += consumoMensual[i]; 
        }
        
        
        double promedioMensual = consumoTotal / 12;
        
        
        System.out.printf("El consumo total anual es: %.2f litros\n", consumoTotal);
        System.out.printf("El consumo promedio mensual es: %.2f litros\n", promedioMensual);
        
        info.close();
    }
}
