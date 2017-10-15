import java.util.ArrayList;

public class Deck{

    private ArrayList<Card> cards;
    public void sort(){
        for(int i=cards.size()-1;i>=1;i--){
            for(int j=0; j<i; j++){
                if(cards.get(j).compareTo(cards.get(j+1))>0){
                    Card c=cards.get(j);
                    cards.set(j,cards.get(j+1));
                    cards.set(j+1,c);
                }
            }
        }
    }
    public void shuffle(){
        // get random 2 and swap 10k times
    }
    public Card getFirst(){
        return cards.get(0);
    }
    public ArrayList<Card> getCards() {
        return cards;
    }

    public Deck(int n){
        assert n<=52&&n%4==0;
        cards = new ArrayList<>();
        int k = 14;
        for(int i=0; 4*i<n; i++){
            Card c = new Card(Color.CLUBS, k);
            cards.add(c);
            cards.add(new Card(Color.DIAMONDS, c.getCardValue()));
            cards.add(new Card(Color.HEARTS, c.getCardValue()));
            cards.add(new Card(Color.SPADES, c.getCardValue()));
            k--;
        }
        shuffle();
    }

}