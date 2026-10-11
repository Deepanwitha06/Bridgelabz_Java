package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.BinarySearch;
public class PeakElement {
    public static void main(String[] args){
        int[] arr={1,2,5,3,6,3,7,3,9};
        int left=0;
        int right=arr.length-1;
        while(left!=right){
            int mid=(left+right)/2;
            if((arr[mid]>arr[mid+1])&&(arr[mid]>arr[mid-1])){
                System.out.println("Peak element: "+arr[mid]);
                break;
            }else if(arr[mid]>arr[mid+1]){
                left=mid+1;
            }else if(arr[mid]>arr[mid-1]){
                right=mid-1;
            }else{
                right--;
                left++;
            }
        }
    }
}