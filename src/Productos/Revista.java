package Productos;

import Productos.Factory.Producto;

public class Revista implements Producto {
    //ISSN, Tienen un nombre, número de edición, precio y
    //periodicidad.

    private String issn;
    private String nombre;
    private int edicion;
    private float precio;
    private String periodicidad;

    public Revista() {
    }

    public Revista(String issn, String nombre, int edicion, float precio, String periodicidad) {
        this.issn = issn;
        this.nombre = nombre;
        this.edicion = edicion;
        this.precio = precio;
        this.periodicidad = periodicidad;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    @Override
    public String toString() {
        return "Productos.Revista{" +
                "issn='" + issn + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edicion=" + edicion +
                ", precio=" + precio +
                ", periodicidad='" + periodicidad + '\'' +
                '}';
    }
}
