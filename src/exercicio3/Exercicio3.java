package exercicio3;

// PAIS A = 90_000_000 HABITANTES - 3.1% TAXA DE CRESCIMENTO AO ANO
// PAIS B = 200_000_000 HABITANTES - 1.5% TAXA DE CRESCIMENTO AO ANO

public class Exercicio3 {
    public static void main(String[] args) {
        double paisA = 90_000_000L;
        double paisB = 200_000_000L;
        int anos = 0;

        while (paisA < paisB){
            paisA = paisA + (paisA * 3.1) / 100;
            paisB = paisB + (paisB * 1.5) / 100;
            anos++;
        }

        // Total de anos para o PaisA ultrapassar o PaisB em numeros de Habitantes
        System.out.println("Total de anos: "+ anos);

    }
}
