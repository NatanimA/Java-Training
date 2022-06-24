public class UpCount{
  public static void main(String[] args) {
    int[] arr={2,4,5,-7,1,1,-5,6,-7,9};
    int num=5;
    System.out.println(upCount(arr,num));
  }
  public static int upCount(int[] arr, int num){
    int partialSum=0;
    int count=-1;
    int flag=1;
    for (int i=0;i<arr.length ;i++ ) {
        partialSum += arr[i];
        if (partialSum>num) {
          if (flag==1) {
            count++;
          }

        }
        else if(count>0 && partialSum>num){
          flag=0;
        }
        else if (count>0 && partialSum<num) {
          flag=1;
        }
    }
    return count;
  }
}
