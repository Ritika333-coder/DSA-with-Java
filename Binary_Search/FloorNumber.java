package Binary_Search;
public class FloorNumber {
    public static void main(String[] args) {
        int[]arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 17;
        int ans = floorValue(arr, target);
        System.out.println(ans);
    }
    static int floorValue(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        // first of all we will check whether the array is in asc or desc
        boolean isAsc=(arr[start]<arr[end]);
        // loop will execute
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(target<arr[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return end;
    }
    
}
