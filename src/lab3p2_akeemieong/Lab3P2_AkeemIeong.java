/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_akeemieong;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
public class Lab3P2_AkeemIeong {
static Scanner read=new Scanner(System.in);
    
    public static void main(String[] args) {
        ArrayList productos= new ArrayList();
        int op=0;
        do{
            System.out.println("1<-Agregar producto");
            System.out.println("2<-Eliminar producto");
            System.out.println("3<-Modificar productos");
            System.out.println("4<-Listar productos");
            System.out.println("5<-Comprar productos");
            System.out.println("6<-Listar las compras");
            System.out.println("7<-Salida");
            switch(op){
                case 1:
                    int op2;
                    System.out.println("1<-Agregar Comida");
                    System.out.println("2<-Agregar Bebidas");
                    op2=read.nextInt();
                    switch (op2){
                        case 1:
                            System.out.println("Ingrese El nombre de la comida: ");
                            String nombre=read.next();
                            System.out.println("Ingrese el precio: ");
                            double precio=read.nextDouble();
                            System.out.println("Ingrese una fecha dd/mm/yyyy");
                            String fecha= read.next();
                            String []fech=fecha.split("/");
                            int dia=Integer.parseInt(fech[0]);
                            int mes=Integer.parseInt(fech[1]);
                            int ano=Integer.parseInt(fech[2]);
                            Date fe=new Date(ano-1900, mes-1,dia);
                            productos.add(new Comidas(fe, nombre, precio));
                            break;
                        case 2:
                            System.out.println("Ingrese El nombre de la bevida: ");
                            String nombre1=read.next();
                            System.out.println("Ingrese el precio: ");
                            double precio1=read.nextDouble();
                            System.out.println("Ingrese el tamano");
                            int tam= read.nextInt();
                            productos.add(new Bebidas(tam, nombre1, precio1));
                            break;
                    }
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(op!=7);
    }
    
}
