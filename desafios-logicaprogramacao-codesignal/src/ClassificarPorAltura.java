public class ClassificarPorAltura {
    public static void main(String[] args) {

    int[] ar = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};

    for (int s :solution(ar)){
        System.out.println(s);
    }
    }


    public static  int[] solution(int[] a) {
        int[] ascendente = new int[a.length];
        int menorNumero = 0, indiceMenorNumero = 0;
        int[] resultado = new int[a.length];

        for (int d = 0; d < a.length;d++){
            if (a[d] == -1){
                resultado[d] = a[d];
            }
        }

        loop1:
        for (int b = 0; b < a.length;b++) {
            lopp2:
            for (int c = 0; c < a.length; c++) {
                    if (c == 0){
                        menorNumero = a[c];
                        indiceMenorNumero = c;
                    }
                    if (a.length == 1){
                        ascendente[b] = menorNumero;
                        continue;
                     }

                    if (menorNumero == -1){
                        if ((c+1) > a.length -1){
                            continue;
                        }
                        menorNumero = a[c+1];
                        indiceMenorNumero = c+1;
                        continue;
                    }
                    if (menorNumero < a[c] && a[c] != -1){
                        menorNumero = menorNumero;
                        ascendente[b] = menorNumero;
                    } else if (menorNumero > a[c] && a[c] != -1) {
                        menorNumero = a[c];
                        ascendente[b] = menorNumero;
                        indiceMenorNumero = c;
                    } else if (menorNumero == a[c] && a[c] != -1){
                        menorNumero = a[c];
                        ascendente[b] = menorNumero;
                        indiceMenorNumero = c;
                    }
                    if (c == a.length -1){
                        a[indiceMenorNumero] = -1;
                    }
            }
        }

        int cont = 0;
        for (int e = 0; e < a.length; e++){
                if (resultado[e] == -1){
                    if ((e+1) > a.length -1){
                        break;
                    }
                     if (resultado[e+1] != -1){
                         ++e;
                         while(resultado[e] != -1){
                            resultado[e] = ascendente[cont];
                            cont++;
                             if ((e+1) > a.length -1){
                                 break;
                             }
                             e++;
                         }
                     }
                 }else {
                    resultado[e] = ascendente[cont];
                    cont++;
                }

            }

        return resultado;
    }
}