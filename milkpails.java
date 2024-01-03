// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class milkpails {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("pails.in"));
        PrintWriter output = new PrintWriter("pails.out");

		int x = input.nextInt();
		int y = input.nextInt();
		int m = input.nextInt();

		int max = 0;
		for (int i = 0; i <= m/x; i++)
		{
			for (int j = 0; j <= m/x; j++)
			{
				int sum = x * i + y * j ;
				if (sum > max && sum <= m)
					max = sum;
			}
		}

		output.print(max);
		output.close();

	}
}
