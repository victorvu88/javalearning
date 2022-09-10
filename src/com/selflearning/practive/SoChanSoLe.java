package com.selflearning.practive;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SoChanSoLe {
    // Nhap vao tu ban phim 10 so nguyen duong
    // Q: In ra tat ca cac so chan va so le.
    public static void main(String[] args) {
        int[] numberArr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= numberArr.length; i++) {
            System.out.println("nhap phan tu thu " + i);
            numberArr[i - 1] = sc.nextInt();
        }

       for (int i = 0; i < numberArr.length; i++) {
           if( numberArr[i] % 2 == 0 ) {
                System.out.println("cac so chan la : " + numberArr[i] + " ");
           } else {
                System.out.println("cac so le la : " + numberArr[i] + " ");
           }
       }
    }
}
