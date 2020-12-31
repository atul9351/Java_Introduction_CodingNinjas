public class Solution {
    
    public static int findTriplet(int[] arr, int x) {
    	//Your code goes here
        int c=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(x==arr[i]+arr[j]+arr[k]){
                    c=c+1;
                   }
                }
            }
        }
        return c;
    }

}