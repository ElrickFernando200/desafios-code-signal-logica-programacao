public class TornarArrayConsecutivo {


    public static void main(String[] args) {
        int[] teste = {6, 2, 3, 8};

        System.out.println(  solution(teste));
    }


    static int solution(int[] statues){
    int[] ordenados = new int[statues.length];
    int menorNumero = statues[0],auxiliar = 0;

    loopA:
    for(int a = 0; a < statues.length; a++){
        loopB:
        for(int b = 0; b < statues.length; b++){
            if (statues[b] < menorNumero){
                menorNumero = statues[b];
                auxiliar = b;
            }
            ordenados[a] = menorNumero;
            if (b == statues.length -1){
                statues[auxiliar] = 2147483647;
                menorNumero =  2147483647;
            }
        }


    }
         int contador = 0;
        for (int c = 0; c < ordenados.length; c++ ){
            if ( c == ordenados.length - 1 ){
                break;
            }
         if ((ordenados[c]  + 1 ) != ordenados[c+1]){
             contador += (ordenados[c + 1] - ordenados[c]) - 1;
             continue;
         }
        }
         return contador;

    }

}
