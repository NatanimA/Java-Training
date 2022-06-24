public class Porcupine{
  public static void main(String[] args) {

  }
  public static int isPorcupine(int n){

    int isPrime=isPrime(n);
    int maXValue=Integer.Max_value;
    int procupineNum=0;
    boolean isPorcupine=false;
    n++;
    while (n<maXValue) {
      if (isPorcupine) {
        if (isPrime==1) {
          if (n%10==9) {
            break;

          }
          else{
            isPorcupine=false;
          }

        }
        else{
          if (isPrime==1) {
            isPorcupine=true;
            procupineNum=n;

          }
        }

      }

    n++
    }
    return procupineNum;


  }

  public static int isPrime(int n){
    int flag=1;
    int m=0;
    m=n/2;
    if (n==0 || n==1) {
      flag=0;
    }
    else{
      for (int i=2;i<=m ;i++ ) {
        if (n%i==0) {
          flag=0;
          break;
      }

    }
  }
  return flag;
}
