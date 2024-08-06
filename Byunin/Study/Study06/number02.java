package Byunin.Study.Study06;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class number02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> dwarflist = new ArrayList<Integer>();
        for(int i = 0; i < 9; i++) {
            dwarflist.add(Integer.parseInt(br.readLine()));
        }
        findspy(dwarflist);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < dwarflist.size(); i++) {
            bw.write(dwarflist.get(i) + "\n");
        }
        bw.flush();
    }
    private static void findspy(List<Integer> dwarflist) {
        int total = 0;
        for(int i = 0; i < dwarflist.size(); i++) {
            total += dwarflist.get(i);
        }
        for(int i = 0; i < 8; i++) {
            for(int j = i+1; j < 9; j++) {
                if(total - dwarflist.get(i) - dwarflist.get(j) == 100) {
                    int a = dwarflist.get(i);
                    int b = dwarflist.get(j);
                    dwarflist.remove(Integer.valueOf(a));
                    dwarflist.remove(Integer.valueOf(b));
                    Collections.sort(dwarflist);
                    return;
                }
            }
        }
    }
}
