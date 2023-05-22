
public class QuaseSequenciaCrescente {
    public static void main(String[] args) {
       int[] sequecies = {3, 5, 67, 98, 3};
        System.out.println( solution(sequecies));
    }

 static boolean solution (int[] sequence) {

        int  verdadeiro = 0, falso = 0;
        for(int c = 0; c < sequence.length;c++){
            if (c == sequence.length -1){
                break;
            }
            if (sequence[c]  < sequence[c+1]){
                verdadeiro += 1;
                continue;
            }

            if (c == 0){
                falso +=1;
                if((c + 2) > sequence.length -1){
                    break;
                }
                if (sequence[c] < sequence[c+2]){
                    sequence[c+1] = sequence[c];
                }else {
                    sequence[c] = sequence[c+1];
                }
                continue;
            }

                if (c == sequence.length -2){
                    if (sequence[c] < sequence[c+1]){
                        verdadeiro += 1;
                    }else{
                        falso += 1;
                    }
                    if (falso >= 2){
                        return false;
                    }
                    return true;
                }

                 falso += 1;

            if (sequence[c] < sequence[c+2]){
                sequence[c+1] = sequence[c];
            }
             if(sequence[c] >= sequence[c+2] && sequence[c-1] < sequence[c+1]){
                  sequence[c] = sequence[c-1];
             } else if(sequence[c] >= sequence[c+2] && sequence[c-1] >= sequence[c+1]){
                sequence[c+1] = sequence[c];
            }


        }

         if (falso >= 2){
            return false;
         }
          return true;

    }

}
