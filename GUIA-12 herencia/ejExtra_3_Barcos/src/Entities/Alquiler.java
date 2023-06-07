/*
 */
package Entities;

import java.time.LocalDate;

public class Alquiler {
    private Cliente cliente;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private Barco embarcacion;
    private double precio;

    public Alquiler() {
    }

    public Alquiler(Cliente cliente, LocalDate fechaAlquiler, LocalDate fechaDevolucion, double precio) {
        this.cliente = cliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.embarcacion= cliente.getEmbarcacion();
        this.precio= precio;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Barco getEmbarcacion() {
        return embarcacion;
    }

    public void setEmbarcacion(Barco embarcacion) {
        this.embarcacion = embarcacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "\n cliente=" + cliente.getNombre() +"dni="+cliente.getDni() + "\n fechaAlquiler=" + fechaAlquiler + "\n fechaDevolucion=" + fechaDevolucion + "\n embarcacion=" + embarcacion +"\n precio=$" +precio+ "}";
    }
    
    
    
}
