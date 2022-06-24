public class UniqueNum{
  public static void main(String[] args) {

  }

  public static int isNUnique(int[] arr, int n){
    int count=0;
    int unique;
    if (arr.length<2) {
      unique=0;
    }
    else{
      for (int i=0;i<arr.length ;i++ ) {
        for (int j=1;j<arr.length ;j++ ) {

          if(a[i]+a[j]==n){
            count++;
          }
          if (count>1) {
            unique=0;
            break;
          }

        }
        if (count==1) {
          unique=1;
        }
      }

    }

    return unique;
  }
}
