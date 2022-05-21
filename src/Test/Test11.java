package Test;

import java.util.Scanner;

//컴퓨터에게 임의의 난수(1~100)를 한개 발생시킨후 
//그 값을 찾는 프로그램을 작성하시오.
//(단, 기회는 7번, 만약에 1번만에 맞추면 
//보너스 100점, 2번은 50점, 3번은 30점)
//예 : 컴퓨터가 발생시킨 난수가 '30'이라고 가정하면
//1회전 : 50 <--50을 입력했다고 하면 다음줄에 '더 작은수를 입력하세요'
//더 작은수를 입력하세요
//2회전 : 20 <--20을 입력했다고 하면 다음줄에 '더 큰수를 입력하세요'
//더 큰수를 입력하세요
//3회전 : 30
//3번만에 맞치셨습니다.
public class Test11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        int rnd, count = 0, su;
        
        rnd = ((int)(Math.random()*99)+1);
        
        System.out.print("수를 입력해주세요(기회는 7번 입니다.) : ");
        su = scanner.nextInt();
        
        for(int i=1;i<=7;i++) {
            count++;
            if(rnd==su) {
                if(i==1) {
                    System.out.println(count+"회전 : "+su);
                    System.out.println(count+"번만에 맞치셨습니다. 보너스 100점");
                    break;
                }
                else if(i==2) {
                    System.out.println(count+"회전 : "+su);
                    System.out.println("번만에 맞치셨습니다. 보너스 50점");
                    break;
                }
                else if(i==3) {
                    System.out.println(count+"회전 : "+su);
                    System.out.println("번만에 맞치셨습니다. 보너스 30점");
                    break;
                }
                System.out.println(count+"회전 : "+su);
                System.out.println(count+"번만에 맞치셨습니다.");
                break;
            }
            else if(rnd>su) {
                System.out.println(count+"회전 : "+su);
                System.out.print("더 큰수를 입력하세요 : ");
                su = scanner.nextInt();
            }
            else if(rnd<su) {
                System.out.println(count+"회전 : "+su);
                System.out.print("더 작은수를 입력하세요 : ");
                su = scanner.nextInt();
            }else if(count == 7) System.out.println("7번의 기회룰 모두 소진하셨습니다.");
        }
        System.out.println("종료...");
        scanner.close();
        }  
    }
    
     