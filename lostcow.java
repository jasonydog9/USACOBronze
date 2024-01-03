// Source: https://usaco.guide/general/io

import java.io.*;
import java.util.StringTokenizer;
import java.util.Scanner;

public class lostcow {
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(new FileReader("lostcow.in"));
        PrintWriter output = new PrintWriter("lostcow.out");

        int farmer_john_starting_position = input.nextInt();
        int bessie_position = input.nextInt();

        int distance = 0;
        int distance_added = 1;
        int farmer_john_position = farmer_john_starting_position;

        while (true) {
            int new_position = farmer_john_starting_position + distance_added;

            if (new_position > bessie_position && farmer_john_starting_position < bessie_position) {
                output.write(Integer.toString(distance + bessie_position - farmer_john_position));
                break;
            }

            if (new_position < bessie_position && farmer_john_starting_position > bessie_position) {
                output.write(Integer.toString(distance + farmer_john_position - bessie_position));
                break;
            }
            
            if (new_position == bessie_position) {
                output.write(Integer.toString(distance + Math.abs(bessie_position - farmer_john_position)));
				break;
            }

            distance += Math.abs(new_position - farmer_john_position);
            distance_added *= -2;
            farmer_john_position = new_position;
        }

        input.close();
        output.close();
	}
}
