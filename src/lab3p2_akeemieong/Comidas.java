/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_akeemieong;

import java.util.Date;


public class Comidas extends Productos{
    private Date fechav;
    
    public Comidas() {
        super();
    }

    public Comidas(Date fechav, String nombre, double precio) {
        super(nombre, precio);
        this.fechav = fechav;
    }

    public Date getFechav() {
        return fechav;
    }

    public void setFechav(Date fechav) {
        this.fechav = fechav;
    }

    @Override
    public String toString() {
        return "fechav=" + fechav + super.toString();
    }
    
    
}
