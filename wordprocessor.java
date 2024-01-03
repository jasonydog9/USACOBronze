// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class wordprocessor {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("word.in"));
		PrintWriter pw = new PrintWriter(new File("word.out"));

		int N = sc.nextInt();
		int K = sc.nextInt();

		String[] array = new String[N];
		for (int i = 0; i < N; i++)
		{
			array[i] = sc.next();
		}
		int count = 0;
		String s = "";
		s += array[0];
		count += array[0].length();
		for (int i = 1; i < array.length; i++)
		{
			count += array[i].length();
			if (count <= K)
				s += " "+array[i];
			else
			{
				count = array[i].length();
				s += "\n" + array[i];
			}

		}
		pw.print(s);
		pw.close();
	}
}
