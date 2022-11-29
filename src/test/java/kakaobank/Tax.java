package kakaobank;

public class Tax {
    public int solution(int money, int minratio, int maxratio, int ranksize, int threshold, int months) {
        for (int i = 0; i < months; i++) {
            int presumeAmount = money - (money % 100);
            int curRatio = minratio;
            if (presumeAmount < threshold) {
                return money;
            }

            int extraAmount = presumeAmount - threshold;
            curRatio += extraAmount / ranksize;
            curRatio = Math.min(maxratio, curRatio);
            double tax = presumeAmount * ((double) curRatio / 100);
            money = money - (int) Math.round(tax);;
        }
        return money;
    }
}
