public class Solution {  

    public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int c=0;
        int d=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c=c+1;
            }
        }
        d=arr.length-c;
        for(int j=0;j<arr.length;j++){
            if(j<c){
                arr[j]=0;
            }
            else{
                arr[j]=1;
            }
        }
    }
}