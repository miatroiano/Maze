import java.util.Random;
import java.util.Scanner;

public class BigMaze {
	public static void main(String []args) {
		int[][] maze = new int[6][8];
		Scanner scanner = new Scanner(System.in);
	
		maze[0][0] = 0;
		maze[0][1] = 0;
		maze[0][2] = 0;
		maze[0][3] = 0;
		maze[0][4] = 0;
		maze[0][5] = 0;
		maze[0][6] = 0;
		maze[0][7] = 0;
		maze[1][0] = 0;
		maze[1][1] = 0;
		maze[1][2] = 0;
		maze[1][3] = 0;
		maze[1][4] = 0;
		maze[1][5] = 0;
		maze[1][6] = 0;
		maze[1][7] = 0;
		maze[2][0] = 0;
		maze[2][1] = 0;
		maze[2][2] = 0;
		maze[2][3] = 0;
		maze[2][4] = 0;
		maze[2][5] = 0;
		maze[2][6] = 0;
		maze[2][7] = 0;
		maze[3][0] = 0;
		maze[3][1] = 0;
		maze[3][2] = 0;
		maze[3][3] = 0;
		maze[3][4] = 0;
		maze[3][5] = 0;
		maze[3][6] = 0;
		maze[3][7] = 0;
		maze[4][0] = 0;
		maze[4][1] = 0;
		maze[4][2] = 0;
		maze[4][3] = 0;
		maze[4][4] = 0;
		maze[4][5] = 0;
		maze[4][6] = 0;
		maze[4][7] = 0;
		maze[5][0] = 0;
		maze[5][1] = 0;
		maze[5][2] = 0;
		maze[5][3] = 0;
		maze[5][4] = 0;
		maze[5][5] = 0;
		maze[5][6] = 0;
		maze[5][7] = 0;
		Random random = new Random();
		
		
		int win = random.nextInt(8);
		int win2 = random.nextInt(6);
		int start = random.nextInt(8);
		int start2 = random.nextInt(6);
		
		while(win == start && win2 == start2) {
			win = random.nextInt(8);
			start = random.nextInt(8);
			start2 = random.nextInt(6);
			win2 = random.nextInt(6);
		}
		
		int current = start;
		int current2 = start2;
		maze[win2][win] = 1;
		maze[start2][start] = 2;
		Boolean winn = false;
		
		while (winn == false) {
			for (int row = 0; row < maze.length; row++) {
				for (int col = 0; col < maze[row].length; col++) {
				System.out.print(maze[row][col]);
				}
				System.out.print("\n");
			}
			System.out.println("do you want to move up, down, left, or right");
			String move = scanner.nextLine();
			if(move.equalsIgnoreCase("left")) {
				current -= 1;
				
				maze[0][0] = 0;
				maze[0][1] = 0;
				maze[0][2] = 0;
				maze[0][3] = 0;
				maze[0][4] = 0;
				maze[0][5] = 0;
				maze[0][6] = 0;
				maze[0][7] = 0;
				maze[1][0] = 0;
				maze[1][1] = 0;
				maze[1][2] = 0;
				maze[1][3] = 0;
				maze[1][4] = 0;
				maze[1][5] = 0;
				maze[1][6] = 0;
				maze[1][7] = 0;
				maze[2][0] = 0;
				maze[2][1] = 0;
				maze[2][2] = 0;
				maze[2][3] = 0;
				maze[2][4] = 0;
				maze[2][5] = 0;
				maze[2][6] = 0;
				maze[2][7] = 0;
				maze[3][0] = 0;
				maze[3][1] = 0;
				maze[3][2] = 0;
				maze[3][3] = 0;
				maze[3][4] = 0;
				maze[3][5] = 0;
				maze[3][6] = 0;
				maze[3][7] = 0;
				maze[4][0] = 0;
				maze[4][1] = 0;
				maze[4][2] = 0;
				maze[4][3] = 0;
				maze[4][4] = 0;
				maze[4][5] = 0;
				maze[4][6] = 0;
				maze[4][7] = 0;
				maze[5][0] = 0;
				maze[5][1] = 0;
				maze[5][2] = 0;
				maze[5][3] = 0;
				maze[5][4] = 0;
				maze[5][5] = 0;
				maze[5][6] = 0;
				maze[5][7] = 0;
				maze[win2][win] = 1;
				maze[current2][current] = 2;
				System.out.println("You moved left!");
				if(current == win && current2 == win2) {
					System.out.println("you win!!");
					winn = true;
				}
			}
			else if(move.equalsIgnoreCase("right")) {
				current += 1;
				
				maze[0][0] = 0;
				maze[0][1] = 0;
				maze[0][2] = 0;
				maze[0][3] = 0;
				maze[0][4] = 0;
				maze[0][5] = 0;
				maze[0][6] = 0;
				maze[0][7] = 0;
				maze[1][0] = 0;
				maze[1][1] = 0;
				maze[1][2] = 0;
				maze[1][3] = 0;
				maze[1][4] = 0;
				maze[1][5] = 0;
				maze[1][6] = 0;
				maze[1][7] = 0;
				maze[2][0] = 0;
				maze[2][1] = 0;
				maze[2][2] = 0;
				maze[2][3] = 0;
				maze[2][4] = 0;
				maze[2][5] = 0;
				maze[2][6] = 0;
				maze[2][7] = 0;
				maze[3][0] = 0;
				maze[3][1] = 0;
				maze[3][2] = 0;
				maze[3][3] = 0;
				maze[3][4] = 0;
				maze[3][5] = 0;
				maze[3][6] = 0;
				maze[3][7] = 0;
				maze[4][0] = 0;
				maze[4][1] = 0;
				maze[4][2] = 0;
				maze[4][3] = 0;
				maze[4][4] = 0;
				maze[4][5] = 0;
				maze[4][6] = 0;
				maze[4][7] = 0;
				maze[5][0] = 0;
				maze[5][1] = 0;
				maze[5][2] = 0;
				maze[5][3] = 0;
				maze[5][4] = 0;
				maze[5][5] = 0;
				maze[5][6] = 0;
				maze[5][7] = 0;
				maze[win2][win] = 1;
				maze[current2][current] = 2;
				System.out.println("You moved right!");
				if(current == win && current2 == win2) {
					System.out.println("you win!!");
					winn = true;
				}
			}
			else if(move.equalsIgnoreCase("up")) {
				current2 -= 1;
					
				maze[0][0] = 0;
				maze[0][1] = 0;
				maze[0][2] = 0;
				maze[0][3] = 0;
				maze[0][4] = 0;
				maze[0][5] = 0;
				maze[0][6] = 0;
				maze[0][7] = 0;
				maze[1][0] = 0;
				maze[1][1] = 0;
				maze[1][2] = 0;
				maze[1][3] = 0;
				maze[1][4] = 0;
				maze[1][5] = 0;
				maze[1][6] = 0;
				maze[1][7] = 0;
				maze[2][0] = 0;
				maze[2][1] = 0;
				maze[2][2] = 0;
				maze[2][3] = 0;
				maze[2][4] = 0;
				maze[2][5] = 0;
				maze[2][6] = 0;
				maze[2][7] = 0;
				maze[3][0] = 0;
				maze[3][1] = 0;
				maze[3][2] = 0;
				maze[3][3] = 0;
				maze[3][4] = 0;
				maze[3][5] = 0;
				maze[3][6] = 0;
				maze[3][7] = 0;
				maze[4][0] = 0;
				maze[4][1] = 0;
				maze[4][2] = 0;
				maze[4][3] = 0;
				maze[4][4] = 0;
				maze[4][5] = 0;
				maze[4][6] = 0;
				maze[4][7] = 0;
				maze[5][0] = 0;
				maze[5][1] = 0;
				maze[5][2] = 0;
				maze[5][3] = 0;
				maze[5][4] = 0;
				maze[5][5] = 0;
				maze[5][6] = 0;
				maze[5][7] = 0;
				maze[win2][win] = 1;
				maze[current2][current] = 2;
				System.out.println("You moved up!");
				if(current == win && current2 == win2) {
					System.out.println("you win!!");
					winn = true;
				}
			}
			else if(move.equalsIgnoreCase("down")) {
				current2 += 1;
					
				maze[0][0] = 0;
				maze[0][1] = 0;
				maze[0][2] = 0;
				maze[0][3] = 0;
				maze[0][4] = 0;
				maze[0][5] = 0;
				maze[0][6] = 0;
				maze[0][7] = 0;
				maze[1][0] = 0;
				maze[1][1] = 0;
				maze[1][2] = 0;
				maze[1][3] = 0;
				maze[1][4] = 0;
				maze[1][5] = 0;
				maze[1][6] = 0;
				maze[1][7] = 0;
				maze[2][0] = 0;
				maze[2][1] = 0;
				maze[2][2] = 0;
				maze[2][3] = 0;
				maze[2][4] = 0;
				maze[2][5] = 0;
				maze[2][6] = 0;
				maze[2][7] = 0;
				maze[3][0] = 0;
				maze[3][1] = 0;
				maze[3][2] = 0;
				maze[3][3] = 0;
				maze[3][4] = 0;
				maze[3][5] = 0;
				maze[3][6] = 0;
				maze[3][7] = 0;
				maze[4][0] = 0;
				maze[4][1] = 0;
				maze[4][2] = 0;
				maze[4][3] = 0;
				maze[4][4] = 0;
				maze[4][5] = 0;
				maze[4][6] = 0;
				maze[4][7] = 0;
				maze[5][0] = 0;
				maze[5][1] = 0;
				maze[5][2] = 0;
				maze[5][3] = 0;
				maze[5][4] = 0;
				maze[5][5] = 0;
				maze[5][6] = 0;
				maze[5][7] = 0;
				maze[win2][win] = 1;
				maze[current2][current] = 2;
				System.out.println("You moved down!");
				if(current == win && current2 == win2) {
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

