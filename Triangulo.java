import java.util.Scanner;
public class Triangulo{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double base, altura, triangulo;

        // entrada dos dados

        System.out.println("por favor, digite o valor da base:");
        base = teclado.nextDouble();
        System.out.println("por favor, digite o valor da Altura:");
        altura = teclado.nextDouble();

        //processamento
        triangulo = base * altura / 2;

        //saída
        System.out.println("o valor do triangulo é " + triangulo);

    }
}

