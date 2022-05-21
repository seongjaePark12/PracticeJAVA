package Test;

import java.util.Scanner;

//다이아몬드 중앙의 수(홀수)를 입력받아 다이아몬드를 그리는 프로그램을 완성하시오.
//예)
//다이아몬드 중앙의 숫자를 입력하세요? 9
//     *
//    ***
//   *****  
//  *******
// *********
//  *******
//   *****
//    ***
//     *
public class Test12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int su1, su2, star=1;
		while(true) {
			System.out.print("다이아몬드 중앙 홀수 숫자를 입력하세요");
			su1 = scanner.nextInt();
			if(su1 % 2==0) {
				System.out.println("홀수만 입력하세요");
			}else break;
		}
		su2 = su1/2;
		for(int i=0; i<=su2; i++) {
			for(int j=1; j<=su2-i; j++) 
				System.out.print(" ");
			for(int j=1; j<=star; j++) 
				System.out.print("*");
			star+=2;
			System.out.println();
		}
		star= su1-2;
		for(int i =1; i<=su2;i++) {
			for(int j=1; j<=i; j++) 
				System.out.print(" ");
			for(int j=1; j<=star; j++) 
				System.out.print("*");
			star-=2;
			System.out.println();
		}
		scanner.close();
	}
}
