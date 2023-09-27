import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int nFuncionarios;
        System.out.println("Digite o numero de funcionarios a serem cadastrados");
        Scanner a = new Scanner(System.in);
        nFuncionarios = a.nextInt();
        while (nFuncionarios <5){
            System.out.println("O minimo de funcionarios por vez é 5");
            nFuncionarios = a.nextInt();
        }
        String[] nome = new String[nFuncionarios];
        String[] idade = new String[nFuncionarios];
        String[] cargo = new String[nFuncionarios];
        String[] setor = new String[nFuncionarios];
        String[] admissao = new String[nFuncionarios];

        for (int i=0; i<nFuncionarios; i++) {
            System.out.println("Digite o nome do funcionario de numero:"+ (i+1) );
            nome[i] = a.next();
            System.out.println("Digite o nome a idade de numero:"+ (i+1) );
            idade[i] = a.next();
            System.out.println("Digite o nome o cargo de numero:"+ (i+1) );
            cargo[i] = a.next();
            System.out.println("Digite o nome o setor de numero:"+ (i+1) );
            setor[i] = a.next();
            System.out.println("Digite o nome a data de admissão de numero:"+ (i+1) );
            admissao[i] = a.next();
        }
        for (int j=0; j<nFuncionarios; j++) {
            System.out.println(" Nome: " + nome[j] + " Idade: " + idade[j] + " Cargo: " + cargo[j] + " Setor: " + setor[j] + " Data de Admissão: " + admissao[j]);
        }
    }
}