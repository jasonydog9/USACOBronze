// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class speedingticket {
	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(new File("./speeding.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("./speeding.out")));

		int n = sc1.nextInt();
		int[][] lim = new int[n][2];

		int m = sc1.nextInt();
		int[][] speed = new int[m][2];
		for (int i =0;i < n; i++)
		{
			lim[i][0] = sc1.nextInt();
			lim[i][1] = sc1.nextInt();
		}
		for (int i =0;i < m; i++)
		{
			speed[i][0] = sc1.nextInt();
			speed[i][1] = sc1.nextInt();
		}
		int high = 0;
		int sCount = 0;
		int limCount = 0;
		while (sCount < m && limCount < n)
		{
			int sLength = speed[sCount][0];
			int limLength = lim[limCount][0];
			int sSpeed = speed[sCount][1];
			int limSpeed = lim[limCount][1];
			if (sLength == limLength)
			{
				if (sSpeed > limSpeed && sSpeed - limSpeed > high)
					high = sSpeed - limSpeed;
				sCount++;
				limCount++;
			}
			else if (sLength > limLength)
			{
				speed[sCount][0] = sLength - limLength;
				
				if (sSpeed > limSpeed && sSpeed - limSpeed > high)
					high = sSpeed - limSpeed;
				limCount++;
			}
			else
			{
				lim[limCount][0] = limLength - sLength;
				if (sSpeed > limSpeed && sSpeed - limSpeed > high)
					high = sSpeed - limSpeed;
				sCount++;
			}
		}

		pw.print(high);
		pw.close();
	}
}
