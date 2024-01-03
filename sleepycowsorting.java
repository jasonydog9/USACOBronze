// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class sleepycowsorting{
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("sleepy.in"));
        PrintWriter output = new PrintWriter("sleepy.out");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i =0; i < n; i++)
		{
			array[i] = input.nextInt();
		}
		int count = 1;
		for (int i = array.length-1; i > 0; i--)
		{
			if (array[i] > array[i-1])
				count++;
			else
				break;
		}
		output.print(n-count);
		output.close();
}
}
