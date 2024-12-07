public class Spiral_matrix{
    
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int endRow=matrix.length-1;
        int startCol=0;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow &&startCol<=endCol){
            //top coloum
            for(int j=startCol;j<=endCol;j++)
            { 
                System.out.println(matrix[startRow][j]+" ");
            }

            //right
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.println(matrix[i][endCol]+" ");
            }

            //bottom
            for(int j=endCol-1;j>=startCol;j--)
            {    
                if(startRow == endRow){//this if n*m =odd
                    break;//if dont want to print singleno.again and agin the use break
                }
                System.out.println(matrix[endRow][j]);
            }

            //left
            for(int i=endRow-1;i>=startRow+1;i--)
            {
                if(startCol == endCol){//this if n*m =odd
                    break;
                    }//if dont want to print singleno.again and agin the use break
                System.out.println(matrix[i][startCol]);
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;

        }
        System.out.println();
      }
    
    
    
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};

       printSpiral(matrix);
    }
}