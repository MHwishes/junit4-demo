import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class AnagramsTest {

    @Test
    public void should_return_when_given_empty_string() throws Exception {

        assertEquals(0, Anagrams.anagrams("").size());
    }

    @Test
    public void should_return_when_give_a() throws Exception {

        List<String> expected = Arrays.asList("a");
       assertEquals(expected,Anagrams.anagrams("a"));
    }
}
