package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======EXERCICO 01==========");

        /*
        Solicitar ao usuário o valor de seu salário atual, solicitar também uma porcentagem de  aumento  de  salário
        almejada. Após  os  cálculos,  exibir  o  valor  do  acréscimo  e  o novo salário acréscimo do aumento desejado.
        */

        System.out.println("Digite o seu salário atual: ");
        double salario = entrada.nextDouble();

        System.out.println("Digite o percentual de aumento: ");
        double porcentagem = entrada.nextDouble();

        double acrescimo = salario * (porcentagem /100);
        double novoSalario = salario + acrescimo;

        System.out.printf("Salario atual: R$ %.2f\n",salario);
        System.out.printf("Valor aumento: R$ %.2f\n", acrescimo);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);

        entrada.close();
    }
}
