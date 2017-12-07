/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfajores;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author 2017
 */
public class Alfajores {

 
    public static int  cantidadDePromociones (int alfajoresChocolate,  int alfajoresDulceDeLeche , int  alfajoresfruta){
        
        int cantidadCajas = 0;
        
        int cantChocolate=4;
        int cantDulceDeLeche=1;
        int cantFruta=1;
        
        while ( alfajoresChocolate >= cantChocolate && alfajoresDulceDeLeche >=cantDulceDeLeche && alfajoresfruta>=cantFruta ){
            
            
            alfajoresChocolate = alfajoresChocolate -  cantChocolate ;
            alfajoresDulceDeLeche=alfajoresDulceDeLeche-cantDulceDeLeche;
            alfajoresfruta= alfajoresfruta-cantFruta;
            
            
            
            
   cantidadCajas = cantidadCajas+1;
            
            
        } 
        
        
  return cantidadCajas;
    
    
}
    
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        int chocolate;
        int dulceDeLeche;
        int fruta;
        int resultadofinal;
        System.out.println("Ingresar cantidad alfajores Chocolate");
        chocolate = leer.nextInt();
        
        System.out.println("Ingresar cantidad alfajores Dulce de leche");
        dulceDeLeche = leer.nextInt();
        
        System.out.println("Ingresar cantidad de alfajores de Fruta");
        
        fruta =leer.nextInt();
        
        resultadofinal = cantidadDePromociones(chocolate,dulceDeLeche,fruta);
    
    
    System.out.println("La cantidad total de cajas de promoción es " +  resultadofinal);
    
    
    }
    
}

