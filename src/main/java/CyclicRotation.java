public class CyclicRotation {
    public static void main(String[] args) {
       int[] A ={};
        int K = 3;
     //   System.out.println(solution(A,K)[0]);
       // System.out.println(solution(A,K)[1]);
       // System.out.println(solution(A,K)[2]);
      //  System.out.println(solution(A,K)[3]);
       // System.out.println(solution(A,K)[4]);
    }
    public static int[] solution(int[] A, int K) {
       if (A.length == 0)
       {
           return A;
       }
        int[] B = A;
        for(int i=0;i<K;i++){
            B = rotate(B);
        }// Implement your solution here
        return B;
    }

    public static int[] rotate(int[] A){
        int lastElement = A[A.length-1];
        int[] B = new int[A.length];
        for(int i=0;i<A.length-1;i++){
            B[i+1]=A[i];

        }
        B[0]=lastElement;
        // Implement your solution here
        return B;
    }

}
