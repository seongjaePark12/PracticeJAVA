package Test;

import java.util.Scanner;

//1.삼각형/2.사각형/3.사다리꼴 의 면적을 구하시오.
//사용자는 1~3번의 숫자를 입력받아서,
//1번을 입력받으면, '밑변'과 '높이'를 다시 입력받아서 삼각형의 면적을 구한다.
//2번을 입력받으면, '가로'와 '세로'의 길이를 입력받아서 사각형의 면적을 구한다.
//3번을 입력받으면, '아랫변'/'윗변'/'높이'를 입력받아서 사다리꼴의 면적을 구한다.

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1:삼각형 2:사각형 3:사다리꼴");
		int input = sc.nextInt();
		if(input == 1) {
			System.out.println("삼각형의 밑변, 높이를 입력해주세요");
			int down = sc.nextInt();
			int up = sc.nextInt();
			int sam = (down*up)/2;
			System.out.println("삼각형의 면적 :" + sam);
		}
		else if(input == 2) {
			System.out.println("사각형의 가로, 세로를 입력해주세요");
			int garo = sc.nextInt();
			int sero = sc.nextInt();
			int sa = garo*sero;
			System.out.println("사각형의 면적 :" + sa);
		}
		else if(input == 3) {
			System.out.println("사다리꼴의 밑변, 윗변, 높이를 입력해주세요");
			int down = sc.nextInt();
			int up = sc.nextInt();
			int high = sc.nextInt();
			int sada = ((down+up)*high)/2;
			System.out.println("사각형의 면적 :" + sada);
		}
		else {
			System.out.println("1~3만 입력해주세요");
		}
		

			
		
		
		
		sc.close();
	}
}
