public class RailRoad{

  public static void main(String[] args) {
    int arr[]={1,1,1,1,1};
    System.out.println(isRailRoadTie(arr));


  }
  public static int isRailRoadTie(int [] arr){
    if (arr.length<2) {
      return 0;

    }
    else{
      if (arr[0]==0  || arr[arr.length -1]==0) {
        return 0;
      }
      else if (arr[0] != 0) {
        for (int i=1;i<arr.length ;i++ ) {
          if (arr[1]== 0) {
            return 0;
        }
        else{
          for (int j=2;j<arr.length ;j++ ) {
            if (arr[i] !=0 && arr[j]==0 || arr[i] !=0 && arr[i-1]==0) {
              i++;
              continue;
            }
            else if (arr[i]==0 && arr[j] !=0 && arr[i-1] !=0) {
              i++;
              continue;

            }
            else{
              return 0;
            }

          }
        }

        }
      }
    }
    return 1;
  }
}
