package Test;

import java.util.Scanner;
//수를 입력받아 입력받은수가,
//3의 배수면 입력받은수에 30을 더하여 출력,
//5의 배수면 입력받은수에 50을 더하여 출력,
//7의 배수면 입력받은수에 70을 더하여 출력, 하고,
//나머지는 입력받은 정수값을 출력하시오.
public class Test4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1;
		System.out.print("수를 입력해주세요");
		su1 = sc.nextInt();
		
		int su3 = (su1 %3)==0 ? (30+su1) : ((su1 % 5)==0 ? (50+su1) : ((su1 % 7)==0 ? (70+su1) : su1));
		System.out.println(su3);
		sc.close();
	}
}
