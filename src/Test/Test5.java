package Test;

import java.util.Scanner;
//첫번째 입력받은 수를 두번째 입력받은 수로 나눴을때의 
//나머지가 1과 3인경우는 '남자'로,
//2와 4인 경우는 '여자'로 출력하고,
//그렇지 않은 경우는 입력받은수와 '오류'라고 출력하시오.
public class Test5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int su1, su2;
		System.out.print("첫번째 수");
		su1 = sc.nextInt();
		System.out.print("두번째 수");
		su2 = sc.nextInt();
		
		String su3 = (su1%su2)==1 ? "남자" : (su1%su2)==3 ? "남자" : (su1%su2)==2 ? "여자" : (su1%su2)==4 ? "여자" : su1 + "오류";
		System.out.printf("%s 입니다",su3);
		sc.close();
	}
}
