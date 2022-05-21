package Test;

import java.util.Scanner;
//'국어/영어/수학점수'를 입력받아, 평균을 구하고,
//그 평균점수가
//90점 이상은 'A학점',
//80점 이상은 'B학점',
//70점 이상은 'C학점',
//60점 이상은 'D학점',
//60점 미만은 'F학점' 이라고 출력하시오.
public class Test2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int k,e,m;
		int evg = 0 ;
		System.out.println("국어");
		k = scan.nextInt();
		System.out.println("영어");
		e = scan.nextInt();
		System.out.println("수학");
		m = scan.nextInt();
		evg = (k + e + m ) /3;
		System.out.println("평균 점수:" + evg);
		String bigo;
		bigo = ((evg >=90) ? "A학점" : (evg >= 80) ? "B학점" : (evg >= 70) ? "C학점" : (evg >= 60) ? "D학점" : "F학점" );
		System.out.println("입력된 점수는? " + evg);
		System.out.println("합격여부 :"  + bigo);
		scan.close();
		
		
		
		
		
		
		
		
		
	
	}
}
