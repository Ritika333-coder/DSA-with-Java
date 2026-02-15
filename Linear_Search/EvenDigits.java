package Linear_Search;

public class EvenDigits {
    public static void main(String[] args) {
        int[]nums={12,345,2,6,7896};
        System.out.println(Number(nums));
        System.out.println(Digits(-2345));
        System.out.println(Digits(0));
    }
    static int Number(int[] nums){
        int count = 0;
        for(int num:nums){
        if(even(num)){
            count++;
        }
    }
       return count;
    }
    static boolean even(int num){
        int numOfdigit = Digits(num);
        return numOfdigit % 2==0;

        }
    static int Digits(int num){
        // for -ve number 
        if(num<0){
            num = num*-1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
