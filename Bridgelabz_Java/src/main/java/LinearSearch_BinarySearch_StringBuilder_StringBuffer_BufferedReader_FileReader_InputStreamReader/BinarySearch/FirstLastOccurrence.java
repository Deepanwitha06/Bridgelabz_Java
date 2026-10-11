package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.BinarySearch;
public class FirstLastOccurrence {
    public static void main(String[] args) {
        int[] arr={1,2,4,4,4,5,6};
        int target=4;

        int first=-1;
        int last=-1;

        // Find first occurrence
        int left=0;
        int right=arr.length-1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if(arr[mid]==target) {
                first=mid;
                right=mid-1;
            } else if(arr[mid]<target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        // Find last occurrence
        left=0;
        right=arr.length-1;

        while(left<=right) {
            int mid=left+(right-left)/2;

            if(arr[mid]==target) {
                last=mid;
                left=mid+1;
            } else if(arr[mid]<target) {
                left=mid+1;
            } else {
                right=mid-1;
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}