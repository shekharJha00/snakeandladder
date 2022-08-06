import java.util.Random;

public class SnakeandLadder {
    static int POSITION=0;
    static int TOTAL_DIE_ROLL=0;
    static final int IS_LADDER=1;
    static final int IS_SNAKE=2;

    public static void main(String[] args) {
        System.out.println("Welcome to Snake And ladder");
        System.out.println("Current Position : " + POSITION);

        private static int dieRoll () {
            Random random = new Random();
            int dieNumber = random.nextInt(6) + 1;
            TOTAL_DIE_ROLL++;
            return dieNumber;
        }
    }}

