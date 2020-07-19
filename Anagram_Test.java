import static junit.framework.TestCase.assertEquals;

public class Anagram_Test {

    @org.junit.Test
    public void AnagramTest_True(){
       assertEquals(Anagram.anagramChecker("table", "bleat"), true);
    }

    @org.junit.Test
    public void AnagramTest_False(){
        assertEquals(Anagram.anagramChecker("tar", "eat"), false);
    }
}
