import java.util.Scanner;
public class Trapezio{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);
        double basemaior, basemenor, altura, trapezio;

        // entrada dos dados

        System.out.println("por favor, digite o valor da base maior:");
        basemaior = teclado.nextDouble();
        System.out.println("por favor, digite o valor da base menor:");
        basemenor = teclado.nextDouble();
        System.out.println("por favor, digite o valor da altura:");
        altura = teclado.nextDouble();
        

        //processamento
        trapezio = (basemaior + basemenor) * altura / 2;

        //saída
        System.out.println("o valor do trapezio  é:" + trapezio);
    }
}    
