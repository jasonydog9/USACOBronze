// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

public class sleepycowherding {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("herding.in"));
        PrintWriter output = new PrintWriter("herding.out");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int max = Main.maxDist(num1, num2, num3) - 1;
		int min = 0;
		if (num2 == num1+1 && num3 ==num1+2)
		{
			min=0;
		}
		else if (Main.minDist(num1, num2, num3) == 2 || Main.maxDist(num1, num2, num3) == 2)
		{
			min=1;
		}
		else{
			min=2;
		}
		output.println(min);
		output.println(Math.max(num2-num1-1, num3-num2-1));
		output.close();
	}

	public static int minDist(int num1, int num2, int num3)
	{
		int min = 10000;
		if (Math.abs(num3 - num2) < min)
		{
			min = Math.abs(num3 - num2);
		}
		if (Math.abs(num3 - num1) < min)
		{
			min = Math.abs(num3 - num1);
		}
		if (Math.abs(num1 - num2) < min)
		{
			min = Math.abs(num1 - num2);
		}
		return min;
	}

	public static int maxDist(int num1, int num2, int num3)
	{
		int max = 0;
		if (Math.abs(num3 - num2) > max)
		{
			max = Math.abs(num3 - num2);
		}
		if (Math.abs(num3 - num1) > max)
		{
			max = Math.abs(num3 - num1);
		}
		if (Math.abs(num1 - num2) > max)
		{
			max = Math.abs(num1 - num2);
		}
		return max - Main.minDist(num1, num2, num3);
	}
}
