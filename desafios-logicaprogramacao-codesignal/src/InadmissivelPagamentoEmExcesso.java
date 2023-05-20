public class InadmissivelPagamentoEmExcesso {
    public static void main(String[] args) {
        double[] prices = {500,500};
        String[] notes = {"100.0% higher than in-store",
                "100.0% higher than in-store"};
        System.out.println(solution(prices, notes, 9));
    }


    static boolean solution(double[] prices, String[] notes, double x) {
        char[] referenciaLoja = new char[notes.length];
        double[] porcetagens = new double[notes.length];

        loopA:
        for (int i = 0; i < notes.length; i++) {
            loopB:
            for (int j = 0; 0 < notes.length; j++) {
                if (notes[i].charAt(j) == 'h') {
                    referenciaLoja[i] = 'h';
                    break loopB;
                } else if (notes[i].charAt(j) == 'l') {
                    referenciaLoja[i] = 'l';
                    break loopB;
                } else if (notes[i].charAt(j) == 'S') {
                    referenciaLoja[i] = 's';
                }
            }
        }

        for (int c = 0; c < notes.length; c++) {
            String valorString = notes[c].replaceAll("[^\\d.]", "");
            if (valorString.equals("")) {
                porcetagens[c] = 0;
                continue;
            }
            double valorNomal = Double.parseDouble(valorString);
            porcetagens[c] = valorNomal;
        }

        double auxiliar, maiorQueNaLoja = 0.0, menorQueNaLoja = 0.0, igualNaLoja = 0.0, valorLoja = 0.0;

        for (int d = 0; d < prices.length; d++) {
            if (referenciaLoja[d] == 'h') {
                auxiliar = (prices[d] * porcetagens[d]) / 100;
                if (auxiliar > prices[d]){
                    maiorQueNaLoja += 1.0;
                    continue;
                }
                valorLoja = prices[d] - auxiliar;

                String valorLojaString = Double.toString(valorLoja);
                int indiceDoPonto = valorLojaString.indexOf(".");
                int valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));

                if (valorAntesDoPonto != 0) {
                    valorLoja = Math.ceil(valorLoja);
                    valorLojaString = Double.toString(valorLoja);
                    indiceDoPonto = valorLojaString.indexOf(".");
                    valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));
                    if (valorAntesDoPonto != 0) {
                        while (valorAntesDoPonto != 0) {
                            valorLoja++;
                            valorLojaString = Double.toString(valorLoja);
                            indiceDoPonto = valorLojaString.indexOf(".");
                            valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));
                        }
                    }
                }

                maiorQueNaLoja += prices[d] - valorLoja;

            } else if (referenciaLoja[d] == 'l') {


                auxiliar = (prices[d] * porcetagens[d]) / 100;
                valorLoja = prices[d] + auxiliar;

                String valorLojaString = Double.toString(valorLoja);
                int indiceDoPonto = valorLojaString.indexOf(".");
                int valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));

                if (valorAntesDoPonto != 0) {
                    valorLoja = Math.ceil(valorLoja);
                    valorLojaString = Double.toString(valorLoja);
                    indiceDoPonto = valorLojaString.indexOf(".");
                    valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));
                    if (valorAntesDoPonto != 0) {
                        while (valorAntesDoPonto != 0) {
                            valorLoja++;
                            valorLojaString = Double.toString(valorLoja);
                            indiceDoPonto = valorLojaString.indexOf(".");
                            valorAntesDoPonto = Character.getNumericValue(valorLojaString.charAt(indiceDoPonto - 1));
                        }
                    }
                }
                menorQueNaLoja += valorLoja - prices[d];
            } else if (referenciaLoja[d] == 's') {
                igualNaLoja = 0.0;
            }
        }


        double resultado = 0.0;
        if (maiorQueNaLoja > menorQueNaLoja){
            resultado = (maiorQueNaLoja - menorQueNaLoja) + igualNaLoja;
            if (resultado <= x){
                return true;
            }
            return false;
        }else if( menorQueNaLoja > maiorQueNaLoja){
            return true;
        }

        return true;

    }
}
