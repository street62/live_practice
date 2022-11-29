package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class One {
    private String[] img;
    private int low;
    private int high;
    private List<List<Integer>> squares = new ArrayList<>();
    private int res;

    public int solution(int low, int high, String[] img) {
        this.img = img;
        this.low = low;
        this.high = high;

        findSquares();
        findQrCodes();

        return res;
    }

    private void findQrCodes() {
        for (List<Integer> s : squares) {
            Map<Character, Integer> map = new HashMap<>();
            int width = s.get(0); int height = s.get(1); int len = s.get(2);
            if (len < 3) {
                continue;
            }

            int lastWidth = width + len - 2; int lastHeight = height + len - 2;

            for (int i = width + 1; i < lastWidth; i++) {
                for (int j = height + 1; j < lastHeight; j++) {
                    map.put(img[i].charAt(j), map.getOrDefault(img[i].charAt(j), 0) + 1);
                }
            }
            double nominator = ((len - 2) * (len - 2));
            double ratio = map.get('#') / nominator * 100;

            if (Math.round(ratio) >= low && Math.round(ratio) < high) {
                res += 1;
            }
        }
    }

    public void findSquares() {
        for (int i = 0; i < img.length; i++) {
            for (int j = 0; j < img[0].length(); j++) {
                for (int k = 1; i + k <= img.length && j + k <= img[0].length(); k++) {
                    isSquare(i, j, k);
                }
            }
        }
    }

    private void isSquare(int i, int j, int k) {
        if (k < 3) {
            return;
        }
        for (int offset = 0; offset < k; offset++) {
            if (img[i].charAt(j + offset) != '#') {
                return;
            }
            if (img[i + offset].charAt(j) != '#') {
                return;
            }
            if (img[i + k - 1].charAt(j + offset) != '#') {
                return;
            }
            if (img[i + offset].charAt(j + k - 1) != '#') {
                return;
            }
        }
        squares.add(List.of(i, j, k));
    }



}
