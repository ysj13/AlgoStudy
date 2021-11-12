package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class Problem62948 {
    public static void main(String[] args) {
        // 숫자 -> 문자 -> 내림차순정렬 -> 조합
        int[] numbers = {6, 10, 2};
        String[] strArr = new String[numbers.length];

        // 문자열로 바꿔줘야 숫자 이어붙이기 가능
        for(int i = 0; i < numbers.length; i++) {
            strArr[i] = "" + numbers[i];
        }

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2 + s1).compareTo(s1 + s2);
            }
        });

//        for(int i = 0; i < strArr.length - 1; i++) {
//            for(int j = i + 1; j < strArr.length; j++) {
//                String s1 = strArr[i];
//                String s2 = strArr[j];
//
//                // compareTo : 기준값이 비교하는값보다 작으면 -1 리턴
//                // if문이 true라면 s1, s2 위치를 바꿔준다
//                if((s1+s2).compareTo(s2+s1) < 0) {
//                    strArr[i] = strArr[j];
//                    strArr[j] = s1;
//                }
//            }
//        }

        String answer = "";
        for(String s : strArr) {
            answer += s;
        }

        if(answer.charAt(0) == '0') {
            answer = "0";
        }

        System.out.println(answer);
    }
}
