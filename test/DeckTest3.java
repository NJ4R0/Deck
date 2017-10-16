import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class DeckTest3 {
    Deck deck;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @After
    public void tearDown() throws Exception {
        deck = null;
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void exception() throws Exception {
        Card Joker = deck.getCards().get(53);
    }

    @Ignore
    @Test
    public void testSort() throws Exception {

        Deck.sort(deck.getCards());
        assertFalse(1 == 1);

    }


    @Test(timeout = 400)

    public void testSort1() {
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.TWO)) == 0);
    }

}