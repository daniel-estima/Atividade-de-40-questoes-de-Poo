package lista_de_exercicio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class lista_de_exercicio {
    static Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        int q;
        do {
            q = lerInteiroValido("Questão (1 a 40; 0 para sair): ");
            switch (q) {
                case 1: q1(); break; case 2: q2(); break; case 3: q3(); break;
                case 4: q4(); break; case 5: q5(); break; case 6: q6(); break;
                case 7: q7(); break; case 8: q8(); break; case 9: q9(); break;
                case 10: q10(); break; case 11: q11(); break; case 12: q12(); break;
                case 13: q13(); break; case 14: q14(); break; case 15: q15(); break;
                case 16: q16(); break; case 17: q17(); break; case 18: q18(); break;
                case 19: q19(); break; case 20: q20(); break; case 21: q21(); break;
                case 22: q22(); break; case 23: q23(); break; case 24: q24(); break;
                case 25: q25(); break; case 26: q26(); break; case 27: q27(); break;
                case 28: q28(); break; case 29: q29(); break; case 30: q30(); break;
                case 31: q31(); break; case 32: q32(); break; case 33: q33(); break;
                case 34: q34(); break; case 35: q35(); break; case 36: q36(); break;
                case 37: q37(); break; case 38: q38(); break; case 39: q39(); break;
                case 40: q40(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida. Digite um número entre 0 e 40.");
            }
        } while (q != 0);
        sc.close();
    }

    static int lerInteiroValido(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                int valor = sc.nextInt();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                sc.nextLine(); 
            }
        }
    }

    static double lerDoubleValido(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                double valor = sc.nextDouble();
                sc.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número (ex: 10.5).");
                sc.nextLine();
            }
        }
    }

    static void q1() {
        int n = lerInteiroValido("Digite N: ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i + " Par");
            else System.out.println(i + " Ímpar");
        }
    }

    static void q2() {
        int soma = 0;
        for (int i = 1; i <= 100; i++)
            if (i % 2 == 0) soma += i;
        System.out.println("Soma dos pares: " + soma);
    }

    static void q3() {
        int i = 1, soma = 0;
        while (i <= 100) {
            if (i % 2 != 0) soma += i;
            i++;
        }
        System.out.println("Soma dos ímpares: " + soma);
    }

    static void q4() {
        for (int i = 1; i <= 50; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    static void q5() {
        int total = 0;
        for (int n = 2; n <= 50; n++) {
            boolean primo = true;
            for (int d = 2; d * d <= n; d++)
                if (n % d == 0) primo = false;
            if (primo) total++;
        }
        System.out.println("Primos: " + total);
    }

    static void q6() {
        int n = lerInteiroValido("Digite N: ");
        if (n < 0) {
            System.out.println("Número negativo.");
        } else {
            long fat = 1;
            for (int i = 2; i <= n; i++) fat *= i;
            System.out.println("Fatorial: " + fat);
        }
    }

    static void q7() {
        for (int n = 2; n <= 500; n++) {
            int soma = 0;
            for (int d = 1; d < n; d++)
                if (n % d == 0) soma += d;
            if (soma == n) System.out.println(n);
        }
    }

    static void q8() {
        int a = 0, b = 1;
        for (int i = 1; i <= 20; i++) {
            System.out.println(a + (a % 2 == 0 ? " (par)" : ""));
            int prox = a + b;
            a = b;
            b = prox;
        }
    }

    static void q9() {
        int n = lerInteiroValido("Digite N: ");
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println("Decolagem!");
    }

    static void q10() {
        double saldo = 1000;
        double saque;
        do {
            saque = lerDoubleValido("Saque (0 sai): ");
            if (saque > 0 && saque <= saldo) {
                saldo -= saque;
                System.out.printf("Autorizado. Saldo: %.2f%n", saldo);
            } else if (saque > saldo) {
                System.out.println("Saldo insuficiente.");
            }
        } while (saque != 0);
    }

    static void q11() {
        int n = lerInteiroValido("Digite o número (1-10): ");
        for (int i = 1; i <= 10; i++)
            if (i % 3 != 0) System.out.println(n + " x " + i + " = " + (n * i));
    }

    static void q12() {
        int n = lerInteiroValido("Quantos números? ");
        int maior = 0, menor = 0;
        for (int i = 0; i < n; i++) {
            int valor = lerInteiroValido("Valor " + (i + 1) + ": ");
            if (i == 0) {
                maior = valor;
                menor = valor;
            } else {
                if (valor > maior) maior = valor;
                if (valor < menor) menor = valor;
            }
        }
        System.out.println("Maior: " + maior + " | Menor: " + menor);
    }

    static void q13() {
        int n = lerInteiroValido("Quantos alunos? ");
        for (int i = 0; i < n; i++) {
            double nota = lerDoubleValido("Nota do aluno " + (i + 1) + ": ");
            if (nota >= 7) System.out.println("Aprovado");
            else if (nota >= 5) System.out.println("Recuperação");
            else System.out.println("Reprovado");
        }
    }

    static void q14() {
        int n = lerInteiroValido("Quantos alunos? ");
        int aprovados = 0, reprovados = 0;
        for (int i = 0; i < n; i++) {
            double nota = lerDoubleValido("Nota do aluno " + (i + 1) + ": ");
            if (nota >= 7) aprovados++;
            else reprovados++;
        }
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Reprovados: " + reprovados);
    }

    static void q15() {
        int n = lerInteiroValido("Digite um número: ");
        int original = n, invertido = 0;
        while (n != 0) {
            invertido = invertido * 10 + n % 10;
            n /= 10;
        }
        System.out.println(original == invertido ? "Palíndromo" : "Não é palíndromo");
    }

    static void q16() {
        int n = lerInteiroValido("Digite um número: ");
        int temp = n;
        int digitos = String.valueOf(n).length(), soma = 0;

        for (; temp > 0; temp /= 10) {
            int d = temp % 10, potencia = 1;
            for (int i = 0; i < digitos; i++) potencia *= d;
            soma += potencia;
        }
        System.out.println(soma == n ? "Armstrong" : "Não é Armstrong");
    }

    static void q17() {
        int n = Math.abs(lerInteiroValido("Digite um número: "));
        int cont = 0;
        do {
            cont++;
            n /= 10;
        } while (n > 0);
        System.out.println("Dígitos: " + cont);
    }

    static void q18() {
        int n = Math.abs(lerInteiroValido("Digite um número: "));
        int soma = 0;
        while (n > 0) {
            soma += n % 10;
            n /= 10;
        }
        System.out.println("Soma: " + soma);
    }

    static void q19() {
        int n = lerInteiroValido("Digite um número: ");
        int inv = 0;
        while (n != 0) {
            inv = inv * 10 + n % 10;
            n /= 10;
        }
        System.out.println("Invertido: " + inv);
    }

    static void q20() {
        long n = lerInteiroValido("Digite N: ");
        int passos = 0;
        while (n != 1) {
            if (n % 2 == 0) n /= 2;
            else n = n * 3 + 1;
            passos++;
        }
        System.out.println("Passos: " + passos);
    }

    static void q21() {
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine().toLowerCase();
        int vogais = 0;
        for (int i = 0; i < frase.length(); i++)
            if ("aeiouáéíóúâêôãõ".indexOf(frase.charAt(i)) >= 0) vogais++;
        System.out.println("Vogais: " + vogais);
    }

    static void q22() {
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();
        int mai = 0, min = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (Character.isUpperCase(texto.charAt(i))) mai++;
            else if (Character.isLowerCase(texto.charAt(i))) min++;
        }
        System.out.println("Maiúsculas: " + mai + "; minúsculas: " + min);
    }

    static void q23() {
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();
        boolean palindromo = true;
        for (int i = 0; i < palavra.length() / 2; i++)
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i))
                palindromo = false;
        System.out.println(palindromo ? "Palíndromo" : "Não é palíndromo");
    }

    static void q24() {
        int n = lerInteiroValido("Digite o número: ");
        int i = 1;
        while (i <= 10) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
            if (resultado % 7 == 0) break;
            i++;
        }
    }

    static void q25() {
        for (int i = 1; i <= 30; i++) {
            if (i % 4 == 0) continue;
            System.out.println(i);
        }
    }

    static void q26() {
        for (int i = 1; i <= 100; i++)
            if (i % 13 == 0 && i % 3 == 0) {
                System.out.println(i);
                break;
            }
    }

    static void q27() {
        int segredo = 42, chute;
        do {
            chute = lerInteiroValido("Tente adivinhar (1-100): ");
            if (chute > segredo) System.out.println("Maior");
            else if (chute < segredo) System.out.println("Menor");
        } while (chute != segredo);
        System.out.println("Acertou!");
    }

    static void q28() {
        double valor = lerDoubleValido("Valor inicial: ");
        double taxa = lerDoubleValido("Taxa mensal (%): ");
        double limite = lerDoubleValido("Limite: ");
        int meses = lerInteiroValido("Quantidade de meses: ");

        boolean avisou = false;
        for (int m = 1; m <= meses; m++) {
            valor *= 1 + taxa / 100;
            System.out.printf("Mês %d: %.2f%n", m, valor);
            if (valor > limite && !avisou) {
                System.out.println("Ultrapassou o limite.");
                avisou = true;
            }
        }
    }

    static void q29() {
        for (int ano = 2000; ano <= 2030; ano++)
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0)
                System.out.println(ano);
    }

    static void q30() {
        int op;
        do {
            op = lerInteiroValido("1-Soma 2-Sub 3-Mult 4-Div 0-Sair: ");
            if (op != 0) {
                double a = lerDoubleValido("Primeiro valor: ");
                double b = lerDoubleValido("Segundo valor: ");
                switch (op) {
                    case 1: System.out.println("Resultado: " + (a + b)); break;
                    case 2: System.out.println("Resultado: " + (a - b)); break;
                    case 3: System.out.println("Resultado: " + (a * b)); break;
                    case 4:
                        if (b == 0) System.out.println("Divisão por zero.");
                        else System.out.println("Resultado: " + (a / b));
                        break;
                    default: System.out.println("Opção inválida.");
                }
            }
        } while (op != 0);
    }

    static void q31() {
        int n = lerInteiroValido("Quantos valores? ");
        int positivos = 0, negativos = 0, zeros = 0;
        for (int i = 0; i < n; i++) {
            int valor = lerInteiroValido("Valor " + (i + 1) + ": ");
            if (valor > 0) positivos++;
            else if (valor < 0) negativos++;
            else zeros++;
        }
        System.out.println(positivos + " positivos, " + negativos + " negativos, " + zeros + " zeros");
    }

    static void q32() {
        int n = lerInteiroValido("Quantidade de linhas: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    static void q33() {
        for (int c = 0; c <= 100; c++) {
            double f = c * 9.0 / 5 + 32;
            System.out.printf("%d°C = %.1f°F", c, f);
            if (c == 0) System.out.print(" - congelamento");
            else if (c == 100) System.out.print(" - ebulição");
            System.out.println();
        }
    }

    static void q34() {
        int a = Math.abs(lerInteiroValido("Primeiro número: "));
        int b = Math.abs(lerInteiroValido("Segundo número: "));
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        System.out.println("MDC: " + a);
    }

    static void q35() {
        int a = Math.abs(lerInteiroValido("Primeiro número: "));
        int b = Math.abs(lerInteiroValido("Segundo número: "));

        if (a == 0 || b == 0) {
            System.out.println("MMC indefinido para zero.");
            return;
        }

        int multiplo = Math.max(a, b);
        while (true) {
            if (multiplo % a == 0 && multiplo % b == 0) {
                System.out.println("MMC: " + multiplo);
                break;
            }
            multiplo++;
        }
    }

    static void q36() {
        int anterior = 0;
        boolean crescente = true, primeiro = true;

        System.out.println("Digite números (-1 para parar):");
        while (true) {
            int n = lerInteiroValido("Número: ");
            if (n == -1) break;
            if (!primeiro && n <= anterior) crescente = false;
            anterior = n;
            primeiro = false;
        }
        System.out.println(crescente ? "Crescente" : "Não é crescente");
    }

    static void q37() {
        int n = lerInteiroValido("Quantos clientes? ");
        int i = 1;
        while (i <= n) {
            System.out.println("Cliente " + i + " atendido");
            if (i % 5 == 0) System.out.println("Atendimento especial!");
            i++;
        }
    }

    static void q38() {
        int base = lerInteiroValido("Base: ");
        int expoente = lerInteiroValido("Expoente: ");
        int resultado = 1;
        if (expoente != 0)
            for (int i = 1; i <= expoente; i++) resultado *= base;
        System.out.println("Resultado: " + resultado);
    }

    static void q39() {
        int limite = lerInteiroValido("Limite: ");
        for (int n = 1; n * (n + 1) / 2 <= limite; n++) {
            int triangular = n * (n + 1) / 2;
            System.out.println(triangular);
        }
    }
    static void q40() {
        String senha = "java123";
        int tentativas = 0;
        boolean entrou = false;
        do {
            System.out.print("Senha: ");
            String entrada = sc.nextLine();
            tentativas++;

            if (entrada.equals(senha)) {
                entrou = true;
                System.out.println("Acesso liberado.");
            } else if (tentativas < 3) {
                System.out.println("Restam " + (3 - tentativas) + " tentativa(s).");
            }
        } while (!entrou && tentativas < 3);

        if (!entrou) System.out.println("Acesso bloqueado.");
    }
}