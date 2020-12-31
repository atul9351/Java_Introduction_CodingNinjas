public class Solution{  

    public static int findUnique(int[] arr){
		//Your code goes here
        int i =0;
        int number=0;
        while(i<arr.length){
            int c=0;
            int Unique=arr[i];
            for(int j=0;j<arr.length;j++){
                if(arr[j]==Unique){
                    c=c+1;
                }
                else{
                    continue;
                }
                
            }
            if(c==1){
                number=arr[i];
                break;
            }
            else{
                i++;
                continue;
                
            }
            
        }
        return number;
    }
}