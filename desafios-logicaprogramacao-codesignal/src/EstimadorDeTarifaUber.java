public class EstimadorDeTarifaUber {
    public static void main(String[] args) {
        double[] custoPorMinuto = {0.2, 0.35, 0.4, 0.45};
        double[] custoPorMilha = {1.1, 1.8, 2.3, 3.5};
        solution(30,7,custoPorMinuto,custoPorMilha);
    }


   public static  double[] solution(int tempoCorrida, int distanciaCorrida, double[] custoPorMinuto, double[] custoPorMilha) {

        double[] resultado = new double[custoPorMinuto.length];

        for(int a = 0; a < custoPorMilha.length;a++){
            resultado[a] = (custoPorMinuto[a] * tempoCorrida) + (custoPorMilha[a] * distanciaCorrida);
        }
        return resultado;
    }

}
