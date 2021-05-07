import java.util.Scanner;
public class Volume{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double volume, altura, largura, profundidade;

        // entrada dos dados

        System.out.println("por favor, digite o valor da altura:");
        altura = teclado.nextDouble();
        System.out.println("por favor, digite o valor da largura:");
        largura = teclado.nextDouble();
        System.out.println("por favor, digite o valor da profundidade:");
        profundidade = teclado.nextDouble();
        

        //processamento
        volume = altura * largura * profundidade;

        //saída
        System.out.println("o valor do volume é:" + volume);
    }
}   