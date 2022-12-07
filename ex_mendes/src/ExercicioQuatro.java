import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.IntStream;

public class ExercicioQuatro {
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
            // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
            case 1:
                System.out.println("Digite a quantidade de notas: ");
                int qtdNotas = scanner.nextInt();
                double[] notas = new double[qtdNotas];
                for (int i = 0; i < qtdNotas; i++) {
                    System.out.println("Digite a nota " + (i + 1));
                    notas[i] = scanner.nextInt();
                }
                System.out.println("A média das notas é: " + calculaMedia(notas)); 
                break;
            // 2) Crie um programa que imprima um arrays com Foreach.
            case 2:
                printArray(new String[]{ "Teste", "imprimir", "foreach" });
                break;
            // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
            case 3:
                double[] valores = new double[10];
                for (int i = 0; i < valores.length; i++) {
                    System.out.println("Digite o valor " + (i + 1));
                    valores[i] = scanner.nextDouble();
                }
                dezValores(valores);
                break;
            // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
            case 4:
                int[] valoresInt = new int[10];
                for (int i = 0; i < valoresInt.length; i++) {
                    System.out.println("Digite o valor " + (i + 1));
                    valoresInt[i] = scanner.nextInt();
                }
                dezValoresInt(valoresInt);
                break;
            // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imrpima elas.
            case 5:
                System.out.println(baralho());
                break;
            // 6) Crie um programa que una duas listas de inteiros.
            case 6:
                int[] mergeList = mergeIntList(new int[]{ 1, 2, 3 }, new int[]{ 4, 5, 6});
                System.out.println(Arrays.toString(mergeList));
                break;
            // 7) Crie um programa que simule a fila de atendimento de um banco.
            case 7:
                filaBanco(scanner);
                break;
            // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
            case 8:
                String[] meses = new String[] {
                    "Jan",
                    "Fev",
                    "Mar",
                    "Abr",
                    "Mai",
                    "Jun",
                    "Jul",
                    "Ago",
                    "Set",
                    "Out",
                    "Nov",
                    "Dez"
                };
                double[] temperaturas = new double[12];
                for (int i = 0; i < meses.length; i++) {
                    System.out.println("Digite a temperatura de " + meses[i]);
                    temperaturas[i] = scanner.nextDouble();
                }
                System.out.println("A temperatura média do ano é: " + temperaturaMedia(temperaturas));
                break;
            // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
            case 9:
                int[] listaUm = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int[] listaDois = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int[] mergeListAlt = alternarArray(listaUm, listaDois);
                System.out.println(Arrays.toString(listaUm));
                System.out.println(Arrays.toString(listaDois));
                System.out.println(Arrays.toString(mergeListAlt));
                break;
            // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
            case 10:
                int[] valoresVinte = new int[20];
                for (int i = 0; i < valoresVinte.length; i++) {
                    System.out.println("Digite o valor " + (i + 1));
                    valoresVinte[i] += scanner.nextInt();
                }
                mediaVinte(valoresVinte);
                break;
            // DESAFIO
            case 11:
                // detetive();
                break;
        
            default:
                System.out.println("Operação inválida");
                break;
        }
    }   

    // 1) Crie um programa que questione a quantidade de notas a ser informada, receba as notas e calcule a média.
    public static double calculaMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
    // 2) Crie um programa que imprima um arrays com Foreach.
    public static void printArray(String[] array) {
        for (String string : array) {
            System.out.println(string);
        }
        for (int i = 0; i < array.length; i++) {
            String string = array[i];
            System.out.println(string);
        }
    }
    // 3) Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores.
    public static void dezValores(double[] valores) {
        for (double valor : valores) {
            System.out.println(valor);
        }
    }
    // 4) Crie um programa que leia 10 valores int e salve em um array, depois imprima se esses valores são pares ou ímpares.
    public static void dezValoresInt(int[] valores) {
        for (int i : valores) {
            System.out.println("O valor " + i + "é: " + (i % 2 == 0 ? "Par" : "Ímpar"));
        }
    }
    // 5) Crie um programa que possua uma collection que represente as 52 cartas do baralho, imprima elas.
    public static SortedSet<String> baralho() {
        TreeSet<String> baralho = new TreeSet<String>();
        String[] nipes = new String[] { "Paus", "Copas", "Espadas", "Ouros" };
        String[] numeros = new String[] { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        for (String numero : numeros) {
            for (String nipe : nipes) {
                baralho.add(numero + " " + nipe);
            }
        }

        return baralho;
    }
    // 6) Crie um programa que una duas listas de inteiros.
    public static int[] mergeIntList(int[] listaUm, int[] listaDois) {
        int[] lista = new int[listaUm.length + listaDois.length];
        int cnt = 0;
        for (int i : listaUm) {
            lista[cnt] = i;
            cnt++;
        }
        for (int i : listaDois) {
            lista[cnt] = i;
            cnt++;
        }
        return lista;
    }
    // 7) Crie um programa que simule a fila de atendimento de um banco.
    public static void filaBanco(Scanner scanner) {
        Queue<String> filaPadrao = new LinkedList<String>();
        Queue<String> filaPreferencial = new LinkedList<String>();

        System.out.println("Bem vindo ao banco");
        int opc = 0;
        do {
            System.out.println("Digite a operação desejada");
            System.out.println("1 - Atendimento Normal");
            System.out.println("2 - Atendimento Preferencial");
            System.out.println("3 - Chamar número");
            System.out.println("0 - Sair");
            opc = scanner.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Adeus");
                    break;
                case 1:
                    System.out.println("Digite o nome da pessoa: ");
                    filaPadrao.add(scanner.next());
                    break;
                case 2:
                    System.out.println("Digite o nome da pessoa: ");
                    filaPreferencial.add(scanner.next());
                    break;
                case 3:
                    String nome = filaPreferencial.poll();
                    if (nome != null) {
                        System.out.println("Chamar: " + nome);
                    } else {
                        nome = filaPadrao.poll();
                        if (nome != null) {
                            System.out.println("Chamar: " + nome);
                        } else {
                            System.out.println("Não há ninguém na fila");
                        }
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;
            }
        } while (opc != 0);

    }
    // 8) Crie um programa que receba a temperatura média de cada mês do ano e após exiba a temperatura média do ano.
    public static double temperaturaMedia(double[] temperaturas) {
        double soma = 0;
        for (double temperatura : temperaturas) {
            soma += temperatura;
        }
        return soma / temperaturas.length;
    }
    // 9) Crie dois arrays de 10 posições e depois gere um terceiro array com os valores intercalados desses dois arrays, ao final, imprima os 3.
    public static int[] alternarArray(int[] listaUm, int[] listaDois) {
        int[] intercalado = new int[listaUm.length + listaDois.length];
        int cnt = 0;
        for (int i = 0; i < listaUm.length; i++) {
            intercalado[cnt] = listaUm[i];
            cnt++;
            intercalado[cnt] = listaDois[i];
            cnt++;
        }
        return intercalado;
    }
    // 10) Crie um programa que leia 20 valores, calcule a média aritmética desses valores e imprima os valores que são inferiores a esta média.
    public static void mediaVinte(int[] valores) {
        int soma = 0;
        for (int i : valores) {
            soma += i;
        }
        double media = soma / valores.length;

        for (int i : valores) {
            if (media <= i) {
                System.out.println("O valor " + i + " é menor que a média.");
            }    
        }
    }

    public static void detetive() {
        
    }
}
