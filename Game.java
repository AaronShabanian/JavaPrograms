public class Game extends Player {
    public int one;
    public int two;
    public int wars;
    public int doublecounter;
    public void game(){
        distribute1();
        distribute2();
        int i=0;
        int doublewar=0;
        int doublecounter=0;
        int one=0;
        int two=0;
        int wars=0;
        while(i<26){
            if(Player1[i]!="King"&&Player1[i]!="Queen"&& Player1[i]!="Jack"&&Player1[i]!="Ace"){
                if(Player2[i]!="King"&&Player2[i]!="Queen"&& Player2[i]!="Jack" && Player2[i]!="Ace"){
                    if (Integer.valueOf(Player1[i])>Integer.valueOf(Player2[i])){
                        doublewar=0;
                        one++;
                    }
                    else if (Integer.valueOf(Player2[i])>Integer.valueOf(Player1[i])){
                        two++;
                        doublewar=0;
                    }
                    else if (Integer.valueOf(Player2[i])==Integer.valueOf(Player1[i])){
                        i+=3;
                        //adds 1 at the end so its a total of plus 4
                        wars++;
                        if(doublewar==1){
                            doublecounter++;
                        }
                       doublewar=1;
                    }
                }
                else{
                    two++;
                    doublewar=0;
                }
            }
            else if(Player2[i]!="King"&&Player2[i]!="Queen"&& Player2[i]!="Jack"&&Player2[i]!="Ace"){
                if(Player1[i]!="King"&&Player1[i]!="Queen"&& Player1[i]!="Jack" && Player1[i]!="Ace"){
                    if (Integer.valueOf(Player1[i])>Integer.valueOf(Player2[i])){
                        one++;
                        doublewar=0;
                    }
                    else if (Integer.valueOf(Player2[i])>Integer.valueOf(Player1[i])){
                        two++;
                        doublewar=0;
                    }
                    else if (Integer.valueOf(Player2[i])==Integer.valueOf(Player1[i]))
                        i+=3;
                        wars++;
                    if(doublewar==1){
                        doublecounter++;
                    }
                    doublewar=1;

                }
                else{
                    one++;
                    doublewar=0;
                }
            }
            else{
                int val1 =0;
                int val2=0;
                if(Player1[i]=="Jack")
                    val1=11;
                if(Player1[i]=="Queen")
                    val1=12;
                if(Player1[i]=="King")
                    val1=13;
                if(Player1[i]=="Ace")
                    val1=14;
                if(Player2[i]=="Jack")
                    val2=11;
                if(Player2[i]=="Queen")
                    val2=12;
                if(Player2[i]=="King")
                    val2=13;
                if(Player2[i]=="Ace")
                    val2=14;
                if(val1>val2) {
                    one++;
                    doublewar=0;
                }
                else if(val2>val1){
                    two++;
                    doublewar=0;
                }
                else if (val1==val2){
                    i+=3;
                    wars++;
                    if(doublewar==1){
                        doublecounter++;
                    }
                    doublewar=1;
                }
            }
            i++;

        }
        this.one=one;
        this.two=two;
        this.wars=wars;
        this.doublecounter=doublecounter;


    }
}
