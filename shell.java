// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class shell {
	public static void main(String[] args) throws IOException {
		Scanner r = new Scanner(System.in);

		int a = r.nextInt();
		boolean[] array = new boolean[3];
		int one = 0;
		int two = 0;
		int three = 0;
		for (int i =0; i < a; i++)
		{
			int swap1 = r.nextInt();
			int swap2 = r.nextInt();
			int guess = r.nextInt();
				
			array[0] = false;
			array[1] = false;
			array[2] = false;
			for (int j=0; j < a; j++)
			{
				array[j] = true;
				boolean temp = array[swap1 - 1];
				array[swap1-1] = array[swap2 - 1];
				array[swap2 -1] = temp;
				if (array[guess - 1])
				{
					if (guess == 1)
					{
						one++;
					}
					if (guess == 2)
					{
						two++;
					}
					if (guess == 3)
					{
						three++;
					}

				}
				array[j] = false;
			}
		}
		if (one >= two && one >= three)
		{
			System.out.print(one);
		}
		else if(one <= two && two >= three)
		{
			System.out.print(two);
		}
		else{
			System.out.print(three);
		}
	}
}
