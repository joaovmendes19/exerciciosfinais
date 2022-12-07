import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class ExercicioTres {
    private static Random scanner;

    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 3 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Tabuada com Arquivo                               |");
        System.out.println("| 2 - Ler e imprimir arquivo de texto                   |");
        System.out.println("| 3 - Operações básicas com a Main                      |");
        System.out.println("| 4 - Exponenciação com Precisão Arbitrária             |");
        System.out.println("| 5 - Nome aleatório de 5 pessoas                       |");
        System.out.println("| 6 - Calcular Raio e Área                              |");
        System.out.println("| 7 - Avaliar se TXT tem JAVA                           |");
        System.out.println("| 8 - 10 primeiros dígitos                              |");
        System.out.println("| 9 - Área com a Main                                   |");
        System.out.println("| 10 - Receba nome de arquivo na Main com valores       |");
        System.out.println("| 11 - Ler e imprimir arquivo de texto                  |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie um programa que receba um valor e calcule a tabuada deste valor, salvando seu resultado em um arquivo de texto.
            case 1:
                 int numero= 10;
                tabuada( numero);
                break;
            // 2) Crie um programa que leia e imprima no console todas as linhas de um arquivo de texto.
            case 2:
                // lerArquivoTexto(String arquivo);
                break;
            // 3) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule as operações básicas com eles.
            case 3:
                // operacoesBasicas(int numeroUm, int numeroDois)
                break;
            // 4) Crie um programa que execute uma operação de Exponenciação com o valor inteiro com precisão arbitrária.
            case 4:
                // bigIntExpo(BigInteger base, int pow);
                break;
            // 5) Crie um programa que receba o nome de 5 pessoas e aleatorize eles.
            case 5:
                // aleatorizarPessoas();
                break;
            // 6) Crie um programa que calcule o raio e a área de uma circunferência (`C = 2πr` e `A = π(r²)`).
            case 6:
                // areaECircunferencia(double raio);
                break;
            // 7) Crie um programa que avalie se um arquivo de texto possui a string "JAVA".
            case 7:
                // hasJava(String arquivo);
                break;
            // 8) Crie um programa que leia as linhas de um arquivo e imprima no console apenas os 10 primeiros digitos de cada linha.
            case 8:
                // dezDigitos()
                break;
            // 9) Crie um programa que receba como entrada da classe Main dois valores numéricos e calcule a área dos valores (`area = lado1 * lado2`).
            case 9:
                // calculaArea(double numeroUm, double numeroDois);
                break;
            // 10) Crie um programa que receba como entrada da classe Main o nome de um arquivo de texto que contenha valores numéricos e some todos os valores, imprimindo no console a soma.
            case 10:
                // somaValoresArquivo(String arquivo);
                break;
            // ## DESAFIO - Crie um Jogo da Forca com Arquivos de Texto**
            case 11:
                // forcaComTxt();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }
        
    }

    public static void tabuada(int numero) {
        
        int Num31; // Valor da Variável
        int inicio31, fim31;

        System.out.println("Informe a Tabuada: ");
        Num31 = scanner.nextInt();
        System.out.println("Informe o inicio da tabuada: ");
        inicio31 = scanner.nextInt();
        System.out.println("Informe o fim da tabuada: ");
        fim31 = scanner.nextInt();

        FileWriter tabuada = new FileWriter("tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(tabuada);

        gravarArq.printf("---Resultado---%n");
        for (int i = inicio31; i <= fim31; i++) {
            System.out.println(" " + Num31 + " x " + i + " = " + Num31 * i);

            gravarArq.printf(" %2d X %d = %2d %n", Num31, i, (Num31 * i));
        }
        

    }
}

    public static void lerArquivoTexto(String arquivo) {
        
        System.out.printf("Informe o Nome de Arquivo Texto:\n");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.printf("\nConteúdo do Arquivo Texto:\n");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            
            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); 
            }
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
      
   
    }
    }

    public static int[] operacoesBasicas(int numeroUm, int numeroDois) {
        return new int[4];
    }

    public static BigInteger bigIntExpo(BigInteger base, int pow) {
        return base;
    }

    public static void aleatorizarPessoas(String pessoas[]) {
        HashSet<String> hash5 = new HashSet<String>();
        Scanner ent5 = new Scanner(System.in);
        System.out.println("Kadu Floresta");

      

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º Nome: ");
            String aux = ent5.nextLine();
            hash5.add(aux);

        }
        System.out.println(hash5);

    public static double[] areaECircunferencia(double raio) {
        return new double[2];
    }

    public static boolean hasJava(String arquivo) {
        return false;
    }

    public static void dezDigitos(String arquivo) {
        
    }

    public static double calculaArea(double numeroUm, double numeroDois) {
        int A = 0;
        int B = 0;
        int adic;
        int subtr;
        int multip;
        int div;

        System.out.println("Digite o 1º valor: ");
        A = scanner.nextInt();
        System.out.println("Digite o 2º valor: ");
        B = scanner.nextInt();

        adic = ((A + B));
        subtr = (A - B);
        multip = (A * B);
        div = (A / B);

        System.out.println("\n" + A + " + " + B + " = " + adic);
        System.out.println(+A + " - " + B + " = " + subtr);
        System.out.println(+A + " * " + B + " = " + multip);
        System.out.println(+A + " / " + B + " = " + div);
        return div;
        

    }

    public static double somaValoresArquivo(String arquivo) {
        return 0;
    }

    public static void forcaComTxt() {
        
    }
}