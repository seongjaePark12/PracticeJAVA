package Test;

//2g, 3g, 5g의 추가 각각 5개씩 준비되어 있다.
//이 3개의 추를 조합하여, 무게가 30g ~ 35g 의 값이 될때의 
//각각의 추의 무게를 출력하는 프로그램을 만드시오?(아래 예와 같이 출력하시오)
//예) 2g짜리 5개 + 3g짜리 5개 + 5g짜리 1개 = 30g

 
public class Test14 {
	public static void main(String[] args) {
		int g1,g2,g3;
        for(int i=0; i<=5; i++) {
            g1=2*i;
            for(int j=0; j<=5; j++) {
                g2=3*j;
                for(int k=0; k<=5; k++) {
                    g3=5*k;
                    for (int l=30;l<=35;l++) {
                        if((g1+g2+g3)==l) {
                            System.out.printf("2g짜리 %d개 + 3g짜리 %d개 + 5g짜리 %d개 = %dg\n",i,j,k,l);                        
                        }
                    }
                }
            }
        }
    }
}
 	
