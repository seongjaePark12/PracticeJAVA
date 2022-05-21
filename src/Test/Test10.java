package Test;

//1~100까지의 합을 구하되, 아래와 같을경우 값을 출력하시오?
//1 ~ 10 : 55
//11 ~ 20 : ....
//21 ~ 30 : ....
//31 ~ 40 : ....
//41 ~ 50 : ....
//~~~~~~~
//99 ~ 100 : ....
public class Test10 {
	public static void main(String[] args) {
		int su1 = 0, su2 = 0, su3 = 0;

		for (su1 = 1; su1 <= 100; su1++) {
			su2 = su2 + su1;
			if (su1 % 10 == 1) {
				su3 = su1;
			} else if (su1 % 10 == 0) {
				System.out.printf("%d~%d : %d\n", su3, su1, su2);
				su2 = 0;
			}
		}
	}
}
