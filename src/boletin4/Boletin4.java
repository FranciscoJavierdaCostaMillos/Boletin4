
package boletin4;

/**
 *
 * @author fdacostamillos
 */
public class Boletin4 {

    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        Satelite satelite1 = new Satelite(20.00, 30000.00, 21.0);
        satelite1.verPosicion();
        
        Circulo circulo1 =  new Circulo(20);
        System.out.println(circulo1.calculaLonxitude());
        System.out.println(circulo1.calcularArea());
        
    }
    
}
