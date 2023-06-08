public class SomasAlternativas {
    public static void main(String[] args) {
        int[] array = {6,87,9,5,3,5,7};
        solution(array);
    }

    public static int[] solution(int[] a){
        int[] equipeUM = new int[a.length];
        int[] equipeDois = new int[a.length];

        for (int i = 0; i < a.length;i++){
            equipeUM[i] = a[i];
            if (a.length > (i+1)){
                equipeDois[i] = a[i+1];
                i++;
            }
        }
        int totalUm = 0,totalDois = 0;
        for (int b = 0 ; b < equipeUM.length;b++){
            totalUm += equipeUM[b];
        }

        for (int c = 0; c < equipeDois.length;c++){
            totalDois += equipeDois[c];
        }

        int[] resposta = {totalUm,totalDois};
        return resposta;

    }


}
