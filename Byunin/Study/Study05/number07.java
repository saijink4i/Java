package Byunin.Study.Study05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class number07 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int k = Integer.parseInt(st.nextToken());


        System.out.println(OneMore(s, k));
    }

    public static String OneMore(String s, int k) {
        Set<String> permutation = new HashSet<String>();
        per("", s, permutation);
        List<String> list = new ArrayList<>(List.copyOf(permutation));
        Collections.sort(list);
        return list.get(k-1);
    }
    public static void per(String prefix, String str, Set<String> permutation) {
        int n = str.length();
        if(n==0)
            permutation.add(prefix);
        else{
            for (int i = 0; i < n; i++) {
                per(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1), permutation);
            }
        }
    }
}
