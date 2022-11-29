package naver;

public class FindNumber {
    public static void main(String[] args) {
        FindNumber n = new FindNumber();
        System.out.println(n.solution(268));
        System.out.println();
        System.out.println(n.solution(670));
        System.out.println();
        System.out.println(n.solution(0));
        System.out.println();
        System.out.println(n.solution(-999));
    }

    public int solution(int N) {
        // write your code in Java SE 8
        String str = String.valueOf(N);
        String res = "";
        if (str.charAt(0) != '-') {
            for (int i = 0; i < str.length(); i++) {
                int curValue = str.charAt(i) - '0';
                if (curValue <= 5) {
                    res = str.substring(0, i) + "5" + str.substring(i, str.length());
                    break;
                }
            }
        } else {
            for (int i = 1; i < str.length(); i++) {
                int curValue = str.charAt(i) - '0';
                if (curValue > 5) {
                    res = str.substring(0, i) + "5" + str.substring(i, str.length());
                    break;
                }
            }
        }
        if (res.equals("")) {
            res = str + "5";
        }
        return Integer.parseInt(res);
    }
}
