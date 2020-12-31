public class Solution{
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	//Your code goes here
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=output.length-1;
        int carry=0;
        int r=0;
        int sum=0;
        while(i>=0&&j>=0){
            sum=arr1[i]+arr2[j]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            i--;
            j--;
            k--;
        }
        while(i>=0){
            sum=arr1[i]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            i--;
            k--;
            
              }
        while(j>=0){
             sum=arr2[j]+carry;
            r=sum%10;
            carry=sum/10;
            output[k]=r;
            j--;
            k--;
        }
        output[0]=carry;
        
        
    }
    
}