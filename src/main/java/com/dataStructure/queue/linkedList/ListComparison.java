package com.dataStructure.queue.linkedList;

import java.util.ArrayList;
import java.util.List;

public class ListComparison {

    // ArrayList vs LinkedList 성능 비교
    public static void main(String[] args) {
        List<Object> arrayList = new ArrayList<>();
        List<Object> linkedList = new ArrayList<>();

        System.out.println("ArrayList");
        rearInsert(arrayList);
        frontInsert(arrayList);
        getElement(arrayList);

        System.out.println("LinkedList");
        rearInsert(linkedList);
        frontInsert(linkedList);
        getElement(linkedList);

    }

    // 1. 10,000개의 데이터를 리스트에 순차적으로 삽입
    public static void rearInsert(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            list.add("world");
        }

        long end = System.nanoTime();
        System.out.println(String.format("순차적 추가 소요 시간: %15d ns", end - start));
    }

    // 2. 10,000개의 데이터를 리스트의 앞에 삽입
    public static void frontInsert(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < 50000; i++) {
            list.add(0, "hello");
        }

        long end = System.nanoTime();
        System.out.println(String.format("앞쪽에 추가 소요 시간: %15d ns", end - start));
    }

    // 3. 리스트의 모든 원소를 순서(idx)를 바탕으로 조회
    public static void getElement(List<Object> list) {
        long start = System.nanoTime();

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

        long end = System.nanoTime();
        System.out.println(String.format("아이템 조회 소요 시간: %15d ns", end - start));
    }

}
