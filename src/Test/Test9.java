package Test;

//1~100까지의 합을 구하되, 각 10항이 되면 해당 누적값을 출력하시오.
//예: 1~10 : 55
//1~20 : 210
//1~30 : ~~~
// ~~~~~
//1~100 : 5050
public class Test9 {
	public static void main(String[] args) {
		int tot = 0; 
		for(int i=0; i<=100;i++) {
			tot = tot + i;
			if (i%10==0)
			System.out.println(+i+"번째누적값" +tot);
		}
		
	}
}
