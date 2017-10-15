import java.util.ArrayList;
import java.util.Random;

class Deck{
    private ArrayList<Card> cards;
    static void sort(ArrayList<Card> cards){
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
    void sort(){
        Deck.sort(cards);
    }
    void shuffle(){
        Random random = new Random();
        for (int i=0; i<200; i++){
            int j=random.nextInt(this.getCards().size());
            int k=random.nextInt(this.getCards().size());
            Card c=this.getCards().get(j);
            this.getCards().set(j,this.getCards().get(k));
            this.getCards().set(k,c);
        }
    }
    Card getFirst(){
        return cards.get(0);
    }
    ArrayList<Card> getCards() {
        return cards;
    }
    void setCards(ArrayList<Card> cards){
        this.cards=cards;
    }
    Deck(int n){
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


    Deck(){
        this(52);
    }

}