public class Centered{
  public static void main(String[] args) {
    int[] arr={3,2,10,4,1,6,9};
    int num=15;
    System.out.println(isCentered(arr,num));
  }
  public static int isCentered(int [] arr,int num){
    if (arr.length < 3) {
      return 0;

    }
    int sum=0;
    for (int i=0;i<arr.length ;i++ ) {
      sum+=arr[i];
    }
    int start=0;
    int end=arr.length-1;
    while(sum != num && start<end){
      sum=sum-arr[start]-arr[end];
      start++;
      end--;
    }
    if (sum == num) {
      return 1;

    }
    else{
      return 0;
    }

  }
}
