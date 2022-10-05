//Pedir el radio de una circunferencia y calcular su longitud.

package semana04;
import java.util.Scanner;
/**
*
* @author Madeley Zuasnabar
*/
public class Ejercicio03 {
 public static void main(String[] args) {
 Scanner arje=new Scanner (System.in);
 System.out.println("Ingrese el radio: ");
 int radio=arje.nextInt();
 double longitud=radio*2*(3.1415);
 System.out.println("Longitud es de= "+longitud+" cm ");
 }

}
