//Pedir un número e indicar si es positivo o negativo.

package semana04;
import java.util.Scanner;
/**
*
* @author ZUASNABAR PAUCAR MADELEYBI
*/
public class Ejercicio05 {

public static void main(String[]args){
 Scanner teclado=new Scanner(System.in);
 int a;
 System.out.println("Ingrese un numero: ");
 a=teclado.nextInt();
 if(a>0)
 System.out.println("es positivo ");
 else
 System.out.println("es negativo ");
 }
}

