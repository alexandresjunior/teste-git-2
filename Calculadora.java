import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        sc.close();

        double soma = num1 + num2;
        double diferenca = num1 - num2;
        double produto = num1 * num2;
        double divisao = num1 / num2;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A diferença dos números é: " + diferenca);
        System.out.println("O produto dos números é: " + produto);
        System.out.println("O quociente dos números é: " + divisao);
    }
}