package Binary_Search;

public class SplitArray {
    public static void main(String[] args) {
        int[]nums={7,2,5,10,8};
        int ans = Splitarray(nums, 0);
        System.out.println(ans);

    }
    static int Splitarray(int[]nums,int m){
        int start=0;
        int end=0;
        for(int i=0;i<nums.length;i++){
            start=Math.max(start,nums[i]);
            end+=nums[i];
        }
        // binary search will apply here 
        while(start<end){
            int mid=start+(end-start)/2;
            //calculate how amny number of pieces you can divide this with max sum
            int sum=0;
            int pieces=1;
            for(int num:nums){
                if(sum+num>mid){
                    // you can't add this in subarray make new one then sum= num
                    sum=num;
                    pieces++;
                }
                else{
                    start+=num;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return start;
    }
}
