// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class distinctnumbers {
	public static void main(String[] args) throws IOException {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int[] array = new int[n];
		for (int i =0; i < n; i++)
		{
			array[i] = obj.nextInt();
		}
		Arrays.sort(array);
		int nums = 1;
		for (int i = 0; i < array.length - 1; i++)
		{
			if (array[i] != array[i+1])
				nums++;
		}
		System.out.print(nums);

	}
}
