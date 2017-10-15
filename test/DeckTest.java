import junit.framework.TestCase;

import java.util.ArrayList;

public class DeckTest extends TestCase {
    private Deck deck = null;

    public void setUp() throws Exception {
        deck = new Deck();
        super.setUp();
    }

    public void tearDown() throws Exception {
        deck = null;
        super.tearDown();
    }

    public void testSort() throws Exception {
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.TWO)) == 0);
    }

    public void testSort1() throws Exception {
        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(Color.HEARTS, Value.KING));
        cards.add(new Card(Color.HEARTS, Value.FIVE));
        cards.add(new Card(Color.HEARTS, Value.ACE));
        cards.add(new Card(Color.DIAMONDS, Value.ACE));
        Deck.sort(cards);
        assertTrue(cards.get(1).compareTo(new Card(Color.HEARTS, Value.FIVE)) == 0);
        assertTrue(cards.get(cards.size() - 1).compareTo(new Card(Color.HEARTS, Value.ACE)) == 0);
    }

    public void testShuffle() throws Exception {
        Deck deck1 = new Deck();
        Deck deck2 = new Deck();
        deck1.shuffle();
        deck2.shuffle();
        assertNotSame(deck1, deck2);
    }

    public void testGetFirst() throws Exception {
        assertEquals(deck.getCards().get(0), deck.getFirst());
    }

    public void testCreation() {
        deck = new Deck(32);
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.SEVEN))==0);
        deck = new Deck(24);
        deck.sort();
        assertTrue(deck.getFirst().compareTo(new Card(Color.CLUBS, Value.NINE))==0);
    }

}