// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class cowsignal {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("cowsignal.in")));
    	PrintWriter pw = new PrintWriter(new FileWriter(new File("cowsignal.out")));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int m = Integer.parseInt(st.nextToken());
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
		String output="";
		for (int i = 0; i < m; i++)
		{
			String line = br.readLine();
			String out = "";
			for (int j=0; j < line.length(); j++)
			{
				for (int count = 0; count < k; count++)
				{
					out+= line.substring(j,j+1);
				}
			}
			for (int a = 0; a < k;a++)
			{
				output += out + "\n";
			}
		}
		pw.print(output);
		br.close();
		pw.close();
	}
}
