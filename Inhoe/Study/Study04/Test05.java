package Inhoe.Study.Study04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;

/*
 *  결과 : 정답
 */

public class Test05 {
    static int count = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String text[] = br.readLine().split(" ");
        int cityNumber = Integer.parseInt(text[0]);
        int routeNumber = Integer.parseInt(text[1]);

        Graph g = new Graph(cityNumber);

        for(int i=0 ; i<routeNumber ; i++) {
            text = br.readLine().split(" ");
            g.addEdge(Integer.parseInt(text[0])-1, Integer.parseInt(text[1])-1);
        }

        for(int i=0 ; i<cityNumber ; i++) {
            g.DFS(i);
        }

        System.out.println(count);
    }

    /* 인접 리스트를 이용한 방향성 있는 그래프 클래스 */
    static class Graph {
        private int V; // 정점의 수
        private LinkedList<Integer>[] adj; // 인접 리스트

        // 생성자
        Graph(int v) {
            V = v;
            adj = new LinkedList[v];
            for (int i = 0; i < v; ++i)
                adj[i] = new LinkedList();
        }

        // 간선 추가
        void addEdge(int v, int w) {
            adj[v].add(w);
        }

        // DFS를 위한 재귀 함수
        void DFSUtil(int v, boolean visited[]) {
            // 현재 노드를 방문한 것으로 표시하고 출력
            visited[v] = true;
            count++;

            // 이 정점에 인접한 모든 정점에 대해 재귀 호출
            Iterator<Integer> i = adj[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        // 주어진 정점에서 DFS 탐색을 시작
        void DFS(int v) {
            // 모든 정점을 방문하지 않은 상태로 표시
            boolean visited[] = new boolean[V];

            // 주어진 정점에서 DFS 탐색 시작
            DFSUtil(v, visited);
        }

            // 메인 메소드
        public static void main(String args[]) {
            Graph g = new Graph(4);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(1, 2);
            g.addEdge(2, 0);
            g.addEdge(2, 3);
            g.addEdge(3, 3);

            System.out.println("0번 정점에서 시작하는 깊이 우선 탐색 (DFS)");

            g.DFS(0);
        }
    }
}