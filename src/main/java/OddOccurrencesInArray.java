import java.util.*;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        int[] A ={9,3,9,3,7};
        int x = solution(A);
        System.out.println(x);
    }

    public static int solution(int[] A) {
        HashSet x = new HashSet();
        for(int i=0;i<A.length;i++) {

            if (x.contains(A[i])){
                x.remove(A[i]);
            }
            else{
                x.add(A[i]);
            }
        }
     return (int) x.iterator().next();
    }


}
