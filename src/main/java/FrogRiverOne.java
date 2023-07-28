import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FrogRiverOne {
    public static int solution(int X, int[] A){
        int[] B = new int[X];
        int[] C = {};
        for(int i=0;i<X;i++){
            B[i]=0;
        }
       for(int i=0;i<A.length;i++){
            B[A[i]-1]=1;
           C = Arrays.stream(B).distinct().toArray();
           if(C.length==1){
               return i;
           }
        }
       return -1;

}
    private static int solution2(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] B = {1,2};
       int  x=2;
       System.out.println(solution2(x,B));
    }
}
