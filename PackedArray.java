import java.lang.ArrayList.*;

public class PackedArray{
  public static void main(String[] args) {

  }
  public static int isPacked(int [] arr){
    if (arr.length<1) {
      return 0;

    }
    else{
      int element=arr[0];
      if (elment <1) {
        return 0;

      }
      else{
        for (int i=1;i<arr.length;i++ ) {
          if (arr[i]<1) {
            return 0;

          }
          else{
            int startindex=0;
            int endindex=0;
            int [] checkedArray= int[arr.length];
            for (startindex=1 ;startindex<=element ; startindex++) {
              if(arr[startindex] != element){
                return 0;
              }
              else{
                endindex++;
                continue;
              }

            }
            checkedArray.add(element);
            element=arr[endindex];
            startindex=endindex;



          }

        }
      }

    }

  }
}
