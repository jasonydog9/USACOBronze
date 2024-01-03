// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class squarepasture {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("square.in"));
        PrintWriter output = new PrintWriter("square.out");

		int x1 = input.nextInt();
		int y1 = input.nextInt();
		int x2 = input.nextInt();
		int y2 = input.nextInt();
		int x3 = input.nextInt();
		int y3 = input.nextInt();
		int x4 = input.nextInt();
		int y4 = input.nextInt();

		int lowestX = Math.min(x1, x3);
		int lowestY = Math.min(y1, y3);
		int highestX = Math.max(x2,x4);
		int highestY = Math.max(y2, y4);

		int length = Math.max(highestX - lowestX, highestY - lowestY);
		
		int area = length * length;
		output.print(area);

		output.close();
	}
}
