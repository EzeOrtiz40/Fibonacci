
package fibonacci;
import java.util.Scanner;
/**
  @author Exxe
 */
public class Fibonacci {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
       int num = leer.nextInt();
       int i;
       
       for (i = 1; i < num; i++){
            System.out.println("La sucesion es: "+ fibo(i) );
        }
        
    }
 public static int fibo(int n){
        int resultado = 0;
        
        if (n < 2){
            resultado = n;
        }else{
            resultado = fibo(n -1) + fibo(n -2);
        }
        return resultado;
    }    
    
}
