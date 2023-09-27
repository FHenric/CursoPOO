import java.util.Scanner;

public class StorageControl {
    public static void main(String[] args) {
        int[] pecas = new int[3];
        int numero;
        int venda;
        int compra;
        int tipoEntrada;
        boolean continuar;

        Scanner leia = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Informe a quantidade da peça " + (i + 1) + ": ");
            pecas[i] = leia.nextInt();
        }

        do {

            System.out.println("Digite 1 para compra ou 2 para venda de produto: ");
            tipoEntrada = leia.nextInt();

            switch (tipoEntrada) {
                case 1 -> {
                    System.out.println("Escolha o produto que quer modificar: (1), (2) ou (3): ");
                    numero = leia.nextInt();
                    numero--;

                    if (numero < 0 || numero > 2) {
                        System.out.println("Numero de produto inválido ");
                        break;
                    }

                    System.out.println("Digite a quantidade de compra: ");
                    compra = leia.nextInt();

                    pecas[numero] = pecas[numero] + compra;

                    System.out.println(compra + " peças foram adicionada ao estoque ");
                }
                case 2 -> {
                    System.out.println("Escolha o produto que quer modificar: (1), (2) ou (3): ");
                    numero = leia.nextInt();
                    numero--;

                    if (numero < 0 || numero > 2) {
                        System.out.println("Numero de produto inválido ");
                        break;
                    }

                    System.out.println("Digite a quantidade de venda: ");
                    venda = leia.nextInt();

                    if (venda > pecas[numero]) {
                        System.out.println("Saldo insuficiente ");
                        break;
                    }

                    pecas[numero] = pecas[numero] - venda;
                    System.out.println(venda + " peças foram retiradas do estoque ");
                }
                default -> System.out.println("Entrada Inválida!");
            }

            for (int j = 0; j < 3; j++) {
                System.out.println(" Nova quantidade da peça " + j + 1 + " é: " + pecas[j]);
            }

            System.out.println("Você quer continuar administrando? (s) ou (n): ");
            continuar = leia.nextBoolean();

        } while (continuar);

    }
}
