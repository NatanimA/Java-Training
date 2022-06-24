public class Henery{
  public static void main(String[] args) {

  }
  public static int henery(int i, int j){
    int henry=0;
    int maXValue=Integer.MAX_VALUE;
    int perfectcount=0;
    for (int num = 6;num<=maXValue ;num++ ) {
      int sum=0;
      for (int div=1;div<num ; div ++) {
        if (num%div == 0) {
          sum + = div;
        }
      }
      if (sum== num) {
        perfectcount++;
        if (perfectcount== i) {
          henery+=sum;

        }
        else if (perfectcount == j) {
          henry + = sum;
          break;
        }


      }

    }
    return henery;
  }
}
