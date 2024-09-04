/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 /**
 *
 * @author Sergio Sanchez 20241222424 Celular 3208689548
 */
package facturacionfruteria;

import java.util.Scanner;

public class Facturacionfruteria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuarCompra = "si";
        double totalCompras = 0.0; // Acumulador del total de las compras

        // Adiciona múltiples compras
        do {
            System.out.print("¡Bienvenido a su despensa de frutas y verduras!.Ingrese el precio por kilo de manzana: ");
            double precioKilo = scanner.nextDouble();

            System.out.print("Ingrese la cantidad de kilos a comprar: ");
            double kilos = scanner.nextDouble();

            double descuento = 0.0;

            // Estructura condicional (if-else if-else) para calcular el descuento
            if (kilos <= 2) {
                descuento = 0.0; // Sin descuento
            } else if (kilos <= 5) {
                descuento = 0.10; // 10% de descuento
            } else if (kilos <= 10) {
                descuento = 0.15; // 15% de descuento
            } else {
                descuento = 0.20; // 20% de descuento
            }

            double precioTotal = (precioKilo * kilos) * (1 - descuento);
            totalCompras += precioTotal; // Sumamos el precio de esta compra al total

            System.out.println("Precio total a pagar por esta compra: COP $" + precioTotal);

            System.out.print("¿Desea comprar otra fruta? (si/no): ");
            continuarCompra = scanner.next().toLowerCase(); 

        } while (continuarCompra.equals("si"));

        System.out.println("Total de todas sus compras: COP $" + totalCompras);
        System.out.println("¡Gracias por su compra!");

        scanner.close();
    }
}
