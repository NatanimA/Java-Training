public class EncodeNumber{
  public static void main(String[] args) {

  }
  public static int encodeNumber(int num){
    if (num<=1) {
      return null;
    }
    else{
      int orginalNum=num;
      int arrayLengthCount=1;
      int div=2;
      while(div<num){
        if (num%div == 0) {
          arrayLengthCount++;
          num=num/div;
          div=2;
        }
        else{
          div++;
        }

      }
      int[] returnArray=new int[arrayLengthCount];
      div=2;
      int index=0;
      num=orginalNum;
      while(div<num){
        if (num%div == 0) {
          returnArray[index]=div;
          num=num/div;
          div=2;
          index++;

        }
        else{
          div++;
        }
      }
      return returnArray;
    }


}
