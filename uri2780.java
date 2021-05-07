import java.util.Scanner;
public class uri2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int D;
        
        // entrada dos dados

        D = teclado.nextInt();
           
        //processamento

        if (D <= 800){
        System.out.println("1");
        }

        else if (D <= 1400){
            System.out.println("2");
        }

        else if (D <= 2000){
            System.out.println("3");
        }
  
    }
}