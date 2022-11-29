package org;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BasicString {

    public static String reverseString(String input) {
        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        return String.valueOf(chars);
    }
    public static int stringToInteger(String input) {
        int res = 0;
        boolean isNegative = false;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i == 0 && c == '-') {
                isNegative = true;
                continue;
            }
            if (c < 48 || c > 57) {
                return -1;
            }
            res = (res * 10) + (c - 48);
        }
        if (isNegative) {
            res *= -1;
        }
        return res;
    }

//    public static String reverseString(String input) {
//        char[] inputArr = input.toCharArray();
//        for (int i = 0; i < inputArr.length / 2; i++) {
//            char temp = inputArr[inputArr.length - 1 - i];
//            inputArr[inputArr.length - 1 - i] = inputArr[i];
//            inputArr[i] = temp;
//        }
//        return String.valueOf(inputArr);
//    }

    public static boolean areCharsUnique(String input) {
        Map<Character, Boolean> map = new HashMap<>();
        char[] inputArr = input.toCharArray();
        for (char c : inputArr) {
            if (map.containsKey(c)) {
                return false;
            }
            map.put(c, true);
        }
        return true;
    }

    public static boolean isInputAnagramOfOrg(String org, String input) {
        char[] orgArr = org.toCharArray();
        char[] inputArr = input.toCharArray();
        boolean res = true;

        if (orgArr.length != inputArr.length) {
            return false;
        }
        Arrays.sort(orgArr);
        Arrays.sort(inputArr);

        for (int i = 0; i < orgArr.length; i++) {
            res = res && orgArr[i] == inputArr[i];
        }
        return res;
    }

    public static int getCountOfInputInTarget(String target, String input) {
        Map<String, Integer> map = new HashMap<>();
        String[] targetArr = target.split(" ");

        for (String s : targetArr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        if (!map.containsKey(input)) {
            return 0;
        }
        return map.get(input);
    }

}


