import java.util.Scanner;
public class uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

         //declaração de variáveis

        int valor;
        int qtvpar = 0;
       
                   
        //processamento

        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor %2 ==0){
                qtvpar++;
           } 
                            
        }
        System.out.println(qtvpar + " valores pares");
    }
}       