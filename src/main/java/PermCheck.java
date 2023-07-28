import java.util.Arrays;

public class PermCheck {
    public static int solution(int[] A){
        int leng =A.length;
        if(leng==0){
            return 0;
        }
        A = Arrays.stream(A).distinct().sorted().toArray();
        if(A.length==leng && A[A.length-1]==A.length){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int[] B = {};

        System.out.println(solution(B));
    }
}
