package Productos.Factory;

import Productos.Libro;
import Productos.Periodico;
import Productos.Revista;

public class productoFactory {
    public static Producto getProducto(int idProducto){
        switch (idProducto){
            case Producto.libroCienAñosDeSoledad:
                return new Libro("978-8437604947", "Cien años de soledad",
                    "Novela cumbre del realismo mágico", "Gabriel García Márquez",
                    450.50f, 432);

            case Producto.libroElPrincipito:
            return new Libro("978-0156013925", "El Principito",
                    "Fábula filosófica sobre la amistad", "Antoine de Saint-Exupéry",
                    185.50f, 96);

            case Producto.revistaNationalGeographic:
                return new Revista("ISSN-123456", "National Geographic",
                        247, 120.00f, "Mensual");

            case Producto.revistaMuyInteresante:
                return new Revista("ISSN-876543", "Muy Interesante",
                        500, 75.00f, "Quincenal");

            case Producto.periodicoElUniversal:
                return new Periodico(1, "El Universal",
                        "15/05/2024", 25.50f);

            case Producto.periodicoLaJornada:
                return new Periodico(2, "La Jornada",
                        "16/05/2024", 20.00f);
        }
        return null;
    }
}
