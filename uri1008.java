import java.util.Scanner;
public class uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int func, hora;
        double vhora, salario;

        // entrada dos dados

        func = teclado.nextInt();
        hora = teclado.nextInt();
        vhora = teclado.nextDouble();
      
        //processamento

        salario = (vhora * hora);

        //saída
        System.out.println("NUMBER = " + func);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}   