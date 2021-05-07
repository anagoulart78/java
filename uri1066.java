import java.util.Scanner;
public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

         //declaração de variáveis

        int x;
            
                   
        //processamento

        for (int contador = 1; contador <= 5; contador++){
            valor = teclado.nextInt();
            if (valor %2 ==0)
                qtvpar++;
            else qtvimpar++;
            if (valor > 0)
                pos++;
            else if (valor < 0)
                neg++;        

        }

        System.out.println(qtvpar + " valor(es) par(es)");
        System.out.println(qtvimpar + " valor(es) impar(es)");
        System.out.println(pos + " valor(es) positivo(s)");
        System.out.println(neg + " valor(es) negativo(s)");
    }

}       