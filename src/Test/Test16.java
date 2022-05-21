package Test;

//아래와 같이 출력되도록 2중 for문을 사용하여 만드시오.
//12345
//23456
//34567
//45678
//56789
public class Test16 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(j+i);
			}
			System.out.println();
		}
	}
}
