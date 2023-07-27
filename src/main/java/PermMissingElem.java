import java.util.ArrayList;

public class PermMissingElem {
    public static int solution2(int[] A) {
        ArrayList x = new ArrayList();

        for(int y=0;y<A.length;y++){
            x.add(A[y]);
        }
        for(int i=1;i<=x.size()+1;i++){
            if(!x.contains(i)){
                return i;
            }
        }
        return 0;
    }

    public static int solution(int[] A) {
        boolean[] a = new boolean[A.length + 1];
        for (int i = 0; i < A.length; i++) {
            a[A[i] - 1] = true;
        }
        for (int i = 0; i < a.length; i++) {
            if (!a[i]) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A= {1,2,3,4,6};
        System.out.println(solution(A));

    }
}
