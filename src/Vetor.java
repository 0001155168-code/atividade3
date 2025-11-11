import java.util.Scanner;

public class Vetor {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         int[] numeros = new int[5];

         for(int i = 0; i < 5 ; i++){
             System.out.print("Digite o numero" + (i + 1) + ": ");
             numeros[i] = sc.nextInt();
         }

         System.out.println("numeros digitados:");
         for (int n : numeros){
             System.out.println(n);
         }
         sc.close();
    }
}
