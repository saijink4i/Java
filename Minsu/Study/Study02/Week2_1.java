package Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Week2_1 {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] rod = br.readLine().split(" ");
		
        int x1 = Integer.parseInt(rod[0]);
        int y1 = Integer.parseInt(rod[1]);
        int x2 = Integer.parseInt(rod[2]);
        int y2 = Integer.parseInt(rod[3]);
        
        int x3 = x1 - (y2 - y1);
        int y3 = y1 + (x2 - x1);
        int x4 = x2 - (y2 - y1);
        int y4 = y2 + (x2 - x1);
        
        System.out.printf("%d %d %d %d\n", x4, y4, x3, y3);
    }
}
