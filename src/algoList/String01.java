package algoList;
/**
 * 같은 문자열 찾기
 */
public class String01 {
    public static void main(String[] args) {
        //sample case
        String str = "Computercooler";
        char c = 'c';

        System.out.println(solution(str, c));
    }

    public static int solution(String str, char c) {
        int answer = 0;
        // 문자열을 전부 대문자 or 소문자로 통일하여 변경한다
        // 통일하여 변경하면 대소문자 구분없이 같은 문자를 찾기 쉬움
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        // 반복문을 돌면서 문자하나씩 비교하여 같은문자가 있을때 count를 올려줌
        for(char x : str.toCharArray()) {
            if(x == c) {
                answer++;
            }
        }

        return answer;
    }
}
