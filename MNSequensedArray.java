public class MNSequensedArray{
  public static void main(String[] args) {
    int [] arr={1,1,3,2,3,4,5};
    int m=1;
    int n=5;
    System.out.println(isMN(arr,m,n));

  }
  public static int isMN(int arr[], int m , int n){
    if (arr.length==0) {
      return 0;

    }
    else{
      if (arr[0] != m || arr[arr.length-1] != n) {
        return 0;
      }
      else{
        int element=arr[0];
        for (int i=1;i<arr.length ;i++ ) {
          if (element > arr[i]) {
            return 0;

          }
          else if (element == arr[i]) {
            continue;
          }
          else{
            if (arr[i] != element +1) {
                return 0;
            }
            else{
              element=arr[i];

            }
          }

        }
        return 1;
      }
    }
  }
}
