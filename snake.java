public class snake{
	
	public static final int ladder = 0;
	public static final int snake = 1;
	
	public static void main(String[] args) {
		
		int position = 0;
		System.out.println("Players current position is: " + position);
		
		int dieNumber = ((int) Math.floor(Math.random()*10) % 6) + 1;
		System.out.println("The number rolled is " + dieNumber);

		int playOption = ((int) Math.floor(Math.random()*10) % 2);
		switch(playOption) {
		case snake:
			position = position - dieNumber;
			if(position<0)
				position = 0;
			break;
		case ladder:
			position = position + dieNumber;
			break;
		default :
			position = position + 0;
				
		}
		System.out.println("Players Current position is: " + position);
	}
}
