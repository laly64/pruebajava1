/*****
 ****
*
 */
package javaapplication5;

import javax.swing.JOptionPane;


/* * **************************************************************************************************************************
 *   Lavinia Avalos Oyarzo
 *  @author LAB02
 *  Fecha:Octubre 30 de 2017
 *  Programa: Datos de usuario
 *  Responsabilidad: Clase 
********************************************************************************************************************************
 */
public class Datosdeusuario 
{
   public static void main(String[] args) 
           
   {
       
       String Nombre;
       int Edad;
       
    Nombre = JOptionPane.showInputDialog("Ingrese su Nombre");
    
    Edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad"));
    
     JOptionPane.showMessageDialog(null,"Bienvenido "+(Nombre));
     
      JOptionPane.showMessageDialog(null,"En 20 años usted tendra "+(Edad+20));
     
    
   }
}
