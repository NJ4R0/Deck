import junit.framework.TestCase;
import org.junit.*;
import static org.junit.Assert.*;

public class DeckTest2 extends TestCase {

    Deck deck = null;

    @Before
    public void setUp() throws Exception {
        deck = new Deck();
    }

    @Ignore
    @Test
    public void testSort() throws Exception {

        Deck.sort(deck.getCards());
        assertFalse(1==1);

    }

    @After
    public void tearDown() throws Exception {
        deck = null;
    }

    @Test(timeout = 0)
    public void testSort1() {
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.TWO)) == 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testException() throws Exception {
        Card Joker = deck.getCards().get(53);
    }

}