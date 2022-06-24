public class SumSafe{
  public static void main(String[] args) {

    int [] arr={5,-2,1};
    System.out.println(isSumSafe(arr));

  }
  public static int isSumSafe(int [] arr){

    if (arr.length<2) {
      return 0;

    }
    else{
      int sum=0;
      int element=0;

      for (int i=0;i<arr.length ;i++ ) {
        sum+=arr[i];

      }
      element=sum;

      for (int j=0;j<arr.length ;j++ ) {
        if (element==arr[j]) {
          return 0;
        }

      }


    }
    return 1;
  }
}
