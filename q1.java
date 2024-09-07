public class q1 {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3},
            {2,3,1},
            {4,5}
        };
        
        System.out.println(maximumwealth(arr));
    }
    static int maximumwealth(int [][] accounts){
        int ans = Integer.MAX_VALUE;
        for(int person = 0; person<accounts.length; person++){
            int sum =0;
            for(int account = 0; account<accounts[person].length; account++){
               sum+=accounts[person][account];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
