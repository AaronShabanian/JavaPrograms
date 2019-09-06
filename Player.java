public class Player extends CardDeck {
   String[] Player1 = new String[26];
   String[] Player2= new String[26];
   public void distribute1(){
       int i=0;
       while(i<26){
           Player1[i]=dealCard();
           i++;
       }
    }
    public void distribute2(){
        int i=0;
        while(i<26){
            Player2[i]=dealCard();
            i++;
        }
    }
}
