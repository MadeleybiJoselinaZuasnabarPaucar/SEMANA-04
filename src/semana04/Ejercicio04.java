// Pedir dos números y decir si son iguales o no.

package semana04;
import java.util.Scanner;
/**
*
* @author ZUASNABAR PAUCAR MADELEYBI
*/
public class Ejercicio04 {

public static void main(String[] args) {
 Scanner teclado=new Scanner(System.in);
 int n1;
 int n2;
 System.out.print("Introduce un número: ");
 n1=teclado.nextInt();
 System.out.print("Introduce otro número: ");
 n2=teclado.nextInt();
 if(n1==n2)
 System.out.println("Son iguales");
 else
 System.out.println("No son iguales");
 }
}
