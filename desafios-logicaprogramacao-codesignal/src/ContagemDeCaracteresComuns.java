public class ContagemDeCaracteresComuns {
    public static void main(String[] args) {
        System.out.println( solution("aabcc","adcaa"));
    }

 public static  int  solution (String s1, String s2){
      char[] letras = new char[s2.length()];
      for (int a = 0; a < s2.length();a++){
          letras[a] = s2.charAt(a);
      }

      int qntCaracteresComuns = 0;
      loop1:
      for (int b = 0; b < s1.length();b++){
          loop2:
          for (int c = 0; c < letras.length;c++){
              if (s1.charAt(b) == letras[c]){
                  qntCaracteresComuns++;
                  letras[c] = 0;
                  break loop2;
              }
          }
      }


      return qntCaracteresComuns;

  }
}
