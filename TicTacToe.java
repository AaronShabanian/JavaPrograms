import java.util.Scanner;

public class TicTacToe {
    public void TicTac()

    {
        Scanner scanner=new Scanner(System.in);
        String[][] Tac = {
                {"1", "2", "3"},
                {"4", "5","6"},
                {"7", "8", "9"}
        };

        for (int i = 0; i < Tac.length; i++) {
            for (int j = 0; j < Tac[i].length; j++) {
                System.out.print(Tac[i][j] + " ");
            }
            System.out.println();
        }
        int player=1;
        int spot=0;
        boolean flag=true;
        while (flag==true) {
            if((player%2)==0){
                System.out.println("Choose a spot(1-9) you would like you would like to mark an X");
                spot=scanner.nextInt();
                switch (spot) {
                    case 1:
                        Tac[0][0] = "X";
                        break;
                    case 2:
                        Tac[0][1] = "X";
                        break;
                    case 3:
                        Tac[0][2] = "X";
                        break;
                    case 4:
                        Tac[1][0] = "X";
                        break;
                    case 5:
                        Tac[1][1] = "X";
                        break;
                    case 6:
                        Tac[1][2] = "X";
                        break;
                    case 7:
                        Tac[2][0] = "X";
                        break;
                    case 8:
                        Tac[2][1] = "X";
                        break;
                    case 9:
                        Tac[2][2] = "X";
                        break;
                    default:
                        System.out.println("Invalid Spot");
                }

                player++;
            }
            else{
                System.out.println("Choose a spot(1-9) you would like you would like to mark an O");
                spot=scanner.nextInt();
                switch (spot) {
                    case 1:
                        Tac[0][0] = "O";
                        break;
                    case 2:
                        Tac[0][1] = "O";
                        break;
                    case 3:
                        Tac[0][2] = "O";
                        break;
                    case 4:
                        Tac[1][0] = "O";
                        break;
                    case 5:
                        Tac[1][1] = "O";
                        break;
                    case 6:
                        Tac[1][2] = "O";
                        break;
                    case 7:
                        Tac[2][0] = "O";
                        break;
                    case 8:
                        Tac[2][1] = "O";
                        break;
                    case 9:
                        Tac[2][2] = "O";
                        break;
                    default:System.out.println("Invalid Spot");
                }
                player++;
            }
            for (int i = 0; i < Tac.length; i++) {
                for (int j = 0; j < Tac[i].length; j++) {
                    System.out.print(Tac[i][j] + " ");
                }
                System.out.println();
            }
            Scanner input=new Scanner(System.in);
            System.out.println("Did X win the game yet?");
            String cont=input.nextLine();
            System.out.println("Did O win the game yet?");
            String contO=input.nextLine();
            if(cont.equalsIgnoreCase("yes")){
                System.out.println("Congratualations to player X");
                flag=false;
            }
            else if (contO.equalsIgnoreCase("yes")){
                System.out.println("Congratualations to player O");
                flag=false;
            }
        }
    }
}