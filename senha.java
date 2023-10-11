import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();
        
        boolean senhaValida = validarSenha(senha);
        
        if (senhaValida) {
            System.out.println("Resultado: A senha é válida.");
        } else {
            System.out.println("Resultado: A senha é inválida.");
        }
        
        scanner.close();
    }
    
    public static boolean validarSenha(String senha) {
        // Verificar o comprimento da senha.
        if (senha.length() < 8) {
            return false;
        }
        
        boolean temLetraMaiuscula = false;
        boolean temLetraMinuscula = false;
        boolean temNumero = false;
        
        // Verificar cada caractere da senha.
        for (char caractere : senha.toCharArray()) {
            if (Character.isUpperCase(caractere)) {
                temLetraMaiuscula = true;
            } else if (Character.isLowerCase(caractere)) {
                temLetraMinuscula = true;
            } else if (Character.isDigit(caractere)) {
                temNumero = true;
            }
            
            // Se já encontramos todos os critérios necessários, podemos parar de verificar.
            if (temLetraMaiuscula && temLetraMinuscula && temNumero) {
                break;
            }
        }
        
        // A senha é válida se atender a todos os critérios.
        return temLetraMaiuscula && temLetraMinuscula && temNumero;
    }
}
