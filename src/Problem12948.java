public class Problem12948 {
    public static void main(String[] args) {
        String phone_number = "01033334444";

        System.out.println(solution(phone_number));
    }

    public static String solution(String phone_number) {
        String answer = "";
        int start = phone_number.length() - 4;

        for(int  i = 0; i < phone_number.length(); i++) {
            if(i >= start) {
                answer += phone_number.charAt(i);
            } else {
                answer += '*';
            }
        }

        return answer;
    }
}
