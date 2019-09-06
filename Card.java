public class Card {
  public int suits;
  public int value;
  public String[] cardValue={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
  public String[] cardSuits={"Clubs","Diamonds","Hearts","Spades"};
  public Card(int suits,int value){
      this.value=value;
      this.suits=suits;
  }
  public Card(){


  }
  public String[] getSuits(){
      return cardSuits;
  }
  public String[] getCardValue(){
      return cardValue;
  }
  public String toString(){
      return cardValue[value]+" of "+cardSuits[suits];
  }

}
