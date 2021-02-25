package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=======EXERCICO 01==========");

        System.out.println("Digite o seu salário atual: ");
        String txtSalario = entrada.nextLine();

        System.out.println("Digite o percentual de aumento: ");
        String txtAumento = entrada.nextLine();

        // Converte String para Double
        Double salario = Double.parseDouble(txtSalario);
        Float aumento = Float.parseFloat(txtAumento);

        System.out.println("Salario: "+ salario);
        System.out.println("Percentual de aumento: "+ aumento);

        double total = salario + (salario * aumento); //Calculo
        System.out.println("Salário Total: "+ total);

    }
}
