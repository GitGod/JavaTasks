public class TapeEquilibrium {
    public static int solution(int[] A){
        int sumElements = 0;
        int left=0;
        int P=0;

        for(int i=0;i<A.length;i++){

           // if(A[i]<0){
           //     sumElements=sumElements-A[i];

          //  }else {
                sumElements = sumElements + A[i];
          //  }
        }
        int anserw=11111111;
        for(int i=0;i<A.length-1;i++){
            left=left+A[i];
        //    if (A[i]<0) {
           //     sumElements = sumElements + A[i];
           // }else{
                sumElements =sumElements - A[i];
            //}
            P=left-sumElements;

            if (P<0){
                P=-P;
            }
            if(anserw>P){
                anserw=P;
            }
        }
        if(A.length==0){
            return 0;
        }
        return anserw;
    }

    public static void main(String[] args) {
        int[] A ={-1000,1000};
        System.out.println(solution(A));
    }
}
