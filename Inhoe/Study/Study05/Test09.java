package Inhoe.Study.Study05;

import java.io.*;
import java.util.*;

/*
 *  결과 : 오답
 */

public class Test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String temp[] = br.readLine().split(" ");
        int cityNumber = Integer.parseInt(temp[0]);
        int questionNumber = Integer.parseInt(temp[1]);
        
        // 그래프 구성
        List<Integer>[] graph = new ArrayList[cityNumber + 1];
        for(int i=0 ; i<graph.length ; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=0 ; i<cityNumber-1 ; i++) {
            temp = br.readLine().split(" ");
            graph[Integer.parseInt(temp[0])].add(Integer.parseInt(temp[1]));
        }
        // for(List<Integer> a : graph) {
        //     System.out.println(a);
        // }

        int depth[] = new int[cityNumber + 1];
        dfs(1, -1, 0, graph, depth);

        // for(int a : depth){
        //     System.out.println(a);
        // }

        for(int i=0 ; i<questionNumber ; i++) {
            temp = br.readLine().split(" ");
            int c = depth[Integer.parseInt(temp[0])] - depth[Integer.parseInt(temp[1])];
            if(c % 2 == 0) 
                System.out.println("Town");
            else
                System.out.println("Road");
        }
    }

    static void dfs(int node, int parent, int currentDepth, List<Integer>[] graph, int[] depth) {
        depth[node] = currentDepth;
        for(int neighbor : graph[node]){
            if(neighbor != parent){
                dfs(neighbor, node, currentDepth + 1, graph, depth);
            }
        }
    }
}