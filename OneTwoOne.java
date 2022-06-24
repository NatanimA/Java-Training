public class OneTwoOne{
  public static void main(String[] args) {
    int arr[]={1,2,1,2,1,2};
  System.out.println(isOneTwoOne(arr));

  }
  public static int isOneTwoOne(int[] arr){
  if (arr.length<2) {
    return 0;

  }
  else{
    int flag=0;
    for (int i=0;i<arr.length ;i++ ) {
      if (arr[i]==1 || arr[i]==2) {
        flag=1;
      }
      else if(arr[i] != 1 || arr[i] != 2){
        return 0;
      }
    }
    if (flag==1) {
      int countOnes=0;
      int countTwos=0;
      for (int index=0;index<arr.length ;index++ ) {
        if (arr[index]==1) {
          countOnes++;

        }
        else if (arr[index]==2) {
          countTwos++;
        }
      }
      if (countOnes != countTwos) {
        return 0;
      }

    }
  }
  return 1;
}
}
