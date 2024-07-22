package Inhoe.Comparator;

import java.util.Arrays;
import java.util.Comparator;



public class Exam01 {
    static class PhyscData{
        private String name; // 이름
        private int height; // 신장
        private double vision; // 시력
    
        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
    
        public static class HeightOrderComparator implements Comparator<PhyscData> {
            public int compare(PhyscData data1, PhyscData data2) {
                return (data1.height > data2.height) ? 1 : (data1.height < data2.height) ? -1 : 0;
            }
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return "name : " + name + ", height : " + height + ", vision : " + vision;
        }
    }
    public static void main(String[] args) {
        PhyscData[] dataList = {
            new PhyscData("김민수", 162, 0.3),
            new PhyscData("박병철", 168, 0.4),
            new PhyscData("홍길동", 169, 0.8),
            new PhyscData("박항서", 172, 1.5),
            new PhyscData("김지누", 174, 0.7),
            new PhyscData("최인회", 175, 1.2),
            new PhyscData("김철진", 180, 1.0),
        };

        int target = 175;

        int idx = Arrays.binarySearch(dataList, new PhyscData("", target, 0.0), PhyscData.HEIGHT_ORDER);

        if(idx < 0)
            System.out.println("Failed to binary search");
        else{
            System.out.println("Successfully : " + idx + " index");
            System.out.println("Data : " + dataList[idx]);
        }
    }
}
