/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_akeemieong;

/**
 *
 * @author surface pro
 */
public class Bebidas extends Productos{
    private int tamano;

    public Bebidas() {
        super();
    }

    public Bebidas(int tamano, String nombre, double precio) {
        super(nombre, precio);
        setTamano(tamano);
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        if(tamano>0){
            this.tamano = tamano;
        }
    }

    @Override
    public String toString() {
        return "tamano=" + tamano +
                super.toString();
    }
    
    
    
}
