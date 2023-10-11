import java.util.Arrays;
import java.util.Scanner;

public class Ordenação{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a lista de números separados por vírgula (por exemplo, 9,2,5,1,7,3): ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split(",");
        int[] numeros = new int[numerosString.length];
        
        for (int i = 0; i < numerosString.length; i++) {
            try {
                numeros[i] = Integer.parseInt(numerosString[i].trim());
            } catch (NumberFormatException e) {
                // Ignora valores não numéricos na entrada.
            }
        }
        
        ordenarLista(numeros);
        
        System.out.println("Resultado: Lista ordenada: " + Arrays.toString(numeros));
        
        scanner.close();
    }
    
    public static void ordenarLista(int[] numeros) {
        int tamanho = numeros.length;
        
        for (int i = 0; i < tamanho - 1; i++) {
            int indiceMenor = i;
            
            for (int j = i + 1; j < tamanho; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            
            if (indiceMenor != i) {
                int temp = numeros[i];
                numeros[i] = numeros[indiceMenor];
                numeros[indiceMenor] = temp;
            }
        }
    }
}
