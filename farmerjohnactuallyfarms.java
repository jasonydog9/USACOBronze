// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class farmerjohnactuallyfarms {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int T = sc.nextInt();
		for (int j = 0; j < T; j++)
		{
			int N = sc.nextInt();
			int[][] array = new int[N][3];
			for (int i = 0; i < 3; i++)
			{
				for (int k = 0; k < N; k++)
				{
					array[k][i] = sc.nextInt();
				}
			}

			Arrays.sort(array, new java.util.Comparator<int[]>() {
				public int compare(int[] a, int[] b) {
						return (int)(a[2] -b[2]);
					}
				});

			int max = 0;
			boolean notDone = true;
			for (int i = 0; i < N - 1; i++)
			{
				if (array[i+1][0] >= array[i][0])
				{
					if(array[i+1][1] >= array[i][1])
					{
						max = -1;
						notDone = false;
						break;
					}
					max = Math.max(max, (array[i][0] - array[i+1][0])/(array[i+1][1] - array[i][1])+1);
				}
					
			}
			if(notDone)
			{
				for (int i = 0; i < N - 1; i++)
				{
					int num1 = array[i][0] + array[i][1] * max;
					int num2 = array[i+1][0] + array[i+1][1] * max;
					if (num1 <= num2)
					{
						max = -1;
						break;
					}
				}
			}
			System.out.println(max);
			
			
			
	


	}
}
}
