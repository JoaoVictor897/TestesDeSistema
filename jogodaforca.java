import java.util.Random;
import java.util.Scanner;

public class jogodaforca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] palavras = {"elefante", "banana", "computador", "programacao", "exemplo", "girafa", "dificil", "alegria"};
        String palavraEscolhida = palavras[random.nextInt(palavras.length)];
        int maxTentativas = 6;
        int tentativasRestantes = maxTentativas;
        StringBuilder palavraAdivinhada = new StringBuilder("_".repeat(palavraEscolhida.length()));

        System.out.println("Bem-vindo ao Jogo da Forca!");
        System.out.println("Adivinhe a palavra: " + palavraAdivinhada);

        while (tentativasRestantes > 0 && palavraAdivinhada.indexOf("_") != -1) {
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            if (!Character.isLetter(letra)) {
                System.out.println("Por favor, insira uma letra válida.");
                continue;
            }

            if (palavraEscolhida.indexOf(letra) != -1) {
                for (int i = 0; i < palavraEscolhida.length(); i++) {
                    if (palavraEscolhida.charAt(i) == letra) {
                        palavraAdivinhada.setCharAt(i, letra);
                    }
                }
            } else {
                tentativasRestantes--;
                System.out.println("Letra incorreta. Tentativas restantes: " + tentativasRestantes);
            }

            System.out.println ("Palavra atual: " + palavraAdivinhada);
        }

        if (palavraAdivinhada.indexOf("_") == -1) {
            System.out.println("Parabéns, você adivinhou a palavra!");
        } else {
            System.out.println("Você esgotou suas tentativas. A palavra era \"" + palavraEscolhida + "\".");
        }

        scanner.close();
    }
}
