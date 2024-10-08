package Inhoe.Search;

import java.util.Scanner;

public class HashSearch01Test {
    static Scanner stdIn = new Scanner(System.in);
    static class Data{
        static final int NO = 1;        // 번호를 읽을것인가?
        static final int NAME = 2;      // 이름을 읽을것인가?

        private Integer no;             // 회원 번호(키 값)
        private String name;            // 이름

        // 키 값
        Integer keyCode() {
            return no;
        }

        // 문자열 표현을 반환
        public String toString() {
            return name;
        }

        // 데이터를 읽어들임
        void scanData(String guide, int sw) {
            System.out.println(guide + "하는 데이터를 입력해주세요.");

            if((sw & NO) == NO){
                System.out.print("번호 : ");
                no = stdIn.nextInt();
            }
            if((sw & NAME) == NAME){
                System.out.print("이름 : ");
                name = stdIn.next();
            }
        }
    }

    // 메뉴 나열
    enum Menu{
        ADD("추가"),
        REMOVE("삭제"),
        SEARCH("검색"),
        DUMP("표시"),
        TERMINATE("종료");

        private final String message;   // 표시용 문자열

        static Menu MenuAt(int idx) {   // idx에 맞는 메뉴를 리턴
            for (Menu m : Menu.values())
                if(m.ordinal() == idx)
                    return m;
            return null;
        }

        Menu(String string) {           // 생성자
            message = string;
        }

        String getMessage() {           // 표시용 문자열을 반환
            return message;
        }
    }

    // 메뉴 선택
    static Menu SelectMenu() {
        int key;
        do {
            for(Menu m : Menu.values())
                System.out.printf("(%d) %s   ", m.ordinal(), m.getMessage());
            System.out.print(" : ");
            key = stdIn.nextInt();
        } while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
        
        return Menu.MenuAt(key);
    }

    public static void main(String[] args) {
        Menu menu;                      // 메뉴
        Data data;                      // 추가용 데이터 참조
        Data temp = new Data();         // 읽어들이기용 데이터

        ChainHash<Integer, Data> hash = new ChainHash<Integer, Data>(13);

        do {
            switch (menu = SelectMenu()) {
                case ADD:               // 추가
                    data = new Data();
                    data.scanData("추가", Data.NO | Data.NAME);
                    hash.add(data.keyCode(), data);
                    break;
            
                case REMOVE:            // 삭제
                    temp.scanData("삭제", Data.NO);
                    hash.remove(temp.keyCode());
                    break;
            
                case SEARCH:            // 검색
                    temp.scanData("검색", Data.NO);
                    Data t = hash.search(temp.keyCode());
                    if(t != null)
                        System.out.println("그 키를 가진 데이터는 " + t + "입니다.");
                    else
                        System.out.println("해당하는 데이터가 없습니다.");
                    break;
            
                case DUMP:              // 표시
                    hash.dump();
                    break;
            }
        } while (menu != Menu.TERMINATE);
    }
}
