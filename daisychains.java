// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class daisychains {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++)
		{
			array[i] = input.nextInt();
		}
		int sum = 0;
		for (int i =0; i < array.length;i++)
		{
			for (int j =i; j < array.length; j++)
			{
				if (i == j)
					sum++;
				else
				{
					int[] nums = new int[j-i+1];
					double average = array[i];
					nums[0] = array[i];
					for (int k = i+1; k <= j;k++)
					{
						nums[k-i] = array[k];
						average+=array[k];
					}
					average=average/(j-i + 1);
					if (Main.contains(average, nums))
						sum++;
				}
			}
		}

		System.out.print(sum);
	}

	public static boolean contains(double n, int[] array)
{
	for (int i =0;i< array.length; i++)
	{
		if (n == array[i])
			return true;
	}
	return false;
}
}
