import java.util.ArrayList;
import java.util.Scanner;

public class MediaLista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma lista de números separados por vírgula (por exemplo, 5,10,15,20): ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split(",");
        ArrayList<Double> numeros = new ArrayList<>();
        
        for (String numeroStr : numerosString) {
            try {
                double numero = Double.parseDouble(numeroStr.trim());
                numeros.add(numero);
            } catch (NumberFormatException e) {
                // Ignora valores não numéricos na entrada.
            }
        }
        
        if (numeros.isEmpty()) {
            System.out.println("Resultado: A lista está vazia, não é possível calcular a média.");
        } else {
            double media = calcularMedia(numeros);
            System.out.println("Resultado: A média dos números é " + media + ".");
        }
        
        scanner.close();
    }
    
    public static double calcularMedia(ArrayList<Double> numeros) {
        double soma = 0;
        
        for (double numero : numeros) {
            soma += numero;
        }
        
        return soma / numeros.size();
    }
}
