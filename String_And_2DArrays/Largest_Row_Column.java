public class Solution {
    public static void findLargest(int mat[][]){
		//Your code goes here
        int rows=mat.length;
        if(rows==0){
             System.out.println("row 0 -2147483648");
        }
        else{
        int cols=mat[0].length;
        int largestRow=-2147483648;
        int largestCol=-2147483648;
        int rowIndex=0;
        int colIndex=0;
        int sum=0;
        for(int i=0;i<rows;i++){
             sum=0;
            for(int j=0;j<cols;j++){
                sum=sum+mat[i][j];
            }
            if(sum>largestRow){
                largestRow=sum;
                rowIndex=i;
            }
        }
        for(int i=0;i<cols;i++){
             sum=0;
            for(int j=0;j<rows;j++){
                sum=sum+mat[j][i];
            }
            if(sum>largestCol){
                largestCol=sum;
                colIndex=i;
            }
        }
            if(largestRow>largestCol){
                System.out.println("row "+rowIndex+" "+largestRow);
            }
            else if(largestRow<largestCol){
                System.out.println("column "+colIndex+" "+largestCol);
            }
            else{
                System.out.println("row "+rowIndex+" "+largestRow);
            }
      }
	}

}