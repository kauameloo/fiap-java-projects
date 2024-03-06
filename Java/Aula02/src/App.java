import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Criar um objeto para representar a classe Cachorro
        Cachorro cachorro = new Cachorro();

        // Atribuir valores aos atributos do objeto
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserir nome do cachorro:");
        cachorro.nome = scanner.nextLine();

        System.out.println("Inserir idade do cachorro:");
        cachorro.idade = scanner.nextInt();

        System.out.println("Inserir peso do cachorro:");
        cachorro.peso = scanner.nextFloat();

        System.out.println("O cachorro é castrado?");
        cachorro.castrado = scanner.nextBoolean();

        String castradoResult;
        if (cachorro.castrado == true) {
            castradoResult = "SIM";
        } else {
            castradoResult = "NÃO";
        }

        // Exibir os dados do objeto cachorro

        System.out.println("Nome: " + cachorro.nome + "\nIdade: " + cachorro.idade + " anos \nPeso: " + cachorro.peso
                + " kg \nCastrado: " + castradoResult);
        System.out.println("-------------------------");

        // Criar um outro objeto cachorro
        Cachorro cachorro2 = new Cachorro();

        // Atribuir outros valores
        cachorro2.nome = "Rex";
        cachorro2.idade = 7;
        cachorro2.peso = 5.5F;
        cachorro2.castrado = true;

        // Exibir os valores do outro objeto
        System.out.println("Nome: " + cachorro2.nome + "\nIdade: " + cachorro2.idade + " anos \nPeso: " + cachorro2.peso
                + " kg \nCastrado: " + cachorro2.castrado);

        // Chamar métodos
        cachorro.andar();
        cachorro2.andar();

    }
}
