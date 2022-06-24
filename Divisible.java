public class Divisible{
  public static void main(String[] args) {
    int arr[]={};
    int num=12;
    System.out.println(isDivisible(arr,num));

  }
  public static int isDivisible(int arr[],int num){
    if (arr.length==0) {
      return 1;
    }
    else{
      int element=arr[0];
      int div=num;
      for (int i=1;i<arr.length ;i++ ) {
        if (element%div != 0) {
          return 0;
        }
        else{
          element=arr[i];
        }

      }
      return 1;
    }
  }
}
