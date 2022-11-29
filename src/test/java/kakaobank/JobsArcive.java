//package kakaobank;
//
//import java.util.*;
//
//public class Jobs {
//    private int curSec = 1;
//    //    private Queue<Category> q = new PriorityQueue<>((q1, q2) -> q2.sumPriority - q1.sumPriority);
//    private List<Category> q = new ArrayList<>();
//    private Map<Integer, Category> map = new HashMap<>();
//    private List<Integer> res = new ArrayList<>();
//    private int lastExecuted = -1;
//
//    // maxPriority를 잡는 것도 방법일듯
//    public static class Category {
//        private int num;
//        private int sumPriority;
//        private int sumTimeToComplete;
//        private List<Integer> taskList = new ArrayList<>();
//
//        public Category(int num) {
//            this.num = num;
//        }
//
//        public void addTask(int timeToComplete, int priority) {
//            sumPriority += priority;
//            sumTimeToComplete += timeToComplete;
//        }
//
//        public int clearTasks() {
//            int res = sumTimeToComplete;
//            sumPriority = 0;
//            sumTimeToComplete = 0;
//            return res;
//        }
//
//        @Override
//        public String toString() {
//            return "category " + String.valueOf(num);
//        }
//    }
//
//    public int[] solution(int[][] jobs) {
//
//        for (int[] job : jobs) {
//            int reqTime = job[0]; int timeToComplete = job[1]; int categoryNum = job[2]; int priority = job[3];
//
//            if (reqTime > curSec) {
//                executeTask();
//            }
//
//            if (!map.containsKey(categoryNum)) {
//                Category category = new Category(categoryNum);
//                map.put(categoryNum, category);
//                q.add(category);
//            }
//
//            Category category = map.get(categoryNum);
//            category.addTask(timeToComplete, priority);
//        }
//
//        execRemains();
//
//        int[] resArr = new int[res.size()];
//        for (int i = 0; i < res.size(); i++) {
//            resArr[i] = res.get(i);
//        }
//        return resArr;
//    }
//
//    private void execRemains() {
//        q.sort((q1, q2) -> q1.num - q2.num);
//        q.sort((q1, q2) -> q2.sumPriority - q1.sumPriority);
//        Category first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : q.get(0);
//
//        while (first.sumTimeToComplete != 0) {
//            lastExecuted = first.num;
//            if (res.isEmpty() || res.get(res.size() - 1) != first.num) {
//                res.add(first.num);
//            }
//
//            curSec += first.clearTasks();
//
//            q.sort((q1, q2) -> q1.num - q2.num);
//            q.sort((q1, q2) -> q2.sumPriority - q1.sumPriority);
//            first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : q.get(0);
//
//        }
//
//        int timeToComplete = first.clearTasks();
//        curSec += timeToComplete;
//    }
//
//    private void executeTask() {
//        q.sort((q1, q2) -> q1.num - q2.num);
//        q.sort((q1, q2) -> q2.sumPriority - q1.sumPriority);
//        Category first = (lastExecuted != - 1 && map.get(lastExecuted).sumTimeToComplete != 0 ) ? map.get(lastExecuted) : q.get(0);
//
//        lastExecuted = first.num;
//        if (res.isEmpty() || res.get(res.size() - 1) != first.num) {
//            res.add(first.num);
//        }
//
//        int timeToComplete = first.clearTasks();
//        curSec += timeToComplete;
//    }
//
//}
