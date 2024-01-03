// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class casino {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		for (int i = 0; i < t; i++)
		{
			int n = input.nextInt();
			int m = input.nextInt();
			int[][] array = new int[n][m];
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < m; k++)
				{
					array[j][k] = input.nextInt();
				}
			}
			int sum = 0;
			for (int j = 0; j < array.length; j++)
			{
				for (int k=j+1; k < array.length;k++)
				{
					sum+= Main.getSum(j, k, array);
				}
			}
			System.out.println(sum);
		}
	}

	public static int getSum(int index1, int index2, int[][] array)
	{
		int sum = 0;
		for (int i = 0; i <array[index1].length; i++)
		{
			sum+=Math.abs(array[index1][i] - array[index2][i]);
		}
		return sum;
	}
}
