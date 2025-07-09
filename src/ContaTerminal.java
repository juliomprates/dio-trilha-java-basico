import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        //TODO: Importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        //Exibir mensagens solicitando informações do usuário e guardar os valores
        System.out.println("|======================================|");
        System.out.println("| Por favor, informe os dados à seguir |");
        System.out.println("|======================================|\n");
        String agencia, nomeCliente;
        int numeroConta;
        double saldo;

        System.out.print("Nome completo: ");
        nomeCliente = sc.nextLine();

        System.out.print("Agência: ");
        agencia = sc.nextLine();

        System.out.print("Número da conta: ");
        numeroConta = Integer.parseInt(sc.nextLine());

        System.out.print("Saldo: ");
        saldo = Double.parseDouble(sc.nextLine());

        //Imprimir uma mensagem de sucesso
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.\n" +
                "Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$"+ saldo +
                " já está disponível para saque!");
    }
}
