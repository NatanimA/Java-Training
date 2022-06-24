public class StantonMeasure{
  public static void main(String[] args) {
    int [] arr={};
    System.out.println(stantonM(arr));

  }
  public static int stantonM(int [] arr){
    if (arr.length == 0) {
      return 0;

    }
    else{
        int countOnes=0;
        for (int i=0;i<arr.length ;i++ ) {
          if (arr[i] == 1) {
            countOnes++;

          }
        }
          int element=countOnes;
          int countElement=0;
          for (int i=0;i<arr.length ;i++ ) {
            if (element == arr[i]) {
              countElement++;
            }

          }

          return countElement;
        }
    }
  }
