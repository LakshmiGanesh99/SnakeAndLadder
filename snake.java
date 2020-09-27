public class snake{
	public static void main(String[] args) {
		int position = 0;
		System.out.println("Players current position is :" + position);
		
		int dieNumber = ((int) Math.floor(Math.random()*10) % 6) + 1;
		System.out.println("The number rolled on die is " + dieNumber);
	}
}