package naver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StringPathChanger {
    public String changeDirectoryString(String currentDirectory, String command) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        stack.addAll(Arrays.asList(currentDirectory.split("/")));
        System.out.println(stack);

        String[] splited = command.split(" ");
        if (!splited[0].equals("cd") || splited.length != 2) {
            throw new IllegalStateException();
        }
        String directory = splited[1];
        if (directory.startsWith("/")) {
            return directory;
        }

        String[] dirs = directory.split("/");
        for (String dir : dirs) {
            if (dir.equals("..")) {
                if (stack.size() > 0) {
                    stack.pop();
                }
            } else {
                stack.push(dir);
            }
        }
        if (stack.size() == 1) {
            return "/";
        }
        for (String dir : stack) {
            sb.append("/").append(dir);
        }
        return sb.toString();
    }
}
