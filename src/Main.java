//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada pelas 3 notas da Jack, Paulo e Suelem;
        double media = (7.2 + 5.2 + 6.0) /3;
        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.printf("Média do filme: %.1f ", media );
        System.out.println(sinopse);

        int classificacao = (int) (media/2);
        System.out.println(classificacao);


    }
    }

