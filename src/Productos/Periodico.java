package Productos;

import Productos.Factory.Producto;

public class Periodico implements Producto {
    //ID, Tienen un nombre, fecha de publicación y precio.
    int ID;
    String nombre;
    String fechaPublicacion;
    float precio;

    public Periodico() {
    }

    public Periodico(int ID, String nombre, String fechaPublicacion, float precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos.Periodico{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
