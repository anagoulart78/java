import java.util.Scanner;
public class uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double VARA, VARB, VARC, MEDIA;

        // entrada dos dados

        VARA = teclado.nextDouble();
        VARB = teclado.nextDouble();
        VARC = teclado.nextDouble();

        //processamento

        MEDIA = (VARA * 2 + VARB * 3 + VARC * 5) / 10.0;

        //saída
        System.out.printf("MEDIA = %.1f\n" , MEDIA);
    }
}   