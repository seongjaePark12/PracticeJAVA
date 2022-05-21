package Test;

import java.util.Scanner;

// 두수를 입력받아 큰수와 작은수를 출력하시오
public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 숫자: ");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = scan.nextInt();
		System.out.println(num1 > num2 ? num1 : num2);
		scan.close();
	}
}
