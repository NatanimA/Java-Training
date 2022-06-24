public class Porcup{
  public static void main(String[] args) {
    System.out.println(isPorcup(139));

  }
  public static int isPorcup(int n){
    int isprime=isPrime(n);
    int maxV=Integer.MAX_VALUE;
    int porcup=0;

      for (int i=n+1;i<maxV ;i++ ) {

        if (isPrime(i)== 1) {
          if (i % 10 == 9) {
            porcup=i;
            break;

          }
          else{
            continue;
          }

        }

      }
      return porcup;

  }
  public static int isPrime(int n){
    if (n== 0 || n==1) {
      return 0;
    }
    else if(n==2){
      return 1;
    }
    else{
      for (int i=2;i<=n/2 ;i++ ) {
        if (n%i == 0) {
          return 0;

        }
        else{
          continue;
        }

      }
      return 1;
    }
  }
}
