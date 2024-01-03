// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class milkfactory {
	public static void main(String[] args) throws IOException {
		int[] out_deg = new int[101];
		int[] in_deg = new int[101];
		Scanner sc = new Scanner(new File("factory.in"));
		PrintWriter pw = new PrintWriter(new File("factory.out"));
		int N = sc.nextInt();

		for (int i = 0; i < N -1; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			out_deg[a]++;
			in_deg[b]++;
		}

		boolean encountered_sink = false;
		int idx = -1;
		for (int i = 1; i <= N; i++)
		{
			if (encountered_sink && out_deg[i] == 0 && in_deg[i] > 0)
			{
				idx = -1;
				break;
			}

			if (out_deg[i] == 0 && in_deg[i] > 0)
			{
				encountered_sink = true;
				idx = i;
			}
		}
		pw.print(idx);
		pw.close();
		
	}
}
