public class AdajacentesElementosProduto {
    public static void main(String[] args) {
        int[] numeros = {4,5,63,5,7,3,2,3};

        System.out.println(solution(numeros));
    }
   
   static int solution(int[] inputArray) {


        int[] totalMult = new int[inputArray.length -1];



        for (int i = 0; i < totalMult.length; i++) {
            totalMult[i] = inputArray[i] * inputArray[i + 1];
        }

        int maiorValor = totalMult[0];
        for (int r = 0; r < totalMult.length; r++){
            if (totalMult[r] > maiorValor){
                maiorValor = totalMult[r];
            }
        }


        return maiorValor;
    }
}
