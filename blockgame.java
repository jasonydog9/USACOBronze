// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class blockgame {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(new File("blocks.out"));
		int N = sc.nextInt();
		String[][] array = new String[N][2];
		for (int i = 0; i < N; i++)
		{
			array[i][0] = sc.next();
			array[i][1] = sc.next(); 
		}
		int[] finalArray = new int[26];
		for (int i = 0; i < 26; i++)
		{
			int count = 0;
			for (int j = 0; j < array.length; j++)
			{
				int max = Math.max(Main.count(array[j][0], (char) (i + 97)), Main.count(array[j][1], (char) (i + 97)));
				count += max;
			}
			finalArray[i] = count;
		}

		for (int i = 0; i < finalArray.length; i++)
		{
			System.out.println(finalArray[i]);
		}
	}

	public static int count(String s, char letter)
	{
		int count = 0;
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == letter)
			{
				count++;
			}
		}
		return count;
	}
}
