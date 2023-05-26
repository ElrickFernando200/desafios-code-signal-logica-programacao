public class Sortudo {
    public static void main(String[] args) {
        System.out.println( solution(12));
    }

    public static boolean solution(int n){
        Integer n1 = n;
        String numeroString =  n1.toString();
        int[] numeros = new int[numeroString.length()];

        for (int b = 0; b < numeroString.length(); b++){
            numeros[b] = Character.getNumericValue(numeroString.charAt(b));
        }

        int cont1 = 0, cont2 = 0;

        for (int c = 0; c < numeros.length; c++){
            if (c > (numeros.length/2) -1){
                cont2 += numeros[c];
                continue;
            }
            cont1 += numeros[c];
        }

        if (cont1 == cont2){
            return true;
        }

        return false;

    }
}
