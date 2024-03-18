public class BinarySearch {
  public static int binarySearch(int[] numList, int target) {
      int firstIndex = 0;
      int lastIndex = numList.length - 1;

      while (firstIndex <= lastIndex) {
          int midIndex = (firstIndex + lastIndex) / 2;
          int midElement = numList[midIndex];

          if (midElement == target) {
              return midIndex;
          } else if (midElement < target) {
              firstIndex = midIndex + 1;
          } else {
              lastIndex = midIndex - 1;
          }
      }

      return -1;
  }

  public static void main(String[] args) {
      int[] lista = {16, 18, 20, 50, 60, 81, 84, 89};

      System.out.println(binarySearch(lista, 81));//5
      System.out.println(binarySearch(lista, 10));//-1 (element not found)
  }
}
