package Inhoe.Study.Study05;

import java.io.*;
import java.util.*;

/*
 *  결과 : 정답
 */

public class Test05 {
    static Integer arrA[];
    static Integer arrB[];

    static class Point {
        int x, y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String temp[] = br.readLine().split(" ");
        int height = Integer.parseInt(temp[0]);
        int width = Integer.parseInt(temp[1]);
        int number = Integer.parseInt(temp[2]);

        Point[] points = new Point[number];

        for(int i = 0 ; i<number ; i++) {
            temp = br.readLine().split(" ");
            points[i] = new Point(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        
        compressCoordinates(points);
        
        for (Point p : points) {
            System.out.println((p.x + 1) + " " + (p.y + 1));
        }
    }

    public static void compressCoordinates(Point[] points) {
        // X 좌표 압축
        Set<Integer> uniqueX = new TreeSet<>();
        for (Point p : points) {
            uniqueX.add(p.x);
        }
        Map<Integer, Integer> compressedX = new HashMap<>();
        int index = 0;
        for (int x : uniqueX) {
            compressedX.put(x, index++);
        }

        // Y 좌표 압축
        Set<Integer> uniqueY = new TreeSet<>();
        for (Point p : points) {
            uniqueY.add(p.y);
        }
        Map<Integer, Integer> compressedY = new HashMap<>();
        index = 0;
        for (int y : uniqueY) {
            compressedY.put(y, index++);
        }

        // 압축된 좌표로 변환
        for (Point p : points) {
            p.x = compressedX.get(p.x);
            p.y = compressedY.get(p.y);
        }
    }
}