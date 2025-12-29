package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockScissorsPaper {
	Scanner sc = new Scanner(System.in);
	
	
    public void rps(){
        
        int num = 0;
        int win = 0;
        int lose = 0;
        int draw = 0;
        String crsp = null;
        
        System.out.print("당신의 이름을 입력해주세요 : ");
        String str = sc.next();
        
        
        for(; ;) {
            
            
            System.out.print("가위바위보 : ");
            String rsp = sc.next();
            
            if(rsp.equals("exit")) {
                System.out.println(win+lose+draw+"전 "+win+"승 "+draw+"무 "+lose+"패" );
                break;
            }
            
            int rd = (int)(Math.random() * 3); //가위 : 0, 바위 : 1, 보 : 2
            if(rd == 0) {
                crsp = "가위";
            } else if(rd == 1) {
                crsp = "바위";
            } else if(rd == 2) {
                crsp = "보";
            }
            
            
            
            if(rsp.equals("가위")) {
                num = 0;
            } else if(rsp.equals("바위")) {
                num = 1;
            } else if(rsp.equals("보")) {
                num = 2;
            }
            else {
                System.out.println("잘못 입력하셨습니다.");
                continue;
            }
            
            
            System.out.println("컴퓨터 : " +crsp);
            System.out.println(str+" : "+rsp);
            
            
            if(num-rd == 0) {
                System.out.println("비겼습니다.");
                draw++;
            }
            else if(num-rd == 1 || num-rd == -2) {
                System.out.println("이겼습니다.");
                win++;
            }
            else if(num-rd == -1 || num-rd == 2) {
                System.out.println("졌습니다.");
                lose++;
            }
            
        }
    }
}
