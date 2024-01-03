// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;


public class mixingmilk {
	public static void main(String[] args) throws IOException {
		Scanner sc1 = new Scanner(new File("./mixmilk.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("./mixmilk.out")));
    	int firstCap = sc1.nextInt();
    	int first = sc1.nextInt();
    	int secCap = sc1.nextInt();
		int sec = sc1.nextInt();
    	int thirdCap = sc1.nextInt();
    	int third = sc1.nextInt();
		
		for (int i = 0; i < 100; i++)
		{
			if (i % 3 == 0)
			{
				if (first > secCap - sec)
				{
					first = first - (secCap - sec);
					sec = secCap;
				}
				else{
					sec += first;
					first = 0;
				}
			}
			else if (i % 3 == 1)
			{
				if (sec > thirdCap - third)
				{
					sec = sec - (thirdCap - third);
					third = thirdCap;
				}
				else{
					third += sec;
					sec = 0;
				}
				
			}
			else{
				if (third > firstCap - first)
				{
					third = third - (firstCap - first);
					first = firstCap;
				}
				else{
					first += third;
					third = 0;
				}
			}
		}
		pw.println(first);
		pw.println(sec);
		pw.println(third);
		pw.close();


	}
}
