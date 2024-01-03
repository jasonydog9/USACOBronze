// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.Arrays;

public class bucketlist {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("blist.in"));
        PrintWriter output = new PrintWriter("blist.out");

		
		int n = input.nextInt();
		int[][] stb = new int[n][3];
		for (int i = 0; i < n; i++)
		{
			for (int j =0; j < 3; j++)
			{
				stb[i][j] = input.nextInt();
			}
		}
		Arrays.sort(stb, (a, b) -> Integer.compare(a[0],b[0]));
		int endTime = 0;
		for (int i =0; i < stb.length;i++)
		{
			if (stb[i][1] > endTime)
			{
				endTime = stb[i][1];
			}
		}
		int maxBuckets = 0;
		for (int i = stb[0][0]; i < endTime; i++)
		{
			int buckets = 0;
			for (int j = 0;j < stb.length; j++)
			{
				if (stb[j][0]<= i && i <=stb[j][1])
				{
					buckets+= stb[j][2];
				}
			}
			if (buckets > maxBuckets)
			{
				maxBuckets = buckets;
			}
		}

		output.print(maxBuckets);
		output.close();
	}


}
