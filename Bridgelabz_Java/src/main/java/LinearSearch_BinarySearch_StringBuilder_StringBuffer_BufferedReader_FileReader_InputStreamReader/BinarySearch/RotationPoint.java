package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.BinarySearch;
public class RotationPoint {
   public static void main(String[] args){
       int[] array={15,23,45,1,1,4,6,7,12};
       int left=0;
       int right=array.length-1;
       while(left!=right){
           int mid=(left+right)/2;
           if(array[mid]>array[right]){
               left=mid+1;
           }else if (array[mid]<array[right]){
               right=mid;
           }else{
               right--;
           }
       }
       System.out.println(array[left]);
   }
}