import java.util.Scanner;

public class Vogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        int numeroDeVogais = contarVogais(frase);
        
        if (numeroDeVogais > 0) {
            System.out.println("Resultado: A frase possui " + numeroDeVogais + " vogais.");
        } else {
            System.out.println("Resultado: A frase não possui vogais.");
        }
        
        scanner.close();
    }
    
    public static int contarVogais(String frase) {
        int contador = 0;
        frase = frase.toLowerCase(); 
        
        for (int i = 0; i < frase.length(); i++) {
            char caractere = frase.charAt(i);
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contador++;
            }
        }
        
        return contador;
    }
}

