/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh;

import static eh.EH.Provincia.CATAMARCA;
import static eh.EH.Provincia.JUJUY;
import static eh.EH.Provincia.SALTA;
import static eh.EH.Provincia.TUCUMAN;
import java.util.Scanner;

/**
 *
 * @author 2017
 */
public class EH {

  
  
   enum Provincia {SALTA, TUCUMAN, CATAMARCA, JUJUY};
   
              
   //recorre de 1 hasta la cantidad epanadassalteñas ingresadas y 
    //si encuentra un numero que al dividir por 4 de como resto 0 suma un 1 al contador
   public static int Calcularcontadorsalt (int saltenas,int cantidadPorCaja){
       int contadorsalt=0;
       
       
       for ( int i=1; i<= saltenas; i++){
                 if (i % cantidadPorCaja == 0 ){ contadorsalt = contadorsalt+1;}
             }
       return contadorsalt;
             
        }
   
              
   //recorre de 1 hasta la cantidad epanadassalteñas ingresadas y 
    //si encuentra un numero que aldividir por 4 de como resto 0 suma un 1 al contador
     public static int CalcularcontadorTuc (int tucumanas, int cantidadPorCaja){
       int contadortuc=0;
       
    for (int j=1;  j <=tucumanas;j++){
                  
                  if (j%cantidadPorCaja==0){
                      
                      contadortuc=contadortuc +1;
                       } 
              }
       return contadortuc;
             
       
       
   }
     
     
     //compara los contadores de los 2 tipos empananadas
     
     public static int compararcontadores (int contadorsaltenas, int contadortucumanas){
       
   
      int resultado = 0;
      int aux;  
               
            if (contadorsaltenas <  contadortucumanas){
              
             aux = contadortucumanas - contadorsaltenas;
             contadortucumanas =  contadortucumanas -aux;
             resultado = contadortucumanas;}
          
          
          if (contadorsaltenas==contadortucumanas) {
              
               resultado = contadortucumanas;
          }
          
          else {
              aux = contadorsaltenas - contadortucumanas;
              contadorsaltenas = contadorsaltenas-aux;
              resultado =contadorsaltenas;
              
          }
        
         return resultado;
         
         
         
         
     }
   
   
  
  // tiene  que dar cantidad de cajas segun cantidad de empanadas
  

 public static int promocionLocal (Provincia provincia,int saltenas, int tucumanas){
      
     Provincia seleccion;
     seleccion = provincia;
     int contSalt;
     int contTuc;
     int resultado = 0;
 
         
     switch (seleccion){
         
         case SALTA:
             
             
           contSalt =  CalcularcontadorTuc(saltenas,4);
           contTuc = CalcularcontadorTuc (tucumanas,2);
          resultado = compararcontadores(contSalt,contTuc);
           
           

    
     break;
      case TUCUMAN:
     
          
          contSalt =  CalcularcontadorTuc(saltenas,2);
           contTuc = CalcularcontadorTuc (tucumanas,4);
          resultado = compararcontadores(contSalt,contTuc);
           
     
           
             break;
             
      case JUJUY  :
      case CATAMARCA:    
          
          contSalt =  CalcularcontadorTuc(saltenas,3);
          contTuc = CalcularcontadorTuc (tucumanas,3);
          resultado = compararcontadores(contSalt,contTuc);
            
        
             
             break; }
    return resultado;
      
 }
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        int empsalt = 0;
        int emptuc=0;
        int seleccionProv=0;
        Provincia provinciaselec = null;
        System.out.println("Seleccione la provincia");
        
        System.out.println("1-Salta");
        System.out.println("2-Tucuman");
        System.out.println("3-Catamarca");
        System.out.println("4-Jujuy");
        
        seleccionProv=leer.nextInt();
        
        switch (seleccionProv) {
            
            case 1:
                
              provinciaselec = SALTA;  
                
            break;
            case 2:
                
                provinciaselec =TUCUMAN;
             break;   
            case 3:
                
                provinciaselec = CATAMARCA;
            break;    
            case 4: 
                provinciaselec = JUJUY;
                
             break;   
            
            
            
        }
        System.out.println("Ingresar cantidad empanadas salteñas");
        empsalt = leer.nextInt();
        System.out.println("Ingresar cantidad empanadas tucumanas");
        emptuc = leer.nextInt();
        int RESULT = promocionLocal(provinciaselec,empsalt,emptuc);
        System.out.println("La cantidad de cajas es " + RESULT);
    }
    
}
