import java.util.Scanner;
public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x; 
        int cont = 0;


        while (cont < 6) {
        	if (x % 2 == 1) {
        		System.out.println(x);
        		cont++;
        	}
    		x++;
        }
    }
	
}