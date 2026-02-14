public class Main {
    public static void main(String[] args) {
        int []nums = {23,45,1,28,19,-1,16,-34,28};
        int target = 19;
        int ans = linearSearch(nums, target);
        System.out.println(ans);
    }
    static int linearSearch(int[]arr , int target){
        if(arr.length==0){
            return -1;
        }
        // run a for loop
        for(int index = 0;index<arr.length;index++){
            // check for every element for every index if it is = target
            int element = arr[index];
            if(element== target){
                return index;
            }
        }
        // This is the line execute if the name of the return statements above have executed hence the 
        // target not found
        return -1;
    }
}


