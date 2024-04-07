public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2021;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo!");
        } else {
            System.out.println("Vale a pena ver de novo!");
        }

        if (incluidoNoPlano || tipoPlano.equals("plus")) {
            System.out.println("Liberado");
        } else {
            System.out.println("Efetue o seu pagamento");
        }
    }

}