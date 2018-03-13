import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AnagramsTest {

    @Test
    public void should_return_when_given_empty_string() throws Exception {

        List<String> expected = Arrays.asList("");

        assertEquals(expected, Anagrams.anagrams(""));
    }

    @Test
    public void should_return_when_give_a() throws Exception {

        List<String> expected = Arrays.asList("a");
        assertEquals(expected, Anagrams.anagrams("a"));
    }

    @Test
    public void should_return_when_give_ab() throws Exception {

        List<String> expected = Arrays.asList("ab", "ba");
        assertEquals(expected, Anagrams.anagrams("ab"));
    }

    @Test
    public void should_return_when_give_abc() throws Exception {

        List<String> expected = Arrays.asList(
        "abc", "acb",
        "bac", "bca",
        "cab", "cba");
        assertEquals(expected, Anagrams.anagrams("abc"));
    }

    @Test
    public void should_return_when_give_biro() throws Exception {

        List<String> expected = Arrays.asList(
                "biro","bior", "brio", "broi", "boir", "bori",
                "ibro","ibor","irbo","irob","iobr","iorb",
                "rbio", "rboi","ribo","riob","robi","roib",
                "obir", "obri", "oibr","oirb","orbi","orib");
        assertEquals(expected, Anagrams.anagrams("biro"));
    }
}
