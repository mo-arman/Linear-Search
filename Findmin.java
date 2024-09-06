public class Findmin {
    public static void main(String[] args) {
        int[] arr = {18,20,88,2,7,8,9,3};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
