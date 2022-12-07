import java.util.Scanner;

public class ExercicioUm {

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 1 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Calcule a Área                                    |");
        System.out.println("| 3 - Calcule o Volume                                  |");
        System.out.println("| 4 - Valor é maior que o dobro de outro valor          |");
        System.out.println("| 5 - Cálculo de Bhaskara                               |");
        System.out.println("| 6 - Velocidade Média                                  |");
        System.out.println("| 7 - Percentual de Imposto                             |");
        System.out.println("| 8 - Valor é par ou ímpar                              |");
        System.out.println("| 9 - Comparar dois valores de String                   |");
        System.out.println("| 10 - Valor double em string e convertido para inteiro |");
        System.out.println("| 11 - Imposto de renda de um salário                   |");
        System.out.println("| 12 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que calcule a média (`(nota1 + nota2 + nota3 / 3)`)
            case 1:
                System.out.println("Os números utilizados são: 5, 7, 10");
                double valorMedia = media(5, 7, 10);
                System.out.println("A média dos números é: " + valorMedia);
                break;
            // 2) Crie um programa que calcule a área (`lado1 * lado2`)
            case 2:
                // area(double ladoUm, double ladoDois)
                area(12, 32);
                break;
            // 3) Crie um programa que calcule o volume (`largura * altura * profundidade`)
            case 3:
                // volume(double largura, double altura, double profundidade)
                break;
            // 4) Crie um programa que avalie se um valor é maior do que o dobro de outro
            // valor
            case 4:
                valorMaiorQueDobro(4, 9);
                break;
            // 5) Crie um programa que calcule _bhaskara_
            case 5:
                bhaskara(1, 4, 1);
                break;
            // 6) Crie um programa que calcule a velocidade média de uma viagem (`distancia
            // (km) / tempo (h)`)
            case 6:
                // mediaViagem(double distancia, double tempo)
                mediaViagem(1200, 16);
                break;
            // 7) Crie um programa que calcule o percentual de imposto pago (`faturamento \
            // qtd imposto`)
            case 7:
                // percentualImposto(double faturamento, double qtdImposto)
                percentualImposto(1000, 0.15);
                break;
            // 8) Crie um programa que teste se um valor é par ou ímpar
            case 8:
                // parOuImpar(int valor)
                parOuImpar(10);
                break;
            // 9) Crie um programa que compare dois valores Strings
            case 9:
                // compareString(String stringUm, String stringDois)
                compareString("Testando", "Testando");
                break;
            // 10) Crie um programa que tenha uma variável com ponto em String e converta
            // seu valor para inteiro
            case 10:
                // convertString(String valor);
                break;
            // 11) Crie um programa que receba o salário e diga o valor de imposto de renda
            // conforme abaixo:
            // Base | Alíquota
            // --------- | ------
            // Até 1.903,98 | Isento
            // De 1.903,99 até 2.826,65 | 7,5%
            // De 2.826,66 até 3.751,05 | 15%
            // De 3.751,06 até 4.664,68 | 22,5%
            // Acima de 4.664,68 | 27,5%
            case 11:
                // percentualImpostoSalario(double salario);
                break;
            // DESAFIO - Crie um programa que teste se um número é primo
            case 12:
                // testePrimo(int valor)
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double media(double notaUm, double notaDois, double notaTres) {
        return (notaUm + notaDois + notaTres) / 3;
    }

    public static double area(double ladoUm, double ladoDois) {
        System.out.println("Calculo área!");
        double area = ladoUm * ladoDois;
        System.out.println("A area total é " + area + " m²");
        return 0;
    }

    public static double volume(double largura, double altura, double profundidade) {
        return 0;
    }

    public static boolean valorMaiorQueDobro(double base, double verificar) {
        if (base > verificar * 2) {
            return true;
        } else {
            return false;
        }
    }

    public static double[] bhaskara(int a, int b, int c) {
        double delta = (b * b) - (4 * a * c);
        double x1 = 0;
        double x2 = 0;
        if (delta < 0) {
            System.out.println("Delta é negativo");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            x2 = x1;
        } else {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
        }
        System.out.println(x1);
        System.out.println(x2);
        return new double[] { x1, x2 };
    }

    public static double mediaViagem(double distancia, double tempo) {
        System.out.println("Calcule a média de km/h feita na viagem");
        double mediaViagem = distancia / tempo;
        System.out.println("Foi realizado uma média de " + mediaViagem + " km/H");

        return 0;
    }

    public static double percentualImposto(double faturamento, double qtdImposto) {
        System.out.println("Calcule o percentual de imposto pago");
        double percentualImposto = faturamento * qtdImposto;
        System.out.println("O percentual de imposto pago é " + percentualImposto);
        return 0;
    }

    public static void parOuImpar(int valor) {
        System.out.println("Verifique se o valor é par ou ímpar");
        if (valor % 2 == 0) {
            System.out.println("O valor é par");
        } else {
            System.out.println("O valor é ímpar");
        }
    }

    public static void compareString(String stringUm, String stringDois) {
        System.out.println("Compare duas strings");
        if (stringUm.equals(stringDois)) {
            System.out.println("As strings são iguais");
        } else {
            System.out.println("As strings são diferentes");
        }
    }

    public static int convertString(String valor) {
        double valorDouble = Double.parseDouble(valor);
        int valorInteiro = (int) valorDouble;
        return valorInteiro;
    }

    public static double percentualImpostoSalario(double salario) {
        double percentual = -1;
        if (salario <= 1903.98) {// Até 1.903,98 | Isento
            percentual = 0;
        } else if (salario <= 1903.99 && salario >= 2826.65) { // De 1.903,99 até 2.826,65 | 7,5%
            percentual = 7.5;
        } else if (salario <= 2826.66 && salario >= 3751.05) { // De 2.826,66 até 3.751,05 | 15%
            percentual = 15;
        } else if (salario <= 3751.06 && salario >= 5664.68) { // De 3.751,06 até 4.664,68 | 22,5%
            percentual = 22.5;
        } else if (salario > 4664.68) { // Acima de 4.664,68 | 27,5%
            percentual = 27.5;
        }
        return percentual;
    }

    public static boolean testePrimo(int valor) {
        for (int i = 2; i < valor; i++) {
            if (valor % i == 0) {
                return false;
            }
        }
        return true;
    }

}