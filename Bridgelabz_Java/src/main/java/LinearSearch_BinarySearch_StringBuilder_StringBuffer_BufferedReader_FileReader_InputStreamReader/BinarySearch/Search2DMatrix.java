package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.BinarySearch;
public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int left=0;
        int right=(rows*cols)-1;
        boolean found=false;
        while(left<=right){
            int mid=(left+right)/2;
            int row=mid/cols;
            int col=mid%cols;
            if(matrix[row][col]==target){
               found=true;
                break;
            }else if(matrix[row][col]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        System.out.println("found: "+found);
    }
}