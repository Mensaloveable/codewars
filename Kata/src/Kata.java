import java.util.ArrayList;
public class Kata
{
    public static String reverseWords(final String original)
    {
        // Have at it
        ArrayList<String> string = new ArrayList<>();
        if (original.trim() == "") {
            return original;
        }
        for (String word : original.split(" ")) {
            string.add(new StringBuilder(word).reverse().toString());
        }
        return String.join(" ", string);
    }
}