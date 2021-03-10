package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======EXERCICO 02==========");

        /*
        Baseado na tabela de Cálculo de Imposto de Renda na tabela acima, crie um programa que receba o valor do salário
        bruto do usuário e informe a alíquota aplicada e o valor da parcela a deduzir do Imposto de Renda para o valor inserido.
        */

        double aliquota;
        double valorParcelaIr = 0D;

        System.out.println("Digite o seu salário atual: ");
        double salarioAtual = entrada.nextDouble();

        if(salarioAtual < 1_903.99) {
            aliquota = 0D;
        } else if(salarioAtual < 2_826.66) {
            aliquota = 0.075;
        } else if (salarioAtual < 3_751.06){
            aliquota = 0.15;
        } else if(salarioAtual < 4_664.68) {
            aliquota = 0.225;
        } else {
            aliquota = 0.275;
        }

        valorParcelaIr = salarioAtual * aliquota;

        System.out.printf("Salário bruto: R$ %.2f\n", salarioAtual);
        System.out.printf("Aliquota: %.2f\n", (aliquota * 100));
        System.out.printf("Parcela: R$ %.2f\n", valorParcelaIr);

        entrada.close();
    }
}
