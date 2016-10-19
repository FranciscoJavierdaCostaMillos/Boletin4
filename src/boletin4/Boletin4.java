
package boletin4;

/**
 *
 * @author fdacostamillos
 */
public class Boletin4 {

    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        
        Satelite satelite1 = new Satelite(15.00, 1000.00, 3.0);
        satelite1.verPosicion();
        
        Circulo circulo1 =  new Circulo(56);
        System.out.println(circulo1.calculaLonxitude());
        System.out.println(circulo1.calcularArea());
        
    }
    
}
