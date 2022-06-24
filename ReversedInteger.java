public class ReversedInteger{
  public static void main(String[] args) {
    int num=1234;
    System.out.println(reversed(num));

  }
  public static int reversed(int num){

  if (num<10 && num>0) {
    return num;

  }


else{
  int sign=1;
  if (num<0) {
    sign=-1;
    num=sign*num;

  }
  int tempNum=num;
  int reversedNum=0;
  int tens=1;
  while(tempNum>0){
    reversedNum=(reversedNum*10)+(tempNum%10);
    tempNum=tempNum/10;
    
  }


  reversedNum=sign*reversedNum;
  return reversedNum;
}
}
}
