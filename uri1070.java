import java.util.Scanner;
public class uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        // declaração de variáveis
        int valor; 
        int cont = 0;

        // entrada de dados

        valor = teclado.nextInt();

         // Processamento

        while (cont < 6) {
        	if (valor % 2 == 1) {
        		System.out.println(valor);
        		cont++;
        	}
    		valor++;
        }
    }
	
}