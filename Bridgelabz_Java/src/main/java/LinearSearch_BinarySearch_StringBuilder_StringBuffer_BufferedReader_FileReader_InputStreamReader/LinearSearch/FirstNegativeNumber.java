package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.LinearSearch;
public class FirstNegativeNumber {
    public static int linearSearch(int[] numbers){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args){
        int[] numbers={1,0,9,-3,-4};
        int resultIndex=linearSearch(numbers);
        if(resultIndex==-1){
            System.out.println("No negative number");
        }else{
            System.out.println("Negative number at position "+(resultIndex+1));
        }
    }
}