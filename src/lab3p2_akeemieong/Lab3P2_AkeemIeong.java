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
static ArrayList productos= new ArrayList();
    public static void main(String[] args) {
        
        int op=0;
        do{
            System.out.println("1<-Agregar producto");
            System.out.println("2<-Eliminar producto");
            System.out.println("3<-Modificar productos");
            System.out.println("4<-Listar productos");
            System.out.println("5<-Comprar productos");
            System.out.println("6<-Listar las compras");
            System.out.println("7<-Salida");
            op=read.nextInt();
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
                    imprimirelim();
                    System.out.println("Ingrese el indice del producto que quiere eliminar");
                    int elim=read.nextInt();
                    if(elim>=0&&elim<productos.size()){
                        for (Object a : productos) {
                            if(elim==productos.indexOf(a)){
                                productos.remove(elim);
                            }
                        }
                    }
                    break;
                case 3:
                    imprimirelim();
                    System.out.println("Ingrese el indice del producto que quere modificar: ");
                    int mod3=read.nextInt();
                    if(mod3>=0&&mod3<productos.size()){
                        for (Object a : productos) {
                        if(mod3==productos.indexOf(a)){
                            if(a instanceof Comidas){
                                System.out.println("1<-Modificar Nombre");
                                System.out.println("2<-Modificar Precio");
                                System.out.println("3<-Modificar Fecha de vecimiento");
                                int mod2=read.nextInt();
                                switch(mod2){
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre: ");
                                        String nname=read.next();
                                        ((Comidas)productos.get(mod3)).setNombre(nname);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio: ");
                                        Double nprecio=read.nextDouble();
                                        ((Comidas)productos.get(mod3)).setPrecio(nprecio);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la nueva fecha de expiracion dd/mm/yyyy: ");
                                        String ndate=read.next();
                                        String []nda=ndate.split("/");
                                        int nday=Integer.parseInt(nda[0]);
                                        int nmes=Integer.parseInt(nda[1]);
                                        int nano=Integer.parseInt(nda[2]);
                                        Date nfe=new Date(nano-1900, nmes-1, nday);
                                        ((Comidas)productos.get(mod3)).setFechav(nfe);
                                        break;
                                    }
                                    break;
                            }
                            if(a instanceof Bebidas){
                                System.out.println("1<-Modificar Nombre");
                                System.out.println("2<-Modificar Precio");
                                System.out.println("3<-Modificar el tamano de la bebida");
                                int mod2=read.nextInt();
                                switch(mod2){
                                    case 1:
                                        System.out.println("Ingrese el nuevo nombre: ");
                                        String nname=read.next();
                                        ((Bebidas)productos.get(mod3)).setNombre(nname);
                                        break;
                                    case 2:
                                        System.out.println("Ingrese el nuevo precio: ");
                                        Double nprecio=read.nextDouble();
                                        ((Bebidas)productos.get(mod3)).setPrecio(nprecio);
                                        break;
                                    case 3:
                                        System.out.println("Ingrese la nuevo tamano de la bebida: ");
                                        int ntam=read.nextInt();
                                        ((Bebidas)productos.get(mod3)).setTamano(ntam);
                                        break;
                                    }
                            }
                        }
                    }
                }else
                    System.out.println("El indice que ingreso no es valido");
                    break;
                case 4:
                    imprimirproductos();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        }while(op!=7);
    }
    
    public static void imprimirproductos(){
        String accum="";
        for (Object p : productos) {
            if(p instanceof Comidas){
                accum+=p;
            }
            
        }
        for (Object p : productos) {
            if(p instanceof Bebidas){
                accum+=p;
            }
        }
        System.out.println(accum);
    }
    
    public static void imprimirelim(){
        String accum="";
        for (Object p : productos) {
            if(p instanceof Comidas){
                accum+=productos.indexOf(p)+"-"+p;
            }
            if(p instanceof Bebidas){
                accum+=productos.indexOf(p)+"-"+p;
            }
        }
    
        System.out.println(accum);
    }

}

