package Productos;

import Productos.Factory.Producto;
import Productos.Factory.productoFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tiendaN = new Tienda();
        tiendaN.menuTienda();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nSeleccione un producto: ");
        int opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println(productoFactory.getProducto(Producto.libroCienAñosDeSoledad));
                break;
            case 2:
                System.out.println(productoFactory.getProducto(Producto.libroElPrincipito));
                break;
            case 3:
                System.out.println(productoFactory.getProducto(Producto.revistaNationalGeographic));
                break;
            case 4:
                System.out.println(productoFactory.getProducto(Producto.revistaMuyInteresante));
                break;
            case 5:
                System.out.println(productoFactory.getProducto(Producto.periodicoElUniversal));
                break;
            case 6:
                System.out.println(productoFactory.getProducto(Producto.periodicoLaJornada));
                break;
        }
    }
}