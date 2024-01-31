package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {

        /* Scanner의 nextLine()과 next에 대해 구분하여 사용할 수 있다. */
        /* 필기.
        *  nextLine() : 공백을 포함한 한 줄을 입력을 위한 개행 문자 전 까지 읽어서 문자열로 반환한다. (공백문자 포함)
        *  next()     : 공백문자나 개행문자 전 까지를 읽어서 문자열로 반환한다. (공백문자 포함하지 않음)
        * */

        Scanner sc = new Scanner(System.in);        // *이거는 꼭 외우기!!!!

        /* nextLine() */
        System.out.println("인사말을 입력해주세요 : ");
        String greeting1 = sc.nextLine();
        System.out.println("greeting1 = " + greeting1);

        /* next() */
        System.out.println("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println("greeting2 = " + greeting2);

//        greeting2 = sc.next();
//
//        System.out.println("greeting2 = " + greeting2);
    }
}
