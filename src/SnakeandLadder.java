import java.util.Random;

public class SnakeandLadder {
    static int POSITION1=0;
    static int POSITION2=0;

    static int TOTAL_DIE_ROLL=0;
    static final int IS_LADDER=1;
    static final int IS_SNAKE=2;



    public static void main(String[] args) {
        System.out.println("Welcome to Snake And ladder");
        System.out.println("Current position Player1:" +POSITION2);
        System.out.println("Current Position Player 2 : " + POSITION1);
        while (POSITION1!=100 && POSITION2!=100) {
            int dieNumber = dieRoll();
            System.out.println("Die Number is : " +dieNumber);
            action(dieNumber);
            System.out.println("Current Position Player1: " + POSITION1);
            System.out.println("Current Position Player2 :"+POSITION2);
            if(POSITION1 == 100)
                System.out.println("Player 1 wins");
            else if (POSITION2==100)
                System.out.println("Player 2 wins");
        }
        System.out.println("Number of times die rolled :: "+TOTAL_DIE_ROLL);

    }
        private static void action(int dieNumber) {
            int option = (int) (Math.random() * 10) % 3;
            switch (option){
                case IS_LADDER:
                    System.out.println("Ladder");
                    if (POSITION1+dieNumber<=100 && POSITION2+dieNumber<=100)
                        POSITION1+=dieNumber;
                    POSITION2+=dieNumber;
                    break;
                case IS_SNAKE:
                    System.out.println("Snake");
                    POSITION1-=dieNumber;
                    POSITION2-=dieNumber;
                    if (POSITION1<0 && POSITION2<0)
                        POSITION1 =0;
                    POSITION2=0;
                    break;






                default:
                    System.out.println("No Play");
            }
        }

        private static int dieRoll () {
            Random random = new Random();
            int dieNumber = random.nextInt(6) + 1;
            TOTAL_DIE_ROLL++;
            return dieNumber;
        }

    }

