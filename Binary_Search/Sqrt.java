package Binary_Search;

public class Sqrt {
    public static void main(String[] args) {
        int n=17;
        int sqrt=Sqrtnum(n);
        System.out.println(sqrt);
    }
    static int Sqrtnum(int x){
        int start=0;
        int end=x;
        int ans =-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==x){
                return mid;
            }
            if(mid*mid<=x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }
}
