/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_akeemieong;

import java.util.Date;


public class Comidas extends Productos{
    private Date fechav;
    private char ven;
    public Comidas() {
        super();
    }

    public Comidas( String nombre, double precio,char ven) {
        super(nombre, precio);

        this.ven=ven;
    }

 

    public char getVen() {
        return ven;
    }

    public void setVen(char ven) {
        this.ven = ven;
    }
    
    @Override
    public String toString() {
        return  super.toString()
                +"Estado de vencimiento: "+ven+"\n";
    }
    
    
}
