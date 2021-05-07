import java.util.Scanner;
public class uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, distancia;
        double litros;

        // entrada dos dados

        tempo = teclado.nextInt();
        distancia = teclado.nextInt();
      
        //processamento

        litros = (double)tempo * distancia / 12 ;

        //saída
        System.out.printf("%.3f\n", litros);
       
    }
}  