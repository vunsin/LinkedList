public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        // for-each 루프로 리스트 순회
        for (int data : list) {
            System.out.println(data);
        }

        // 특정 인덱스의 요소 얻기
        int element = list.get(1);
        System.out.println("Element at index 1: " + element);

        // 특정 인덱스의 요소 삭제
        list.delete(1);

        // 삭제 후 리스트 출력
        System.out.println("List after deletion:");
        for (int data : list) {
            System.out.println(data);
        }
    }
}
