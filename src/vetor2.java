import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;

        for (int i = 0; i <5; i++){
            System.out.print("digite o numero " +(i + 1) + ": ");
            numeros[i] = sc.nextInt();
            soma += numeros [i];
        }

        System.out.print("Soma total = " + soma);
        sc.close();
    }
}
