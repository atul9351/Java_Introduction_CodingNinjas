public class Solution {
    
    public static void swapAlternate(int arr[]) {
    	//Your code goes here
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
            int a =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=a;
            i++;
            }
        }
        else{
           for(int i=0;i<arr.length-1;i++){
            int a =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=a;
            i++;
            }
            
        }
    }
}