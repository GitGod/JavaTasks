public class FrogJmp {

        public static int solution(int X, int Y, int D) {
            return (int) (Math.ceil(Double.valueOf(Y-X)/D));

        }

    public static void main(String[] args) {
        System.out.println(solution(10,85,30));

    }

}
