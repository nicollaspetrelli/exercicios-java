package exercicio3;

// PAIS A = 90_000_000 HABITANTES - 3.1% TAXA DE CRESCIMENTO AO ANO
// PAIS B = 200_000_000 HABITANTES - 1.5% TAXA DE CRESCIMENTO AO ANO

public class Exercicio3 {
    public static void main(String[] args) {
        long paisA = 90_000_000L;
        long paisB = 200_000_000L;
        int anos = 0;

        while (paisA < paisB){
            paisA = paisA + 2_790_000;
            //paisB = paisB + 3_000_000;
            anos++;
        }

        // Total de anos considerando que o PAIS B fique estagnado no seu numero de crescimento
        System.out.println("Total de anos: "+ anos);

    }
}
