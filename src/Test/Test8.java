package Test;

import java.util.Scanner;

//학생 30명에게 각각 똑 같은 개수의 연필을 나눠주려고 한다.
//이때 나눠주려고 하는 연필의 개수를 입력받아서 처리하는데, 
//이때 학생 1명당 받게 되는 연필의 개수는 몇자루이고, 남는 연필의 개수는 몇자루인지 출력하시오.
//예 : 입력시에 연필의 총개수를 100개를 주었다면, 학생 1명당 받개되는 연필의 개수는 3개씩이고, 
//3자루씩을 모두 나눠주고 남은 연필의 개수는 10개이다.
public class Test8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int pen = 0, pen2 = 0, pen3 = 0;

		System.out.print("총 연필 개수를 적어주세요:");
		pen = scanner.nextInt();

		pen2 = pen / 30;
		pen3 = pen % 30;
		System.out.printf("총연필개수: %d\n 학생들에게 %d만큼 나눠주고 %d만큼 남았습니다.",pen, pen2, pen3);

		scanner.close();
		
		
	}
}
