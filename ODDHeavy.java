public class ODDHeavy{
  public static void main(String[] args) {
    int arr[]={-2,-4,-6,-8,-11};
    System.out.println(isOddHeavy(arr));

  }
  public static int isOddHeavy(int [] arr){
    if (arr.length==0) {
      return 0;

    }
    else if(arr.length==1 && arr[0]%2 == 0){
      return 0;
    }
    else if (arr.length==1 && arr[0]%2 !=0) {
      return 1;

    }
    else{
      int count=0;
      for (int index=0;index<arr.length ;index++ ) {
        if (arr[index]%2 != 0) {
          count++;
          continue;
        }
      }
      if (count > 0) {
        for (int i=0;i<arr.length ;i++ ) {
          int  element=arr[i];
          if (element % 2 !=0) {
            for (int j=arr.length-1;j>=0 ;j-- ) {
              if (arr[j]%2==0) {
                if (element > arr[j]) {
                  continue;
                }
                else{
                  return 0;
                }
              }
            }
          }
        }

      }
      else{

        return 0;
      }

    }
      return 1;

    }
  }
