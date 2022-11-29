package naver;

public class Log {
    public int[] solution(String logs) {
        int[] answer = new int[24];
        String[] logArr = logs.split("\n");
        for (String log : logArr) {
            String time = log.split(" ")[1];
            int hour = Integer.parseInt(time.split(":")[0]);
            hour += 9;
            if (hour > 23) {
                hour -= 24;
            }
            answer[hour] += 1;
        }
        return answer;
    }
}
