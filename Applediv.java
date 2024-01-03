// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class Applediv {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i =0; i < n; i++)
		{
			array[i] = input.nextInt();
		}
		System.out.println(Main.solve(0,0,0,n,array));
	}

	public static int solve(int index, int sum1, int sum2, int n, int[] array)
	{
		if (index == n) return Math.abs(sum1 - sum2);
		return Math.max(solve(index+1, sum1+array[index], sum2, n, array), solve(index+1, sum1,sum2+array[index], n, array));
	}
}
