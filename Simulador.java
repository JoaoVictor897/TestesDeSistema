import java.util.Scanner;

public class Simulador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();

        saldo += deposito;
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + saldo);

        System.out.print("Digite o valor do saque: ");
        double saque = scanner.nextDouble();

        if (saque <= saldo) {
            saldo -= saque;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }

        scanner.close();
    }
}

