public class index {
    public static int[] solution(int[] num_list) {
        int length = num_list.length;
        int[] answer = new int[length];
        int index = 0;
        for (int i = num_list.length - 1; i >= 0; i--) {
            answer[index] = num_list[i];
            index++;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] num_list = {4,5,6};
        int[] answer = solution(num_list);
        for (int i : answer) {
            System.out.println(i);
        }

    }
}
