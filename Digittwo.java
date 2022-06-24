// intialize a variable to count
// intialize sum to take value after multiple
// have for loop to iterate the multiplication
// havae an if statement to check if sum contains the digit 2
// if it includes the digit to increment the count
// return count

public class DigitTwo{
  public static void main(String[] args) {

  }
  public static int smallest(int n){
    int count = 0;
    int sumMultiple = 0;
    int numb=n;
    int maXValue=Integer.MAX_VALUE;
    boolean replay=true;
    int i=1;
    String numbS;
    numbS=Integer.toString(numb);
    while(replay){
      for (int x=0;i<numbS.length ;x++ ) {
        numb=numb*i;
        numbS=Integer.toString(numb);
        if (numbS[x]==2) {
          count++;
          i++;
        }
        else{
          replay=false;
          break;
        }
      }
    }



  }
}
