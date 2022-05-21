package Test;

import java.util.Scanner;

//프로그램 시작시에 임의의 초기값(1~99)을 변수 한개에 기억시켜두고, 
//그 값을 키보드를 통해서 입력받아 맞추는 프로그램을 작성하시오.  
//이때 몇번만에 맞췄는지를 출력하시오.(단, 기회는 5번까지로 한다.)
public class Test7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int ran = 96, su = 0, i = 0;
		String res = "";

		while (i < 5) {
			System.out.print("임의의 수를 맞춰보세요. ");
			su = scanner.nextInt();

			i++;

			if (su == ran) {
				res = "정답";
				break;
			}
		}

		if (res == "정답") {
			System.out.printf("%d번만에 맞추셨습니다. 정답:%d", i, ran);
		} else {
			System.out.printf("못맞추셨습니다.ㅠㅠ", i);
		}

		scanner.close();

	}
}
