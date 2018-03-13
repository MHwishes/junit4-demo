import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class AnagramsTest {

    @Test
    public void should_return_when_given_empty_string() throws Exception {

        assertEquals(0, Anagrams.anagrams("").size());
    }

}
