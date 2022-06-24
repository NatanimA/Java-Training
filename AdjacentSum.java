public class AdjacentSum{
  public static void main(String[] args) {
    int arr[]={18,-12,9,-10};
    System.out.println(adjacentSum(arr));

  }
  public static int adjacentSum(int arr []){
    int sum=0;
    int tempSum=0;
    if (arr.length==0) {
      return 0;

    }
    else{
      int element=arr[0];
      for (int i=1;i<arr.length-1 ;i++ ) {
        tempSum=element+arr[i];
        element=arr[i];
        if (tempSum>sum) {
          sum=tempSum;
          //tempSum=0;

        }
        else{
          continue;
        }


      }
      return sum;
    }
  }
}
