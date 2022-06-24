import java.lang.Math.*;

public class RepsEqual{
  public static void main(String[] args) {
    int[] arr={3,2,0,5,3};
    int num=32053;
    System.out.println(isReps(arr,num));

  }
  public static int isReps(int[] arr, int num){
    if (arr.length == 0) {
      return 0;
    }
    else{

      int len=arr.length;
      int sum=0;
      for (int i=0;i<arr.length ;i++ ) {
        sum+=(Math.pow(10,len-1))*arr[i];
        len--;
        }
        if (sum==num) {
          return 1;

        }
        else{
          System.out.println(sum);
          return 0;
        }
    }

  }
}
