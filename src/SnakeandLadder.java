import java.util.Random;

public class SnakeandLadder {
    static int POSITION=0;
    static int TOTAL_DIE_ROLL=0;
    static final int IS_LADDER=1;
    static final int IS_SNAKE=2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And ladder");
        System.out.println("Current Position : " + POSITION);

        private static void action(int dieNumber) {
            int option = (int) (Math.random() * 10) % 3;
            switch (option){
                case IS_LADDER:
                    System.out.println("Yay... you got a Ladder");
                    if (POSITION+dieNumber<=100)
                        POSITION+=dieNumber;
                    break;
                case IS_SNAKE:
                    System.out.println("Oops it's a Snake");
                    POSITION-=dieNumber;
                    if (POSITION<0)
                        POSITION =0;
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
    }}

