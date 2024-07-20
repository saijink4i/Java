package Inhoe.Search;

public class HashSearch01 {
    /*
     * 해시검색 - 체인법 
     * ハッシュ検索 ― チェイン法
     */
    public static void main(String[] args) {
        
    }
}
// 체인법에 따른 해시
class ChainHash<K, V> {
    // 해시를 구성하는 노드
    class Node<K, V> {
        private K key;                  // 키
        private V value;                // 데이터
        private Node<K, V> next;        // 후속포인터(후속 노드의 참조)

        // 생성자
        Node(K key, V value, Node<K, V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }

        // 키를 반환
        K getKey() {
            return key;
        }

        // 데이터를 반환
        V getValue() {
            return value;
        }

        // 키의 해시값을 반환
        public int hashCode() {
            return key.hashCode();
        }
    }

    private int size;                   // 해시의 최대값
    private Node<K, V>[] table;         // 해시 표

    // 생성자
    public ChainHash(int capacity){
        try {
            table = new Node[capacity];
            this.size = capacity;
        } catch (OutOfMemoryError e){   // 표를 생성하지 못했을때
            this.size = 0;
        }
    }

    // 해시값을 반환
    public int hashValue(Object key) {
        return key.hashCode() % size;
    }

    // 키 값을 Key로 검색(데이터를 반환)
    public V search(K key) {
        int hash = hashValue(key);      // 탐색하는 데이터의 해시값
        Node<K, V> p = table[hash];     // 다음 노드

        while (p != null) {
            if(p.getKey().equals(key))
                return p.getValue();    // 탐색 성공
            p = p.next;                 // 후속 노드로 이동
        }
        return null;                    // 탐색 실패
    }

    // 키 값을 Key, 데이터는 Data인 요소 추가
    public int add(K key, V data) {
        int hash = hashValue(key);      // 추가하는 데이터의 해시값
        Node<K, V> p = table[hash];     // 다음 노드

        while (p != null) {
            if (p.getKey().equals(key)) // 이미 등록되어있는 노드일경우
                return 1;
            p = p.next;                 // 후속 노드로 이동
        }
        Node<K, V> temp = new Node<K, V>(key, data, table[hash]);
        table[hash] = temp;             // 노드의 주입
        return 0;
    }

    // 키 값이 key인 요소의 삭제
    public int remove(K key) {
        int hash = hashValue(key);      // 삭제하는 데이터의 해시 값
        Node<K, V> p = table[hash];     // 다음 노드
        Node<K, V> pp = null;           // 이전 노드

        while (p != null) {
            if(p.getKey().equals(key)){ // 발견했다면
                if(pp == null)
                    table[hash] = p.next;
                else
                    pp.next = p.next;
                return 0;
            }
            pp = p;
            p = p.next;                 // 후속 노드를 다음 노드로
        }
        return 1;                       // 해당 키의 값은 존재하지 않음
    }

    public void dump() {
        for(int i=0 ; i < size ; i++){
            Node<K, V> p = table[i];
            System.out.printf("%02d", i);
            while (p != null) {
                System.out.printf("%s (%s)", p.getKey(), p.getValue());
                p = p.next;
            }
            System.out.println();
        }
    }
}
