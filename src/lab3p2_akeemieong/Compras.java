/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_akeemieong;

import java.util.ArrayList;


public class Compras {
    ArrayList pro=new ArrayList();
    double total;

    public Compras() {
    }

    public Compras(double total) {
        this.total = total;
    }

    public ArrayList getPro() {
        return pro;
    }

    public void setPro(ArrayList pro) {
        this.pro = pro;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Productos comprados: " + pro
                +"\ntotal a pagar: " + total ;
    }
    
    
}
