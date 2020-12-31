public class Solution {

	public static void spiralPrint(int mat[][]){
		//Your code goes here
        int rows=mat.length;
        
        if(rows!=0){
        int cols=mat[0].length;
    	int rowS=0;
        int colS=0;
        int rowE=rows-1;
        int colE=cols-1;
        int count=rows*cols;
        int i=0;
        
        while(i<count){
            for(int j=colS;j<=colE;j++){
                System.out.print(mat[rowS][j]+" ");
                i++;
            }
            rowS++;
            for(int j=rowS;j<=rowE;j++){
                System.out.print(mat[j][colE]+" ");
                i++;
            }
            colE--;
            for(int j=colE;j>=colS;j--){
                System.out.print(mat[rowE][j]+" ");
                i++;
            }
            rowE--;
            for(int j=rowE;j>=rowS;j--){
                System.out.print(mat[j][colS]+" ");
                i++;
            }
            colS++;
            
        }
      } 
    
	}
}