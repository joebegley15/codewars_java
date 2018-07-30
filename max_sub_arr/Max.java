public class Max {
  public static int sequence(int[] arr) {
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
      int tempMax = 0;
      for (int x = i; x < arr.length; x++) {
        tempMax += arr[x];
        if (tempMax > max) {
          max = tempMax;
        }
      }
    }
    return max;
  }
}