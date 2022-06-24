public class AcsendingSequence{
  public static void main(String[] args) {
    int arr[]={3,4,4,4};
    System.out.println(isSequentialyBound(arr));

  }
  public static int isSequentialyBound(int [] arr){
    int element=arr[0];
    int count=0;
    if (arr.length==0) {
      return 0;
    }
    else{
      for (int i=1;i<arr.length ;i++ ) {
        if (element<2 || arr[i]<2) {
          return 0;
        }
        else if (element==arr[i]) {
          count++;
          continue;
        }
        else if (element != arr[i]) {
          if (element> arr[i]) {
            return 0;
          }
          else{

            for (int startindex=1;startindex<element ;startindex++ ) {
              element=arr[startindex];
              int endindex=1;
              if (element==arr[startindex+1]) {
                count++;
                endindex++;
                continue;
              }
              if (count > element) {
                return 0;
              }
              if (count < element) {
                return 1;

              }
              startindex=endindex;
              count=0;

            }
          }
          element=arr[i];
          count=0;

          }


        }
        return 1;


      }

    }

  }
