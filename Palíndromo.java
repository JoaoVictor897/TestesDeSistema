import java.util.Scanner;

public class Palíndromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        
        boolean ehPalindromo = verificarPalindromo(palavra);
        
        if (ehPalindromo) {
            System.out.println("Resultado: A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("Resultado: A palavra \"" + palavra + "\" não é um palíndromo.");
        }
        
        scanner.close();
    }
    
    public static boolean verificarPalindromo(String palavra) {
        palavra = palavra.toLowerCase(); // Converte a palavra para letras minúsculas para fazer a verificação sem distinção entre maiúsculas e minúsculas.
        int comprimento = palavra.length();
        
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - 1 - i)) {
                return false;
            }
        }
        
        return true;
    }
}
