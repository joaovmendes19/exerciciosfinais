import java.util.Scanner;

public class ExercicioDois {


    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 2 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Calcule a Média                                   |");
        System.out.println("| 2 - Mês do Ano                                        |");
        System.out.println("| 3 - Forca                                             |");
        System.out.println("| 4 - Tabuada                                           |");
        System.out.println("| 5 - Letra a Letra                                     |");
        System.out.println("| 6 - Número ímpares multiplos de 7                     |");
        System.out.println("| 7 - Calcule a Média de Notas informadas               |");
        System.out.println("| 8 - Fatorial                                          |");
        System.out.println("| 9 - Calculo IMC                                       |");
        System.out.println("| 10 - Operadores                                       |");
        System.out.println("| 11 - DESAFIO                                          |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba três notas calcule a média e diga se foi aprovado (`(nota1 + nota2 + nota3 / 3)`) e (`média maior que 7 para ser aprovado`).
            case 1:
                System.out.println("Programa que calcula a média de três valores.");
                System.out.println("Digite o primeiro valor: ");
                double notaUm = scanner.nextDouble();
                System.out.println("Digite o segundo valor: ");
                double notaDois = scanner.nextDouble();
                System.out.println("Digite o terceiro valor: ");
                double notaTres = scanner.nextDouble();
                System.out.println("A média das três notas é: " + calculaMedia(notaUm, notaDois, notaTres));
                if(calculaMedia(notaUm, notaDois, notaTres) >= 7){
                    System.out.println("Você foi aprovado!");
                } else {
                    System.out.println("Você foi reprovado!");
                }
                break;
            // 2) Crie um programa que receba um número e indique o mês que representa.
            case 2:
                System.out.println("Programa que recebe um número e retorna o mês representante. ");
                System.out.println("Digite um valor de 1 à 12: ");
                int mes = scanner.nextInt();
                System.out.println("O mês representado pelo número é: " + qualMes(mes));
                break;
            // 3) Crie um programa que simule um jogo da forca, com a entrada da palavra oculta, a quantidade de tentativas para acerto e depois solicite a entrada da palavra. A cada erro deve imprimir a quantidade de tentativas restantes e o 'membro' que foi marcado. Ao final deve imprimir se acertou ou não a palavra e se foi 'enforcado'.
            case 3:
                System.out.println("Programa que simula o jogo de forca. ");
                System.out.println("Digite a palavra: ");
                String palavr4 = scanner.next();
                System.out.println("Digite a quantidade de tentativas: ");
                int tentativa = scanner.nextInt();
                System.out.println("Tente adivinhar qual é a palavra");
                for(int i = tentativa; i > 0; i--)
                {
                    System.out.println("Você tem " + i + " tentativas");
                    String scan = scanner.next();
                    if(scan.equals(palavr4)) {
                        System.out.println("Acertou");
                        break;
                    } else {
                        System.out.println("Errou");
                    }      
                }
                // forca(String palavra, int tentativa, Scanner scanner);
                break;
            // 4) Crie um programa que imprima a tabuada de 0 a 10.
            case 4:
                System.out.println("Programa que imprime a tabuada de 0 à 10. ");
                System.out.println("Digite um valor: ");
                int numero = scanner.nextInt();
                System.out.println("Resultado: " + Arrays.toString(tabuada(numero)));
                break;
            // 5) Crie um programa que receba uma String e imprima linha a linha suas letras.
            case 5:
                System.out.println("Programa que imprime linha a linha as letras de uma string. ");
                System.out.println("Digite a palavra: ");
                String palavra = scanner.next();
                for(char letra : letraALetra(palavra)){
                    System.out.println(letra);
                }
                break;
            // 6) Crie um programa que de a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500.
            case 6:
                System.out.println("Programa que dá a soma de todos os números ímpares e múltiplos de 7 entre 1 e 500. ");
                System.out.println("O resultado é: " + numerosImpares());
                // numerosImpares();
                break;
            // 7) Crie um programa que tenha como entrada as notas de um aluno. Somente se encerrará quando for inserida uma nota negativa. Ao final deverá informar a média das notas.
            case 7:
                System.out.println("Programa que calcula as médias das notas de um aluno.");
                double[] notas = new double[500];
                for(int i = 1; i < notas.length; i++) {
                    System.out.println("Digite a " + i + "º nota: ");
                    notas[i - 1] = scanner.nextDouble();
                    if(notas[i -1] < 0) {
                        System.out.println("O resultado da média das notas é: " + calculaMedia(notas));
                        break;
                    }
                }
                break;
            // 8) Crie um programa que receba um valor e imprima o fatorial desse número. Ex.: 3! = 3 x 2 x 1 = 6.
            case 8:
                System.out.println("Programa que imprime o fatorial de um número. ");
                System.out.println("Digite um valor: ");
                int numer0 = scanner.nextInt();
                System.out.println("O fatorial é: " + fatorial(numer0));
                break;
            // 9) Crie um programa que receba a altera e o peso e calcule o IMC:
            // 
            // IMC | Classificação
            // --- | ------
            // Abaixo de 18,5 | Abaixo do Peso
            // Entre 18,6 e 24,9 | Peso Ideal
            // Entre 25,0 e 29,9 | Levemente acima do peso
            // Entre 30,0 e 34,9 | Obesidade Grau I
            // Entre 35,0 e 39,9 | Obesidade Grau II
            // Acima de 40 | Obesidade Grau III (mórbida)
            case 9:
                System.out.println("Programa que calcula IMC. ");
                System.out.println("Digite sua altura em métros: ");
                double altura = scanner.nextDouble();
                System.out.println("Digite  seu peso em kg: ");
                double peso = scanner.nextDouble();
                if(imc(altura, peso) < 18.5) {
                    System.out.println("Você está abaixo do peso. ");
                } else if((imc(altura, peso) > 18.6) && (imc(altura, peso) < 24.9)) {
                    System.out.println("Você está no peso ideal. ");
                } else if((imc(altura, peso) > 25) && (imc(altura, peso) < 29.9)) {
                    System.out.println("Você está levemente acima do peso. ");
                } else if((imc(altura, peso) > 30) && (imc(altura, peso) < 34.9)) {
                    System.out.println("Você está com obesidade grau I. ");
                } else if((imc(altura, peso) > 35) && (imc(altura, peso) < 39.9)) {
                    System.out.println("Você está com obesidade grau II. ");
                } else {
                    System.out.println("Você está com obesidade grau III. ");
                }
                break;
            // 10) Crie um programa que receba dois valores e solicite a operação a ser realizada (+ - * /). Ao final imprima o resultado.
            case 10:
                System.out.println("Programa que opera com varias operações com dois valores. ");
                System.out.println("Digite um valor: ");
                int valorUm = scanner.nextInt();
                System.out.println("Digite a operação (+, -, *, /): ");
                char operacao = scanner.next().charAt(0);
                System.out.println("Digite um outro valor: ");
                int valorDois = scanner.nextInt();
                System.out.println("Resultado: " + operador(valorUm, valorDois, operacao));
                break;
            // DESAFIO: Crie um programa que receba um valor em reais e determine qual o mínimo de notas necessárias para entregá-lo. <br> Notas: R$ 200, R$ 100, R$ 50, R$ 10, R$ 5, R$ 1 <br> Exemplo: R$ 15 -> 1 nota de R$ 10 e 1 nota de R$ 5
            case 11:
                // notasNecessarias(int valor);
            default:
                System.out.println("Operação inválida");
                break;
        }
    }

    public static double calculaMedia(double notaUm, double notaDois, double notaTres) {
        double media = (notaUm+notaDois+notaTres)/3;
        return media;
    }

    public static String qualMes(int mes) {
        switch (mes) {
            case 1:{
                return "Janeiro";
            }
            case 2:{
                return "Fevereiro";
            }
            case 3:{
                return "Março";
            }
            case 4:{
                return "Abril";
            }
            case 5:{
                return "Maio";
            }
            case 6:{
                return "Junho";
            }
            case 7:{
                return "Julho";
            }
            case 8:{
                return "Agosto";
            }
            case 9:{
                return "Setembro";
            }
            case 10:{
                return "Outubro";
            }
            case 11:{
                return "Novembro";
            }
            case 12:{
                return "Dezembro";
            }
            default:{
                return "Valor inválido!";
            }
        }
    }

    public static int[] tabuada(int numero) {
        int[] vet = new int[10];
        for(int i = 1; i <= 10; i++){
            vet[i - 1] = numero * i;
        }
        return vet;
    }

    public static char[] letraALetra(String palavra) {
        char[] word = new char[palavra.length()];
        for(int i = 0; i < word.length; i++){
            word[i] = palavra.charAt(i);
        }
        return word;
    }

    public static int numerosImpares() {
        int[] num = new int[500];
        int soma = 0;
        for(int i = 0; i< 500; i++){
            num[i] = i;
        }
        for(int i = 0; i < 500; i++){
            if((num[i] % 2 == 1) && (num[i] % 7 == 0)){
                soma = soma + num[i];
            }
        }
        return soma;
    }

    public static double calculaMedia(double[] notas) {
        double cont = 0;
        int j = 0;
        for(int i = 0; i < notas.length; i++) {
            if(notas[i] > 0) {
                cont = cont + notas[i];
                j++;
            }   
        }
        cont = cont/j;
        return cont;
    }

    public static int fatorial(int numer0) {
        return 0;
    }

    public static double imc(double altura, double peso) {
        double calcimc = peso / (altura*altura);
        return calcimc;
    }

    public static double operador(int valorUm, int valorDois, char operacao) {
        double op = 0;
        switch (operacao) {
            case '+':{
                op = valorUm + valorDois;
                break;
            }
            case '-':{
                op = valorUm - valorDois;
                break;
            }
            case '/':{
                op = valorUm / valorDois;
                break;
            }
            case '*':{
                op = valorUm * valorDois;
                break;
            }
            default: {
                System.out.println("Operador inválido. ");
                break;
            }
        }
        return op;
    }

    public static int[] notasNecessarias(int valor) {
        return new int[6];
    }
}
