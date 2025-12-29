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
    
    


}
