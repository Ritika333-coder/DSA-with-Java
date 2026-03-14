package Binary_Search;
public class PeakElement {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5,3,1};
        int target=3;
        int ans = Search(arr,target);
        System.out.println(ans);
    }
     static int Search(int[]arr,int target){
        int peak = Peakelement(arr);
        int FirstHalf= OrderAgnostic(arr, target, 0, peak);
        if(FirstHalf!=-1){
            return FirstHalf; 
        }
       // now we will search in 2nd half
       return OrderAgnostic(arr,target,peak+1,arr.length-1);
    }
    static int Peakelement(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
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
            int mid =start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    start = mid+1;                }
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
          return -1;
    }
}
