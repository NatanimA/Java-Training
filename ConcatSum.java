public class ConcatSum{
  public static void main(String[] args) {
    int num=194;
    int cat=2;
    System.out.println(isConcatSum(num,cat));

  }
  public static int isConcatSum(int num, int cat){
    int isConcat=1;
    int tempn=num;
    int sum=0;
    while(tempn>0){
      int tempSum=0;
      int modulo=tempn%10;
      int tens=1;
      for (int i=0;i<cat ;i++ ) {
        tempSum+=tens*modulo;
        tens=1*10;
      }
      tempn=tempn/10;
      //modulo=tempn%10;
     sum+=tempSum;
    }
    if (sum != num) {
      return 0;
    }
    else{
      return 1;
    }
  }
}
