public class Kata {
  public static int findEvenIndex(int[] arr) {
    int left = 0;
    int right = 0;
    for (int i : arr)
      right += i;
    for (int it = 0; it < arr.length; it++) {
      right -= arr[it];
      if (left == right) {
        return it;
      }
      left += arr[it];
    }
    return -1;
  }
}