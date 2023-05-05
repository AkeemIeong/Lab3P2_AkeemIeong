/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_akeemieong;

/**
 *
 * @author surface pro
 */
public class Productos {
    private String nombre;
    private double precio;

    public Productos() {
    }

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        setPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio>0){
            this.precio = precio;
        }
       
    }

    @Override
    public String toString() {
        return "nombre=" + nombre 
              +"precio=" + precio;
    }
    
    
}
