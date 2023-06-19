package com.dataStructure.queue;

public class MyQueue {
    public final int[] arr = new int[4];
    // Queue에서 데이터를 꺼내는 위치
    private int rear = -1;
    // Queue에서 데이터를 추가하는 위치
    private int front = -1;

    public MyQueue() {
    }

    // 데이터 추가
    public void enQueue(int x) {
        // rear + 1이 배열의 크기만해질 때
        if (rear == arr.length - 1) {
            throw new RuntimeException("queue is full");
        }
        // rear 하나 증가
        rear++;
        // arr[rear]에 data 할당
        arr[rear] = x;
    }

    // 데이터 회수
    public int deQueue() {
        // front == rear일 때 큐가 비어있음
        if (front == rear) {
            throw new RuntimeException("queue is empty");
        }
        // front를 하나 증가
        front++;
        // arr[front]의 값 반환
        return arr[front];
    }

    // 큐가 비었는지 확인
    public boolean isEmpty() {
        return front == rear;
    }

    // 다음에 나올 데이터가 무엇인지 확인 (Queue에서 빼내지 않음)
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        // 비어있지 않다면 front +1의 값 반환
        return arr[front + 1];
    }

    public static void main(String[] args) {
        MyQueue intQueue = new MyQueue();
        intQueue.enQueue(1);
        intQueue.enQueue(2);
        intQueue.enQueue(3);
        System.out.println(intQueue.peek());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());
        System.out.println(intQueue.deQueue());

    }
}
