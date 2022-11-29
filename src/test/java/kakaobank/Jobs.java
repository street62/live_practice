package kakaobank;

import java.util.*;

public class Jobs {
    private int curSec;
    private final List<Category> categories = new ArrayList<>();
    private final Map<Integer, Category> map = new HashMap<>();
    private final List<Integer> res = new ArrayList<>();
    private int lastExecuted = -1;

    public static class Category {
        private final int id;
        private int sumPriority;
        private int sumTimeToComplete;

        public Category(int id) {
            this.id = id;
        }

        public void addTask(int timeToComplete, int priority) {
            sumPriority += priority;
            sumTimeToComplete += timeToComplete;
        }

        public int clearTasks() {
            int executingTime = sumTimeToComplete;
            sumPriority = 0;
            sumTimeToComplete = 0;
            return executingTime;
        }
    }

    public int[] solution(int[][] jobs) {
        curSec = jobs[0][0];
        for (int[] job : jobs) {
            int reqTime = job[0]; int timeToComplete = job[1]; int categoryNum = job[2]; int priority = job[3];

            if (reqTime > curSec) {
                int plus = -1;
                while (reqTime > curSec && plus != 0) {
                    plus = executeTask();
                }
            }

            if (!map.containsKey(categoryNum)) {
                Category category = new Category(categoryNum);
                map.put(categoryNum, category);
                categories.add(category);
            }

            Category category = map.get(categoryNum);
            category.addTask(timeToComplete, priority);
        }

        execRemains();

        int[] resArr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            resArr[i] = res.get(i);
        }
        return resArr;
    }

    private int executeTask() {
        categories.sort((c1, c2) -> c1.id - c2.id);
        categories.sort((c1, c2) -> c2.sumPriority - c1.sumPriority);
        Category first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : categories.get(0);

        lastExecuted = first.id;
        if (res.isEmpty() || res.get(res.size() - 1) != first.id) {
            res.add(first.id);
        }

        int timeToComplete = first.clearTasks();
        curSec += timeToComplete;
        return timeToComplete;
    }

    private void execRemains() {
        categories.sort((c1, c2) -> c1.id - c2.id);
        categories.sort((c1, c2) -> c2.sumPriority - c1.sumPriority);
        Category first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : categories.get(0);

        while (first.sumTimeToComplete != 0) {
            lastExecuted = first.id;
            if (res.isEmpty() || res.get(res.size() - 1) != first.id) {
                res.add(first.id);
            }

            curSec += first.clearTasks();

            categories.sort((c1, c2) -> c1.id - c2.id);
            categories.sort((c1, c2) -> c2.sumPriority - c1.sumPriority);
            first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : categories.get(0);
        }
    }


}