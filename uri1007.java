import java.util.Scanner;
public class uri1007{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int VARA, VARB, VARC, VARD, DIFERENCA;

        // entrada dos dados

        VARA = teclado.nextInt();
        VARB = teclado.nextInt();
        VARC = teclado.nextInt();
        VARD = teclado.nextInt();

        //processamento

        DIFERENCA = (VARA * VARB - VARC * VARD);

        //saída
        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}   