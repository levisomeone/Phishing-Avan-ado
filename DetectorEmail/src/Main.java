import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        File arquivo = new File("email1.txt");

        if (!arquivo.exists()) {
            System.out.println("Arquivo não encontrado!");
            return;
        }

        Scanner sc = new Scanner(arquivo);

        StringBuilder conteudo = new StringBuilder();

        while (sc.hasNextLine()) {
            conteudo.append(sc.nextLine()).append(" ");
        }

        sc.close();

        String email = conteudo.toString();

        BancoPhishing banco = new BancoPhishing();
        banco.analisar(email);

        DetectorAvancado detector = new DetectorAvancado();
        detector.analisar(email);
    }
}