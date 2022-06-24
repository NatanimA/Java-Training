public class LegalArr{
  public static void main(String[] args) {

  }
  public static int isLegalNumber(int[] arr, int base){

    for (int i=0;i<arr.length ;i++ ) {
      if (arr[i]>=base) {
        return 0;
      }
    }
    return 1;

  }
}
