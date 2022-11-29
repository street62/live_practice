package kakaobank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Door {
    private Set<Integer> visited = new HashSet<>();
    private int[] rooms;


    public static void main(String[] args) {
        Door door = new Door();
        int solution = door.solution(new int[]{3, 1, 2, 4});
        System.out.println(solution);
    }

    public int solution(int[] rooms) {
        this.rooms = rooms;
        int res = 0;


        for (int i = 1; i <= rooms.length; i++) {
            if (visited.contains(i)) {
                continue;
            }
            res += 1;
            visit(i);
        }

//        int[] parent = new int[rooms.length + 1];
//        for (int i = 1; i < parent.length; i++) {
//            parent[rooms[i - 1]] = i;
//        }
//        System.out.println(Arrays.toString(parent));
        res -= 1;
        res = Math.max(res, 1);
        return res;
    }

    private void visit(int room) {
        if (visited.contains(room)) {
            return;
        }
        visited.add(room);
        visit(rooms[room - 1]);
    }
}
