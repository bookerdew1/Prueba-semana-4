/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermercado;

import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        
        System.out.print("Ingrese el número de productos que va a registrar: ");
        int numeroProductos = info.nextInt();

        double costoTotal = 0;

       
        for (int i = 1; i <= numeroProductos; i++) {
            System.out.println("Producto " + i + ":");
            
            
            System.out.print("Ingrese el precio del producto: ");
            double precio = info.nextDouble();

            
            System.out.print("Ingrese la cantidad comprada: ");
            int cantidad = info.nextInt();

            
            costoTotal += precio * cantidad;
        }

       
        System.out.printf("El costo total de la compra es: $%.2f\n", costoTotal);

        info.close();
    }
}
