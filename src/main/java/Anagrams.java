import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {

    static List<String> anagrams(String string) {

        if (string.length() <= 1) {
            return Arrays.asList(string);
        }
        ArrayList anagrams = new ArrayList();

        for (int i = 0; i < string.length(); i++) {
            List anagramsOfRest = Anagrams.anagrams(Anagrams.removeIndexFromString(string, i));
            //坑点在这里
//            for (int j = 0; j < string.length() - 1; j++) {
            for (int j = 0; j < anagramsOfRest.size(); j++) {
                anagrams.add(string.charAt(i) + Anagrams.anagrams(Anagrams.removeIndexFromString(string, i)).get(j));
            }
        }
        return anagrams;
    }


    private static String removeIndexFromString(String str, Integer index) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i == index) {
                continue;
            }
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
