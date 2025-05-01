package PMO;

import java.io.File;
import java.util.Arrays;

public class OrdenaArray {
    public static void main(String[] args) {
        File pasta = new File("/home/fluxyfp/Downloads/PastaTeste");

        // Filtro: apenas arquivos de imagem
        File[] imagens = pasta.listFiles((dir, nome) ->
                nome.toLowerCase().endsWith(".jpg")
                nome.toLowerCase().endsWith(".jpeg")
                nome.toLowerCase().endsWith(".jpg")
        );


        if (imagens != null) {
            // Ordena por nome (alfabético)
            Arrays.sort(imagens, (f1, f2) -> Long.compare(f1.length(), f2.length()));

            // Exibe os nomes dos arquivos ordenados
            for (File imagem : imagens) {
                System.out.println(imagem.getName());
                System.out.println(imagem.length());
            }
        } else {
            System.out.println("A pasta está vazia ou não existe.");
        }
    }
}