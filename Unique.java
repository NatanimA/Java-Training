public class Unique{
  public static void main(String[] args) {
    int [] arr={2,7,3,4};
    int n=5;
    System.out.println(isUnique(arr,n));

  }
  public static int isUnique(int[] a, int n){
    if (a.length <2) {
      return 0;

    }
    else{
      int sumOccured=0;
      for (int i=0;i<a.length ;i++ ) {
        for (int j=1;j<a.length ;j++ ) {
          if (a[i] + a[j] == n) {
            sumOccured++;

          }

        }

      }
      if (sumOccured == 1) {
        return 1;

      }
      else{
        return 0;
      }


    }
  }
}
