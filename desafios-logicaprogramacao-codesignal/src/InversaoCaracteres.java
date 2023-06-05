import java.util.ArrayList;
import java.util.List;

public class InversaoCaracteres {
    public static void main(String[] args) {
        System.out.println( solution(   "foo(bar(baz))blim"));
    }


    public static String solution(String inputString) {
        char[] parenteseDentro = new char[inputString.length()];
        char[] parenteseFora = new char[inputString.length()];
        char[] caracSemParentes = new char[inputString.length()];
        char[] duplo = new char[inputString.length()];

        int cont = 0,conttt = 0;
        for (int a = 0; a < inputString.length(); a++) {
            if (inputString.charAt(a) == '(') {
                a++;
                while(inputString.charAt(a) != ')') {
                    if(inputString.charAt(a) != '(') {
                        parenteseFora[cont] = inputString.charAt(a);
                        cont++;
                    }
                    if(inputString.charAt(a) == '(') {
                        a++;

                        while(inputString.charAt(a) != ')') {
                            parenteseDentro[conttt] = inputString.charAt(a);
                            conttt++;
                            a++;
                        }
                    }
                    a++;
                }
                if (inputString.charAt(a) == ')'){
                    if (a == inputString.length() -1){
                        break;

                    }
                    a++;
                    while(inputString.charAt(a) != '('){
                        if ((a+1) > inputString.length()-1){
                            break;
                        }
                        a++;
                    }
                    if (inputString.charAt(a) == '('){
                        int contt = 0;
                        while(inputString.charAt(a) != ')'){
                            if (inputString.charAt(a) != '(') {
                                duplo[contt] = inputString.charAt(a);
                                contt++;
                            }
                            a++;
                        }
                    }
                }
            }

        }

            boolean t = false;
        for (int k = 0; k < inputString.length(); k++){
                if (duplo[k] != 0){
                    t = true;
                    break;
                }
            }


            if (t == true){
                char[] duplo1 = new char[duplo.length];
                int g1 = 0;
                for (int g = duplo.length -1; g >= 0;g--){
                    if (duplo[g] != 0) {
                        duplo1[g1] = duplo[g];
                        g1++;
                    }
                }
                int g2 = 0;
                char[] parenteseForaa = new char[parenteseFora.length];
                for (int h = parenteseFora.length -1; h >= 0; h--){
                        if (parenteseFora[h] != 0){
                            parenteseForaa[g2] = parenteseFora[h];
                            g2++;
                        }

                }

                for (int b = 0; b < inputString.length(); b++) {
                    if (inputString.charAt(b) == '(') {
                        b++;
                        while (inputString.charAt(b) != ')') {
                            if (inputString.charAt(b) == '(') {
                                while (inputString.charAt(b) != ')') {
                                    b++;
                                }
                                if (inputString.charAt(b) == ')') {
                                    if ((b + 2) < inputString.length()) {
                                        b += 2;
                                        while (b < inputString.length()) {
                                            caracSemParentes[b] = inputString.charAt(b);
                                            b++;
                                        }
                                    }
                                }
                            }

                            if (b == inputString.length()) {
                                break;
                            }
                            b++;
                        }
                    }
                    if (b == inputString.length()) {
                        break;
                    }
                    if (inputString.charAt(b) != ')') {
                        caracSemParentes[b] = inputString.charAt(b);
                    }
                }

                int contFinal = 0,contFinal1 = 0;
                for (int w = 0; w < caracSemParentes.length;w++){
                    while(caracSemParentes[w] != 0){
                        w++;
                    }
                    if (caracSemParentes[w] == 0){
                        if (parenteseForaa[contFinal] == 0){
                                while(caracSemParentes[w] == 0){
                                    caracSemParentes[w] = duplo1[contFinal1];
                                    contFinal1++;
                                    if ((w +1) > caracSemParentes.length -1){
                                        break;
                                    }
                                    w++;
                                }

                        }
                        while(caracSemParentes[w] == 0){
                            if ((w+1) > caracSemParentes.length -1){
                                break;
                            }
                            caracSemParentes[w] = parenteseForaa[contFinal];
                            contFinal++;
                            w++;
                        }

                    }
                }
                List<Character> list = new ArrayList<>();
                for (int f = 0; f < inputString.length();f++){
                    if (caracSemParentes[f] != 0){
                        list.add(caracSemParentes[f]);
                    }
                }
                char[] principal = new char[list.size()];
                for (int g = 0; g < list.size();g++){
                    principal[g] = list.get(g);
                }


                String resultado = String.valueOf(principal);
                return resultado;

            }

        for (int b = 0; b < inputString.length(); b++) {
            if (inputString.charAt(b) == '(') {
                b++;
                while (inputString.charAt(b) != ')') {
                    if (inputString.charAt(b) == '(') {
                        while (inputString.charAt(b) != ')') {
                            b++;
                        }
                        if (inputString.charAt(b) == ')') {
                            if ((b + 2) < inputString.length()) {
                                b += 2;
                                while (b < inputString.length()) {
                                    caracSemParentes[b] = inputString.charAt(b);
                                    b++;
                                }
                            }
                        }
                    }

                    if (b == inputString.length()) {
                        break;
                    }
                    b++;
                }
            }
            if (b == inputString.length()) {
                break;
            }
            if (inputString.charAt(b) != ')') {
                caracSemParentes[b] = inputString.charAt(b);
            }
        }

        int aux = 0;
        char[] parenteseDentro1 = new char[inputString.length()];
        for (int d = inputString.length() - 1; d >= 0; d--) {
            if (parenteseDentro[d] != 0) {
                parenteseDentro1[aux] = parenteseDentro[d];
                aux++;
            }
        }
        int aux1 = 0;
        char[] parenteseFora1 = new char[parenteseFora.length];
        for (int e = 0; e < inputString.length(); e++) {
            if (parenteseFora[e] != 0) {
                parenteseFora1[aux1] = parenteseFora[e];

                aux1++;
            }
        }

        int aux2 = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (parenteseFora1[i] == 0) {
                if (parenteseDentro1[aux2] != 0) {
                    parenteseFora1[i] = parenteseDentro1[aux2];
                    aux2++;
                }
            }
        }
                int aux3 = 0;
                char[] parenteseForaa = new char[inputString.length()];
            for (int o = inputString.length() -1; o >= 0 ; o--){
                if (parenteseFora1[o] != 0){
                    parenteseForaa[aux3] = parenteseFora1[o];
                    aux3++;
                }
            }

                int auxx = 0;
            for (int u = 0; u < inputString.length(); u++){
                if (caracSemParentes[u] == 0){
                    while(caracSemParentes[u] == 0){
                        caracSemParentes[u] = parenteseForaa[auxx];
                        auxx++;
                        if ((u+1) > inputString.length()-1){
                            break;
                        }
                        u++;
                    }
                }
            }

            List<Character> list = new ArrayList<>();
            for (int f = 0; f < inputString.length();f++){
                if (caracSemParentes[f] != 0){
                    list.add(caracSemParentes[f]);
                }
            }
                char[] principal = new char[list.size()];
                for (int g = 0; g < list.size();g++){
                    principal[g] = list.get(g);
                }


    String resultado = String.valueOf(principal);
        return resultado;
    }
}

