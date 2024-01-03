// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class shuffle {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("shuffle.in"));
        PrintWriter output = new PrintWriter("shuffle.out");

		int n = input.nextInt();
		int[] positions = new int[n];
		for (int i = 0; i < positions.length; i++)
		{
			positions[i] = input.nextInt();
		}
		int[] ids = new int[n];
		for (int i =0;i< ids.length; i++)
		{
			ids[i] = input.nextInt();
		}
		for (int i =0; i < 3; i++)
		{
			int[] newId = new int[ids.length];
			for (int j = 0; j < positions.length; j++)
			{
				int newPos = j+1;
				newId[Main.find(newPos, positions)] =  ids[j];
			}
			ids = newId;
		}
		for (int i =0; i < ids.length; i++)
		{
			output.println(ids[i]);
		}
		output.close();
	}

	public static int find(int j, int[] array)
	{
		for (int i = 0; i < array.length;i++)
		{
			if (array[i] == j)
			{
				return i;
			}
		}
		return 1;
	}
}
