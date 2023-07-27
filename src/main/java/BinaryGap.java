public class BinaryGap {


    public static void main(String[] args) {
        int x = mostZero(5);
        System.out.println(x);
    }
    public static int mostZero(int N){
        int maxZero=0;
        int numberOfZero=0;
        int i=0;
        int modifier=0;
        String x = Integer.toString(N,2);
        if(x.endsWith("1")){
            modifier= 1;
        }
        do {
            if(x.charAt(i)=='0'){
                numberOfZero++;
            }
            else{
                if(maxZero<numberOfZero){
                    maxZero=numberOfZero;
                }
                if(numberOfZero!=0) {
                    numberOfZero = 0;
                }
            }
            i++;


        } while (i<x.length());


        return maxZero;
    }


}
