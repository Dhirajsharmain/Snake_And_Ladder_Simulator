//Welcome to snake and ladder simulator

public class SnakeAndLadder {
     public static void main(String[] args) {
       int playerPosition = 0;
       
       //Roll dice to generate random number between 1 to 6
       int dice =(int) Math.floor(Math.random() * 10) % 6 + 1;
       System.out.println("Roll Dice: " + dice);

    }
}