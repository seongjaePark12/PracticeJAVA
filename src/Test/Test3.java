package Test;

import java.util.Scanner;
//수를 입력받아 입력받은 수가 짝수인지 홀수인지를 판별하여 출력하시오.
public class Test3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int su1, su2 ;
		System.out.print("수를 입력하세요");
		su1 = scan.nextInt();
		
		su2 = su1 % 2;
		String su3 = (su2==1) ? "홀수" : "짝수";
		
		System.out.printf("입력한 수는 %d이므로 %s 입니다 ", su1, su3);
		scan.close();
		
	}
}
