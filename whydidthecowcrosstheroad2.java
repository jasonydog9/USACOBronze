// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class whydidthecowcrosstheroad2 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		int pairs = 0;
		int i = 0;
		while (s.length() > 0)
		{
			char first = s.charAt(0);
			char second = s.charAt(1);
			s = s.substring(2);
			if (first != second)
			{
				if (s.lastIndexOf(first) < s.lastIndexOf(second))
					pairs++;
				s = s.substring(0, s.lastIndexOf(first)) + s.substring(s.lastIndexOf(first) + 1);
				s = s.substring(0, s.lastIndexOf(second)) + s.substring(s.lastIndexOf(second) + 1);
				
			}
			//delete elements
		}
		System.out.println(pairs);
	}
}
