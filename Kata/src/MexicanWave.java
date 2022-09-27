
//    Task
//In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
// You will be passed a string and you must return that string in an array where an uppercase
// letter is a person standing up.
//Rules
// 1.  The input string will always be lower case but maybe empty.
//
// 2.  If the character in the string is whitespace then pass over it as if it was an empty seat
//Example
//wave("hello") => {"Hello", "hEllo", "heLlo", "helLo", "hellO"}
import java.util.*;
public class MexicanWave {

    public static String[] wave(String str) {
        // Your code here
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < str.length(); ++i) {
            String[] process = str.split("");
            process[i] = process[i].toUpperCase();
            if (process[i].equals(" ")) {
                continue;
            }
            String pro = String.join("", process);
            answer.add(pro);
        }

        return answer.toArray(String[]::new);
    }

}

