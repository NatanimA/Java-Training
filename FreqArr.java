
public class FreqArr{
  public static void main(String[] args) {
    int[] arr={1,2,2,2,34,5,5,6,6,66,22,2,2,2,2};
    frequentlyOccur(arr);
    

  }
  public static int frequentlyOccur(int[] arr){

    if (arr==null) {
      return 0;

    }
    else{
      int count=0;
      int permanentCount=0;
      int element=0;
      for (int i=0;i<arr.length ;i++ ) {
        for (int j=1;j<arr.length ;j++ ) {
          if (arr[i]==arr[j]) {
            count++;

          }

        }
        if (count > permanentCount) {
          permanentCount=count;
          element=arr[i];

        }
        count=0;

      }
      System.out.println("The element :"+element +" occured :"+permanentCount);

      return count;




    }

}
}
