public class Square{
  public static void main(String[] args) {
    int n=4;
    System.out.println(isSquare(n));

  }
  public static int isSquare(int n){
    int sqrt=0;
    for (int i=0;i<=n/2 ;i++ ) {
      i=i*i;
      if (i == n) {
        return 1;

      }
    }
    return 0;
  }
}
