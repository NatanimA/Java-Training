import java.lang.Math.*;

public class ConverTobaseTen{
  public static void main(String[] args) {
    int arr[]={1,0,4,1};
    int base=3;
    System.out.println(convert(arr,base));

  }
  public static int convert(int [] arr,int base){

    int num=0;
    int pw=arr.length-1;
    int bse=base;
    for (int index=0;index<arr.length ;index++ ) {
      if (arr[index]>= bse) {
        return 0;
      }
    }
    for (int i=0;i<arr.length;i++ ) {
      num+=arr[i]*Math.pow(bse,pw);
      pw--;
    }
    return num;

  }
}
