import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Corrigido o nome da variável

        // Coletando informações do usuário
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();  // Corrigido para usar a variável 'scanner'

        System.out.print("Digite tipo de Conta: Corrente ou Poupança: ");
        String tipoDeConta = scanner.nextLine();  // Corrigido para usar a variável 'scanner'

        System.out.print("Digite o saldo da Conta: ");
        double saldo = scanner.nextDouble();  // Corrigido para usar a variável 'scanner'

        // Exibindo informações
        System.out.println("Nome: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);

        // Definindo o menu
        String menu = """
                ** Digite sua opção **
                1 - Consulta saldo
                2 - Transferir valor
                3 - Saque de Valor
                4 - Sair
                """;

        int opcao = 0;
        Scanner leitura = new Scanner(System.in);

        // Loop do menu
        while (opcao != 4) {
            System.out.println(menu);  // Mostra o menu de opções
            opcao = leitura.nextInt();

            // Adiciona uma linha em branco para espaçamento
            System.out.println();

            if (opcao == 1) {
                // Espaçamento antes do resultado
                System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor que deseja transferir?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transferência.");
                } else {
                    saldo -= valor;
                    System.out.println("Novo saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção inválida!");
            }

            // Adiciona uma linha em branco para espaçamento entre interações
            System.out.println();
        }

        scanner.close();
        leitura.close();  // Fecha os scanners
    }
}
