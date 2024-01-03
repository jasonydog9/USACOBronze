// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class measuringtraffic {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileReader("traffic.in"));
        PrintWriter output = new PrintWriter("traffic.out");
		int N = sc.nextInt();
		int[][] array = new int[100][3];
		for (int i = 0; i < N; i++)
		{
			String ramp = sc.next();
			int type = 0;
			if (ramp.equals("on"))
				type = 1;
			else if (ramp.equals("none"))
				type = 2;
			else
				type = 3;
			array[i][0] = type;
			array[i][1] = sc.nextInt();
			array[i][2] = sc.nextInt();
		}
		ArrayList<int[]> arraylist = new ArrayList<int[]>();
		//finding speed after segments
		int a = 0;
		int b = 999999999;
		for (int i = N-1; i >=0; i--)
		{
			if (array[i][0] == 1)
			{
				a -= array[i][2];
				b -= array[i][1];
			}
			if (array[i][0] == 2)
			{
				a = Math.max(a, array[i][1]);
				b = Math.min(b, array[i][2]);
			}
			if (array[i][0] == 3)
			{
				a += array[i][1];
				b += array[i][2];
			}

		}
		if (a<0)
			a= 0;
		if (b < 0)
			b = 0;
		output.println(a + " " + b);
		a = 0;
		b = 999999999;
		for (int i = 0; i < N; i++)
		{
			if (array[i][0] == 1)
			{
				a+= array[i][1];
				b += array[i][2];
			}
			if (array[i][0] == 2)
			{
				a = Math.max(a, array[i][1]);
				b = Math.min(b, array[i][2]);
			}
			if (array[i][0] == 3)
			{
				a -= array[i][2];
				b -= array[i][1];
			}

		}
		if (a<0)
			a= 0;
		if (b < 0)
			b = 0;
		output.println(a + " " + b);
		output.close();

	}
}
