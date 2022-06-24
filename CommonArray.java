public class CommonArray{
  public static void main(String[] args) {
    int arrOne[]={3,3,3};
    int arrTwo[]={3,4};
    int [] result=commonArr(arrOne,arrTwo);
    for (int i=0;i<result.length ;i++ ) {
      System.out.println(result[i]);

    }

  }
  public static int[] commonArr(int[] arrOne,int[] arrTwo ){
    int[] output={};
    if (arrOne ==null || arrTwo == null ) {
      return null;

    }
    else if(arrOne.length<1 || arrTwo.length<1) {
      return output;
    }
    else{
      int len;
      if (arrOne.length<= arrTwo.length) {
        len=arrOne.length;

      }
      else{
        len=arrTwo.length;
      }
      int outArr[]= new int[len];
      int counter=0;
      int flag=0;
      if (arrOne.length <= arrTwo.length) {
        for (int i=0;i<arrOne.length ; i++) {
          for (int j=0;j<arrTwo.length ;j++ ) {
              flag=0;
            if (arrOne[i]==arrTwo[j]) {
                int element=arrOne[i];
                for (int k=0;k<outArr.length ;k++ ) {
                    if (element == outArr[k]) {
                      flag=1;
                      break;
                    }

                }
                if (flag == 0) {
                  outArr[counter]=arrOne[i];
                  counter++;
                  break;
                }
            }

          }

          }

      }
      else{
        for (int i=0;i<arrTwo.length ; i++) {
          for (int j=0;j<arrOne.length ;j++ ) {
            if (arrTwo[i]==arrOne[j]) {
              int element=arrTwo[i];
              for (int k=0;k<outArr.length ;k++ ) {
                  if (element == outArr[k]) {
                    flag=1;
                    break;
                  }

              }
              if (flag == 0) {
                outArr[counter]=arrTwo[i];
                counter++;
                break;
              }
            }

          }
          }
      }
          int [] filteredOutput=new int[counter];
          for (int x=0;x<filteredOutput.length ;x++ ) {
            filteredOutput[x]=outArr[x];
          }
          return filteredOutput;
      }

    }

}
