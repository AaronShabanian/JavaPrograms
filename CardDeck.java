import java.util.ArrayList;
import java.util.Random;
public class CardDeck extends Card {
    public ArrayList<String> deck;
    public Card card;

    public CardDeck() {
        deck = new ArrayList<String>(52);
        card = new Card();
    }

    public ArrayList<String> getCardDeck() {
        for (int i = 0; i < cardValue.length; i++) {
            for (int k = 0; k < cardSuits.length; k++) {
                System.out.println(cardValue[i] + " of " + cardSuits[k]);
            }
        }
        return deck;
    }
    public String dealCard(){
        Random r=new Random();
        int num = r.nextInt(13);
        return cardValue[num];
    }

}
