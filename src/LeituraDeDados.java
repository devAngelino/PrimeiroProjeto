import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu desenho favorito");
        String desenho = leitura.nextLine();
        System.out.println("Qual o ano de lançamento? ");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliação para o desenho ");
        double avaliacao = leitura.nextDouble();

        System.out.println(desenho);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);

    }
}
