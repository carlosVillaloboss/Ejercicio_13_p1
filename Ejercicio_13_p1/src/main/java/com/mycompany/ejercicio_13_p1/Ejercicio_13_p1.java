package com.mycompany.ejercicio_13_p1;
import java.util.Scanner;

public class Ejercicio_13_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor de la compra: ");
        double vcompra= scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese color de la bolita(blanco,amarillo,verde,azul,rojo): ");
        String color= scanner.nextLine().toLowerCase();
        
         if (color.equals("blanco")){
             vcompra= vcompra;
         }else if(color.equals("verde")){
             vcompra= vcompra-(vcompra*0.1);
         }else if(color.equals("amarillo")){
             vcompra=vcompra-(vcompra*0.25);
         }else if(color.equals("azul")){
             vcompra=vcompra-(vcompra*0.5);
         }else {
             vcompra= 0;   
     }    
         
         System.out.println("El valor total a pagar seria: "+vcompra);
         scanner.close();
    
     }
}
