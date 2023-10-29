/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package leanumeroydigacual;

import java.util.Scanner;

/**
 *
 * @author migue
 */
public class Leanumeroydigacual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Crea un programa que lea tres números por teclado y nos diga cual es mayor, cual es menor o si son iguales.


    Scanner sc = new Scanner(System.in);
        String numero1;
            System.out.println("Escribe un número");
                numero1 = sc.nextLine();
        String numero2;
            System.out.println("Escribe otro número");
                numero2 = sc.nextLine();
        String numero3;
            System.out.println("Escribe el último número");
                numero3 = sc.nextLine();

        int a = Integer.parseInt(numero1);
        int b = Integer.parseInt(numero2);
        int c = Integer.parseInt(numero3);
        
            if(a>b && a>c && b>c)
             System.out.println("el número mayor es "  + numero1 );
             System.out.println("el número del medio es  "  + numero2 );
            System.out.println("el número mas pequeño es "  + numero3 );
          
            if(a<=b && a<=c && b<=c)
             System.out.println("el número mayor es "  + numero3 );
            
            if(c>=b && c>=a && b<=a)
             System.out.println("el número mayor es "  + numero3 );
            else
            System.out.println("El alumno"  + numero2 + "esta aprobado");
          

    }
}
