public class TriPair{
  #########################
  public static void main(String[] args) {

  }
  public static int isTrivalent(int[] n){

    if (n.length<3 || n==null) {
      return 0;

    }
    else{
      int[] arr = new int[3]
      int putindex=1;
      arr[0]=n[0];
      boolean replay=true
      for (int index=1;index<n.lenth ;index++ ) {
        while(replay){
          if (putindex==1) {
            if (arr[0]!=n[index]) {
              arr[putindex]=n[index];
              putindex++;
              break;

            }
            else{
              break;
            }

          }
          else if (putindex==2) {
            if ([arr[1] != n[index] && arr[0] != n[index]) {
              arr[putindex]=n[index];
              putindex++;
              replay=false;
              break;

            }
            else{
              break;
            }

          }
        }
        if (putindex==3) {
          if (arr[0] != n[index] || arr[1] != n[index] || arr[2] != n[index]) {
            return 0;

          }


        }


      }
      if (putindex != 3) {
        return 0;

      }
      else{
        for (int i=0;i<arr.length ;i++ ) {
          int count=1;
          for (int j=1;j<n.length ;j++ ) {
            if (arr[i]==n[j]) {
              count++;

            }

          }

        }
        if (count>3) {
          return 0;

        }
      }
  }
  return 1;
}
}
