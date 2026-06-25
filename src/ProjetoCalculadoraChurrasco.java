import java.util.Scanner;

public class ProjetoCalculadoraChurrasco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();
        System.out.println("Olá " + nome + "!");

        System.out.println("Digite a quantidade de adultos: ");
        int numAdultos = input.nextInt();

        System.out.println("Digite a quantidade de crianças: ");
        int numCriancas = input.nextInt();

        System.out.println("Digite a duração do churrasco em horas: ");
        int duracaoChurrasco = input.nextInt();

        int carne = (numAdultos * 400 + numCriancas * 200); // Calculo de consumo de adultos e crianças
        int refrigerante = (numAdultos * 500 + numCriancas * 300);
        int agua = (numAdultos + numCriancas) * 300;

        String mensagemConsumo = "";
        String mensagemAumento = "";

        if (duracaoChurrasco > 6) {
            carne = (int) (carne * 1.5); // Necessário converter para int porque 1.5 gera um resultado double, e a carne esta declarada como inteiro
            refrigerante = (int) (refrigerante * 1.5);
            agua = (int) (agua * 1.5);
            mensagemConsumo = "Churrasco com mais de 6 horas detectado!";
            mensagemAumento = "Consumo aumentado em 50%";
        } else if (duracaoChurrasco > 4) {
            carne = (int) (carne * 1.25);
            refrigerante = (int) (refrigerante * 1.25);
            agua = (int) (agua * 1.25);
            mensagemConsumo = "Churrasco com mais de 4 horas detectado!";
            mensagemAumento = "Consumo aumentado em 25%";
        }
        double kgCarne = (carne / 1000.0); // Conversão de gramas para kg e de ml para litros
        double litrosRefrigerante = (refrigerante / 1000.0);
        double litrosAgua = (agua / 1000.0);


        System.out.println("========================");
        System.out.println("CALCULADORA DE CHURRASCO!");
        System.out.println("========================");
        System.out.println("Adultos: " + numAdultos);
        System.out.println("Crianças: " + numCriancas);
        System.out.println("Responsável: " + nome);
        System.out.printf("Quantidade de Carne: %dg (%.2f kg)%n", carne, kgCarne);
        System.out.printf("Quantidade de Refrigerante: %dml (%.2f L)%n", refrigerante, litrosRefrigerante);
        System.out.printf("Quantidade de Água: %dml (%.2f L)%n", agua, litrosAgua);
        System.out.println(mensagemConsumo);
        System.out.println(mensagemAumento);
        System.out.println("Bom Churrasco!");
        System.out.println("========================");

    }
}
