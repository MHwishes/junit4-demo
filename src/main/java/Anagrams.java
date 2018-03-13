import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    public static List<String> anagrams(String string) {

        if (string.length() == 0) {

            return new ArrayList();
        }
        return Arrays.asList(string);
    }
}
