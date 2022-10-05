//2. Pedir el radio de un círculo y calcular su área. A=PI*r^2.

package semana04;
import java.util.Scanner;
/**
*
* @author ZUASNABAR PAUCAR MADELEYBI
*/
public class Ejercicio02 {

public static void main(String[] args) {
 double area, radio;
 Scanner num = new Scanner(System.in);
 try {
 System.out.print("Introduce el radio de un Círculo: ");
 radio = num.nextDouble();
 area = Math.PI*(radio*radio);
 System.out.println("El area del Circulo es: " + area);
 } catch (Exception e) {
 }
 }
}
