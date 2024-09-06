public class Linear{
    public static void main(String[] args) {
        int[] nums = {23,34,25,16,28,1};
        int target = 25;
      int ans = linearS(nums, target);
      System.out.println(ans);;
    }
    static int linearS(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int i =0; i<arr.length; i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
            
        }
       return -1;
    }
}