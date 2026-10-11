package LinearSearch_BinarySearch_StringBuilder_StringBuffer_BufferedReader_FileReader_InputStreamReader.StringBuffer;
/*
       compare StringBuffer vs StringBuilder
       use System.nanoTime()
 */
public class StringBufferVsStringBuilder {
    public static void main(String[] args){
        //StringBuffer obj
        StringBuffer sbf=new StringBuffer();
        long startTime1=System.nanoTime();
        for(long i=0;i<1000000;i++){
            sbf.append("hello");
        }
        long endTime1=System.nanoTime();
        long elapse1=endTime1-startTime1;

        //StringBuilder object
        StringBuilder sbr=new StringBuilder();
        long startTime2=System.nanoTime();
        for(long i=0;i<1000000;i++){
            sbr.append("hello");
        }
        long endTime2=System.nanoTime();
        long elapse2=endTime2-startTime2;

        System.out.println("String buffer: "+elapse1+"\nString Builder: "+elapse2);
        if(elapse1>elapse2){
            System.out.println("String builder is faster than String buffer");
        }else if(elapse2>elapse1){
            System.out.println("String buffer is faster than string builder");
        }else{
            System.out.println("Both same");
        }
    }
}