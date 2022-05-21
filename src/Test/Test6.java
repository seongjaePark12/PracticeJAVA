package Test;

import java.util.Scanner;

//사다리꼴의 면적을 구하시오
//단, 입력받는 값은 '아랫변/윗변/높이'를 입력받는다.
//입력값은 아랫변의 값이 999이면 작업을 종료한다.
//사다리꼴 면적 공식 =( 아랫변+윗변) * 높이/ 2
public class Test6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int lower=0, upper=0, height=0; 
		double area =0;		
		while (true) {

			System.out.print("아랫변의 길이를 입력하세요. (종료하려면 999): ");
			lower = scanner.nextInt();

			if (lower == 999) {
				break;
			}

			System.out.print("윗변의 길이를 입력하세요. : ");
			upper = scanner.nextInt();
			System.out.print("높이의 길이를 입력하세요. : ");
			height = scanner.nextInt();

			System.out.println();

			area = (lower + upper) * height / 2.0;
			System.out.printf("사다리꼴 아랫변:%d 윗변:%d 높이:%d입니다.\n", lower, upper, height);
			System.out.printf("넓이: (%d +%d) * %d/2 입니다.\n ", lower, upper, height);
			System.out.printf("사다리꼴의 넓이 : %7.1f \n", area);
		}

		scanner.close();
	}
}
