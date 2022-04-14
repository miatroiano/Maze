import java.util.Random;
import java.util.Scanner;

public class MiniMaze {
	public static void main(String []args) {
		int[] maze = new int[8];
		Scanner scanner = new Scanner(System.in);
	
		
		maze[0] = 0;
		maze[1] = 0;
		maze[2] = 0;
		maze[3] = 0;
		maze[4] = 0;
		maze[5] = 0;
		maze[6] = 0;
		maze[7] = 0;
		Random random = new Random();
		int win = random.nextInt(8);
		int start = random.nextInt(8);
		
		while (win == start) {
			win = random.nextInt(8);
			start = random.nextInt(8);
		}
		int current = start;
		maze[win] = 1;
		maze[start] = 2;
		Boolean winn = false;
		
		while (winn == false) {
			for (int i = 0; i < maze.length; i++) {
				System.out.print(maze[i]);
				}
			System.out.print("\n");
			System.out.println("do you want to move left or right");
			String move = scanner.nextLine();
			if(move.equalsIgnoreCase("left")) {
				current -= 1;
				maze[0] = 0;
				maze[1] = 0;
				maze[2] = 0;
				maze[3] = 0;
				maze[4] = 0;
				maze[5] = 0;
				maze[6] = 0;
				maze[7] = 0;
				maze[win] = 1;
				maze[current] = 2;
				if(current == win) {
					System.out.println("you win!!");
					winn = true;
				}
			}
			else if(move.equalsIgnoreCase("right")) {
				current += 1;
				maze[0] = 0;
				maze[1] = 0;
				maze[2] = 0;
				maze[3] = 0;
				maze[4] = 0;
				maze[5] = 0;
				maze[6] = 0;
				maze[7] = 0;
				maze[win] = 1;
				maze[current] = 2;
				if(current == win) {
					System.out.println("you win!!");
					winn = true;
				}
			
			}
			else {
				System.out.println("invalid direction");
			}
			
		}
		
		
	}
	
}
