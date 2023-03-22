import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int numeros;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite quantos números serão usados");
        numeros = s.nextInt();
        int vetorNumero[] = new int[numeros];
        int maiorValor = 0;
        int menorValor = Integer.MAX_VALUE;
        for (int i = 0; i <vetorNumero.length; i++) {
            System.out.println("Digite um número");
            vetorNumero[i] = s.nextInt();
            if (vetorNumero[i] > maiorValor) {
                maiorValor = vetorNumero[i];
            }
            if (vetorNumero[i] < menorValor) {
                menorValor = vetorNumero[i];
            }
        }
        System.out.println("O maior valor do vetor é: " + maiorValor);
        System.out.println("O menor valor do vetor é: " + menorValor);
    }
}