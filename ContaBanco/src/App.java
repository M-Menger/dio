import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        System.out.println("Qual seu nome: ");
        String nome_cliente = scanner.nextLine();
        
        System.out.println("Digite a Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Digite o número: ");
        int numero = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();
        
        ContaTerminal novoCliente = new ContaTerminal(numero, agencia, nome_cliente, saldo);

        novoCliente.getCliente();
    }
}

