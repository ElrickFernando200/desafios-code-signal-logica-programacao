import java.util.List;

public class TodasStringsMaisLongas {
    public static void main(String[] args) {
        String[] letras = {"abc","gsgs","gkemge","ffs"};
        for (String resultado : solution(letras)){
            System.out.println(resultado);
        }

    }

  public static String[] solution(String[] inputArray) {
       int maiorNumero = inputArray[0].length();

        for (int a = 0; a < inputArray.length; a++) {
            if (maiorNumero > inputArray[a].length()){
                maiorNumero = maiorNumero;
            } else if (maiorNumero < inputArray[a].length()) {
                maiorNumero = inputArray[a].length();
            }
        }
            int qntMaiores = 0;
        for (int b = 0; b < inputArray.length;b++){
            if (inputArray[b].length() == maiorNumero){
                qntMaiores++;
            }
        }

            String[] maioresNumeros = new String[qntMaiores];
            int cont = 0;
        for (int c = 0; c < inputArray.length;c++){
            if (inputArray[c].length() == maiorNumero){
                maioresNumeros[cont] = inputArray[c];
                cont++;
            }
        }
        return maioresNumeros;

    }
}