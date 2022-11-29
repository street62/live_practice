package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoMarathon {
    public static class Player {
        private String name;
        private int[] records;
        private int sumOfRecords;
        private int numOfComplete;
        private int hardestCompleteCourse;
        private int golds;
        private int silvers;
        private int bronzes;

        public Player(String name, int[] records) {
            this.name = name;
            this.records = records;

            for (int i = 0; i < records.length; i++) {
                sumOfRecords += records[i];

                if (records[i] != 0) {
                    numOfComplete += 1;
                    hardestCompleteCourse = i + 1;
                    if (!courses.containsKey(i + 1)) {
                        courses.put(i + 1, new ArrayList<>());
                    }
                    courses.get(i + 1).add(this);
                }
            }
        }
    }


    private Map<String, Player> map = new HashMap<>();
    private List<String> res;
    private static Map<Integer, List<Player>> courses = new HashMap<>();


    public String[] solution(String[] record) {
        parseInput(record);
        giveMedals();

        fifthSort();
        fourthSort();

        String[] answer = {};
        return answer;
    }

    private void giveMedals() {
        for (int i = 1; i <= 5; i++) {
            courses.get(i);

        }
    }

    private void fourthSort() {

    }

    private void fifthSort() {
        res.sort(String::compareTo);
    }

    private void parseInput(String[] record) {
        for (String r : record) {
            String[] split = r.split(":|,");
            String name = split[0];
            int[] records = new int[] {
                    Integer.parseInt(split[1]),
                    Integer.parseInt(split[2]),
                    Integer.parseInt(split[3]),
                    Integer.parseInt(split[4]),
                    Integer.parseInt(split[5])
            };
            map.put(name, new Player(name, records));
        }
        res = new ArrayList<>(map.keySet());
    }


}
