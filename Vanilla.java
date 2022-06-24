public class Vanilla{
  public static void main(String[] args) {
    int arr[]={99999,9999,9,99,99999,9};
    System.out.println(isVanilla(arr));

  }
  public static int isVanilla(int [] arr){
    if (arr.length<2) {
      return 1;

    }
    else{
      int element=arr[0];
      for (int i=0;i<arr.length ;i++ ) {
        if (element>arr[i]) {
          element=arr[i];
        }
    }
    int carry=0;
    for (int i=0;i<arr.length ;i++ ) {
      if (carry != arr[i]) {
        carry=arr[i];
        while(carry > element){
          //temp+=tens*carry%10;
          carry=carry/10;
          //tens=tens*10;
        }
          if (carry==element) {
            continue;
          }
          else if(carry < element){

            return 0;
          }
    }

    }
  }
  return 1;
}
}
