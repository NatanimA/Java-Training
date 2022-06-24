##################
public class LargestPrimeFactor{
  public static void main(String[] args) {

  }
  public static int largestPrimeFactor(int n){
    if (n<2) {
        return 0;
    }
    else{
      int div=2;
      while(div<n){
        if (n%div !=0) {
          div++;
        }
        else{
          n=n/div;
          div=2;

        }
      }

        }
        return n;

      }


    }

    // else{
    //   int temp=1;
    //   for (int i=2;i<n ;i++ ) {
    //     if (n%i !=0) {
    //       return n;
    //     }
    //     else{
    //       for (int j=2;j<=i ;j++ ) {
    //         if (i>temp && i%j != 0) {
    //           temp=i;
    //         }
    //
    //       }
    //     }
    //   }
    // }
    //return temp;
  }
}
