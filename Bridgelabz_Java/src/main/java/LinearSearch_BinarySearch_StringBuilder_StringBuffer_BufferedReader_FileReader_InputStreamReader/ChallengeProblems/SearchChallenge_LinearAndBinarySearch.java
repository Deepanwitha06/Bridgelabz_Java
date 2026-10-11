package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.ChallengeProblems;

public class SearchChallenge_LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        boolean[] visited=new boolean[max+1];
        for(int num:arr){
            if(num>0){
                visited[num]=true;
            }
        }
        boolean missingFound=false;
        for(int i=1;i<visited.length;i++){
            if(!visited[i]){
                System.out.println("First missing positive: "+i);
                missingFound=true;
                break;
            }
        }
        if(!missingFound){
            System.out.println("First missing positive: "+(max+1));
        }
        int target=4;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==target){
                index=mid;
                break;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        System.out.println("Target index: "+index);
    }
}