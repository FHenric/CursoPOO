import java.util.Scanner;
// APRIMORAR ESSA FUNCIONALIDADE

//INSTRUÇÕES:

//  Faça um algoritmo que  calcule o gasto médio de uma família,
//  sabendo que eles só podem ter um gasto de 80% do roçamento.

//  Os gastos são:

//      - Plano de saúde;
//      - Alimentação
//      - Despesas fixas;
//      - Despesas variáveis;
//      - Escola dos filhos;

//  Solicite ao cliente que informe o salário da família,
//  os valores de cada gasto e mostre se ele está dentro do orçamento estipulado,
//  qual o percentual de cada gasto e quanto sobrou ou faltou do salário da família

public class Orcamento {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        double salario, planoSaude, alimentacao, despesasFixas, despesasVariaveis, escola, gastoTotal, porcentGastoTotal;
        int OITENTA_PORCENTO = 80;

        System.out.println("Informe seu salário: ");
        salario = scanner.nextDouble();
        System.out.println("Informe o valor total do plano de saúde: ");
        planoSaude = scanner.nextDouble();
        System.out.println("Informe o gasto total com alimentação: ");
        alimentacao = scanner.nextDouble();
        System.out.println("Informe o total com despesas fixas: ");
        despesasFixas = scanner.nextDouble();
        System.out.println("Informe o total com despesas variaveis: ");
        despesasVariaveis = scanner.nextDouble();
        System.out.println("Informe o gasto total com a educação das crianças: ");
        escola = scanner.nextDouble();

        gastoTotal = planoSaude + alimentacao + despesasFixas + despesasVariaveis + escola;
        porcentGastoTotal = (gastoTotal * 100) / salario;

        System.out.println("---RELATÓRIO---");

        if(porcentGastoTotal <= OITENTA_PORCENTO){
            System.out.println("Seu gasto total esse mês corresponde a " + porcentGastoTotal + "% do seu salário, estamos dentro do padrão!");
        } else if(gastoTotal > salario){
            System.out.println("Seus gastos totais nesse mês superaram a renda!!!");
        } else {
            System.out.println("Seus gastos esse mês chegaram a " + porcentGastoTotal + "%. Você ultrapassou o limite estipulado!");
        }

        System.out.println("---------------------------");

        System.out.println("Seu salário é: " + "R$" + salario);

        System.out.println("O plano de saúde corresponde a " + (planoSaude * 100) / salario + "% do seu salário");
        System.out.println("A alimentação corresponde a " + (alimentacao * 100) / salario + "% do seu salário");
        System.out.println("As despesas fixas correspondem a " + (despesasFixas * 100) / salario + "% do seu salário");
        System.out.println("As despesas variaveis correspondem a " + (despesasVariaveis * 100) / salario + "% do seu salário");
        System.out.println("Os gastos escolares correspondem a " + (escola * 100) / salario + "% do seu salário");

        System.out.println("seus gastos totais são de: R$" + gastoTotal);
        System.out.println("seus gastos são " + porcentGastoTotal + "% do seu salário");
    }
}
