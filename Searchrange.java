public class Searchrange {
    public static void main(String[] args) {
      int[] arr = {18,20,-88,2,7,8,9,3};
      int target = 2;
      System.out.println(LinearSearch(arr, target, 1, 4));  
    }
    static int LinearSearch(int[] arr, int target,int start,int end){
        if(arr.length==0){
            return -1;
        }
        for(int i =start; i<=end; i++){
            int element = arr[i];
            if(element==target){
                return i;
            }
        }
        return-1;
    }
}
