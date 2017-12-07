
package empanadas;

public class Empanadas {
       enum Provincia {SALTA, TUCUMAN, CATAMARCA, JUJU};
               
    public static void main(String[] args) {
           int produccS = 400;
           int produccT = 300;
           int resultado =0;
           
           PromocionLocal PL = new PromocionLocal();
           resultado = PL.PromocionLocal (Provincia.SALTA,produccS, produccT);
           
    }
    
}
