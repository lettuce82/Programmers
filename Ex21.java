public class Ex21 {
    public static int solution(int[] sides) {
        int temp;
        for (int i = 0; i < sides.length - 1; i++) {
            for (int j = 0; j < sides.length - i - 1; j++) {
                if (sides[j] < sides[j + 1]) {
                    temp = sides[j];
                    sides[j] = sides[j + 1];
                    sides[j + 1] = temp;
                }
            }
        }
        if (sides[0] < sides[1] + sides[2]) {
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String[] args) {
        int[] sides = {3, 6, 1};
        
        System.out.println(solution(sides));
    }
}
