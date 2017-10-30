/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;
import java.util.Scanner;

/** /*********************************************************************************************************************************
 *  Lavinia Avalos Oyarzo
 *  @author LAB02
 *  Fecha:Octubre 30 de 2017
 *  Programa: Pruebajava1
 *  Responsabilidad: Clase *
 *
 * @author LAB02
 */
public class Area1 
        
{
    public static void main(String[] args)
    {
        int area;
        
            Scanner sc = new Scanner(System.in);
            
      System.out.println("Ingrese la base del rectangulo ");
      int base = sc.nextInt();
      
      System.out.println("Ingrese la altura del rectangulo ");
       int altura = sc.nextInt();
      area=base*altura;
      
         System.out.println("El area del rectangulo " +base+" mts2");
      
      
    }
}




        
    

