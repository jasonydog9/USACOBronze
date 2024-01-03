// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class diamond {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("diamond.in"));
        PrintWriter output = new PrintWriter("diamond.out");

		int n = input.nextInt();
		int k = input.nextInt();

		int[] array = new int[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = input.nextInt();
		}

		int sum = 0;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++)
		{
			int current = 0;
			for (int j = i; j < array.length; j++)
			{
				if (Math.abs(array[i] - array[j]) <= k)
				{
					current++;
				}
			}
			if (current > sum)
				sum = current;
		}
		output.print(sum);
		output.close();

	}
}
