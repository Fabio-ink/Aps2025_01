package PMO;
import java.io.File;
import java.util.Arrays;

public class OrdenaImagens {
    public static void main(String[] args) {
        File pasta = new File("/home/fluxyfp/Downloads/PastaTeste");

        // Filtro: apenas arquivos de imagem
        File[] imagens = pasta.listFiles((dir, nome) ->
                nome.toLowerCase().endsWith(".jpg") || nome.toLowerCase().endsWith(".jpeg") || nome.toLowerCase().endsWith(".png")
        );


        if (imagens != null) {
            // Início da medição
            long inicio = System.nanoTime();

            // Ordena por nome (alfabético)
            Arrays.sort(imagens, (f1, f2) -> Long.compare(f1.length(), f2.length()));

            // Fim da medição
            long fim = System.nanoTime();

            // Tempo em milissegundos
            long duracaoMs = (fim - inicio) / 1_000_000;

            for (File imagem : imagens) {
                System.out.println(imagem.getName());
                System.out.println(imagem.length());
            }
            // Exibe resultado
            System.out.println("Tempo de ordenação: " + duracaoMs + " ms");
        } else {
            System.out.println("A pasta está vazia ou não existe.");

        }
    }
}