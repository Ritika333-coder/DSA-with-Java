package Linear_Search;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {18,21,33},
            {13,54,67},
            {34,56,23}
        };
        int target = 56;
        int[]ans=search(arr, target); // format to return value {row,col}
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][]arr,int target){
        for(int row =0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
