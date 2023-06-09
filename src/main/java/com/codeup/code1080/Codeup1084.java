package com.codeup.code1080;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Codeup1084 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<r; i++) {
            for(int j=0; j<g; j++) {
                String str="";
                for(int k=0; k<b;k++) {
                    str += i+" "+j+" "+k+"\n";
                }
                bf.write(str);
                bf.flush();
            }
        }
        System.out.println(r*g*b);
        sc.close();
        bf.close();
    }
}
