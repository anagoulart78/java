import java.util.Scanner;
public class uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double VARA, VARB, VARC, TRI, CIRC, TRAP, QUAD, RET, PI;

        // entrada dos dados

        VARA = teclado.nextDouble();
        VARB = teclado.nextDouble();
        VARC = teclado.nextDouble();
        PI = 3.14159 ;

        //processamento

        TRI = VARA * VARC / 2;
        CIRC = VARC * VARC * PI;
        TRAP = (VARA + VARB) * VARC /2;
        QUAD = VARB * VARB;
        RET = VARA * VARB;

        //saída
        System.out.printf("TRIANGULO: %.3f\n", TRI);
        System.out.printf("CIRCULO: %.3f\n", CIRC);
        System.out.printf("TRAPEZIO: %.3f\n", TRAP);
        System.out.printf("QUADRADO: %.3f\n", QUAD);
        System.out.printf("RETANGULO: %.3f\n", RET);
    }
}  