package com.rsp.main;

/**
 * Created by kspark on 2017. 7. 20..
 */
public class Rsp extends User {
    String rsp ="";

    public Rsp(User user, String rsp){
        super(user.getName(), user.getAge());
        this.rsp = rsp;
    }

    private static int rspString(String rsp){
        if (rsp.equals("가위")){
            return 1;
        }else if(rsp.equals("바위")){
            return 2;
        }else if(rsp.equals("보")){
            return 3;
        }else{
            return 100;
        }
    }

    public static Rsp rspCompare(Rsp r1, Rsp r2){
        //1 = 가위, 2 = 바위, 3 = 보
        /*
        * r1 - r2 = -2 이면 r1 승
        * 가위   보
        *
        * r1 - r2 = -1 이면 r2 승
        * 가위   바위
        * 바위   보
        *
        * r1 - r2 = 0  이면 비김
        *
        * r1 - r2 = 1 이면 r1 승
        * 바위   가위
        * 보     바위
        *
        * r1 - r2 = 2 이면 r2 승
        * 보    가위
        *
        * */
        int rsp1 = rspString(r1.rsp);
        int rsp2 = rspString(r2.rsp);

        int result = rsp1 - rsp2;
        if(result == -2 || result == 1){
            return r1;
        }else if (result == -1 || result == 2){
            return r2;
        }else{
            return null;
        }
    }
}
