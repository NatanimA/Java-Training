public class Cluster{
  public static void main(String[] args) {
    int[] arr={3,3,3,4,4,3,2,2,6,6,6,99,99,99,44,44,44,66,6,6,6,2,2,2};
    int[] result=clusterCompression(arr);
    for (int i=0;i<result.length ;i++ ) {
      System.out.println(result[i]);

    }

  }
  public static int[] clusterCompression(int [] arr){
    int element=arr[0];
    int count=1;
    for (int i=1;i<arr.length ;i++ ) {

      if (element != arr[i]) {
        element=arr[i];
        count++;

      }
      else{
        continue;
      }
    }
    element=arr[0];
    int[] retArr=new int[count];
    retArr[0]=arr[0];
    int inc=1;
    for (int index=1;index<arr.length ;index++ ) {
      if (element != arr[index]) {
        element=arr[index];
        retArr[inc]=element;
        inc++;
      }
      else{
        continue;
      }
    }
    return retArr;
  }
}
