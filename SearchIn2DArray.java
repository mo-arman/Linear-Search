import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {23,4,1},
            {12,34,56,78,90},
            {12,23}
        };
        int target = 34;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
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
}
