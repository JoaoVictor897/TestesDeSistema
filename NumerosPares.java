import java.util.ArrayList;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite uma lista de números separados por vírgula (por exemplo, 2,4,6,8,10): ");
        String input = scanner.nextLine();
        
        String[] numerosString = input.split(",");
        ArrayList<Integer> numeros = new ArrayList<>();
        
        for (String numeroStr : numerosString) {
            try {
                int numero = Integer.parseInt(numeroStr.trim());
                numeros.add(numero);
            } catch (NumberFormatException e) {
                
            }
        }
        
        int somaDosPares = calcularSomaDosPares(numeros);
        
        if (somaDosPares > 0) {
            System.out.println("Resultado: A soma dos números pares é " + somaDosPares + ".");
        } else {
            System.out.println("Resultado: A lista não contém números pares.");
        }
        
        scanner.close();
    }
    
    public static int calcularSomaDosPares(ArrayList<Integer> numeros) {
        int soma = 0;
        
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                soma += numero;
            }
        }
        
        return soma;
    }
}
