import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {12,34,56,78,90},
            {12,23}
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target){
        for(int row =0; row<arr.length; row++){
            for(int column=0; column<arr[row].length; column++){
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
            }
        }
        return new  int[]{-1,-1};
    }
    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}

