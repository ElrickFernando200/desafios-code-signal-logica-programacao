public class Palindromo {
    public static void main(String[] args) {
        System.out.println(solution("ava"));
    }
   static Boolean solution(String inputString) {

        char[] c = new char[inputString.length()];
        boolean[] teste = new boolean[inputString.length()];
        boolean resposta;

        for (int i = 0; i < c.length; i++) {
            c[i] = inputString.charAt(i);
        }

        for(int i = 0; i < c.length;i++) {
            for (int j = c.length - 1; j >= 0; j--) {
                if(c[i] == c[j]){
                    teste[i] = true;
                }else{
                    teste[i] = false;
                }
                i++;
            }
        }

        for(int i = 0; i < teste.length; i++){
            if(teste[i] == false){
                resposta = false;
                return resposta;
            }
        }
        return true;

    }


}
