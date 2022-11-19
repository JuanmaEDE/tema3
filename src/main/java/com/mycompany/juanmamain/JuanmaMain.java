
package com.mycompany.juanmamain;
import java.util.Scanner;

public class JuanmaMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na;
        int mod ;
        int horas;

        System.out.println("Ingrese nombre y apellidos: ");
        na = sc.nextLine();
        System.out.println("Ingrese el número de módulos en los que está matriculado: ");
        mod = sc.nextInt();
        String valor1 = String.valueOf(mod);
        System.out.println("Ingrese el número de horas que dedica a estudiar: ");
        horas = sc.nextInt();
        String valor2 = String.valueOf(horas);
       System.out.println("Estudiante: " + na + "  " +"\n" + modulo.veredicto(valor1,valor2));
      }

        
}
        
        
        
        
        
    

