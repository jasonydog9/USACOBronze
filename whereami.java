// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class whereami {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File("whereami.in"));
		PrintWriter pw = new PrintWriter(new File("whereami.out"));

		int n = sc.nextInt();
		String s = sc.next();

		// try each length starting from the smallest one
		for (int guess = 1; guess <= n; guess++) {
			boolean good = true;
			// try all substring combinations of that length
			for (int i = 0; i + guess <= n; i++) {
				for (int j = 0; j < i; j++) {
					String substring1 = s.substring(i, i + guess);
					String substring2 = s.substring(j, j + guess);
					if (substring1.equals(substring2)) { good = false; }
				}
			}
			if (good) {  // output the length and break because we want the
				         // minimum
				pw.println(guess);
				break;
			}
		}

		pw.close();
	}
}
