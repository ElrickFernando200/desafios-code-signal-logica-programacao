
public class SomaDosElementosDaMatriz {
    public static void main(String[] args) {
        int[][] valores = {{0,1,1,2},{0,5,0,0},{2,0,3,3}};
        System.out.println( solution(valores));
    }

   public static int solution(int[][] matrix) {

        int soma = 0;
        Loop1:
        for (int a = 0; a < matrix.length;a++){
            Loop2:
            for (int b = 0; b < matrix[a].length;b++){
                if (matrix.length >= 4 ){
                    if (a == 2){
                        break Loop1;
                    }
                }else {
                    if (a == 1) {
                        break Loop1;
                    }
                }

                if (matrix[a][b] == 0){
                    int aux = 0;
                    while( aux < matrix.length ){
                        if (a+1 > matrix.length -1){
                            break Loop1;
                        }
                        matrix[a+1][b] = 0;
                        aux++;
                    }
                }
            }
        }

        LoopA:
        for (int b = 0; b < matrix.length;b++){
            LoopB:
            for (int c = 0; c < matrix[b].length;c++){
                if (b == 0) {
                    if (matrix[b][c] != 0) {
                        soma += matrix[b][c];
                    }
                }
                if (b >= 1){
                    if (matrix[b-1][c] != 0){
                        if (matrix[b][c] != 0){
                            soma += matrix[b][c];
                        }
                    }
                }
            }
        }

        return soma;


    }

}



