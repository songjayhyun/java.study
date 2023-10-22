package org.example.linkedlist;

import java.util.LinkedList;

public class LinkedListClass<T> {
    // 집합하는 각 요소들을 노드로 표현하고, 각 노드들을 서로 연결
    // 요소를 갖는 노드들은 다음 노드에 대한 참조 정보를 통해 접근
    // 노드가 필요할 경우, 연결하여 사용하기 때문에 용량 개념이 없음

    // 요소의 추가는 곧 노드의 추가를 의미하며, 일반적으로 add를 사용한다
    // 인덱스를 지정해 특정 지점에 요소를 추가할 경우, 기존 노드의 연결을 끊고 새로운 노드를 연결하여 추가한다
    // 요소의 삭제는 삭제할 노드가 갖고 있는 다음 노드에 대한 포인트를 이전 노드가 포인트 할 수 있도록 하여 삭제한다
    // ArrayList와 달리 요소의 추가, 삭제에 대한 부하가 적은 반면 메모리의 사용은 더 많은 특징을 가진다.
    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // 리스트 끝에 데이터 추가
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // 리스트에서 데이터 삭제
    public void remove(T data) {
        if (head == null) {
            return;
        }

        if (head.data.equals(data)) {
            head = head.next;
            return;
        }

        Node<T> current = head;
        while (current.next != null) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    // 리스트 출력
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListClass<Integer> list = new LinkedListClass<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.display(); // 출력: 1 -> 2 -> 3 -> null

        list.remove(2);
        list.display(); // 출력: 1 -> 3 -> null
    }
}

