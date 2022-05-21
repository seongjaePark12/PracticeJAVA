package Test;

//두개의 주사위를 던졌을때, 
//두 눈의 합이 6이 되는 경우는 어떤 경우가 있는지 
//모두 출력하는 프로그램을 작성하시오.
public class Test17 {
	public static void main(String[] args) {
		int dice1, dice2, su;
		System.out.println("주사위 두 눈합이 6이 되는경우!");
		
		for(dice1=1; dice1<=6; dice1++) {
			for(dice2=1; dice2<=6; dice2++) {
				su= dice1+dice2;
				if(su==6) {
					System.out.println(""+dice1+","+dice2+"");
				}
			}
		}
		
	}
}
