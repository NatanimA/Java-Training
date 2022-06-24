package JavaTraining;

public class Stacked{

  public static void main(String[] args) {
  int result=isStacked(10);
  System.out.println(result);

  }

  public static int isStacked(int n){
    int sum=0;
    for (int i=1;i<=n/2 ;i++ ) {
      sum=sum+i;
      if (sum==n) {
        return 1;

      }
    }
    return 0;
  }
}
