public class XO {
  
  public static boolean getXO (String str) {
    int x = 0;
    int o = 0;
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (letter == 'X' || letter == 'x') {
        x++;
      } else if (letter == 'O' || letter == 'o') {
        o++;
      }
    }
    return x == o;
  }
}