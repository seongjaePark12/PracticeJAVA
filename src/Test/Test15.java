package Test;

//달팽이가 나무를 올라가는데 낮에는 5cm를 올라가고, 
//밤에는 3.5cm를 내려온다고 할때, 
//이 달팽이가 전체길이 20Cm의 나무 정상에 
//올라가려면 몇일이 걸리는지 프로그램으로 작성하시오?
public class Test15 {
	public static void main(String[] args) {
		
		double mor=5.0, nig=-3.5,dal=0.0;
		int cnt=0, sw=0;
		while(true) {
			if(sw==0) {
				cnt++;
				dal+=mor;
				sw=1;
			}else if(sw==1) {
				dal +=nig;
				sw=0;
			}
			if(dal>=20) {
				System.out.println("총"+cnt+"일 걸렸습니다");
				break;
			}
		}
	}
}
