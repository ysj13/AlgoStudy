package leetcode;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        System.out.println(titleToNumber(columnTitle));
    }

    public static int titleToNumber(String columnTitle) {
        int answer = 0;
        char temp = ' ';

        for(int i = columnTitle.length() - 1; i >= 0; i--) {
            temp = columnTitle.charAt(columnTitle.length() - 1 - i);
            answer += (temp - 64) * Math.pow(26, i);
        }

        return answer;
    }
}
