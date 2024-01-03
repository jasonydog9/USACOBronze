// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class tamingherd {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("taming.in"));
        PrintWriter output = new PrintWriter("taming.out");
		int n = input.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++)
		{
			array[i] = input.nextInt();
		}
		int confirmed = 0;
		int possible = 0;
		boolean broke =false;
		for (int i = array.length - 1; i >= 0; i--)
		{
			if (i == 0 || array[i] == 0)
			{
				confirmed++;
			}
			else if (array[i] == -1)
			{
				possible++;
			}
			else
			{
				i = i - array[i];
				confirmed++;
				if (i < 0)
				{
					broke = true;

				}
			}
		}
		if (broke)
		{
			output.print(-1);
		}
		else
		{
			output.print(confirmed +" " + (possible+confirmed));
		}


		output.close();
	}
}
