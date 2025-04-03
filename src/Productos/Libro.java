package Productos;

import Productos.Factory.Producto;

public class Libro implements Producto {
    //ISBN, Tienen un título, una reseña, autor, precio y número de
    //páginas.

    private String ibn;
    private String titulo;
    private String reseña;
    private String autor;
    private float precio;
    private int numpaginas;

    //public Productos.Libro() {
    //}

    public Libro(String ibn, String titulo, String reseña, String autor, float precio, int numpaginas) {
        this.ibn = ibn;
        this.titulo = titulo;
        this.reseña = reseña;
        this.autor = autor;
        this.precio = precio;
        this.numpaginas = numpaginas;
    }

    public String getIbn() {
        return ibn;
    }

    public void setIbn(String ibn) {
        this.ibn = ibn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getReseña() {
        return reseña;
    }

    public void setReseña(String reseña) {
        this.reseña = reseña;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(int numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Productos.Libro{" +
                "ibn='" + ibn + '\'' +
                ", titulo='" + titulo + '\'' +
                ", reseña='" + reseña + '\'' +
                ", autor='" + autor + '\'' +
                ", precio=" + precio +
                ", numpaginas=" + numpaginas +
                '}';
    }
}
