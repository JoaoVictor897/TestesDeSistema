import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();
        
        int numeroDePalavras = contarPalavras(frase);
        
        if (numeroDePalavras > 0) {
            System.out.println("Resultado: A frase possui " + numeroDePalavras + " palavras.");
        } else {
            System.out.println("Resultado: A frase não possui palavras.");
        }
        
        scanner.close();
    }
    
    public static int contarPalavras(String frase) {
        String[] palavras = frase.split("\\s+"); // Divide a frase em palavras usando espaços em branco como delimitador.
        int contador = 0;
        
        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
                contador++;
            }
        }
        
        return contador;
    }
}
