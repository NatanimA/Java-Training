public class MinAdj{
  public static void main(String[] args) {
    int arr[]={5,4,1,3,2};
    System.out.println(isMinAdj(arr));

  }
  public static int isMinAdj(int [] arr){
    if (arr.length<2) {
      return 0;
    }
    else{
      int minElement=arr[0];
      int maxElement=arr[0];
      int countMin=0;
      int countMax=0;
      boolean isad=false;
      for (int index=0;index<arr.length ;index++ ) {
        for (int j=1;j<arr.length ;j++ ) {
          if (minElement>arr[j]) {
            minElement=arr[j];
          }
          else if (maxElement<arr[j]) {
            maxElement=arr[j];
          }
        }
      }
      for (int i=0;i<arr.length ;i++ ) {
        if (minElement==arr[i]) {
          countMin++;
        }
        else if (maxElement==arr[i]) {
            countMax++;
        }

      }

      if (minElement+1 == maxElement ||minElement == maxElement || countMin>1 || countMax>1) {
          return 0;
      }

    }
    return 1;

  }
}
