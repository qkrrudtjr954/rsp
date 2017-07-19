package com.rsp.main;

import java.util.Scanner;

/**
 * Created by kspark on 2017. 7. 20..
 */
public class RspMain {
    public static void main(String[] args) {
        User user1 = null;
        User user2 = null;
        do{
            System.out.println("첫번째 도전자!!");
            System.out.print("이름: ");
            System.out.print("나이: ");
            Scanner scanner = new Scanner(System.in);
            user1 = new User(scanner.next(), scanner.nextInt());
            System.out.println("first user: "+user1.getName());

            System.out.println("두번째 도전자!!");
            System.out.print("이름: ");
            System.out.print("나이: ");
            scanner = new Scanner(System.in);
            user2 = new User(scanner.next(), scanner.nextInt());
            System.out.println("second user: "+user2.getName());
        }while(!user1.compare(user2));

        rsp(user1, user2);
    }

    private static void rsp(User u1, User u2) {
        System.out.println(u1.getName()+" 님 먼저 내십시오.");
        Scanner scanner = new Scanner(System.in);
        Rsp rsp1 = new Rsp(u1, scanner.next());

        System.out.println(u2.getName()+" 님 내십시오.");
        scanner = new Scanner(System.in);
        Rsp rsp2 = new Rsp(u2, scanner.next());

        System.out.println(rsp1.getName()+"은"+ rsp1.rsp + "을 냈습니다");
        System.out.println(rsp2.getName()+"은"+ rsp2.rsp + "을 냈습니다");

        Rsp winner = Rsp.rspCompare(rsp1, rsp2);
        if(winner!=null){
            System.out.println("승자는 "+winner.getName()+" 입니다");
        }else {
            System.out.println("비겼습니다.");
        }
    }
}
