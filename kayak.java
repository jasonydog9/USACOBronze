// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class kayak {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n*2];
		for (int i =0; i < n *2; i++)
		{
			array[i] = input.nextInt();
		}
		Arrays.sort(array);
		int sum = 1000000000;
		for (int i =0; i < array.length;i++)
		{
			for (int j = i+1; j<array.length;j++)
			{
				int roundSum = Main.sum(i,j,array);
				if (roundSum < sum)
					sum = roundSum;
			}
		}
		System.out.print(sum);
	}

	public static int sum(int first, int second, int[] array)
	{
		int[] newArray = new int[array.length - 2];
		int newInt = 0;
		for (int i =0; i < array.length;i++)
		{
			if (i == first || i==second)
			{
				continue;
			}
			newArray[newInt]=array[i];
			newInt++;
		}
		int sum = 0;
		for (int i =0; i < newArray.length-1; i++)
		{

			sum+=Math.abs(newArray[i] - newArray[i+1]);
		}

		return sum;
	}
}
