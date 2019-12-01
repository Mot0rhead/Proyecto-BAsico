/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogithub;


public class ProyectoGithub {

private static String veredicto(String valor1, String valor2) {
    
  if (valor1.equals(valor2)) {
   return "Perfecto. Has tenido buen criterio.";
}
if (Integer.valueOf(valor1) < Integer.valueOf(valor2)){
   return "Has mejorado, o te ha llegado el éxito inesperado.";
}
 return "Te has confiado. Falta realismo."; 
 /**
  * @author Jomathan
  * @return El String segun si el valor n es igual a m
  * Este metodo sirve para compara dos valores y retornar el String consiguient
  */

}
    public static void main(String[] args) {
        System.out.println("La calificacion de "+args[0]+" "+args[1]+" es: "+args[3]);
        veredicto(args[2],args[3]);
    }
    
}
