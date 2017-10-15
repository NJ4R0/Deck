
public class Card implements Comparable<Card>{

    public int compareTo(Card card){
        if(this.cardColor == card.cardColor){
            return this.getCardValue().compareTo(card.getCardValue());
        }
        else {
            return this.getCardColor().compareTo(card.getCardColor());
        }
    }

    private Color cardColor;
    private Value cardValue;
    public Color getCardColor() {
        return cardColor;
    }
    public Value getCardValue() {
        return cardValue;
    }
    public Card(Color color, Value value){
        cardColor=color;
        cardValue=value;
    }
    public Card(Color color, int value){
        assert value<=14&&value>=2;
        cardColor = color;
        switch (value){
            case 14:
                cardValue = Value.ACE;
                break;
            case 13:
                cardValue = Value.KING;
                break;
            case 12:
                cardValue = Value.QUEEN;
                break;
            case 11:
                cardValue = Value.JACK;
                break;
            case 10:
                cardValue = Value.TEN;
                break;
            case 9:
                cardValue = Value.NINE;
                break;
            case 8:
                cardValue = Value.EIGHT;
                break;
            case 7:
                cardValue = Value.SEVEN;
                break;
            case 6:
                cardValue = Value.SIX;
                break;
            case 5:
                cardValue = Value.FIVE;
                break;
            case 4:
                cardValue = Value.FOUR;
                break;
            case 3:
                cardValue = Value.THREE;
                break;
            case 2:
                cardValue = Value.TWO;
                break;
        }
    }
}