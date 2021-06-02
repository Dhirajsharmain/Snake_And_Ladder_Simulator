import java.util.Random;

//Welcome to snake and ladder simulator

public class SnakeAndLadder {

	public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int WIN_POSITION = 100;
    
    public static void main(String[] args) {
       int playerPosition = 0;
            
       Random random = new Random();

       while(playerPosition < WIN_POSITION) {
    	   //Roll dice to generate random number between 1 to 6
    	   int option = random.nextInt(4)+1;
    	   System.out.println("Option number is :" + " " + option);

    	   int dice = random.nextInt(7)+1;
    	   System.out.println("Random number generated by dice is :" + " " + dice);

    	   switch (option) {
    	   	case NO_PLAY:
    	   		System.out.println("You got No-Play Option!");
			case LADDER:
				System.out.println("You got Ladder!");
				if ((playerPosition + dice) <= WIN_POSITION) {
					playerPosition += dice;
				}
    		case SNAKE:
    			System.out.println("You got Snake!");
    			playerPosition -= dice;
    			if (playerPosition <= 0){
    				playerPosition = 0;
    			}
			default:
				if ((playerPosition + dice) <= WIN_POSITION) {
					playerPosition += dice;
				}
    	   	}
    	   	System.out.println("Curruent position of player is :" + " " + playerPosition);
       }

    }
}