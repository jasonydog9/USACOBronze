// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class whydidthecowcrosstheroad3 {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("cowqueue.in"));
        PrintWriter output = new PrintWriter("cowqueue.out");

		int n = input.nextInt();
		int[][] array = new int[n][2];
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[0].length; j++)
			{
				array[i][j] = input.nextInt();
			}
		}
		Arrays.sort(array, (a, b) -> Integer.compare(a[0],b[0]));

		int time  = 0;
		for (int i =0; i < n; i++)
		{
			if (i == 0) {
				time+= array[0][0];
			}
			else if (i == array.length -1)
			{
				if (time > array[i][0])
				{
					time += array[i][1];
				}
				else if (time < array[i][0])
				{
					time+= array[i][0] - time + array[i][1];
				}
				else
				{
					time += array[i][1];
				}
			}
			else
			{
				if (time > array[i][0])
				{
					time = array[i][0] + array[i][1];
				}
				else if (time < array[i][0])
				{
					time = array[i][0] + array[i][1];
				}
				else
				{
					time += array[i][1];
				}
			}

		}
		output.print(time);
		output.close();
		
	}
}
