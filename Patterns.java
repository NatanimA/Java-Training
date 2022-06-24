import java.lang.Math;

public class Patterns{
  public static void main(String[] args) {
    int [] a={1,2,3,-5,-5,2,3,18};
    int [] p={3,-2,3};
    System.out.println(matches(a,p));

  }
  public static int matches(int[] a, int[] p){
    int startIndex=0;
    int endIndex=0;;
    int element;
    for (int i=0;i<p.length ;i++ ) {
      element=p[i];

      if (element > 0) {
        endIndex+=element;
        while (startIndex<endIndex) {
          if (a[startIndex]>0) {
            startIndex++;
            continue;
          }
          else{
            return 0;
          }

        }
        startIndex+=endIndex;


      }
      else if(element<0){
        element=-1*element;
        endIndex+=element;
        while(startIndex<endIndex) {
          if (a[startIndex]<0) {
            startIndex++;
            continue;
          }
          else{
            return 0;
          }

        }
        startIndex+=endIndex;
      }

    }

    return 1;
  }

}
