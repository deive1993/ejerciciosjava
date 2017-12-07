/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empanadas;

import empanadas.Empanadas.Provincia;


public class PromocionLocal {
    int cajasS =0;
    int cajasT =0;
    
   public int  PromocionLocal (Provincia nombreprovincia, int produccS, int produccT ){
       if (nombreprovincia==Provincia.SALTA) {
           
            cajasS = produccS /4;
            cajasT = produccT /2;
       } 
       if (nombreprovincia==Provincia.TUCUMAN) {
           
            cajasS = produccS /2;
            cajasT = produccT /4;
            }
       if (nombreprovincia==Provincia.SALTA)  {
           
            cajasS = produccS /2;
            cajasT = produccT /4;
            }
        return 0;
   }
    
}
