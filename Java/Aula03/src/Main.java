import java.util.Scanner;

import br.com.fiap.tds.model.Aviao;
import br.com.fiap.tds.model.Carro;
import br.com.fiap.tds.model.Cor;
import br.com.fiap.tds.model.Lancha;

public class Main {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe qual classe deseja: (1) Carro, (2) Aviao, (3) Lancha");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            // Instanciar um Carro
            Carro gol = new Carro();
            gol.setCor("Azul");
            gol.setModelo("Gol");
            gol.setPlaca("ZZZ123123");

            // Exibir os valores do modelo, placa e cor
            System.out.println("Modelo: " + gol.getModelo() + "\nCor: " + gol.getCor() + "\nPlaca: " + gol.getPlaca());

        } else if (opcao == 2) {
            Aviao american = new Aviao();
            Cor vermelho = new Cor();
            vermelho.alterarCor(255, 0, 0, "Vermelho");

            american.setModelo("777-200er");
            american.setQuantidadeLugares(440);
            american.setPrefixo("Boeing");
            american.setComprimento(64);
            american.setAnoFabricacao(2020);
            american.setQuantidadeTurbinas(4);
            american.setCor(vermelho);

            System.out.println("Prefixo: " + american.getPrefixo() + "\nModelo: " + american.getModelo() + "\nCor: "
                    + american.getCor().getNome());
        } else if (opcao == 3) {
            Lancha nx400 = new Lancha();
            Cor branco = new Cor();
            branco.alterarCor(255, 255, 255, "Branco");

            nx400.setModelo("NX400");
            nx400.setAnoFabricacao(2023);
            nx400.setComprimento(12.10);
            nx400.setCor(branco);
            nx400.setQuantidadeLugares(18);
            nx400.setQuantidadeMotores(4);

            System.out.println("Modelo: " + nx400.getModelo() + "\nAno: " + nx400.getAnoFabricacao() + "\nCor: "
                    + nx400.getCor().getNome());
        } else {
            System.out.println("Opção inválida.");
        }
    }
}