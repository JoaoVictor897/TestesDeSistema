import java.util.Arrays;
import java.util.Scanner;

public class Binaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a lista de números ordenados separados por vírgula (por exemplo, 1,3,5,7,9,11,13,15): ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split(",");
        int[] numeros = new int[numerosString.length];
        
        for (int i = 0; i < numerosString.length; i++) {
            try {
                numeros[i] = Integer.parseInt(numerosString[i].trim());
            } catch (NumberFormatException e) {
               
            }
        }
        
        System.out.print("Digite o número a ser buscado: ");
        int numeroBuscado = scanner.nextInt();
        
        int posicao = buscarNumero(numeros, numeroBuscado);
        
        if (posicao >= 0) {
            System.out.println("Resultado: O número " + numeroBuscado + " foi encontrado na posição " + posicao + ".");
        } else {
            System.out.println("Resultado: O número " + numeroBuscado + " não foi encontrado na lista.");
        }
        
        scanner.close();
    }
    
    public static int buscarNumero(int[] numeros, int numeroBuscado) {
        int inicio = 0;
        int fim = numeros.length - 1;
        
        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            
            if (numeros[meio] == numeroBuscado) {
                return meio;
            } else if (numeros[meio] < numeroBuscado) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        
        return -1; 
    }
}
