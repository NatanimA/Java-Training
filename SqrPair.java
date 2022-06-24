public class SqrPair{
  public static void main(String[] args) {

  }
  public static int isPerfectSquare(int n){
    for (int i=1;i<=n/2 ;i++ ) {
      if (i*i==n) {
        return 1;

      }

    }
    return 0;
  }
  public static int countSquarePairs(int [] arr){
    int count=0;
    if (arr.length<2) {
      return 0;
    }
    else{
      for (int i=0;i<arr.length ;i++ ) {
        for (int j=1;j<arr.length ;j++ ) {
          if (arr[i]>0 && arr[j]>0) {
            if (arr[i]<arr[j]) {
              if (isPerfectSquare(arr[i]+arr[j])==1) {
                count=count+1;
              }

            }

          }

        }


      }
      for (int k=arr.length-1;k>=0 ;k-- ) {
        for (int z=0;z<arr.length ;z++ ) {
          if (arr[k]>0 && arr[z]>0) {
            if (arr[k]<arr[z]) {
              if (isPerfectSquare(arr[k]+arr[z])==1) {
                count=count+1;

              }

            }

          }

        }

      }
    }
    return count;
  }
}
