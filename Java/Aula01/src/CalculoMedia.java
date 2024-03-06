import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Ler a média da cp, gs, challenge
        System.out.println("Insira a média da CP:");
        float cp = scanner.nextFloat();

        System.out.println("Insira a média da GS:");
        float gs = scanner.nextFloat();

        System.out.println("Insira a média do Challenge:");
        float challenge = scanner.nextFloat();

        // Calcular a média
        float mediaFinal = ((cp * 0.2F) + (gs * 0.6F) + (challenge * 0.2F));

        // Exibir a média
        System.out.println("A média final do aluno é: " + mediaFinal);
    }
}
