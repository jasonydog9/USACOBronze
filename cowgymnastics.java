// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class cowgymnastics {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new File("gymnastics.out"));
		int K = sc.nextInt();
		int N = sc.nextInt();

		int[][] array = new int[K][N];
		for (int i = 0; i< K; i++)
		{
			for (int j = 0; j < N;j++)
			{
				array[i][j] = sc.nextInt();
			}
		}
		ArrayList<int[]> arrayList = new ArrayList<int[]>();
		for (int k = 0; k < K; k++)
		{
			for (int i = 0; i < N; i++)
			{
				for (int j = i + 1; j < N; j++)
				{
					int[] a = {array[k][i], array[k][j]};
					arrayList.add(a);
				}
			}
		}
		int count = 0;
		for (int i = 0; i< arrayList.size(); i++)
		{
			int[] a = arrayList.get(i);
			int curr = 0;
			for (int j = i+1; j < arrayList.size(); j++)
			{
				if (a[0] == arrayList.get(j)[0] && a[1] == arrayList.get(j)[1])
				{
					curr++;
				}
				
			}
			if (curr == K - 1)
				count++;
		}
		System.out.println(count);
		pw.close();
	}
}
