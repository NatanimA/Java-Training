public class Sqrt{
  public static void main(String[] args) {

  }

  public static int isSqrt(int n){

      int isSqr=0;

      for (int i=0;i<=n/2 ;i++ ) {

        if (i*i==n) {
          isSqr=1;
          break;
        }


      }
      return isSqr;
  }
}
