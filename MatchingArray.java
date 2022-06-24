public class MatchingArray{
  public static void main(String[] args) {
    int arr[]={1,2,2,1,1,3};
    int arr2[]={1,2,1,3};
    System.out.println(isMatchingArray(arr,arr2));

  }
  public static int isMatchingArray(int[] arrayOne, int [] checkinArray){
    if (arrayOne.length<1 || checkinArray.length <1) {
      return 0;

    }

    else{
      if (arrayOne[0] != checkinArray[0] || arrayOne[arrayOne.length -1] != checkinArray[checkinArray.length-1]) {
        return 0;
      }
      else{
        int inc=1;
        int element=arrayOne[0];
        for (int index=1;index<arrayOne.length ;index++ ) {
          if (element == arrayOne[index]) {
            continue;
          }
          else{
            if (arrayOne[index]==checkinArray[inc]) {
              element=checkinArray[inc];
              inc++;
            }
            else{
              return 0;
            }
          }

        }
        return 1;
      }
    }


  }
}
