import java.util.Scanner;

public class vetor3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.print("digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[1];
        }

        double media = soma / 5;
        System.out.println("Media das notas = " + media);
        sc.close();
    }
}
