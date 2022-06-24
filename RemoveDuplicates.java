public class RemoveDuplicates{
  public static void main(String[] args) {
    int [] arr={1,2,2,2,3,1,4,5,6,6,7,7,1,3,3};
    int [] result=removeDuplicates(arr);
    for (int i=0;i<result.length ;i++ ) {
      System.out.println(result[i]);

    }
    System.out.println();

  }
  public static int[] removeDuplicates(int [] arr){
    if (arr.length<2) {
      return arr;

    }
  else{
    boolean isDuplicate=false;
    int output[]=new int[arr.length];
    int counter=0;
    for (int i=0;i<arr.length ;i++ ) {
      isDuplicate=false;
      for (int j=0;j<arr.length ;j++ ) {
        if (arr[i]== output[j]) {
          isDuplicate=true;
          break;

        }

      }
      if (isDuplicate == false) {
          output[counter]=arr[i];
          counter++;

      }
    }
    if (counter == output.length) {
      return output;

    }
    else{
      int[] filteredOutput = new int[counter];
      for (int x=0;x<counter;x++ ) {
        filteredOutput[x]=output[x];

      }
      System.out.println(counter);
      return filteredOutput;

    }
  }

  }
}
