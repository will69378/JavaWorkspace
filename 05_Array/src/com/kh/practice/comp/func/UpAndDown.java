package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
    
	Scanner sc = new Scanner(System.in);
    
    public void upDown(){
        
        int rd = (int)(Math.random()*100 +1);
        int count = 0;
        System.out.println(rd);
        for(; ;) {
            System.out.print("1~100 사이의 임의의 난수를 맞춰보세요 : ");
            int num = sc.nextInt();
            count ++;
            
            if(num<1 || num>100) {
                System.out.println("1~100 사이의 숫자를 입력해주세요.");
            }
            if(num>rd) {
                System.out.println("Down");
            }
            if(num<rd ){
                System.out.println("Up");
            }
            if(num == rd) {
                System.out.println(count+"회만에 맞추셨습니다.");
                break;
            }
        }
    }
    
    
    public void rps(){
        
        int num = 0;
        int win = 0;
        int lose = 0;
        int equal = 0;
        String crsp = null;
        
        System.out.print("당신의 이름을 입력해주세요 : ");
        String str = sc.next();
        
        
        for(; ;) {
            
            
            System.out.print("가위바위보 : ");
            String rsp = sc.next();
            
            if(rsp.equals("exit")) {
                System.out.println(win+lose+equal+"전 "+win+"승 "+equal+"무 "+lose+"패" );
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
                equal++;
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
