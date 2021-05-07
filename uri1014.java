import java.util.Scanner;
public class uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X;
        double Y, CONSUMO;

        // entrada dos dados

        X = teclado.nextInt();
        Y = teclado.nextDouble();
      
        //processamento

        CONSUMO = X / Y;

        //saída
        System.out.printf("%.3f\n km/l\n" CONSUMO);
       
    }
}  