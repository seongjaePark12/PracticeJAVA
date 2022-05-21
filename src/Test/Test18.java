package Test;

import java.util.Scanner;
//100명 이하의 학생점수를 입력받아서 학점을 구하되, 출력은 점수 내림차순으로 출력하시오.
public class Test18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    int[] jumsu = new int[100];
	    int cnt = 0, temp = 0;
	    String[] grade = new String[100];
	    String tmp1 = "";
	        
	    for(cnt=0; cnt<jumsu.length; cnt++) {
	        System.out.print((cnt+1)+"번째 학생의 점수를 입력하세요.(종료시 999) :");
	        jumsu[cnt] = scanner.nextInt();
	        if(jumsu[cnt] == 999) break;
	    }
	    for(int j=0; j<cnt; j++) {
	        switch(jumsu[j]/10) {
	            case 10:
	            case 9: 
	                grade[j] = "A";
	                break;
	            case 8:
	                grade[j] = "B";
	                break;
	            case 7:
	                grade[j] = "C";
	                break;
	            case 6:
	                grade[j] = "D";
	                break;
	            default:
	                grade[j] = "F";
	        }
	    }
	    for(int i=0; i<cnt-1; i++) {      
	        for(int j=i+1; j<cnt; j++) {
	            if(jumsu[i] < jumsu[j]) {
	                temp = jumsu[i]; 
	                jumsu[i] = jumsu[j]; 
	                jumsu[j] = temp;
	                tmp1 = grade[i]; 
	                grade[i] = grade[j]; 
	                grade[j] = tmp1;
	            }
	        }
	    }
	    System.out.println();
	        
	    for(int j=0; j<cnt; j++) {
	        System.out.println("점수 :" +jumsu[j] + ", 학점 :"+grade[j]);
	    }
	    scanner.close();
	        
	}
}
