import java.util.Scanner;
public class uri1003{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int VARA, VARB, SOMA;

        // entrada dos dados

        VARA = teclado.nextInt();
        VARB = teclado.nextInt();

        //processamento

        SOMA = VARA + VARB;

        //saída
        System.out.println("SOMA = " + SOMA);
    }
}   