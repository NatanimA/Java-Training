public class GutherieSequence{
  public static void main(String[] args) {
    int [] arr={8,4,2};
    System.out.println(isGutherie(arr));

  }
  public static int isGutherie(int [] arr){
    if (arr.length==0) {
      return 0;

    }
    else if(arr[arr.length-1] != 1){
      return 0;
    }
    else{
      int element=arr[0];
      for (int i=1;i<arr.length ;i++ ) {
        if (element % 2 == 0) {
          if (element / 2 == arr[i]) {
            element=arr[i];
            continue;
          }
          else{
            return 0;
          }

        }
        else if( element % 2 != 0){
          if (((element*3) + 1) == arr[i]) {
            element=arr[i];
            continue;
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
