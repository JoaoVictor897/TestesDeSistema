import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        
        boolean ehPrimo = verificarPrimo(numero);
        
        if (ehPrimo) {
            System.out.println("Resultado: O número " + numero + " é primo.");
        } else {
            System.out.println("Resultado: O número " + numero + " não é primo.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}
