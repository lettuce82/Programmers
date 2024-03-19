/*
 * 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
 * t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 * ---------------------------------------------------
 * [생각해 볼 풀이] - 쉬프트 연산
    class Solution {
        public int solution(int n, int t) {
            int answer = 0;

            answer = n << t;

            return answer;
        }
    }
 */
public class Ex16 {
    public static int solution(int n, int t) {
        int answer = 0;
        for (int i = 0; i < t; i++) {
            answer = 2 * n;
            n = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2));
    }
}
