import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite seu nome");
        String name = sc.nextLine();

        System.out.println("Por favor, digite sua agência");
        String aggency = sc.nextLine();

        System.out.println("Digite o número da conta: ");
        int accountNumber = sc.nextInt();

        System.out.println("Digite seu saldo");
        double balance = sc.nextDouble();

        ContaBancaria newAccount = new ContaBancaria(accountNumber, aggency, name, balance);
        newAccount.returnAccount();


    }
}