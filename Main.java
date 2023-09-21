import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de ingresso: ");
        System.out.println("1 - Ingresso Normal");
        System.out.println("2 - Ingresso VIP");
        System.out.println("3 - Ingresso Camarote");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite o valor do ingresso normal: R$");
                double valorNormal = scanner.nextDouble();
                Normal ingressoNormal = new Normal(valorNormal);
                ingressoNormal.imprimir();
                break;
            case 2:
                System.out.print("Digite o valor do ingresso VIP: R$");
                double valorVIP = scanner.nextDouble();
                System.out.print("Digite o valor adicional do ingresso VIP: R$");
                double adicionalVIP = scanner.nextDouble();
                VIP ingressoVIP = new VIP(valorVIP, adicionalVIP);
                ingressoVIP.imprimir();
                break;
            case 3:
                System.out.print("Digite o valor do ingresso do camarote: R$");
                double valorCamarote = scanner.nextDouble();
                System.out.print("Digite o valor adicional do ingresso do camarote: R$");
                double adicionalCamarote = scanner.nextDouble();
                System.out.print("Digite a localização do camarote: ");
                scanner.nextLine(); // Consumir a quebra de linha pendente
                String localizacaoCamarote = scanner.nextLine();
                Camarote ingressoCamarote = new Camarote(valorCamarote, adicionalCamarote, localizacaoCamarote);
                ingressoCamarote.imprimir();
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        // Aqui você pode criar instâncias de Funcionario, SalarioFixo, Comissao e Produtividade
        // e chamar o método calcularProventos() para calcular os proventos de cada funcionário.
    }
}
