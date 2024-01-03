// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;
public class fencepainting {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("paint.in"));
        PrintWriter output = new PrintWriter("paint.out");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();

		boolean[] painted = new boolean[101];

		for (int i = a; i < b; i++)
		{
			painted[i] = true;
		}
		for (int i = c; i < d; i++)
		{
			painted[i] = true;
		}
		int sum = 0;
		for (int i = 0; i < painted.length;i++)
		{
			if (painted[i])
				sum++;

		}
		output.print(sum);
		output.close();
	}
}