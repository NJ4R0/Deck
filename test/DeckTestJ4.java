import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTestJ4 extends TestCase {
    Deck deck = null;
    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @After
    public void tearDown() throws Exception {
        deck = null;
    }
    @Ignore
    @Test
    public void testSort() throws Exception {
    }

    @Test(timeout = 10) public void testSort1(){
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.TWO))==0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testException() throws Exception{
        try{
            Card Joker = deck.getCards().get(53);
        } catch (IndexOutOfBoundsException ex){
            throw ex;
        }
    }

}