import java.util.Scanner;

public class ExercicioCinco {
    
    public static void call(Scanner scanner) {
        System.out.println("=== EXERCÍCIOS - LISTA 5 ===");

        System.out.println("+-------------------------------------------------------+");
        System.out.println("| 1 - Criar Pessoa                                      |");
        System.out.println("| 2 - IMC de Pessoa                                     |");
        System.out.println("| 3 - Conta Corrente                                    |");
        System.out.println("| 4 - Movimentacao Conta                                |");
        System.out.println("| 5 - Circunferencia                                    |");
        System.out.println("| 6 - Cifra de César                                    |");
        System.out.println("+-------------------------------------------------------+");

        int menu = 0;
        try {
            menu = scanner.nextInt();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            menu = 0;
        }

        switch (menu) {
            // 1) Crie uma classe que represente uma Pessoa, devendo ter as propriedades Nome, Peso, Altura e Data de Nascimento e o método IMC, que retornará o valor do IMC.
            case 1:
                // criarPessoa();
                criarPessoa();
                break;
            /* 2) Crie um programa que receba a pessoa criada e verifique qual o IMC.

            IMC               | Classificação
            ----------------- | ------
            Abaixo de 18,5    | Abaixo do Peso
            Entre 18,6 e 24,9 | Peso Ideal
            Entre 25,0 e 29,9 | Levemente acima do peso
            Entre 30,0 e 34,9 | Obesidade Grau I
            Entre 35,0 e 39,9 | Obesidade Grau II
            Acima de 40       | Obesidade Grau III (mórbida)
            */                
            case 2:
                // verificarIMC();
                verificarIMC();
                break;
            // 3) Crie uma classe que represente uma Conta Corrente, devendo ter as propriedades Número da Conta, Agência, Saldo, Nome do Titular e os métodos Depósito, Saque e Saldo Total.
            case 3:
                // contaCorrente();
                contaCorrente();
                break;
            // 4) Crie um programa que receba a conta corrente e deposite e saque valores, ao final imprimindo o saldo existente.
            case 4:
                // depositarValores();
                depositarValores();
                break;
            // 5) Crie uma classe que calcule a área de uma circunferência, recebendo com valor inicial o raio
            case 5:
                // circunferencia();
                circunferencia();
                break;
            // 6) Crie uma classe para Cifra de César, devendo ter um método criptografia e receba como valor inicial uma mensagem e o valor constante. Cifra de César é uma das criptografias mais antigas conhecidas, onde a chave está no valor constante, para cada letra do alfabeto atribuí-se um número (exemplo: A=1;B=2;C=3,etc), então para cada letra da mensagem, soma-se o valor correspondente a esta letra ao valor constante, gerando uma nova letra para formar a nova mensagem, ou seja, a mensagem "Ataque a roma" com um valor constante de 3 seria "dwdtxh d urpd". Dica, utilize arrays para isso.
            case 6:
                // cifraCesar();
                cifraCesar();
                break;
            default:
                System.out.println("Operação inválida");
                break;
        }

    }

    public static void criarPessoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 1 - CRIAR PESSOA ===");

        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a data de nascimento da pessoa: ");
        String dataNascimento = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso, altura, dataNascimento);

        System.out.println("Pessoa criada com sucesso!");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Peso: " + pessoa.getPeso());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
    }

    public static void verificarIMC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 2 - VERIFICAR IMC ===");

        System.out.println("Digite o nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o peso da pessoa: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura da pessoa: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite a data de nascimento da pessoa: ");
        String dataNascimento = scanner.nextLine();

        Pessoa pessoa = new Pessoa(nome, peso, altura, dataNascimento);

        System.out.println("IMC: " + pessoa.getIMC());
    }

    public static void contaCorrente() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 3 - CRIAR CONTA CORRENTE ===");

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, numeroAgencia, saldo, nomeTitular);

        System.out.println("Conta corrente criada com sucesso!");
        System.out.println("Número da conta: " + contaCorrente.getNumeroConta());
        System.out.println("Número da agência: " + contaCorrente.getNumeroAgencia());
        System.out.println("Saldo: " + contaCorrente.getSaldo());
        System.out.println("Nome do titular: " + contaCorrente.getNomeTitular());
    }

    public static void depositarValores() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 4 - DEPOSITAR VALORES ===");

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o nome do titular da conta: ");
        String nomeTitular = scanner.nextLine();

        ContaCorrente contaCorrente = new ContaCorrente(numeroConta, numeroAgencia, saldo, nomeTitular);

        System.out.println("Digite o valor a ser depositado: ");
        double valorDeposito = scanner.nextDouble();

        contaCorrente.depositar(valorDeposito);

        System.out.println("Valor depositado com sucesso!");
        System.out.println("Saldo atual: " + contaCorrente.getSaldo());
    }

    public static void circunferencia() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 5 - CIRCUNFERÊNCIA ===");

        System.out.println("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        Circunferencia circunferencia = new Circunferencia(raio);

        System.out.println("Circunferência criada com sucesso!");
        System.out.println("Raio: " + circunferencia.getRaio());
        System.out.println("Área: " + circunferencia.getArea());
        System.out.println("Comprimento: " + circunferencia.getComprimento());
    }

    public static void cifraCesar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== EXERCÍCIO 6 - CIFRA DE CESAR ===");

        System.out.println("Digite o texto a ser criptografado: ");
        String texto = scanner.nextLine();

        System.out.println("Digite o número de casas: ");
        int numeroCasas = scanner.nextInt();

        CifraDeCesar cifraCesar = new CifraDeCesar(texto, numeroCasas);

        System.out.println("Texto criptografado: " + cifraCesar.criptografar());
    }
}
