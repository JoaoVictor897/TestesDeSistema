import java.util.Scanner;

public class calculadora{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Calcular o fatorial de: ");
        int numero = scanner.nextInt();
        
        long fatorial = calcularFatorial(numero);
        
        System.out.println("Resultado: O fatorial de " + numero + " é " + fatorial + ".");
        
        scanner.close();
    }
    
    public static long calcularFatorial(int numero) {
        if (numero < 0) {
            return -1; 
        }
        
        long fatorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        return fatorial;
    }
}
