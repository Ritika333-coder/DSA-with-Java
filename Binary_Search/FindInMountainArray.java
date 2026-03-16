package Binary_Search;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,3,1};
        int target=5;
        int ans=Search(arr, target);
        System.out.println(ans);
    }
    static int Search(int[]arr,int target){
        int peak=PeakElement(arr);
        int FirstHalf=OrderAgnostic(arr, target, 0,peak);
        if(FirstHalf!=-1){
            return FirstHalf;
        }
        return OrderAgnostic(arr, target, peak+1,arr.length-1);
    }
    static int PeakElement(int[]arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    static int OrderAgnostic(int[]arr,int target,int start,int end){
        boolean isAsc;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        else{
            isAsc=false;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
            return mid;
        }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }     
                else{
                    end=mid-1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
