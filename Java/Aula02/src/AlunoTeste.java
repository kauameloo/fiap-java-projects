import java.util.Scanner;

public class AlunoTeste {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        // Ler os dados: nome, nota gs, cp e challenge
        System.out.println("Digite o nome:");
        aluno.nome = scanner.next() + scanner.nextLine();

        System.out.println("Digite a nota GS:");
        aluno.gs = scanner.nextFloat();

        System.out.println("Digite a nota CP:");
        aluno.cp = scanner.nextFloat();

        System.out.println("Digite a nota Challenge:");
        aluno.challenge = scanner.nextFloat();

        // Calcular e exibir a media do aluno

        System.out.println("Aluno: " + aluno.nome + "\nMédia final: " + aluno.mediaFinal());

    }
}
