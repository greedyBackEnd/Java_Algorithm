package com.dataStructure.stack;

public class MyStack {
    // 스택에 실제 데이터가 저장되는 곳
    private final int[] arr = new int[16];
    // 현재 스택의 최고점을 파악하기 위한 top
    private int top = -1;

    public MyStack() {
    }

    // push: 데이터를 스택의 제일 위에 넣는 메서드
    public void push(int data) {
        // 0. arr가 가득 찾는지 판단
        if (arr.length - 1 == top) {
            throw new RuntimeException("stack is full");
        }
        // 1. top을 하나 증가
        // 2. arr[top]에 data를 할당
        arr[++top] = data;
    }

    // pop: 스택 제일 위의 값을 꺼냄
    public int pop() {
        // 0. arr가 비어있는지 판단
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        // 1. arr[top]의 값을 반환
        // 2. top의 값을 하나 감소
        return arr[top--];
    }

    // peek: 값을 pop하지 않고 top의 값을 확인
    public int peek() {
        // 0. arr가 비어있는지 판단
        if (empty()) {
            throw new RuntimeException("stack is empty");
        }
        // 1. top의 값을 반환
        return arr[top];
    }

    // empty: 스택이 비어있는지 확인
    public boolean empty() {
        // 스택이 비었을 경우 top == -1 (초기값)
        return top == -1;
    }

    public static void main(String[] args) {
        // 스택에 3개의 데이터를 넣었다가 빼기
        MyStack intStack = new MyStack();
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        System.out.println(intStack.pop());
        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
    }
}
