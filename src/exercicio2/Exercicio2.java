package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======EXERCICO 02==========");

        System.out.println("Digite o seu salário atual: ");
        String txtSalario = entrada.nextLine();

        // Converte String para Double
        double salario = Double.parseDouble(txtSalario);

        if (salario <= 1903.98) {
            System.out.println("Isento");
        }

        if ((salario >= 1903.99) && (salario <= 2826.65)) {
            System.out.println("Alíquota: 7,5%");
            System.out.println("Parcela a deduzir do IR: R$ 142,80");
        }

        if ((salario >= 2826.66) && (salario <= 3751.05)) {
            System.out.println("Alíquota: 15%");
            System.out.println("Parcela a deduzir do IR: R$ 354,80");
        }

        if ((salario >= 3751.06) && (salario <= 4664.68)) {
            System.out.println("Alíquota: 22,5%");
            System.out.println("Parcela a deduzir do IR: R$ 869,36");
        }

        if (salario > 4664.68) {
            System.out.println("Alíquota: 27,5%");
            System.out.println("Parcela a deduzir do IR: R$ 869,36");
        }

    }
}
