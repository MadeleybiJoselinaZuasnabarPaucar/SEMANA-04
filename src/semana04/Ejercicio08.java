//Pedir dos números y decir cuál es el mayor o si son iguales.

package semana04;
import java.util.Scanner;
/**
*
* @author ZUASNABAR PAUCAR MADELEYBI
*/
public class Ejercicio08 {

public static void main(String[]args){
 Scanner teclado=new Scanner(System.in);
 int a;
 int b;
 System.out.print("ingrese el primer numero : ");
 a=teclado.nextInt();
 System.out.print("ingrese el segundo numero : ");
 b=teclado.nextInt();
 if(a==b)
 System.out.print("Los numeros ingresados son iguales");
   if(a>b)
 System.out.print("El numero mayor es : "+a);
   if(b>a)
 System.out.print("El numero mayor es : "+b);

 }
}
