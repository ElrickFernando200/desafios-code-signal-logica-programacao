import java.util.ArrayList;
import java.util.List;

public class AdicionarBorda {
    public static void main(String[] args) {
        String[] picture ={};
        solution(picture);
    }

    public static String[] solution(String[] picture) {
        List<String> formatado = new ArrayList<>();
        String novo = "", asteristicos;


        for (int a = 0; a < picture.length; a++) {
            novo = "*" + picture[a] + "*";

            asteristicos = "";
            if (a == 0 ){
                for (int b = 0; b < novo.length(); b++){
                    asteristicos += "*";
                }
                formatado.add(asteristicos);
            }
            formatado.add(novo);

            asteristicos = "";
            if (a == picture.length -1){
                for (int b = 0; b < novo.length(); b++){
                    asteristicos += "*";
                }
                formatado.add(asteristicos);
            }

        }


        String[] vetorFormatado = new String[formatado.size()];

        for (int c = 0; c < vetorFormatado.length;c++){
            vetorFormatado[c] = formatado.get(c);
        }

         return vetorFormatado;
    }


}
